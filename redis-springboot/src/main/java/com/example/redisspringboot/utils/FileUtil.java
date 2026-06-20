package com.example.redisspringboot.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;

import java.io.IOException;

@Slf4j
public class FileUtil {

    public static byte[] getBytesFromResource(String resourcePath) {
        try {
            ClassPathResource resource = new ClassPathResource(resourcePath);
            return StreamUtils.copyToByteArray(resource.getInputStream());
        } catch (IOException e) {
            log.error(e.toString());
        }
        return new byte[0];
    }

    public static void main(String[] args) throws IOException {
        byte[] bytes = getBytesFromResource("application.yml");
        System.out.println(new String(bytes));
    }

}
