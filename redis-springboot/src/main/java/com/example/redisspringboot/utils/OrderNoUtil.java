package com.example.redisspringboot.utils;

import java.util.UUID;

public class OrderNoUtil {

    public static String generateOrderNo() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
