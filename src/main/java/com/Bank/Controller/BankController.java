package com.Bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.Entity.Bank;
import com.Bank.Service.BankService;

@RestController
@RequestMapping(value="/bank")
public class BankController {
	
	@Autowired
	BankService bs;
	
	@PostMapping(value="/postObjects")
	public String postAllObject(@RequestBody List<Bank> banks) {
		return bs.postAllObject(banks);
	}
	
	@GetMapping(value="/getBrachByIfsc/{ifscCode}")
	public String getAllObject(@PathVariable String ifscCode){
		return bs.getAllObject(ifscCode);
	}


}
