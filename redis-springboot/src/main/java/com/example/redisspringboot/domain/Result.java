package com.example.redisspringboot.domain;

import lombok.Data;

@Data
public class Result<T> {

    int code;

    String msg;

    T data;

    public static Result<?> ok() {
        return new Result<>();
    }

    public static Result<?> error(String msg) {
        Result<?> r = new Result<>();
        r.setMsg(msg);
        r.setCode(500);
        return r;
    }
}
