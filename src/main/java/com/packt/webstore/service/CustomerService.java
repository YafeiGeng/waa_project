package com.packt.webstore.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.data.repository.query.Param;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.Movie;

public interface CustomerService {

	public Customer save(Customer customer);
	public List<Customer> findAll();
	public Customer findOne(Long id);
 
}
