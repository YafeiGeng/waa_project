package com.waa.ticketing.service;

import java.util.List;

import com.waa.ticketing.domain.Customer;

public interface CustomerService {

	public Customer save(Customer customer);
	public List<Customer> findAll();
	public Customer findOne(Long id);
 
}
