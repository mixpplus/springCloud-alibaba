package com.ingin.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-08 12:19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderApplicationZk {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplicationZk.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
