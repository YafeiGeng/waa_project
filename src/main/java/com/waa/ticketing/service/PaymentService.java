package com.waa.ticketing.service;

import java.util.List;

import com.waa.ticketing.domain.Payment;

public interface PaymentService {
	
	List<Payment> getAllPayments();

/*	List<Payment> getProductsByCategory(String category);

	Set<Payment> getProductsByFilter(Map<String, List<String>> filterParams);

	void addPayment(Payment payment);

	Payment get(long id);

	public Payment getAddPayment(String desc);

	List<Payment> getPaymentsByDescOrder();
*/

}
