package com.example.jvm_3_clazz;

public class Demo {

    public static void main(String[] args) {
        int a = 10;
        int b = Short.MAX_VALUE + 1;
        int c = a + b;
        System.out.println(c);
    }

}

//Classfile /Users/admin/IdeaProjects/study/jvm/src/main/java/com/example/jvm_3_clazz/Demo.class
//  Last modified 2024-3-19; size 450 bytes
//  MD5 checksum a9c53bd411d54b4f5e5e3739312cab6f
//  Compiled from "Demo.java"
//public class com.example.jvm_3_clazz.Demo
//  minor version: 0
//  major version: 52
//  flags: ACC_PUBLIC, ACC_SUPER
//Constant pool:
//   #1 = Methodref          #7.#16         // java/lang/Object."<init>":()V
//   #2 = Class              #17            // java/lang/Short
//   #3 = Integer            32768
//   #4 = Fieldref           #18.#19        // java/lang/System.out:Ljava/io/PrintStream;
//   #5 = Methodref          #20.#21        // java/io/PrintStream.println:(I)V
//   #6 = Class              #22            // com/example/jvm_3_clazz/Demo
//   #7 = Class              #23            // java/lang/Object
//   #8 = Utf8               <init>
//   #9 = Utf8               ()V
//  #10 = Utf8               Code
//  #11 = Utf8               LineNumberTable
//  #12 = Utf8               main
//  #13 = Utf8               ([Ljava/lang/String;)V
//  #14 = Utf8               SourceFile
//  #15 = Utf8               Demo.java
//  #16 = NameAndType        #8:#9          // "<init>":()V
//  #17 = Utf8               java/lang/Short
//  #18 = Class              #24            // java/lang/System
//  #19 = NameAndType        #25:#26        // out:Ljava/io/PrintStream;
//  #20 = Class              #27            // java/io/PrintStream
//  #21 = NameAndType        #28:#29        // println:(I)V
//  #22 = Utf8               com/example/jvm_3_clazz/Demo
//  #23 = Utf8               java/lang/Object
//  #24 = Utf8               java/lang/System
//  #25 = Utf8               out
//  #26 = Utf8               Ljava/io/PrintStream;
//  #27 = Utf8               java/io/PrintStream
//  #28 = Utf8               println
//  #29 = Utf8               (I)V
//{
//  public com.example.jvm_3_clazz.Demo();
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
//  public static void main(java.lang.String[]);
//    descriptor: ([Ljava/lang/String;)V
//    flags: ACC_PUBLIC, ACC_STATIC
//    Code:
//      stack=2, locals=4, args_size=1
//         0: bipush        10
//         2: istore_1
//         3: ldc           #3                  // int 32768
//         5: istore_2
//         6: iload_1
//         7: iload_2
//         8: iadd
//         9: istore_3
//        10: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        13: iload_3
//        14: invokevirtual #5                  // Method java/io/PrintStream.println:(I)V
//        17: return
//      LineNumberTable:
//        line 6: 0
//        line 7: 3
//        line 8: 6
//        line 9: 10
//        line 10: 17
//}
//SourceFile: "Demo.java"