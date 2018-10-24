package com.packt.webstore.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.webstore.domain.Payment;
import com.packt.webstore.repository.PaymentRepository;
import com.packt.webstore.service.PaymentService;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public List<Payment> getAllPayments() {
		return paymentRepository.getAllpayments();
	}

/*	@Override
	public List<Payment> getProductsByCategory(String category) {
		return null;
//		PaymentRepository.getPaymentsByCategory(category);
	}

	@Override
	public Set<Payment> getProductsByFilter(Map<String, List<String>> filterParams) {
		List<String> params = filterParams.get("brand");
		return null;
//		PaymentRepository.getProductsByFilter(params);
	}

	@Override
	public void addPayment(Payment product) {
		paymentRepository.save(product);
	}

	@Override
	public Payment get(long productID) {
		return paymentRepository.findOne(productID);
	}

	@Override
	public List<Payment> getPaymentsByDescOrder() {
		return null;
//		PaymentRepository.getProductsByDescOrder();
	}

	// Cache in play because fetches are in same session
	@Override
	public Payment getAddPayment(String desc) {
		Payment p = new Payment();
		p = get(p.getId());

		addPayment(p);
		return p;

	}*/

}
