package org.example.reactor.flux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxTest {

    public static void main(String[] args) {
        Flux<String> deferredMono = Flux.defer(() -> {
            // 在 Supplier 中定义生成元素的逻辑
            System.out.println("Generating element...");
            return Flux.just("Hello, world!");
        });

        // 订阅 Mono 对象并打印元素
        deferredMono.subscribe(System.out::println);
    }

}
