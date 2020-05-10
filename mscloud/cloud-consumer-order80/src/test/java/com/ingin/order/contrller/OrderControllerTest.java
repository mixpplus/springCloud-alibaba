package com.ingin.order.contrller;

import com.ingin.common.entity.CommonResult;
import com.ingin.common.entity.Payment;
import com.ingin.order.RootTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-07 19:50
 */
public class OrderControllerTest extends RootTest {

    @Autowired
    private RestTemplate restTemplate;
    private String url = "http://localhost:8001";

    @Test
    public void test1() {
        Payment payment = new Payment();
        payment.setSerial("haha");
        LinkedMultiValueMap<Object, Object> map = new LinkedMultiValueMap<>();
        map.add("serial", "lisi19");
        CommonResult commonResult = restTemplate.postForObject(url+ "/payment/create", map, CommonResult.class);
        System.out.println(commonResult);
    }


    @Test
    public void test2() {
        MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
        map.add("name","chang");
        restTemplate.postForObject(url+ "/payment", map, Object.class);
    }

    @Test
    public void test3() {
        MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
        map.add("serial","chang");
        restTemplate.postForObject(url+ "/payment/2", map, Object.class);
    }


}