package com.collabera.mysql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collabera.mysql.model.Account;
import com.collabera.mysql.model.Customer;
import com.collabera.mysql.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository repo;
	
	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}
	
	public Customer getCustomer(Long id) {
		
		Optional<Customer> found = repo.findById(id);
		
		if(found.isPresent()) {
			return found.get();
		}
		else {
			return new Customer();
		}
		
	}
	
	public void addCustomer(Customer customer) {

		boolean foundCustomer = repo.findAll()
				.stream().anyMatch(c -> c.getId() == customer.getId());

		if (!foundCustomer) {
			repo.save(customer);
			System.out.println(customer);
		}

	}
	
	public void updateCustomer(Customer customer) {
		
		Optional<Customer> optToUpdate = repo.findById(customer.getId());
		
		if(optToUpdate.isPresent()) {
			
			Customer toUpdate = optToUpdate.get();
			
			toUpdate.setFirstName(customer.getFirstName());
			toUpdate.setLastName(customer.getLastName());
			toUpdate.setPin(customer.getPin());
			
			repo.save(toUpdate);
			
		}
	}
	
//	public void updatePin(Customer customer, Long id) {
//		
//		Customer custToUpdate = getCustomer(id);
//		
//		if(custToUpdate.getId() != -1L) {
//			
//			custToUpdate.setPin(customer.getPin());
//			
//			repo.save(custToUpdate);
//			
//		}
//		
//	}
	
	public void updatePin(String pin, Long id) {

		Customer custToUpdate = getCustomer(id);

		if (custToUpdate.getId() != -1L) {

			custToUpdate.setPin(pin);

			repo.save(custToUpdate);

		}

	}
	
	public void updateAccount(Account account, Long id) {
		
		Customer customer = getCustomer(id);
		
		if(customer.getId() != -1L) {
			
			customer.updateAccount(account);
			
			repo.save(customer);
		}
	}
	
	public void deleteCustomer(Long id) {
		
		repo.deleteById(id);
		
	}

}
