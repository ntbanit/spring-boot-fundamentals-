package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.jms.MessageSender;
import com.example.demo.service.PaymentService;
import com.example.demo.service.PaymentServiceImpl;

/** SECTION #4: First Project*/
@SpringBootTest
class HelloworldApplicationTests {

	@Autowired
	PaymentService service;

	@Autowired
	PaymentServiceImpl impl;

	
	@Test
	void testDI() {
		assertNotNull(service);
		assertNotNull(impl.getDao());
	}

	@Test
	void testSum() {
		assertEquals(service.sum(1, 2), 3);
	}

//	
//	@Autowired
//	MessageSender sender ;
//	
//	@Test
//	public void sendMessage() {
//		sender.send("MY_FAKING_MESSAGE");
//	}
	
}
