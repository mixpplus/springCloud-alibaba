package com.ingin.stream.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-10 22:28
 */
@EnableBinding(Sink.class)
public class StreamService {

    @Value("${server.port}")
    private Integer port;

    @StreamListener(Sink.INPUT)
    public void getMsg(Message<String> message) {
        System.out.println(message.getPayload() + "  " + port);
    }

}
