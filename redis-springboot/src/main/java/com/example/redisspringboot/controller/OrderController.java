package com.example.redisspringboot.controller;

import com.example.redisspringboot.domain.OrderReq;
import com.example.redisspringboot.domain.Result;
import com.example.redisspringboot.service.iface.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    IOrderService orderService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Result<?> create(@RequestBody OrderReq req) {
        return orderService.createOrder(req);
    }

}
