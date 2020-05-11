package com.ingin.stream.service.impl;

import com.ingin.stream.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-10 22:20
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {
    @Autowired
    private MessageChannel output;
    @Override
    public void send() {

        output.send(MessageBuilder.withPayload(UUID.randomUUID().toString()).build());

    }
}
