package com.ingin.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-10 00:22
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DashApplication {
    public static void main(String[] args) {
        SpringApplication.run(DashApplication.class, args);
    }
}
