package com.example.provider.domain;

import lombok.Data;

@Data
public class ServiceDTO {

    int errCode;

    String errMsg;

    Object result;

}
