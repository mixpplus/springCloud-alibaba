package com.ingin.seata;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-14 15:10
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoDataSourceProxy
@MapperScan(basePackages = "com.ingin.seata.dao")
public class SeataApplication2002 {
    public static void main(String[] args) {
        SpringApplication.run(SeataApplication2002.class, args);
    }
}
