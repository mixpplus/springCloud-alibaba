package com.ingin.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-11 16:37
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPaymentApplication9001 {
    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentApplication9001.class, args);

    }

}
