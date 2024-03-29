package com.example.jvm_1_memory.methodArea;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}

/*
==========================基本信息=============================
 * Classfile /Users/zhangzuohong/IdeaProjects/study/jvm/src/main/java/com/example/jvm_1_memory/methodArea/HelloWorld.class
 *   Last modified 2024年2月18日; size 461 bytes
 *   SHA-256 checksum 4f8e21c343eac002c26078d5071b0a14528546a4bb819e55b3d2c9a8ac5bdce0
 *   Compiled from "HelloWorld.java"
 * public class com.example.jvm_1_memory.methodArea.HelloWorld
 *   minor version: 0
 *   major version: 61
 *   flags: (0x0021) ACC_PUBLIC, ACC_SUPER
 *   this_class: #21                         // com/example/jvm_1_memory/methodArea/HelloWorld
 *   super_class: #2                         // java/lang/Object
 *   interfaces: 0, fields: 0, methods: 2, attributes: 1
==========================常量池=============================
 * Constant pool:
 *    #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
 *    #2 = Class              #4             // java/lang/Object
 *    #3 = NameAndType        #5:#6          // "<init>":()V
 *    #4 = Utf8               java/lang/Object
 *    #5 = Utf8               <init>
 *    #6 = Utf8               ()V
 *    #7 = Fieldref           #8.#9          // java/lang/System.out:Ljava/io/PrintStream;
 *    #8 = Class              #10            // java/lang/System
 *    #9 = NameAndType        #11:#12        // out:Ljava/io/PrintStream;
 *   #10 = Utf8               java/lang/System
 *   #11 = Utf8               out
 *   #12 = Utf8               Ljava/io/PrintStream;
 *   #13 = String             #14            // hello world
 *   #14 = Utf8               hello world
 *   #15 = Methodref          #16.#17        // java/io/PrintStream.println:(Ljava/lang/String;)V
 *   #16 = Class              #18            // java/io/PrintStream
 *   #17 = NameAndType        #19:#20        // println:(Ljava/lang/String;)V
 *   #18 = Utf8               java/io/PrintStream
 *   #19 = Utf8               println
 *   #20 = Utf8               (Ljava/lang/String;)V
 *   #21 = Class              #22            // com/example/jvm_1_memory/methodArea/HelloWorld
 *   #22 = Utf8               com/example/jvm_1_memory/methodArea/HelloWorld
 *   #23 = Utf8               Code
 *   #24 = Utf8               LineNumberTable
 *   #25 = Utf8               main
 *   #26 = Utf8               ([Ljava/lang/String;)V
 *   #27 = Utf8               SourceFile
 *   #28 = Utf8               HelloWorld.java
 ==========================方法，包括构造方法=============================
 * {
 *   public com.example.jvm_1_memory.methodArea.HelloWorld();
 *     descriptor: ()V
 *     flags: (0x0001) ACC_PUBLIC
 *     Code:
 *       stack=1, locals=1, args_size=1
 *          0: aload_0
 *          1: invokespecial #1                  // Method java/lang/Object."<init>":()V
 *          4: return
 *       LineNumberTable:
 *         line 3: 0
 *
 *   public static void main(java.lang.String[]);
 *     descriptor: ([Ljava/lang/String;)V
 *     flags: (0x0009) ACC_PUBLIC, ACC_STATIC
 *     Code:
 *       stack=2, locals=1, args_size=1
 *          0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
 *          3: ldc           #13                 // String hello world
 *          5: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
 *          8: return
 *       LineNumberTable:
 *         line 5: 0
 *         line 6: 8
 * }
 * SourceFile: "HelloWorld.java"
 */
