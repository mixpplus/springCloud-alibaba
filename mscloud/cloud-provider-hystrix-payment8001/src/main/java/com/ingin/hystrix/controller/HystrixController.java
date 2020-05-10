package com.ingin.hystrix.controller;

import com.ingin.hystrix.service.HystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-09 21:08
 */
@RestController
@DefaultProperties(defaultFallback = "defaultHandler")
public class HystrixController {

    @Autowired
    private HystrixService hystrixService;

    @GetMapping("/payment/ok")
    @HystrixCommand
    public String getOkStr() {
        return hystrixService.returnOkStr();
    }

    @GetMapping("/payment/timeout")
    @HystrixCommand(defaultFallback = "timeOutHandler")
//    @HystrixCommand
    public String getTimeOutStr() throws InterruptedException {
        return hystrixService.returnTimeOutStr();
    }

    public String timeOutHandler(){
        return "这是熔断方法";
    }

    public String defaultHandler() {
        return "这是全局默认熔断方法";
    }
}
