package com.example.jvm_1_memory.heap;

import java.util.ArrayList;

public class GCTest {

    private static final int _512KB = 512 * 1024;
    private static final int _1Mb = 1024 * 1024;
    private static final int _6Mb = 6 * 1024 * 1024;
    private static final int _7Mb = 7 * 1024 * 1024;
    private static final int _8Mb = 8 * 1024 * 1024;

    // -Xms20M -Xmx20M -Xmn10M -XX:+UseSerialGC -XX:+PrintGCDetails -verbose:gc
    public static void main(String[] args) {
        //Heap 堆
        // def new generation 新生代  total 9216K 总大小9M，幸存区1M有一个为空, used 1711K 使用量 [0x00000007bec00000, 0x00000007bf600000, 0x00000007bf600000)
        //  eden space 8192K,  20% used [0x00000007bec00000, 0x00000007bedabc20, 0x00000007bf400000)
        //  from space 1024K,   0% used [0x00000007bf400000, 0x00000007bf400000, 0x00000007bf500000)
        //  to   space 1024K,   0% used [0x00000007bf500000, 0x00000007bf500000, 0x00000007bf600000)
        // tenured generation 老年代  total 10240K, used 0K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
        //   the space 10240K,   0% used [0x00000007bf600000, 0x00000007bf600000, 0x00000007bf600200, 0x00000007c0000000)
        // Metaspace   元空间    used 3171K, capacity 4496K, committed 4864K, reserved 1056768K
        //  class space    used 348K, capacity 388K, committed 512K, reserved 1048576K
        ArrayList<byte[]> list = new ArrayList<>();
        list.add(new byte[_7Mb]);
        //[GC (Allocation Failure) [ DefNew: 回收前内存占用 1546K->回收后内存占用 369K(9216K 总大小), 0.0032272 secs GC时间] 1546K->369K(19456K), 0.0034263 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
        //Heap
        // def new generation   total 9216K, used 7947K [0x00000007bec00000, 0x00000007bf600000, 0x00000007bf600000)
        //  eden space 8192K,  92% used [0x00000007bec00000, 0x00000007bf366830, 0x00000007bf400000)
        //  from space 1024K,  36% used [0x00000007bf500000, 0x00000007bf55c428, 0x00000007bf600000)
        //  to   space 1024K,   0% used [0x00000007bf400000, 0x00000007bf400000, 0x00000007bf500000)
        // tenured generation   total 10240K, used 0K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
        //   the space 10240K,   0% used [0x00000007bf600000, 0x00000007bf600000, 0x00000007bf600200, 0x00000007c0000000)
        // Metaspace       used 3172K, capacity 4496K, committed 4864K, reserved 1056768K
        //  class space    used 348K, capacity 388K, committed 512K, reserved 1048576K
        list.add(new byte[_512KB]);
        //[GC (Allocation Failure) [DefNew: 1546K->361K(9216K), 0.0034190 secs] 1546K->361K(19456K), 0.0035838 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
        //Heap
        // def new generation   total 9216K, used 8451K [0x00000007bec00000, 0x00000007bf600000, 0x00000007bf600000)
        //  eden space 8192K, eden区快满了  98% used [0x00000007bec00000, 0x00000007bf3e6870, 0x00000007bf400000)
        //  from space 1024K,  35% used [0x00000007bf500000, 0x00000007bf55a418, 0x00000007bf600000)
        //  to   space 1024K,   0% used [0x00000007bf400000, 0x00000007bf400000, 0x00000007bf500000)
        // tenured generation   total 10240K, used 0K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
        //   the space 10240K,   0% used [0x00000007bf600000, 0x00000007bf600000, 0x00000007bf600200, 0x00000007c0000000)
        // Metaspace       used 3173K, capacity 4496K, committed 4864K, reserved 1056768K
        //  class space    used 348K, capacity 388K, committed 512K, reserved 1048576K
        list.add(new byte[_512KB]);
        //[GC (Allocation Failure) [DefNew: 1546K->366K(9216K), 0.0040977 secs] 1546K->366K(19456K), 0.0042850 secs] [Times: user=0.01 sys=0.00, real=0.01 secs]
        //[GC (Allocation Failure) 又触发了一次GC [DefNew: 8374K->876K(9216K), 0.0032543 secs] 8374K->8044K(19456K), 0.0032721 secs] [Times: user=0.00 sys=0.01, real=0.01 secs]
        //Heap
        // def new generation   total 9216K, used 1718K [0x00000007bec00000, 0x00000007bf600000, 0x00000007bf600000)
        //  eden space 8192K,  10% used [0x00000007bec00000, 0x00000007becd2778, 0x00000007bf400000)
        //  from space 1024K,  85% used [0x00000007bf400000, 0x00000007bf4db340, 0x00000007bf500000)
        //  to   space 1024K,   0% used [0x00000007bf500000, 0x00000007bf500000, 0x00000007bf600000)
        // tenured generation 虽然没到15次，但是内存紧张，直接进入老年代  total 10240K, used 7168K [0x00000007bf600000, 0x00000007c0000000, 0x00000007c0000000)
        //   the space 10240K,  70% used [0x00000007bf600000, 0x00000007bfd00010, 0x00000007bfd00200, 0x00000007c0000000)
        // Metaspace       used 3191K, capacity 4496K, committed 4864K, reserved 1056768K
        //  class space    used 352K, capacity 388K, committed 512K, reserved 1048576K

    }

}
