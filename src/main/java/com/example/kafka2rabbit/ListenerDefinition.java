package com.example.kafka2rabbit;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ListenerDefinition {
	
	String INPUT = "input_topic";
	
	@Input(INPUT)
	SubscribableChannel listen2input();
	

}
