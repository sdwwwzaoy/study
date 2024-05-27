package com.example.provider.controller;

import com.example.provider.anno.OpenApi;
import com.example.provider.domain.ServiceDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/bag")
public class BagController {

    @PostMapping("/queryByNo")
    @OpenApi(name = "测试接口", resource = "bag", action = "query_by_no")
    public ServiceDTO test() {
        System.out.println(new Date());
        return new ServiceDTO();
    }

}
