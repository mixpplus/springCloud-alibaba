package com.ingin.feign;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-08 19:34
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }

    @Bean
    public Logger.Level feignLevel() {
        return Logger.Level.FULL;
    }
}
