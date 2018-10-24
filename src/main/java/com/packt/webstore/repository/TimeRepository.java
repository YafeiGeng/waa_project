package com.packt.webstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.packt.webstore.domain.Time;

public interface TimeRepository extends CrudRepository<Time, Long>, JpaSpecificationExecutor<Time> {
	Time getTimeByTimeId(String key);

	// findAll comes with repository
	@Query("SELECT t FROM TIME t")
	public List<Time> getAllTimes();

	@Query("SELECT t FROM TIME t where TIMEID = :timeId")
	Time getTimeById(@Param("timeId") String key);


}
