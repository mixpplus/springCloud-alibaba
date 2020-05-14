package com.ingin.seata.controller;

import com.ingin.seata.service.ReceiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-14 15:11
 */
@RestController
public class ReceiveController {

    @Autowired
    private ReceiveService receiveService;

    @GetMapping("/receive")
    public String receive(@RequestParam("id") Long id, @RequestParam("money") Double money) {
        int i = 1/0;
        receiveService.receive(id, money);
        return "ok, receive success";
    }
}
