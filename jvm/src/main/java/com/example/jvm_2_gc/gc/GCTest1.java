package com.example.jvm_2_gc.gc;

import java.util.ArrayList;

public class GCTest1 {

    private static final int _512KB = 512 * 1024;
    private static final int _1Mb = 1024 * 1024;
    private static final int _6Mb = 6 * 1024 * 1024;
    private static final int _7Mb = 7 * 1024 * 1024;
    private static final int _8Mb = 8 * 1024 * 1024;

    // -Xms20M -Xmx20M -Xmn10M -XX:+UseSerialGC -XX:+PrintGCDetails -verbose:gc
    public static void main(String[] args) {
        // 如果在线程内OOM，主线程不结束
        ArrayList<byte[]> list = new ArrayList<>();
        list.add(new byte[_8Mb]);
        //Heap
        // def new generation   total 9216K, used 1711K [0x00000007bec00000, 0x00000007bf600000, 0x00000007bf600000)
        //  eden space 8192K,  20% used [0x00000007bec00000, 0x00000007bedabc20, 0x00000007bf400000)
        //  from space 1024K,   0% used [0x00000007bf400000, 0x00000007bf400000, 0x00000007bf500000)
        //  to   space 1024K,   0% used [0x00000007bf500000, 0x00000007bf500000, 0x00000007bf600000)
        // tenured generation   total 10240K, used 8192K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
        //   the space 10240K, 新生代空间不足，直接晋升老年代  80% used [0x00000007bf600000, 0x00000007bfe00010, 0x00000007bfe00200, 0x00000007c0000000)
        // Metaspace       used 3177K, capacity 4496K, committed 4864K, reserved 1056768K
        //  class space    used 349K, capacity 388K, committed 512K, reserved 1048576K
        list.add(new byte[_8Mb]);
        //[GC (Allocation Failure) [DefNew: 1546K->366K(9216K), 0.0041768 secs][Tenured: 8192K->8557K(10240K), 0.0012478 secs] 9738K->8557K(19456K), [Metaspace: 3170K->3170K(1056768K)], 0.0055743 secs] [Times: user=0.00 sys=0.01, real=0.01 secs]
        //[Full GC (Allocation Failure) [Tenured: 8557K->8540K(10240K), 0.0008628 secs] 8557K->8540K(19456K), [Metaspace: 3170K->3170K(1056768K)], 0.0008755 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
        //Heap
        // def new generation   total 9216K, used 410K [0x00000007bec00000, 0x00000007bf600000, 0x00000007bf600000)
        //  eden space 8192K,   5% used [0x00000007bec00000, 0x00000007bec66850, 0x00000007bf400000)
        //  from space 1024K,   0% used [0x00000007bf500000, 0x00000007bf500000, 0x00000007bf600000)
        //  to   space 1024K,   0% used [0x00000007bf400000, 0x00000007bf400000, 0x00000007bf500000)
        // tenured generation   total 10240K, used 8540K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
        //   the space 10240K,  83% used [0x00000007bf600000, 0x00000007bfe57210, 0x00000007bfe57400, 0x00000007c0000000)
        // Metaspace       used 3206K, capacity 4496K, committed 4864K, reserved 1056768K
        //  class space    used 353K, capacity 388K, committed 512K, reserved 1048576K OOM了
        //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        //	at com.example.jvm_2_gc.gc.GCTest1.main(GCTest1.java:26)
    }

}
