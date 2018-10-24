package com.packt.webstore.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.packt.webstore.domain.Reservation;

public interface ReservationService {
	
	List<Reservation> getAllReservations();

	Reservation getReservationById(String reservationID);

	List<Reservation> getProductsByCategory(String category);

	Set<Reservation> getProductsByFilter(Map<String, List<String>> filterParams);

	void addReservation(Reservation reservation);

	Reservation get(long id);

	public Reservation getAddReservation(String desc);

	List<Reservation> getReservationsByDescOrder();
}
