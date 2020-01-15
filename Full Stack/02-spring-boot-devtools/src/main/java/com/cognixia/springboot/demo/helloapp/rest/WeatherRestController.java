package com.cognixia.springboot.demo.helloapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherRestController {

	// expose "/" end-point that returns "Hello Weather"
	@GetMapping("/")
	public String sayHello(){
		return "Hello Weather! The time in Dallas is " + LocalDateTime.now();
	}
	
	// expose a new end-point for "study"
	@GetMapping("/study")
	public String getDailyStudy() {
		return "Study Daily for 2 hours once you are back in your extended stay apartment!";
	}
	
	// expose a new end-point for "job"
	@GetMapping("/job")
	public String getJob() {
		return "Study and get Job Offer!";
	}
	
}
