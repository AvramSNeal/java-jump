package com.collabera.mysql.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.mysql.model.Account;
import com.collabera.mysql.model.Customer;
import com.collabera.mysql.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	
	@GetMapping("/api/customer")
	public List<Customer> getAllCustomers() {
		
		return customerService.getAllCustomers();
	}
	
	@GetMapping("/api/customer/{customerid}")
	public Customer getCustomer(@PathVariable Long customerid) {
		
		return customerService.getCustomer(customerid);
	}
	
	@PostMapping("/api/addcustomer")
	public void addCustomer(@RequestBody Customer customer) {
		
		customerService.addCustomer(customer);
		
	}
	
	@PutMapping("/api/updatecustomer")
	public void updateCustomer(@RequestBody Customer customer) {
		
		customerService.updateCustomer(customer);
		
	}
	
//	@PatchMapping("/api/updatecustomer/pin/{customerid}")
//	public void updatePinForCustomer
//		(@RequestBody Customer customer, @PathVariable Long customerid) {
//		
//		customerService.updatePin(customer, customerid);
//		
//	}
	
	@PatchMapping("/api/updatecustomer/pin/{customerid}")
	public void updatePinForCustomer
		(@RequestBody Map<String, String> pinUpdate, 
				@PathVariable Long customerid) {
		
		customerService.updatePin(pinUpdate.get("pin"), customerid);	
	}
	
	@PatchMapping("/api/updatecustomer/account/{customerid}")
	public void updateAccountForCustomer
		(@RequestBody Account account, @PathVariable Long customerid) {
		
		customerService.updateAccount(account, customerid);		
		
	}
	
	@DeleteMapping("/api/removecustomer/{customerid}")
	public void removeCustomer(@PathVariable Long customerid) {
		
		customerService.deleteCustomer(customerid);
	}
	

}
