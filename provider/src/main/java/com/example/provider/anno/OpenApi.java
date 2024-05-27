package com.example.provider.anno;

import com.example.provider.constants.ApiType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface OpenApi {

    /**
     * 请求来源类型
     */
    ApiType type() default ApiType.SERVER;

    /**
     * api名称
     */
    String name();

    /**
     * 资源
     */
    String resource();

    /**
     * 操作
     */
    String action();

}
