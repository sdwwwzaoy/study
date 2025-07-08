package com.example.redisspringboot.service.iface;

import com.example.redisspringboot.domain.OrderReq;
import com.example.redisspringboot.domain.Result;

public interface IOrderService {

    Result<?> createOrder(OrderReq req);

}
