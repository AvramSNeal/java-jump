package com.cognixia.springboot.demo.helloapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
