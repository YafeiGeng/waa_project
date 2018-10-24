package com.packt.webstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.packt.webstore.domain.Payment;


public interface PaymentRepository extends CrudRepository<Payment, Long>, JpaSpecificationExecutor<Payment> {

	// findAll comes with repository
	@Query("SELECT p FROM PAYMENT p")
	public List<Payment> getAllpayments();
/*
	@Query("SELECT p FROM PAYMENT p WHERE PAYMENTID = :paymentId")
	Payment getpaymentById(@Param("paymentId") String key);
*/
}
