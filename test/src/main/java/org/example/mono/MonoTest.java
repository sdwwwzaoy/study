package org.example.mono;

import reactor.core.publisher.Mono;

public class MonoTest {

    public static void main(String[] args) {
        // 使用 Mono.defer() 创建一个延迟执行的 Mono 对象
        Mono<String> deferredMono = Mono.defer(() -> {
            // 在 Supplier 中定义生成元素的逻辑
            System.out.println("Generating element...");
            return Mono.just("Hello, world!");
        });

        // 订阅 Mono 对象并打印元素
        deferredMono.subscribe(System.out::println);
    }
}
