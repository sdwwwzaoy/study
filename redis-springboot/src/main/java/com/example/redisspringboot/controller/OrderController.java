package com.example.redisspringboot.controller;

import com.example.redisspringboot.domain.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Result<?> create() {

        return Result.ok();
    }

}
