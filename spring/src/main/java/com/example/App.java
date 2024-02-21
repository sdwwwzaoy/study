package com.example;

import com.example.event.UserRegisterEvent;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Locale;
import java.util.Map;

@SpringBootApplication
public class App {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, IOException {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        context.close();
//        //BeanFactory才是Spring的核心容器，BeanFactory是ApplicationContext的父接口
//        //ApplicationContext组合了BeanFactory的功能
//
//        //Bean的生命周期的各种功能都由BeanFactory提供，控制反转，依赖注入
//        Field singletonObjects = DefaultSingletonBeanRegistry.class.getDeclaredField("singletonObjects");
//        singletonObjects.setAccessible(true);
//        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
//        Map<String, Object> map = (Map<String, Object>) singletonObjects.get(beanFactory);
//        map.entrySet().stream().filter(e -> e.toString().startsWith("component")).forEach(e -> System.out.println(e.getKey() + "=" + e.getValue()));
//
//        //ApplicationContext扩展的功能
//        //1.国际化翻译
//        System.out.println(context.getMessage("hi",null, Locale.CHINA));
//        System.out.println(context.getMessage("hi",null, Locale.ENGLISH));
//        System.out.println(context.getMessage("hi",null, Locale.JAPANESE));
//
//        //2.找资源
////        Resource[] resources = context.getResources("classpath:application.properties");
//        Resource[] resources = context.getResources("classpath*:META-INF/spring.factories");
//        for (Resource resource : resources) {
//            System.out.println(resource);
//        }
//
//        //3.找配置
//        System.out.println(context.getEnvironment().getProperty("java_home"));
//        System.out.println(context.getEnvironment().getProperty("server.port"));
//
//        //4.发布事件
//        context.publishEvent(new UserRegisterEvent(context));

    }
}
