package com.example.beanFactory;

import org.springframework.beans.factory.annotation.Autowired;
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
        //org.springframework.context.annotation.internalConfigurationAnnotationProcessor 处理@Configuration
        //org.springframework.context.annotation.internalAutowiredAnnotationProcessor
        //org.springframework.context.annotation.internalCommonAnnotationProcessor
        //org.springframework.context.event.internalEventListenerProcessor
        //org.springframework.context.event.internalEventListenerFactory
        for (String beanDefinitionName : beanFactory.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }

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

        @Autowired
        Bean2 bean2;

    }

    static class Bean2 {
        public Bean2() {
            System.out.println("构造bean2");
        }
    }

}
