package com.example.jvm_1_memory;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class DirectOOM {

    static int _100MB = 1024 * 1024 * 100;

    public static void main(String[] args) {
        List<ByteBuffer> list = new ArrayList<>();
        int i = 0;
        try {
            while (true) {
                ByteBuffer bb = ByteBuffer.allocateDirect(_100MB);
                list.add(bb);
                i++;
            }
        } finally {
            System.out.println(i);
        }
    }
}
