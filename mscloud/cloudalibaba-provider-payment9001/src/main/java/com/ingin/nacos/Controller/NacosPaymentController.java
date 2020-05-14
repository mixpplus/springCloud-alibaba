package com.ingin.nacos.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-11 16:41
 */
@RestController
public class NacosPaymentController {

    @Value("${server.port}")
    private Integer port;
    @RequestMapping("/nacos/payment/get")
    public String getString() {
        return "nacosPayment: port:" + port;
    }
}
