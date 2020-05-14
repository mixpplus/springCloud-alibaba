package com.ingin.sentinel.service;

import com.ingin.sentinel.fallback.PaymentFeignImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-12 19:37
 */
@Component
@FeignClient(value = "nacos-config-client",fallback = PaymentFeignImpl.class)
public interface PaymentFeign {
    @GetMapping("/nacos/config/get")
    public String getInfo();
}
