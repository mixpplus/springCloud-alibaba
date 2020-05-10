package com.ingin.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-10 17:47
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServerApplication3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication3344.class, args);
    }
}
