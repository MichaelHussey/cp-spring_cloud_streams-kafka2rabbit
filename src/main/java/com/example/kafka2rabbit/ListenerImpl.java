package com.example.kafka2rabbit;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.SendTo;

@EnableBinding(Processor.class)
public class ListenerImpl {

  @StreamListener(Processor.INPUT)
  @SendTo(Processor.OUTPUT)
  public Message<?> receiveAndForward(Message<?> message) {
    MessageBuilder<?> mb = MessageBuilder.fromMessage(message);
    
    //String destName = (String) message.getHeaders().get();
    System.err.println(message);
       
    message = mb.build();
    return message;
}
}
