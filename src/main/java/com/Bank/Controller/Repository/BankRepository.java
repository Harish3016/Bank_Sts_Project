package com.Bank.Controller.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Bank.Entity.Bank;

public interface BankRepository extends JpaRepository<Bank,Integer> {
	
	@Query(value="select b.branch from Bank b where ifsc=:a")
	 String getAllObject(@Param("a") String ifscCode);

}
