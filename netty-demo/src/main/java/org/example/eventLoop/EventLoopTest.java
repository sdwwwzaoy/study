package org.example.eventLoop;

import io.netty.channel.DefaultEventLoop;
import io.netty.channel.EventLoop;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

import java.util.concurrent.TimeUnit;

public class EventLoopTest {

    public static void main(String[] args) {
        //1.create event loop group
        EventLoopGroup group = new NioEventLoopGroup(2);//io,普通,定时
        //EventLoopGroup group = new DefaultEventLoop();//普通,定时

        //2.get next event loop
        for (int i = 0; i < 3; i++) {
            System.out.println(group.next());
        }

        //3.execute common task
        group.next().submit(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("[" + Thread.currentThread().getName() + "] " + "ok1");
        });
        System.out.println("main");

        // 4.execute scheduled task
        group.next().scheduleAtFixedRate(() -> {
            System.out.println("[" + Thread.currentThread().getName() + "] " + "ok2");
        }, 0, 1, TimeUnit.SECONDS);

    }

}
