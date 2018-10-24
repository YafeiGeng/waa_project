package com.packt.webstore.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.webstore.domain.Payment;
import com.packt.webstore.domain.query.ProductSpecification;
import com.packt.webstore.repository.PaymentRepository;
import com.packt.webstore.service.PaymentService;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	private PaymentRepository paymentRepository;

	public List<Payment> getAllPayments() {
		return paymentRepository.getAllpayments();
	}

	public Payment getPaymentById(String paymentID) {
		return paymentRepository.getpaymentBypaymentId(paymentID);
	}

	public List<Payment> getProductsByCategory(String category) {
		return null;
//		PaymentRepository.getPaymentsByCategory(category);
	}

	public Set<Payment> getProductsByFilter(Map<String, List<String>> filterParams) {
		List<String> params = filterParams.get("brand");
		return null;
//		PaymentRepository.getProductsByFilter(params);
	}

	public void addPayment(Payment product) {
		paymentRepository.save(product);
	}

	public Payment get(long productID) {
		return paymentRepository.findOne(productID);
	}

	public List<Payment> getPaymentsByDescOrder() {
		return null;
//		PaymentRepository.getProductsByDescOrder();
	}

	// Cache in play because fetches are in same session
	public Payment getAddPayment(String desc) {
		Payment p = getPaymentById("P1235");
		p = get(p.getId());

		// Update
		p.setDescription(desc);
		addPayment(p);
		return p;

	}

	/*
	 * Uses the Specification Interface to pass Criteria into findAll This is the
	 * way to use the Criteria API with Spring Data
	 */
	public List<Payment> findBySpec(Payment product) {

		ProductSpecification productSpecification = new ProductSpecification(product);

		return PaymentRepository.findAll(productSpecification);
	}


}
