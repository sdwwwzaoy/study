package org.example.buffer;

import java.nio.ByteBuffer;

public class TestByteBufferRW {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put((byte) 0x61);
    }

}
