package com.ingin.hystrix.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-09 21:06
 */
@Service
public class HystrixService {

    public String returnOkStr() {
        return Thread.currentThread().getName() + "return ok";
    }

    public String returnTimeOutStr() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        return Thread.currentThread().getName() + "return TimeOut";
    }
}
