package com.ingin.feign.feign;

import com.ingin.common.entity.CommonResult;
import com.ingin.common.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-08 19:37
 */
@FeignClient(name = "cloud-payment-service")
public interface PaymentFeign {

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment);
}
