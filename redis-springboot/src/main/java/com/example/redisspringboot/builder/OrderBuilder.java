package com.example.redisspringboot.builder;

import com.example.redisspringboot.domain.OrderReq;
import com.example.redisspringboot.entity.MallOrder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface OrderBuilder {

    OrderBuilder INSTANCE = Mappers.getMapper(OrderBuilder.class);

    @Mapping(target = "userId", source = "userId")
    MallOrder toOrder(OrderReq orderReq);

}
