package com.ingin.nacosconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-11 17:27
 */
@RestController
@RefreshScope
public class NacosConfigController {
    @Value("${user.info}")
    private String info;

    @GetMapping("/nacos/config/get")
    public String getInfo() {
        return info;
    }


}
