package com.ingin.seata.feign.impl;

import com.ingin.seata.feign.ReceiveFeign;
import org.springframework.stereotype.Component;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-14 18:08
 */
@Component
public class ReceiveFeignImpl implements ReceiveFeign {
    @Override
    public String receive(Long id, Double money) {
        return "出错了";
    }
}
