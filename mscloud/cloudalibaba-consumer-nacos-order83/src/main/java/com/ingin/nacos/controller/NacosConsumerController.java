package com.ingin.nacos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-11 16:56
 */
@RestController
public class NacosConsumerController {
    @Value("${service.nacos-payment-provider}")
    private String service;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/get")
    public String getStr() {
        ResponseEntity<String> entity = restTemplate.getForEntity(service + "/nacos/payment/get", String.class);
        return entity.getBody();
    }
}
