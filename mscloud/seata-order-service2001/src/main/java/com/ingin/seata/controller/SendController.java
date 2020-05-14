package com.ingin.seata.controller;

import com.ingin.seata.feign.ReceiveFeign;
import com.ingin.seata.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-14 14:57
 */
@RestController
public class SendController {

    @Autowired
    private SendService sendService;

    @Autowired
    private ReceiveFeign receiveFeign;

    @GetMapping("/send")
    public String send(@RequestParam("id") Long id, @RequestParam("money") Double money) {

        sendService.send(id, money);
        return "ok success";
    }

    @GetMapping("/tt")
//    @HystrixCommand(fallbackMethod = "helloHandler")
    public String hello() {
//        int i = 1/0;
        return receiveFeign.receive(1L, 1D);
    }

    public String helloHandler() {
        return "error function";
    }
}
