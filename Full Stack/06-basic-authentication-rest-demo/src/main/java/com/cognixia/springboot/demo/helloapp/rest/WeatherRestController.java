package com.cognixia.springboot.demo.helloapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherRestController {
	
	// expose "/Bankingapp" and give specific access to URL Resources
	@GetMapping("/")
	public String welcomePage() {
		return "Welcome to Bank of America";
	}
	
	@GetMapping("/profile")
	public String getProfile() {
		return "This is the Banking Customer Profile Page";
	}
	
	@GetMapping("/admin")
	public String getAdminPage() {
		return "This is the Banking Admin Page who has end to end access for SpringBoot, Manager, End-User";
	}
	
	@GetMapping("/manager")
	public String getManagementPage() {
		return "This specific page can be accessed by Manager of Admin only";
	}
	
}
