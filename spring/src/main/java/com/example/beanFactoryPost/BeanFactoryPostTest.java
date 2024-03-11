package com.example.beanFactoryPost;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.MethodMetadata;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Set;


public class BeanFactoryPostTest {

    public static void main(String[] args) throws IOException {
        GenericApplicationContext context = new GenericApplicationContext();
        context.registerBean("config", Config.class);
//        context.registerBean(ConfigurationClassPostProcessor.class); //@ComponentScan @Bean @Import @ImportResource
//        context.registerBean(MapperScannerConfigurer.class, bd -> bd.getPropertyValues()
//                .add("basePackage", "com.example.beanFactoryPost.mapper"));//扫描mapper @MapperScan
//        context.registerBean(ComponentScanPostProcessor.class);
        context.registerBean(AtBeanPostProcessor.class);

        context.refresh();
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
        context.close();
    }

}
