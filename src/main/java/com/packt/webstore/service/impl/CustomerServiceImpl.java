package com.packt.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.repository.CustomerRepository;
import com.packt.webstore.service.CustomerService;

@Service
@Transactional 
public class CustomerServiceImpl implements CustomerService {
	
 	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}
	@Override
	public List<Customer> findAll() {
		return (List<Customer>)customerRepository.findAll();
	}

	@Override
	public Customer findOne(Long id) {
		return customerRepository.findOne(id);
	}

}
