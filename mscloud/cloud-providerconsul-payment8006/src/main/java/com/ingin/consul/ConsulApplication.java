package com.ingin.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-08 14:20
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulApplication.class, args);
    }
}
