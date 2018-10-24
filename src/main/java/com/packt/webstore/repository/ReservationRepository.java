package com.packt.webstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.packt.webstore.domain.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Long>, JpaSpecificationExecutor<Reservation> {
	Reservation getReservationByReservationId(String key);

	// findAll comes with repository
	@Query("SELECT r FROM RESERVATION r")
	public List<Reservation> getAllReservations();
/*
	@Query("SELECT r FROM RESERVATION r WHERE RESERVATIONID = :reservationId")
	Reservation getReservationById(@Param("reservationId") String key);*/

}
