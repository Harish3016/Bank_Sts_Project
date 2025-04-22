package com.Customer.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Customer.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

	@Query(value="select c from Customer c")
	List<Customer> getAllObject();

}
