package com.example.beanFactoryPost;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.resource.PathResourceResolver;

public class ComponentScanPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        DefaultListableBeanFactory bf = (DefaultListableBeanFactory) beanFactory;
        try {
            ComponentScan componentScan = AnnotationUtils.findAnnotation(Config.class, ComponentScan.class);
            if (componentScan == null) {
                return;
            }
            AnnotationBeanNameGenerator generator = new AnnotationBeanNameGenerator();
            for (String basePackage : componentScan.basePackages()) {
                // com.example.beanFactoryPost.component => classpath*:com/example/beanFactoryPost/component/**/*.class
                String path = "classpath*:" + basePackage.replace(".", "/") + "/**/*.class";
                Resource[] resources = new PathMatchingResourcePatternResolver().getResources(path);
                CachingMetadataReaderFactory factory = new CachingMetadataReaderFactory();
                for (Resource r : resources) {
                    AnnotationMetadata metadata = factory.getMetadataReader(r).getAnnotationMetadata();
                    if (metadata.hasMetaAnnotation(Component.class.getName()) ||
                            metadata.hasAnnotation(Component.class.getName())) {
                        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(
                                metadata.getClassName()).getBeanDefinition();
                        String name = generator.generateBeanName(beanDefinition, bf);
                        bf.registerBeanDefinition(name, beanDefinition);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

