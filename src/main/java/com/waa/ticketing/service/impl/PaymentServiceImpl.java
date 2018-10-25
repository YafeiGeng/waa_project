package com.waa.ticketing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.waa.ticketing.domain.Payment;
import com.waa.ticketing.repository.PaymentRepository;
import com.waa.ticketing.service.PaymentService;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public List<Payment> getAllPayments() {
		return paymentRepository.getAllpayments();
	}

}
