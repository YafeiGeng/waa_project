package com.waa.ticketing.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.waa.ticketing.domain.Reservation;

public interface ReservationService {
	
	List<Reservation> getAllReservations();
	
	List<Reservation> getProductsByCategory(String category);

	Set<Reservation> getProductsByFilter(Map<String, List<String>> filterParams);

	void addReservation(Reservation reservation);

	Reservation get(long id);
}
