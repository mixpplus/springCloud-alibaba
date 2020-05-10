package com.ingin.hystrix.feign.impl;

import com.ingin.hystrix.feign.PaymentFeign;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-09 23:06
 */
@Component
public class FallBackFactoryPaymentFeignImpl implements FallbackFactory<PaymentFeign> {
    @Override
    public PaymentFeign create(Throwable throwable) {
        return new PaymentFeign() {
            @Override
            public String getOkStr() {
                return "工厂熔断ok";
            }

            @Override
            public String getTimeOutStr() throws InterruptedException {
                return "工厂熔断timeout";
            }
        };
    }
}
