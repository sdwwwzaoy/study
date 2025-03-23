package com.example.redisspringboot.enums;

public enum ErrorCode {

    SYS_ERROR(500,"system error"),
    ;

    final int code;

    final String msg;

    ErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }



}
