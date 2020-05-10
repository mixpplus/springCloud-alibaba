package com.ingin.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-07 16:50
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentApplication02 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication02.class, args);
    }
}
