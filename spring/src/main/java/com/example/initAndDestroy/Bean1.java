package com.example.initAndDestroy;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class Bean1 implements InitializingBean {

    //三种初始化方法，下面三个从前到后执行

    //通过Bean后处理器执行
    @PostConstruct
    public void init() {
        System.out.println("init 1");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init 2");
    }

    //@Bean加在BeanDefinition中，优先级最低
    public void init3() {
        System.out.println("init 3");
    }
}
