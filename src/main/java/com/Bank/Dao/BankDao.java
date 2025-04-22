package com.Bank.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Bank.Controller.Repository.BankRepository;
import com.Bank.Entity.Bank;

@Repository
public class BankDao {
	
	@Autowired
	BankRepository br;

	public String postAllObject(List<Bank> banks) {
		br.saveAll(banks);
		return "Posted SuccessFully";
	}
	
	public String getAllObject(String ifscCode){
		return br.getAllObject(ifscCode);	
	}

}
