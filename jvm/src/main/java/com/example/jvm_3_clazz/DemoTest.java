package com.example.jvm_3_clazz;

public class DemoTest {

    public static void main(String[] args) {
        int a = 10;
        int b = a++ + ++a + a--;
        System.out.println(a);
        System.out.println(b);
        
        // vtable在链接阶段生成
    }

}
