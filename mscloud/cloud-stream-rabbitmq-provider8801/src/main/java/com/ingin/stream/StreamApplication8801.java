package com.ingin.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-10 22:17
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamApplication8801 {
    public static void main(String[] args) {
        SpringApplication.run(StreamApplication8801.class, args);
    }
}
