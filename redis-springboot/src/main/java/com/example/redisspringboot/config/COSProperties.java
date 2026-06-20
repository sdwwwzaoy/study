package com.example.redisspringboot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class COSProperties {

    @Value("${qcloud.cos.secretId}")
    private String secretId;

    @Value("${qcloud.cos.secretKey}")
    private String secretKey;

    @Value("${qcloud.cos.region}")
    private String cosRegion;

    @Value("${qcloud.cos.bucketName}")
    private String bucketName;

}
