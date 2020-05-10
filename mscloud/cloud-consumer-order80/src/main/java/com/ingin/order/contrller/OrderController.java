package com.ingin.order.contrller;

import com.ingin.common.entity.CommonResult;
import com.ingin.common.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-07 19:24
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;



//    public static final String PAYMENT_URL = "http://localhost:8001";
    public static final String PAYMENT_URL = "http://cloud-payment-service";

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {

        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }

    @GetMapping("/consumer/payment/entity/get/{id}")
    public ResponseEntity getPayment1(@PathVariable("id") Long id) {
//        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
        return restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }

    @GetMapping("/consumer/payment/entity/create")
    public ResponseEntity<CommonResult> create1(Payment payment) {

//        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
        ResponseEntity<CommonResult> entity = restTemplate.postForEntity(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
        return entity;

    }


}
