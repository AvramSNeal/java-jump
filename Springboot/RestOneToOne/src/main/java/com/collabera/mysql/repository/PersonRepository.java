package com.collabera.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collabera.mysql.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
