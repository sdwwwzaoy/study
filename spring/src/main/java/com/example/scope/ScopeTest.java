package com.example.scope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// singleton 每次获取同一个对象
// prototype 每次获取产生新对象
// request bean存在于request域中，生命周期和request一样
// session bean存在于session域中，生命周期和session一样
// application servletContext启动时创建，销毁时销毁
@SpringBootApplication
public class ScopeTest {

    public static void main(String[] args) {
        SpringApplication.run(ScopeTest.class, args);
    }

}
