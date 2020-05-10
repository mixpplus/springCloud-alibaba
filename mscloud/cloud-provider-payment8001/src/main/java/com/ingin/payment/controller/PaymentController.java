package com.ingin.payment.controller;

import com.ingin.common.entity.CommonResult;
import com.ingin.common.entity.Payment;
import com.ingin.payment.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-07 17:53
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private int port;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        log.info("{}", payment);
        int result = paymentService.create(payment);
        log.info("result: {}", result);
        if (result > 0) {

            return new CommonResult(200, "insert success"+ port);
        } else {
            return new CommonResult(404, "insert failed"+ port);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("result: {}", payment);
        if (payment != null) {

            return new CommonResult(200, "query success"+ port, payment);
        } else {
            return new CommonResult(404, "query failed"+ port);
        }
    }


}
