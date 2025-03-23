package com.example.redisspringboot.service.iface;

import com.example.redisspringboot.domain.Result;

public interface IOrderService {

    Result<?> createOrder();

}
