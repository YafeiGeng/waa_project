package com.packt.webstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.packt.webstore.domain.MovieTime;

public interface MovieTimeRepository extends CrudRepository<MovieTime, Long>, JpaSpecificationExecutor<MovieTime> {
	MovieTime getMovieTimeByMovieTimeId(String key);

	// findAll comes with repository
	@Query("SELECT m FROM MOVIETIME m")
	public List<MovieTime> getAllMovieTimes();

	@Query("SELECT m FROM MOVIETIME m WHERE MOVIETIME = :movieTimeId")
	MovieTime getMovieTimeById(@Param("movieTimeId") String key);
}
