package com.ingin.payment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-08 12:02
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private int port;
    @RequestMapping("/payment/str")
    public String responseStr() {
        return "hello world" + port +"  "+ UUID.randomUUID().toString();
    }
}
