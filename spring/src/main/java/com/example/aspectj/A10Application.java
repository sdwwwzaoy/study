package com.example.aspectj;

import com.example.aspectj.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//agent（类加载）
//aspectj（编译）
//代理
@SpringBootApplication
public class A10Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(A10Application.class, args);
        MyService bean = context.getBean(MyService.class);
        System.out.println(bean);
        bean.foo();
        context.close();
    }

}
