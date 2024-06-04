package com.example.jvm_3_clazz;

public class SyncTest {

    public static void main(String[] args) {
        Object lock = new Object();
        synchronized (lock) {
            System.out.println("ok");
        }
    }

    // public static void main(java.lang.String[]);
    //    descriptor: ([Ljava/lang/String;)V
    //    flags: ACC_PUBLIC, ACC_STATIC
    //    Code:
    //      stack=2, locals=4, args_size=1
    //         0: new           #2                  // class java/lang/Object
    //         3: dup
    //         4: invokespecial #1                  // Method java/lang/Object."<init>":()V
    //         7: astore_1
    //         8: aload_1
    //         9: dup
    //        10: astore_2
    //        11: monitorenter
    //        12: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
    //        15: ldc           #4                  // String ok
    //        17: invokevirtual #5                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
    //        20: aload_2
    //        21: monitorexit
    //        22: goto          30
    //        25: astore_3
    //        26: aload_2
    //        27: monitorexit
    //        28: aload_3
    //        29: athrow
    //        30: return
    //      Exception table:
    //         from    to  target type
    //            12    22    25   any
    //            25    28    25   any
    //      LineNumberTable:
    //        line 6: 0
    //        line 7: 8
    //        line 8: 12
    //        line 9: 20
    //        line 10: 30


}
