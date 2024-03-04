package com.example.jvm_1_memory.stringTable;

public class StringTableTest {

    //常量池中的信息会被加载到运行时常量池，这时ab都是常量池中的符号，不是String对象
    //ldc           #7会把a变成字符串对象

    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        String s5 = "a" + "b";

        String s4 = s2 + s3;//String对象拼接
        System.out.println(s4 == s3);
        System.out.println(s5 == s3);
    }
    //Constant pool:
    //   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
    //   #2 = Class              #4             // java/lang/Object
    //   #3 = NameAndType        #5:#6          // "<init>":()V
    //   #4 = Utf8               java/lang/Object
    //   #5 = Utf8               <init>
    //   #6 = Utf8               ()V
    //   #7 = String             #8             // a
    //   #8 = Utf8               a
    //   #9 = String             #10            // b
    //  #10 = Utf8               b
    //  #11 = String             #12            // ab
    //  #12 = Utf8               ab
    //  #13 = Class              #14            // com/example/jvm_1_memory/stringTable/StringTableTest
    //  #14 = Utf8               com/example/jvm_1_memory/stringTable/StringTableTest
    //  #15 = Utf8               Code
    //  #16 = Utf8               LocalVariableTable
    //  #17 = Utf8               this
    //  #18 = Utf8               Lcom/example/jvm_1_memory/stringTable/StringTableTest;
    //  #19 = Utf8               main
    //  #20 = Utf8               ([Ljava/lang/String;)V
    //  #21 = Utf8               args
    //  #22 = Utf8               [Ljava/lang/String;
    //  #23 = Utf8               s1
    //  #24 = Utf8               Ljava/lang/String;
    //  #25 = Utf8               s2
    //  #26 = Utf8               s3
    //{
    //  public com.example.jvm_1_memory.stringTable.StringTableTest();
    //    descriptor: ()V
    //    flags: (0x0001) ACC_PUBLIC
    //    Code:
    //      stack=1, locals=1, args_size=1
    //         0: aload_0
    //         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
    //         4: return
    //      LocalVariableTable:
    //        Start  Length  Slot  Name   Signature
    //            0       5     0  this   Lcom/example/jvm_1_memory/stringTable/StringTableTest;
    //
    //  public static void main(java.lang.String[]);
    //    descriptor: ([Ljava/lang/String;)V
    //    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    //    Code:
    //      stack=1, locals=4, args_size=1
    //         0: ldc           #7                  // String a
    //         2: astore_1
    //         3: ldc           #9                  // String b
    //         5: astore_2
    //         6: ldc           #11                 // String ab
    //         8: astore_3
    //         9: return
    //      LocalVariableTable:
    //        Start  Length  Slot  Name   Signature
    //            0      10     0  args   [Ljava/lang/String;
    //            3       7     1    s1   Ljava/lang/String;
    //            6       4     2    s2   Ljava/lang/String;
    //            9       1     3    s3   Ljava/lang/String;
    //}

}
