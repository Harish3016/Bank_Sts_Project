package com.Customer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Customer.Dao.CustomerDao;
import com.Customer.Entity.Customer;

@Service
public class CustomerService {
	
	@Autowired
	CustomerDao cd;
	
	public String postAllObject(List<Customer> customers) {
		return cd.postAllObject(customers);
	}

	public List<Customer> getAllObject() {
		return cd.getAllObject();
	}

}
