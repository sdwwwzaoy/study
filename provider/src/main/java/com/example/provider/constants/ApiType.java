package com.example.provider.constants;

import lombok.Getter;

public enum ApiType {

    SERVER("server"),
    SDK("sdk"),
    WEB("web"),
    OAUTH("oauth"),
    ;


    /**
     * api请求文根
     */
    private final String context;

    public String getContext() {
        return this.context;
    }

    ApiType(String context) {
        this.context = context;
    }

}
