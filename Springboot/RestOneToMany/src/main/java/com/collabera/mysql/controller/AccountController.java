package com.collabera.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.mysql.model.Account;
import com.collabera.mysql.repository.AccountRepository;

@RestController
public class AccountController {
	
	@Autowired
	AccountRepository service;
	
	@GetMapping("/api/account")
	public List<Account> getAllAccounts() {
		
		return service.findAll();
	}

}
