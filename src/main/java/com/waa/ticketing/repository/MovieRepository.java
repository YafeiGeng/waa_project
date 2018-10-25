package com.waa.ticketing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.waa.ticketing.domain.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long>, JpaSpecificationExecutor<Movie> {
	Movie getMovieByMovieId(String key);

	// findAll comes with repository
	@Query("SELECT p FROM MOVIE p")
	public List<Movie> getAllMovies();

	@Query("SELECT p FROM MOVIE p where MOVIEID = :movieId")
	Movie getMovieById(@Param("movieId") String key);

}