package com.example.beanPost;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.annotation.ContextAnnotationAutowireCandidateResolver;
import org.springframework.context.support.GenericApplicationContext;

public class GenericApplicationContextTest {

    public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();
        context.registerBean("bean1", Bean1.class);
        context.registerBean("bean2", Bean2.class);
        context.registerBean("bean3", Bean3.class);
        context.registerBean("bean4", Bean4.class);
        context.getDefaultListableBeanFactory().setAutowireCandidateResolver(
                new ContextAnnotationAutowireCandidateResolver());
        context.registerBean(AutowiredAnnotationBeanPostProcessor.class);//解析@Autowired和@Value
        context.registerBean(CommonAnnotationBeanPostProcessor.class);//@Resource @PostConstruct @PreDestroy
        ConfigurationPropertiesBindingPostProcessor.register(
                context.getDefaultListableBeanFactory()); //@ConfigurationProperties
        System.out.println(context.getBean("bean4", Bean4.class).getHome());
        context.refresh();
        context.close();
    }

}
