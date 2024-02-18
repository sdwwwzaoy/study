package com.example.jvm_1_memory.stack;

public class StackOverFlow {

    private static int count;

    public static void main(String[] args) {
        try {
            method();
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(count);
            //11909
            //2079
        }
    }

    private static void method() {
        count++;
        method();
    }

}
