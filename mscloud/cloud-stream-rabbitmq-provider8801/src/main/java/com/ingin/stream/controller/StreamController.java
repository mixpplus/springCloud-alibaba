package com.ingin.stream.controller;

import com.ingin.stream.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-10 22:24
 */
@RestController
public class StreamController {
    @Autowired
    private IMessageProvider messageProvider;

    @GetMapping("/send/msg")
    public String sendMsg() {
        messageProvider.send();
        return "ok";
    }
}
