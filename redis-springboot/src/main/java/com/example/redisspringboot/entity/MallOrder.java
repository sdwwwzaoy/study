package com.example.redisspringboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("mall_order")
public class MallOrder {

    @TableId(type = IdType.AUTO)
    Long id;

    @TableField("order_no")
    String orderNo;

    @TableField("user_id")
    String userId;

    @TableField("status")
    Integer status;

    @TableField("create_time")
    Date createTime;

    @TableField("update_time")
    Date updateTime;

}
