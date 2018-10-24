package com.packt.webstore.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.webstore.domain.Reservation;
import com.packt.webstore.repository.ReservationRepository;
import com.packt.webstore.service.ReservationService;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationRepository reservationRepository;

	@Override
	public List<Reservation> getAllReservations() {
		return reservationRepository.getAllReservations();
	}
/*
	@Override
	public Reservation getReservationById(String ReservationID) {
		return reservationRepository.getReservationById(ReservationID);
	}

	@Override
	public List<Reservation> getProductsByCategory(String category) {
		return null;
//		ReservationRepository.getReservationsByCategory(category);
	}

	@Override
	public Set<Reservation> getProductsByFilter(Map<String, List<String>> filterParams) {
		List<String> params = filterParams.get("brand");
		return null;
//		ReservationRepository.getProductsByFilter(params);
	}

	@Override
	public void addReservation(Reservation product) {
		reservationRepository.save(product);
	}

	@Override
	public Reservation get(long productID) {
		return reservationRepository.findOne(productID);
	}

	@Override
	public List<Reservation> getReservationsByDescOrder() {
		return null;
//		ReservationRepository.getProductsByDescOrder();
	}

	// Cache in play because fetches are in same session
	@Override
	public Reservation getAddReservation(String desc) {
		Reservation p = getReservationById("P1235");
		p = get(p.getId());

		addReservation(p);
		return p;

	}
*/

}
