package com.ingin.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.ingin.sentinel.service.PaymentFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-12 14:23
 */
@RestController
@Slf4j
public class SentinelController {
    @Value("${server.port}")
    private Integer port;
    @GetMapping("/sentinel/get")
    public String getStr() throws InterruptedException {
//        TimeUnit.SECONDS.sleep(1);
        int i = 1/0;
        log.info("{}","running....");
        return "port: "+ port;
    }

    @GetMapping("/sentinel/hot")
    @SentinelResource(value ="hot",
            blockHandler = "hotKey_handler",
            fallback = "fallBackHandler",
            exceptionsToIgnore = ArithmeticException.class)
    public String hotKey(@RequestParam(value = "p1",required = false) String p1,
                         @RequestParam(value = "p2",required = false) String p2) {

        if (p1.equals("3")) {
            throw new RuntimeException("不合法");
        }
        if (p1.equals("4")) {
            int i = 1/0;
        }
        return "hotKey ...";
    }

    public String hotKey_handler(String p1, String p2, BlockException exception) {
        return "降级方法";
    }

    public String fallBackHandler(String p1, String p2, Throwable throwable) {
        return "fallBackHandler";
    }

    @Autowired
    private PaymentFeign paymentFeign;

    @GetMapping("/sentinel/str/info")
    public String getInfo() {
        return paymentFeign.getInfo();
    }
}
