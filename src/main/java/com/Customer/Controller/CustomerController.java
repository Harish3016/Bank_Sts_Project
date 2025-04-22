package com.Customer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Customer.Entity.Customer;
import com.Customer.Service.CustomerService;



@RestController
@RequestMapping(value="/customer")
public class CustomerController {
	
	@Autowired
	CustomerService cs;
	
	@Autowired
	RestTemplate rt;
	
	@PostMapping(value="/setBranchByIfsc")
	public String setBranchByIfsc(@RequestBody List<Customer> customers) {
		
		String url1="http://localhost:9090/bank/getBrachByIfsc/";
		
		
		customers.forEach(x->{
			
			
			String ifscCode = x.getIfsc();
			
			ResponseEntity<String> re2 = rt.exchange(url1+ifscCode, HttpMethod.GET, null, String.class);
			
			String branch = re2.getBody();
			
			x.setBranch(branch);
			
		});
			
 		 return cs.postAllObject(customers);
	}
	
	@GetMapping(value="/getAllObject")
	public List<Customer> getAllObject(){
		return cs.getAllObject();
	}

}
