package com.example.aspectj.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Before("execution(* com.example.aspectj.service.MyService.foo())")
    public void before() {
        System.out.println("before");
    }

}
