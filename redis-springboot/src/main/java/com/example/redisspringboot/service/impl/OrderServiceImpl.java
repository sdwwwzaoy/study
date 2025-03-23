package com.example.redisspringboot.service.impl;

import com.example.redisspringboot.domain.Result;
import com.example.redisspringboot.mappers.OrderMapper;
import com.example.redisspringboot.service.iface.IOrderService;
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
    public Result<?> createOrder() {
        return Result.ok();
    }

}
