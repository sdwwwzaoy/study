package com.example.test.bd;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanBeanDefinitionApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.example.test.bd");
        BeanDefinition person = ctx.getBeanDefinition("person");
        System.out.println(person);
        System.out.println(person.getClass().getName());

    }

}
