package com.collabera.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collabera.mysql.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
