package com.example.jvm_1_memory.stack;

public class NativeMethod {

    public native void sayHello();

    static {
        System.loadLibrary("NativeMethod");
    }

    public static void main(String[] args) {
        // 创建 NativeMethod 对象并调用本地方法
        NativeMethod example = new NativeMethod();
        example.sayHello();
    }


}
