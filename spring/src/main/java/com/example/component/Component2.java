package com.example.component;

import com.example.event.UserRegisterEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Component2 {

    @EventListener
    public void listen(UserRegisterEvent event) {
        System.out.println("event======");
    }

}
