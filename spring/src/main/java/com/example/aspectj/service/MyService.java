package com.example.aspectj.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void foo() {
        System.out.println("foo()");
    }

}
