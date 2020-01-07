package com.cognixia.springboot.demo.helloapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/weather")
public class WeatherRestController {
	
	@Value("${weatherApiKey}")
	private String weatherApiKey;
	
	// expose "/" end-point that returns "Hello Weather"
	@GetMapping("/{city}")
	public Object getWeatherApi(@PathVariable("city") String city) {
		RestTemplate restTemplate = new RestTemplate();
		
		String uri = "http://api.openweathermap.org/data/2.5/weather?q="
			+city
			+"&APPID="
			+weatherApiKey;
		Object results = restTemplate.getForObject(uri, Object.class);
		return results;
	}
	
	
}
