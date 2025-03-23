package com.example.redisspringboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("order")
public class Order {

    @TableId(type = IdType.AUTO)
    Long id;

    @TableField("order_no")
    String orderNo;

    @TableField("user_id")
    String userId;

    @TableField("create_time")
    Date createTime;

    @TableField("update_time")
    Date updateTime;

}
