package com.example.demo.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

//@Component
public class MessageListener {
//	@JmsListener(destination = "${springjms.myQueue}")
	public void receive(String message) {
		System.out.println("_________________MESSAGE LISTENER:"+message+"_________________");
	}

}
