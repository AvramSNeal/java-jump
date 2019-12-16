package com.collabera.todoapp.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	
	public boolean validateUser(String name, String password) {
		return name.equalsIgnoreCase("v") && password.equalsIgnoreCase("p");
	}

}
