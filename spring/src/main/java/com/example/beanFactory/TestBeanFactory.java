package com.example.beanFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class TestBeanFactory {

    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //bean定义
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(Config.class)
                .setScope(ConfigurableBeanFactory.SCOPE_SINGLETON).getBeanDefinition();
        beanFactory.registerBeanDefinition("config", beanDefinition);
        //config
        for (String beanDefinitionName : beanFactory.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        // 给beanFactory添加常用的后处理器
        AnnotationConfigUtils.registerAnnotationConfigProcessors(beanFactory);
        //config
        //org.springframework.context.annotation.internalConfigurationAnnotationProcessor 处理@Configuration，beanFactory处理器
        //org.springframework.context.annotation.internalAutowiredAnnotationProcessor 处理@Autowired，bean处理器
        //org.springframework.context.annotation.internalCommonAnnotationProcessor 处理@Resource,JavaEE的，bean处理器
        //org.springframework.context.event.internalEventListenerProcessor
        //org.springframework.context.event.internalEventListenerFactory
        for (String beanDefinitionName : beanFactory.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        //执行后处理器
        beanFactory.getBeansOfType(BeanFactoryPostProcessor.class).values().forEach(beanFactoryPostProcessor -> {
            beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);
        });
        //config
        //org.springframework.context.annotation.internalConfigurationAnnotationProcessor
        //org.springframework.context.annotation.AutowiredAnnotationProcessor
        //org.springframework.context.annotation.internalCommonAnnotationProcessor
        //org.springframework.context.event.internalEventListenerProcessor
        //org.springframework.context.event.internalEventListenerFactory
        //bean1
        //bean2
        for (String beanDefinitionName : beanFactory.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        //null
//        System.out.println(beanFactory.getBean(Bean1.class).bean2);
        //bean后处理器针对bean的生命周期的各个阶段提供扩展，例如@Autowired、@Resource
        beanFactory.getBeansOfType(BeanPostProcessor.class).values().forEach(beanPostProcessor -> {
            System.out.println(">>>>>" + beanPostProcessor);
            beanFactory.addBeanPostProcessor(beanPostProcessor);
        });
        //com.example.beanFactory.TestBeanFactory$Bean2@4206a205
        System.out.println(beanFactory.getBean(Bean1.class).bean2);
        //预先创建好单例bean
        beanFactory.preInstantiateSingletons();
        //1.beanFactory不会主动调用bean工厂的后处理器
        //2.不主动添加Bean后处理器
        //3.不主动实例化单例bean
        //4.不解析beanFactory、${}、#{}

        //bean后处理器会根据Order排序

    }

    @Configuration
    static class Config {

        @Bean
        public Bean1 bean1() {
            return new Bean1();
        }

        @Bean
        public Bean2 bean2() {
            return new Bean2();
        }

    }

    static class Bean1 {
        public Bean1() {
            System.out.println("构造bean1");
        }

        //@Autowired根据类型匹配，如果有多个，根据成员变量和bean的名字匹配
        @Autowired
        Bean2 bean2;

    }

    static class Bean2 {
        public Bean2() {
            System.out.println("构造bean2");
        }
    }

}
