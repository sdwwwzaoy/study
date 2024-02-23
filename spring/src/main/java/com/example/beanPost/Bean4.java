package com.example.beanPost;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "java")
public class Bean4 {

    private String home;

    private String version;

    public String getHome() {
        return home;
    }

    public void setHome() {
        this.home = home;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion() {
        this.version = version;
    }

}
