package com.example.jvm_1_memory.methodArea;

import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

public class MethodAreaTest extends ClassLoader {

    public static void main(String[] args) {
        int i = 0;
        try {
            MethodAreaTest test = new MethodAreaTest();
            for (i = 0; i < 10000; i++) {
                ClassWriter cw = new ClassWriter(0);
                cw.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "Class" + i, null, "java/lang/Object", null);
                byte[] code = cw.toByteArray();
                //类加载，不链接，返回Class对象
                test.defineClass("Class" + i, code, 0, code.length);
            }
            System.out.println(i);
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(i);
        }

    }

}
