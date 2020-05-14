package com.ingin.seata;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-14 14:56
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoDataSourceProxy
@MapperScan(basePackages = "com.ingin.seata.dao")
@EnableFeignClients
public class SeataApplicatoin2001 {
    public static void main(String[] args) {
        SpringApplication.run(SeataApplicatoin2001.class, args);
    }
}
