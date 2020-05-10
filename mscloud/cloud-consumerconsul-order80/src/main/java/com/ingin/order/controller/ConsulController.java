package com.ingin.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-08 14:30
 */
@RestController
@Slf4j
public class ConsulController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    private static final String PAYMENT_URL = "http://consul-provider-payment";

    @GetMapping("/order/payment/str")
    public String getStr() {
        String str = restTemplate.getForObject(PAYMENT_URL + "/payment/consul/str", String.class);
        return str;
    }

    @GetMapping("/order/client")
    public Object getClient() {
        List<String> services = discoveryClient.getServices();
        log.info("services: {}", services);
        List<ServiceInstance> instances = discoveryClient.getInstances("consul-provider-payment");
        instances.forEach(serviceInstance -> {
            log.info("{}-{}-{}-{}-{}",serviceInstance.getServiceId(),
                    serviceInstance.getHost(),serviceInstance.getPort(),
                    serviceInstance.getServiceId(), serviceInstance.getUri());
        });
        return discoveryClient;
    }
}
