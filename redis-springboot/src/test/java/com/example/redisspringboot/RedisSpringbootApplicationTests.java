package com.example.redisspringboot;

import com.alibaba.fastjson.JSON;
import com.example.redisspringboot.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class RedisSpringbootApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        redisTemplate.getConnectionFactory().getConnection().flushDb();
        User user = new User("zzh", 25);
        String userJson = JSON.toJSONString(user);
        ValueOperations<String, Object> ops = redisTemplate.opsForValue();
        ops.set("user", user);
        Object userValue = ops.get("user");
        System.out.println(userValue);
    }

}
