package com.cognixia.springboot.demo.helloapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherRestController {
	// expose "/" endpoint that returns "Hello Weather"
	@GetMapping("/time")
	public String sayHello() {
		return "Hello Weather: The time in Dallas is " + LocalDateTime.now();
		
	}
	
	
}
