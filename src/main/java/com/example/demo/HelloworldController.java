package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** CODE ON SECTION #3: Basics*/
@RestController
public class HelloworldController {
	
	@RequestMapping("/hello-world")
	public String hello() {
		return "Hello world from Spring Boot" ;
	}
}
