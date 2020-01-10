package com.cognixia.springboot.demo.helloapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@EnableAuthorizationServer
@SpringBootApplication
public class HelloappApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloappApplication.class, args);
	}

}
