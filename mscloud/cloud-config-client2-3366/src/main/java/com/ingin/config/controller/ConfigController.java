package com.ingin.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-10 17:56
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${user.version}")
    private Integer version;
    @Value("${user.name}")
    private String name;

    @Value("${user.label}")
    private String label;
    @Value("${user.branch}")
    private String branch;
    @GetMapping("/config/client/version")
    public String getVersion() {

        return "config client version:" + version + "\n"+
                "name: " + name + "\n"+
                "label: "+ label +
                "branch: " + branch;
    }
}
