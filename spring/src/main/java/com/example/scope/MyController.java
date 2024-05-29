package com.example.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class MyController {

    // 单例bean注入多例bean时获取到的是同一个，但加了@Lazy，实际注入的是代理，调用toString时会调用真正的bean的toString
    @Lazy
    @Autowired
    BeanForApplication beanForApplication;

    @Lazy
    @Autowired
    BeanForRequest beanForRequest;

    @Lazy
    @Autowired
    BeanForSession beanForSession;

    @GetMapping(value = "/test", produces = "text/html")
    public String test(HttpServletRequest request, HttpSession session) {
        ServletContext sc = request.getServletContext();
        return "<ul>" +
                "<li>" + "request scope" + beanForRequest + "</li>" +
                "<li>" + "session scope" + beanForSession + "</li>" +
                "<li>" + "application scope" + beanForApplication + "</li>"
                + "</ul>";
    }

    //1. @Lazy
    //2. proxyMode = ScopedProxyMode.TARGET_CLASS
    //3. ObjectFactory
    //4. 注入ApplicationContext


}

