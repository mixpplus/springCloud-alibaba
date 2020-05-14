package com.ingin.seata.feign;

import com.ingin.seata.feign.impl.ReceiveFeignImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-14 15:25
 */
@FeignClient(value = "seata-user-service", fallback = ReceiveFeignImpl.class)
@Component
public interface ReceiveFeign {
    @GetMapping("/receive")
    public String receive(@RequestParam("id") Long id, @RequestParam("money") Double money);
}
