package org.example.buffer;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TestByteBuffer {

    public static void main(String[] args) {
        // FileChannel
        try (FileInputStream fis = new FileInputStream("netty-demo/data.txt")) {
            FileChannel channel = fis.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(10);
            while (true) {
                // read to channel
                int len = channel.read(buffer);
                if (len == -1) {
                    break;
                }
                // switch to read mode
                buffer.flip();
                while (buffer.hasRemaining()) {
                    byte b = buffer.get();
                    System.out.println((char) b);
                }
                buffer.clear();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
