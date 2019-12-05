package com.collabera.mysql.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collabera.mysql.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	// returns all students
	List<Student> findAll();
	
	// returns one student by their id
	Optional<Student> findById(Long id);
	
	
}
