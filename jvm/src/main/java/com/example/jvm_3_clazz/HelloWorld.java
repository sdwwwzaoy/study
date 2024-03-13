package com.example.jvm_3_clazz;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");
    }
    //javac -parameters -d . HelloWorld.java

    //0000000    |ca  fe  ba  be| magic   |00  00| minor_version  |00  3d (61=jdk 17)| major_version  |00  1f(31,#0不计入,常量池有#1~#30项)|  |0a (method ref) => ((00  02)#2 class name) (00  03)#3 method name)  07
    //0000020    00  04  0c  00  05  00  06  |01 utf-8  (00  10 16bytes)  (6a  61  76  61  2f  6c
    //0000040    61  6e  67  2f  4f  62  6a  65  63  74)|   |01 utf-8 (00  06 6bytes)  (3c  69  6e
    //0000060    69  74  3e <init>) |01 utf-8  (00  03 3bytes)  (28  29  56 ()V void)| |09 (field ref)  (00  08)  (00  09)|  |07 (class)  (00
    //0000100    0a #10)|  |0c (NameAndType)  (00  0b)#11  (00  0c)#12|  |01 (utf-8) (00  10)16bytes (6a  61  76  61  2f  6c  61
    //0000120    6e  67  2f  53  79  73  74  65  6d java/lang/System)|  |01 (utf-8) (00  03)  (6f  75  74) out  |01 (utf-8)
    //0000140    (00  15) 21bytes  (4c  6a  61  76  61  2f  69  6f  2f  50  72  69  6e  74
    //0000160    53  74  72  65  61  6d  3b) Ljava/io/PrintStream;|  |08 (String) (00  0e)#14|  |01 (utf-8) (00  0b) 11bytes (68  65  6c
    //0000200    6c  6f  20  77  6f  72  6c  64)|  |0a (method ref) (00  10)#16  (00  11)#17|  |07 (class) (00  12)#18|
    //0000220    |0c (NameAndType) (00  13)#19 (00  14)#20|  |01 (utf-8) (00  13)  (6a  61  76  61  2f  69  6f  2f
    //0000240    50  72  69  6e  74  53  74  72  65  61  6d) java/io/PrintStream|  |01 (utf-8) (00  07)  (70  72
    //0000260    69  6e  74  6c  6e) println|  |01 (utf-8) (00  15) 21bytes (28  4c  6a  61  76  61  2f  6c
    //0000300    61  6e  67  2f  53  74  72  69  6e  67  3b  29  56) (Ljava/lang/String;)V|  |07 (class) (00  16)#22|
    //0000320    |01 (utf-8) (00  22) 34bytes (63  6f  6d  2f  65  78  61  6d  70  6c  65  2f  6a
    //0000340    76  6d  5f  33  5f  63  6c  61  7a  7a  2f  48  65  6c  6c  6f
    //0000360    57  6f  72  6c  64) com/example/jvm_3_clazz/HelloWorld|  |01 (utf-8) (00  04) (43  6f  64  65) Code|  |01 (utf-8) (00  0f) 15bytes (4c
    //0000400    69  6e  65  4e  75  6d  62  65  72  54  61  62  6c  65)LineNumberTable|  |01 (utf-8) (00
    //0000420    04) 4bytes (6d  61  69  6e) main|  |01 (utf-8) (00  16) 22bytes (28  5b  4c  6a  61  76  61  2f
    //0000440    6c  61  6e  967  2f  53  74  72  69  6e  67  3b  29  56) ([Ljava/lang/String;)V|  |01 (utf-8) (00
    //0000460    10) 16bytes (4d  65  74  68  6f  64  50  61  72  61  6d  65  74  65  72
    //0000500    73)|  |01 (utf-8) (00  04) 4bytes (61  72  67  73) args|  |01 (utf-8) (00  0a) 10bytes (53  6f  75  72  63
    //0000520    65  46  69  6c  65) SourceFile|  |01 (utf-8) (00  0f) 15bytes (48  65  6c  6c  6f  57  6f  72
    //0000540    6c  64  2e  6a  61  76  61) HelloWorld.java|  |00  21 access_flags (public class)|  |00  15 this_class #21|  |00  02 super_class #2| |00  00 interfaces: 0|  |00
    //0000560    00 fields: 0|  |00  02  methods: 2|  (( ((|00  01 public|  |00  05 (#5 <init>)|  |00  06 ()V|  |00  01 attributes: 1|  |00  17 (#23 Code)|  |00  00  00
    //0000600    1d 29bytes|  (|00  01 操作数栈深度|  |00  01局部变量表长度 this|  |00  00  00  05 代码长度5bytes|  |2a  b7  00  01  b1 byte code|  |00  00
    //0000620    00  01 子属性1个|  |00  18 (#24 LineNumberTable 用于将字节码和代码行号对应，debug)|  |00  00  00  06 LineNumberTable的长度|  |00  01 表长度|  |00  00 字节码起始行号|  |00  03 对应java源码的第4行|))  ((00  09 (public static)
    //0000640    |00  19 (main)|  |00  1a (([Ljava/lang/String;)V)|  |00  02 方法属性2个|  |00  17 Code|  |00  00  00  25 代码长度37bytes|  |00  02 操作数栈深度|  |00  01 局部变量表长度|
    //0000660    |00  00  00  09代码长度|  |b2  00  07  12  0d  b6  00  0f  b1|  |00  00  00
    //0000700    01 附加属性1个|  |00  18 LineNumberTable|  |00  00  00  0a 10bytes|  |00  02 有2项|  |00  00 => 00  06|  |00  08 => 00
    //0000720    07|  |00  1b MethodParameters|  |00  00  00  05 5bytes|  |01 参数数量1  (00  1c args)  (00  00 正常 10就是final)|  |附加属性 00  01 1个 (00  1d SourceFile)
    //0000740    |00  00  00  02 属性长度为2|  |00  1e HelloWorld.java|
    //0000746

    //Classfile /Users/zhangzuohong/IdeaProjects/study/jvm/src/main/java/com/example/jvm_3_clazz/com/example/jvm_3_clazz/HelloWorld.class
    //  Last modified 2024年3月12日; size 486 bytes
    //  SHA-256 checksum 9c87ca393b81cad888f7e31360a3fed2b9eaa2dac12d46c1e9deebceb2b6031a
    //  Compiled from "HelloWorld.java"
    //public class com.example.jvm_3_clazz.HelloWorld
    //  minor version: 0
    //  major version: 61
    //  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
    //  this_class: #21                         // com/example/jvm_3_clazz/HelloWorld
    //  super_class: #2                         // java/lang/Object
    //  interfaces: 0, fields: 0, methods: 2, attributes: 1
    //Constant pool:
    //   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
    //   #2 = Class              #4             // java/lang/Object
    //   #3 = NameAndType        #5:#6          // "<init>":()V
    //   #4 = Utf8               java/lang/Object
    //   #5 = Utf8               <init>
    //   #6 = Utf8               ()V
    //   #7 = Fieldref           #8.#9          // java/lang/System.out:Ljava/io/PrintStream;
    //   #8 = Class              #10            // java/lang/System
    //   #9 = NameAndType        #11:#12        // out:Ljava/io/PrintStream;
    //  #10 = Utf8               java/lang/System
    //  #11 = Utf8               out
    //  #12 = Utf8               Ljava/io/PrintStream;
    //  #13 = String             #14            // hello world
    //  #14 = Utf8               hello world
    //  #15 = Methodref          #16.#17        // java/io/PrintStream.println:(Ljava/lang/String;)V
    //  #16 = Class              #18            // java/io/PrintStream
    //  #17 = NameAndType        #19:#20        // println:(Ljava/lang/String;)V
    //  #18 = Utf8               java/io/PrintStream
    //  #19 = Utf8               println
    //  #20 = Utf8               (Ljava/lang/String;)V
    //  #21 = Class              #22            // com/example/jvm_3_clazz/HelloWorld
    //  #22 = Utf8               com/example/jvm_3_clazz/HelloWorld
    //  #23 = Utf8               Code
    //  #24 = Utf8               LineNumberTable
    //  #25 = Utf8               main
    //  #26 = Utf8               ([Ljava/lang/String;)V
    //  #27 = Utf8               MethodParameters
    //  #28 = Utf8               args
    //  #29 = Utf8               SourceFile
    //  #30 = Utf8               HelloWorld.java
    //{
    //  public com.example.jvm_3_clazz.HelloWorld();
    //    descriptor: ()V
    //    flags: (0x0001) ACC_PUBLIC
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
    //    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    //    Code:
    //      stack=2, locals=1, args_size=1
    //         0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
    //         3: ldc           #13                 // String hello world
    //         5: invokevirtual #15                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
    //         8: return
    //      LineNumberTable:
    //        line 6: 0
    //        line 7: 8
    //    MethodParameters:
    //      Name                           Flags
    //      args
    //}
    //SourceFile: "HelloWorld.java"

}
