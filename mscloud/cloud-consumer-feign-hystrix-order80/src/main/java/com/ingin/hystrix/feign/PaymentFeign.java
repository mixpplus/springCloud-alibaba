package com.ingin.hystrix.feign;

import com.ingin.hystrix.feign.impl.FallBackFactoryPaymentFeignImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-09 21:17
 */
@Component
@FeignClient(value = "hystrix-payment", fallbackFactory = FallBackFactoryPaymentFeignImpl.class)
//@FeignClient(value = "hystrix-payment", fallback = PaymentFeignImpl.class)
public interface PaymentFeign {

    @GetMapping("/payment/ok")
    public String getOkStr();

    @GetMapping("/payment/timeout")
    public String getTimeOutStr() throws InterruptedException;
}
