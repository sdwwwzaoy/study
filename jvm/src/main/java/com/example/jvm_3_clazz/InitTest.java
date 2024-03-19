package com.example.jvm_3_clazz;

public class InitTest {

    static int i = 10;

    static {
        i = 20;
    }

    static {
        i = 30;
    }

}
//Classfile /Users/admin/IdeaProjects/study/jvm/src/main/java/com/example/jvm_3_clazz/InitTest.class
//  Last modified 2024-3-19; size 317 bytes
//  MD5 checksum 4f4e72f8d8d8f2358d9ed1f2c2c5cfef
//  Compiled from "InitTest.java"
//public class com.example.jvm_3_clazz.InitTest
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Methodref          #4.#14         // java/lang/Object."<init>":()V
//   #2 = Fieldref           #3.#15         // com/example/jvm_3_clazz/InitTest.i:I
//   #3 = Class              #16            // com/example/jvm_3_clazz/InitTest
//   #4 = Class              #17            // java/lang/Object
//   #5 = Utf8               i
//   #6 = Utf8               I
//   #7 = Utf8               <init>
//   #8 = Utf8               ()V
//   #9 = Utf8               Code
//  #10 = Utf8               LineNumberTable
//  #11 = Utf8               <clinit>
//  #12 = Utf8               SourceFile
//  #13 = Utf8               InitTest.java
//  #14 = NameAndType        #7:#8          // "<init>":()V
//  #15 = NameAndType        #5:#6          // i:I
//  #16 = Utf8               com/example/jvm_3_clazz/InitTest
//  #17 = Utf8               java/lang/Object
//{
//  static int i;
//    descriptor: I
//    flags: ACC_STATIC
//
//  public com.example.jvm_3_clazz.InitTest();
//    descriptor: ()V
//    flags: ACC_PUBLIC
//    Code:
//      stack=1, locals=1, args_size=1
//         0: aload_0
//         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//         4: return
//      LineNumberTable:
//        line 3: 0
//
//  static {};
//    descriptor: ()V
//    flags: ACC_STATIC
//    Code:
//      stack=1, locals=0, args_size=0
//         0: bipush        10
//         2: putstatic     #2                  // Field i:I
//         5: bipush        20
//         7: putstatic     #2                  // Field i:I
//        10: bipush        30
//        12: putstatic     #2                  // Field i:I
//        15: return
//      LineNumberTable:
//        line 5: 0
//        line 8: 5
//        line 12: 10
//        line 13: 15
//}
//SourceFile: "InitTest.java"
