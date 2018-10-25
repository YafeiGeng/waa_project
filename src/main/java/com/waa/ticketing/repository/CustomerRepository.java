package com.waa.ticketing.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.waa.ticketing.domain.Customer;

	@Repository
	public interface CustomerRepository extends  CrudRepository<Customer, Long> 
	{
  	}

