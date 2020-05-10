package com.ingin.consul.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-08 14:21
 */
@RestController
public class ConsulController {

    @Value("${server.port}")
    private int port;

    @RequestMapping("/payment/consul/str")
    public String getStr() {
        return "hello world " + port + " " + UUID.randomUUID().toString();
    }
}
