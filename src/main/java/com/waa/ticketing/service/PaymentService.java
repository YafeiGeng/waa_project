package com.waa.ticketing.service;

import java.util.List;

import com.waa.ticketing.domain.Payment;

public interface PaymentService {
	
	List<Payment> getAllPayments();
}
