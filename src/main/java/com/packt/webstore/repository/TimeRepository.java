package com.packt.webstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Time;

@Repository
public interface TimeRepository extends CrudRepository<Time, Long>, JpaSpecificationExecutor<Time> {
	
	// findAll comes with repository
		@Query("SELECT t FROM TIME t")
		public List<Time> getAllTimes();
}
