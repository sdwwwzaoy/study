package com.example.redisspringboot;

import com.alibaba.fastjson.JSON;
import com.example.redisspringboot.config.COSProperties;
import com.example.redisspringboot.pojo.User;
import com.example.redisspringboot.utils.FileUtil;
import com.qcloud.cos.COSClient;
import com.qcloud.cos.model.Bucket;
import com.qcloud.cos.model.GeneratePresignedUrlRequest;
import com.qcloud.cos.model.PutObjectRequest;
import com.qcloud.cos.model.PutObjectResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@SpringBootTest
class RedisSpringbootApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    COSClient cosClient;

    @Autowired
    COSProperties cosProperties;

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

    @Test
    void testCOSBucketList() {
        List<Bucket> buckets = cosClient.listBuckets();
        for (Bucket bucket : buckets) {
            System.out.println(bucket);
        }
    }

    @Test
    void testPutObject() throws IOException {
        InputStream is = new ClassPathResource("application.yml").getInputStream();
        String key = UUID.randomUUID().toString().replace("-", "");
        PutObjectRequest putObjectRequest =
                new PutObjectRequest(cosProperties.getBucketName(), key, is, null);
        PutObjectResult res = cosClient.putObject(putObjectRequest);
        System.out.println(JSON.toJSONString(res));
    }

    @Test
    void testCOSGetObjectUrl() {
        URL url = cosClient.getObjectUrl(cosProperties.getBucketName(), "7eea7eabe2444ac6aa75df0d3987caa2");
        System.out.println(url);
    }

    @Test
    void testCOSGeneratePresignedUrl() {
        GeneratePresignedUrlRequest req =
                new GeneratePresignedUrlRequest(cosProperties.getBucketName(), "7eea7eabe2444ac6aa75df0d3987caa2");
        req.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60));
        URL url = cosClient.generatePresignedUrl(req);
        System.out.println(url);
    }

}
