package com.packt.webstore.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.webstore.domain.Reservation;
import com.packt.webstore.domain.Reservation;
import com.packt.webstore.domain.query.ProductSpecification;
import com.packt.webstore.repository.ReservationRepository;
import com.packt.webstore.service.ReservationService;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationRepository reservationRepository;

	public List<Reservation> getAllReservations() {
		return reservationRepository.getAllReservations();
	}

	public Reservation getReservationById(String ReservationID) {
		return reservationRepository.getReservationById(ReservationID);
	}

	public List<Reservation> getProductsByCategory(String category) {
		return null;
//		ReservationRepository.getReservationsByCategory(category);
	}

	public Set<Reservation> getProductsByFilter(Map<String, List<String>> filterParams) {
		List<String> params = filterParams.get("brand");
		return null;
//		ReservationRepository.getProductsByFilter(params);
	}

	public void addReservation(Reservation product) {
		reservationRepository.save(product);
	}

	public Reservation get(long productID) {
		return reservationRepository.findOne(productID);
	}

	public List<Reservation> getReservationsByDescOrder() {
		return null;
//		ReservationRepository.getProductsByDescOrder();
	}

	// Cache in play because fetches are in same session
	public Reservation getAddReservation(String desc) {
		Reservation p = getReservationById("P1235");
		p = get(p.getId());

		// Update
		p.setDescription(desc);
		addReservation(p);
		return p;

	}

	/*
	 * Uses the Specification Interface to pass Criteria into findAll This is the
	 * way to use the Criteria API with Spring Data
	 */
	public List<Reservation> findBySpec(Reservation product) {

		ProductSpecification productSpecification = new ProductSpecification(product);

		return ReservationRepository.findAll(productSpecification);
	}


}
