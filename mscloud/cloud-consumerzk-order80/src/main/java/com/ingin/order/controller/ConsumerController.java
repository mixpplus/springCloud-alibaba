package com.ingin.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-08 12:20
 */
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    private static final String PAYMENT_URL="http://cloud-provider-payment";

    @GetMapping("/order/str")
    public String getstr() {
        String str = restTemplate.getForObject(PAYMENT_URL + "/payment/str", String.class);
        return str;
    }
}
