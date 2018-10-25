package com.waa.ticketing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.waa.ticketing.domain.Payment;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Long>, JpaSpecificationExecutor<Payment> {

	// findAll comes with repository
	@Query("SELECT p FROM PAYMENT p")
	public List<Payment> getAllpayments();

}
