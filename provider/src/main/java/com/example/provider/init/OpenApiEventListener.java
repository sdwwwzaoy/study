package com.example.provider.init;

import com.example.provider.anno.OpenApi;
import org.apache.commons.lang3.StringUtils;
import org.springframework.aop.support.AopUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@Component
public class OpenApiEventListener implements ApplicationListener<ContextRefreshedEvent> {

    private final AtomicBoolean registered = new AtomicBoolean(false);


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        final ApplicationContext context = event.getApplicationContext();
        Map<String, Object> apiList = getControllerBeans(context);
        if (CollectionUtils.isEmpty(apiList)) {
            return;
        }
        if (!registered.compareAndSet(false, true)) {
            return;
        }
        apiList.forEach(this::handle);
    }

    private void handle(String beanName, Object bean) {
        Class<?> clazz = getCorrectedClass(bean);
        final Method[] methods = ReflectionUtils.getUniqueDeclaredMethods(clazz);
        for (Method method : methods) {
            final OpenApi openApi = AnnotatedElementUtils.findMergedAnnotation(method, OpenApi.class);
            if (openApi == null) {
                continue;
            }
            String url = buildApiPath(openApi);
            System.out.println(url);
        }
    }

    private Map<String, Object> getControllerBeans(final ApplicationContext context) {
        return context.getBeansWithAnnotation(Controller.class);
    }

    private Class<?> getCorrectedClass(final Object bean) {
        Class<?> clazz = bean.getClass();
        if (AopUtils.isAopProxy(bean)) {
            clazz = AopUtils.getTargetClass(bean);
        }
        return clazz;
    }

    protected String buildApiPath(final OpenApi openApi) {
        String name = openApi.name();
        String resource = openApi.resource();
        String action = openApi.action();
        if (StringUtils.isAnyBlank(name, resource, action)) {
            throw new RuntimeException("OpenApi field is blank");
        }
        return String.format("/%s/%s/%s/%s", openApi.type().getContext(), parseDomain(), resource, action);
    }

    private String parseDomain() {
        return "dsbd";
    }

}
