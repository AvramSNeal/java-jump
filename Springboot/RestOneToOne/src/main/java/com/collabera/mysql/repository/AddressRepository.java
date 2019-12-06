package com.collabera.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collabera.mysql.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
