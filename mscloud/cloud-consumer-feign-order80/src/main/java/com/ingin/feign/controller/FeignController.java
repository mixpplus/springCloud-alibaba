package com.ingin.feign.controller;

import com.ingin.common.entity.CommonResult;
import com.ingin.common.entity.Payment;
import com.ingin.feign.feign.PaymentFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-08 19:35
 */
@RestController
public class FeignController {

    @Autowired
    private PaymentFeign paymentFeign;
    @GetMapping("/consumer/payment/feign/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id) {

        CommonResult commonResult = paymentFeign.getPaymentById(id);
        return commonResult;
    }

    @GetMapping("/consumer/payment/feign/create")
    public CommonResult create(Payment payment) {
        CommonResult commonResult = paymentFeign.create(payment);
        return commonResult;
    }
}
