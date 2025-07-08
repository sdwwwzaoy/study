package com.example.redisspringboot.service.impl;

import com.example.redisspringboot.builder.OrderBuilder;
import com.example.redisspringboot.domain.OrderReq;
import com.example.redisspringboot.domain.Result;
import com.example.redisspringboot.entity.MallOrder;
import com.example.redisspringboot.mappers.OrderMapper;
import com.example.redisspringboot.service.iface.IOrderService;
import com.example.redisspringboot.utils.OrderNoUtil;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    RedissonClient redissonClient;

    @Autowired
    OrderMapper orderMapper;

    @Override
    public Result<?> createOrder(OrderReq req) {
        MallOrder order = OrderBuilder.INSTANCE.toOrder(req);
        order.setOrderNo(OrderNoUtil.generateOrderNo());
        order.setStatus(0);
        orderMapper.insert(order);
        return Result.ok();
    }

}
