package com.packt.webstore.service;

import java.util.List;
import com.packt.webstore.domain.Customer;

public interface CustomerService {

	public Customer save(Customer customer);
	public List<Customer> findAll();
	public Customer findOne(Long id);
 
}
