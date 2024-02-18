package com.example.jvm_1_memory.stack;

public class Main {

    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        method2(1, 2);
    }

    private static int method2(int a, int b) {
        return a + b;
    }

}
