package com.example.beanPost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Bean1 {
    private Bean2 bean2;

    private Bean3 bean3;

    private String home;

    @Autowired
    public void setBean2(Bean2 bean2) {
        System.out.println("@Autowired生效");
        this.bean2 = bean2;
    }

    @Resource
    public void setBean3(Bean3 bean3) {
        System.out.println("@Resource生效");
        this.bean3 = bean3;
    }

    @Autowired
    public void setHome(@Value("${HOME}") String home) {
        System.out.println("@Value生效");
        this.home = home;
    }

    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct生效");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("@PreDestroys生效");
    }
}
