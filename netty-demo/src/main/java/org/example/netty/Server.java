package org.example.netty;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class Server {

    public static void main(String[] args) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(16);
        try (ServerSocketChannel ssc = ServerSocketChannel.open()) {
            // create selector
            Selector selector = Selector.open();
            ssc.configureBlocking(false);

            // bind selector and channel
            SelectionKey sscKey = ssc.register(selector, 0, null);
            sscKey.interestOps(SelectionKey.OP_ACCEPT);
            System.out.println(sscKey);
            ssc.bind(new InetSocketAddress(8080));
            while (true) {
                // select wait
                selector.select();

                // handle event
                for (SelectionKey key : selector.selectedKeys()) {
                    System.out.println(key);
                    ServerSocketChannel channel = (ServerSocketChannel) key.channel();
                    SocketChannel sc = channel.accept();
                    System.out.println(sc);
                }

            }
        }
    }

}
