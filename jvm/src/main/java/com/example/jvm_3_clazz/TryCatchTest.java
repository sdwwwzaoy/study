package com.example.jvm_3_clazz;

public class TryCatchTest {

    public static void main(String[] args) {
        int i = 0;
        try {
            i = 10;
        } catch (Exception e) {
            i = 20;
        }
    }

    //  public static void main(java.lang.String[]);
    //    descriptor: ([Ljava/lang/String;)V
    //    flags: ACC_PUBLIC, ACC_STATIC
    //    Code:
    //      stack=1, locals=3, args_size=1
    //         0: iconst_0
    //         1: istore_1
    //         2: bipush        10
    //         4: istore_1
    //         5: goto          12
    //         8: astore_2
    //         9: bipush        20
    //        11: istore_1
    //        12: return
    //      Exception table:
    //         from    to  target type
    //             2     5     8   Class java/lang/Exception
    //多个exception复用一个变量slot

}
