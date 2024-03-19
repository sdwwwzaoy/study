package com.example.jvm_3_clazz;

public class IfTest {

    public static void main(String[] args) {
        int a = 0;
        if (a == 0) {
            a = 10;
        } else {
            a = 20;
        }
    }

    //Classfile /Users/admin/IdeaProjects/study/jvm/src/main/java/com/example/jvm_3_clazz/IfTest.class
    //  Last modified 2024-3-19; size 341 bytes
    //  MD5 checksum 14750a295eb9b3db3d66c7a586e280db
    //  Compiled from "IfTest.java"
    //public class com.example.jvm_3_clazz.IfTest
    //  minor version: 0
    //  major version: 52
    //  flags: ACC_PUBLIC, ACC_SUPER
    //Constant pool:
    //   #1 = Methodref          #3.#13         // java/lang/Object."<init>":()V
    //   #2 = Class              #14            // com/example/jvm_3_clazz/IfTest
    //   #3 = Class              #15            // java/lang/Object
    //   #4 = Utf8               <init>
    //   #5 = Utf8               ()V
    //   #6 = Utf8               Code
    //   #7 = Utf8               LineNumberTable
    //   #8 = Utf8               main
    //   #9 = Utf8               ([Ljava/lang/String;)V
    //  #10 = Utf8               StackMapTable
    //  #11 = Utf8               SourceFile
    //  #12 = Utf8               IfTest.java
    //  #13 = NameAndType        #4:#5          // "<init>":()V
    //  #14 = Utf8               com/example/jvm_3_clazz/IfTest
    //  #15 = Utf8               java/lang/Object
    //{
    //  public com.example.jvm_3_clazz.IfTest();
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
    //      stack=1, locals=2, args_size=1
    //         0: iconst_0
    //         1: istore_1
    //         2: iload_1
    //         3: ifne          12
    //         6: bipush        10
    //         8: istore_1
    //         9: goto          15
    //        12: bipush        20
    //        14: istore_1
    //        15: return
    //      LineNumberTable:
    //        line 6: 0
    //        line 7: 2
    //        line 8: 6
    //        line 10: 12
    //        line 12: 15
    //      StackMapTable: number_of_entries = 2
    //        frame_type = 252 /* append */
    //          offset_delta = 12
    //          locals = [ int ]
    //        frame_type = 2 /* same */
    //}

}
