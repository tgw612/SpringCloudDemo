package com.didispace.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RabbitListener(queues = "hello")
public class Receiver {

    @RabbitHandler
    public void process(String msg) {
        System.out.println("Receiver : " + msg);
    }

}
