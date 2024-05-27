package com.example.initAndDestroy;

import org.springframework.beans.factory.DisposableBean;

import javax.annotation.PreDestroy;

public class Bean2 implements DisposableBean {

    //销毁有3种，从上到下依次执行

    @PreDestroy
    public void destroy1() {
        System.out.println("destroy1");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy2");
    }

    public void destroy3() throws Exception {
        System.out.println("destroy3");
    }
}
