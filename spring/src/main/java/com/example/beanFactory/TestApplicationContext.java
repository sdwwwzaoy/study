//package com.example.beanFactory;
//
//import lombok.Data;
//import org.springframework.beans.factory.support.DefaultListableBeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
//import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletRegistrationBean;
//import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
//import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
//import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.web.servlet.DispatcherServlet;
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class TestApplicationContext {
//
//    public static void main(String[] args) {
////        testClasspathXmlApplicationContext();
////        testFileSystemXmlApplicationContext();
////        testAnnotationConfigApplicationContext();
//        testAnnotationConfigServletWebServerApplicationContext();
//
////        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
////        System.out.println("读取前");
////        for (String name : beanFactory.getBeanDefinitionNames()) {
////            System.out.println(name);
////        }
////        System.out.println("读取后");
////        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
////        reader.loadBeanDefinitions(new ClassPathResource("b01.xml"));
////        for (String name : beanFactory.getBeanDefinitionNames()) {
////            System.out.println(name);
////        }
//
//    }
//
//    //经典，基于classpath下xml
//    private static void testClasspathXmlApplicationContext() {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("b01.xml");
//        for (String name : context.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }
//        System.out.println(context.getBean(Bean2.class).getBean1());
//    }
//
//    private static void testFileSystemXmlApplicationContext() {
//        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(
//                "//Users/zhangzuohong/IdeaProjects/study/spring/src/main/resources/b01.xml");
//        for (String name : context.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }
//        System.out.println(context.getBean(Bean2.class).getBean1());
//    }
//
//    private static void testAnnotationConfigApplicationContext() {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        for (String name : context.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }
//        System.out.println(context.getBean(Bean2.class).getBean1());
//    }
//
//    private static void testAnnotationConfigServletWebServerApplicationContext() {
//        AnnotationConfigServletWebServerApplicationContext context = new AnnotationConfigServletWebServerApplicationContext(WebConfig.class);
//        for (String name : context.getBeanDefinitionNames()) {
//            System.out.println(name);
//        }
//    }
//
//    @Configuration
//    static class WebConfig {
//        @Bean
//        public ServletWebServerFactory servletWebServerFactory() {
//            return new TomcatServletWebServerFactory();
//        }
//
//        @Bean
//        public DispatcherServlet dispatcherServlet() {
//            return new DispatcherServlet();
//        }
//
//        @Bean
//        public DispatcherServletRegistrationBean registrationBean(DispatcherServlet servlet) {
//            return new DispatcherServletRegistrationBean(servlet, "/");
//        }
//
//        @Bean("/hello")
//        public Controller controller1() {
//            return (httpServletRequest, httpServletResponse) -> {
//                httpServletResponse.getWriter().println("hello");
//                return null;
//            };
//        }
//    }
//
//    static class Config {
//        @Bean
//        public Bean1 bean1() {
//            return new Bean1();
//        }
//
//        @Bean
//        public Bean2 bean2(Bean1 bean1) {
//            Bean2 bean2 = new Bean2();
//            bean2.setBean1(bean1);
//            return bean2;
//        }
//    }
//
//    static class Bean1 {
//
//    }
//
//    @Data
//    static class Bean2 {
//        Bean1 bean1;
//    }
//
//}
