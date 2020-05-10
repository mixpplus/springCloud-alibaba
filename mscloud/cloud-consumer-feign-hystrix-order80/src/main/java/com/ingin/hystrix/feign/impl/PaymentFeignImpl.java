package com.ingin.hystrix.feign.impl;

import com.ingin.hystrix.feign.PaymentFeign;
import org.springframework.stereotype.Component;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-09 22:41
 */
@Component
public class PaymentFeignImpl implements PaymentFeign {

    @Override
    public String getOkStr() {
        return "熔断方法ok";
    }

    @Override
    public String getTimeOutStr() throws InterruptedException {
        return "熔断方法timeout";
    }
}
