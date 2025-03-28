package com.example.redisspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.redisspringboot.mappers")
public class RedisSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisSpringbootApplication.class, args);
	}

}
