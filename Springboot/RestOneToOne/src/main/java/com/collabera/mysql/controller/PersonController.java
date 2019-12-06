package com.collabera.mysql.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.mysql.model.Person;
import com.collabera.mysql.repository.PersonRepository;

@RestController
public class PersonController {

	@Autowired
	PersonRepository service;
	
	@GetMapping("/api/people")
	public List<Person> getAllPeople() {
		
		return service.findAll();
	}
	
	@GetMapping("/api/people/{personid}")
	public Person getPerson(@PathVariable Long personid) {
		
		Optional<Person> found = service.findById(personid);
		
		if(found.isPresent()) {
			return found.get();
		} else {
			return new Person();
		}
	}
	
	
	@PostMapping("/api/addperson")
	public void addPerson(@RequestBody Person person) {
		
		System.out.println(person);
		service.save(person);
	}
}
