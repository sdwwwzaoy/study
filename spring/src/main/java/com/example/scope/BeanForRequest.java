package com.example.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import javax.annotation.PreDestroy;

@Component
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class BeanForRequest {

    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }

}
