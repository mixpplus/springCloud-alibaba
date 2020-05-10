package com.ingin.hystrix.controller;

import cn.hutool.core.util.IdUtil;
import com.ingin.hystrix.feign.PaymentFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-09 21:17
 */
@RestController
public class HystrixFeignController {

    @Autowired
    private PaymentFeign paymentFeign;

    @GetMapping("/consumer/payment/ok")
    public String getOkStr() {
        return paymentFeign.getOkStr();
    }

    @GetMapping("/consumer/payment/timeout")
//    @HystrixCommand(defaultFallback = "defaultHandler")
    public String getTimeOutStr() throws InterruptedException {
        return paymentFeign.getTimeOutStr();
    }

    @GetMapping("/consumer/get/{id}")
    @HystrixCommand(defaultFallback = "defaultHandler")
    public String getstr(@PathVariable("id") Integer id) {

        if (id < 0) {
            throw new RuntimeException("不能为负数");
        }
        return "ok" + IdUtil.simpleUUID();
    }

    public String defaultHandler(){
        return "这是默认熔断方法consumer";
    }
}
