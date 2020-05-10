package com.ingin.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-07 22:02
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka2Application {
    public static void main(String[] args) {
        SpringApplication.run(Eureka2Application.class, args);
    }
}
