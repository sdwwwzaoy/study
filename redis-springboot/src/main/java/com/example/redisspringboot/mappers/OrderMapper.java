package com.example.redisspringboot.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.redisspringboot.entity.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper extends BaseMapper<Order> {

}
