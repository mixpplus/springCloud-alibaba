package com.ingin.sentinel.fallback;

import com.ingin.sentinel.service.PaymentFeign;
import org.springframework.stereotype.Component;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-12 19:38
 */
@Component
public class PaymentFeignImpl implements PaymentFeign {
    @Override
    public String getInfo() {
        return "这是feign的降级方法";
    }
}
