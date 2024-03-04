package com.example.jvm_1_memory.directMemory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class DirectMemoryTest {

    static final String FROM = "/Users/zhangzuohong/Downloads/Feishu-darwin_arm64-6.5.8-signed.dmg";

    static final String TO = "/Users/zhangzuohong/Desktop/Feishu-darwin_arm64-6.5.8-signed.dmg";

    static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        io();
        directBuffer();
    }

    private static void directBuffer() {
        long start = System.nanoTime();
        try (FileChannel from = new FileInputStream(FROM).getChannel();
             FileChannel to = new FileOutputStream(TO).getChannel()) {
            ByteBuffer bb = ByteBuffer.allocateDirect(_1MB);
            while (true) {
                int len = from.read(bb);
                if (len == -1) {
                    break;
                }
                bb.flip();
                to.write(bb);
                bb.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.nanoTime();
        System.out.println("directBuffer用时：" + (end - start) / 1000_000.0);
    }

    private static void io() {
        long start = System.nanoTime();
        try (FileInputStream from = new FileInputStream(FROM);
             FileOutputStream to = new FileOutputStream(TO)) {
            byte[] buf = new byte[_1MB];
            while (true) {
                int len = from.read(buf);
                if (len == -1) {
                    break;
                }
                to.write(buf, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long end = System.nanoTime();
        System.out.println("io用时：" + (end - start) / 1000_000.0);
    }

}
