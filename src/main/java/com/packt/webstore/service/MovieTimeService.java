package com.packt.webstore.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.packt.webstore.domain.MovieTime;

public interface MovieTimeService {
	
	List<MovieTime> getAllMovieTimes();

	MovieTime getMovieTimeById(String movieTimeID);

	List<MovieTime> getProductsByCategory(String category);

	Set<MovieTime> getProductsByFilter(Map<String, List<String>> filterParams);

	void addMovieTime(MovieTime movieTime);

	MovieTime get(long id);

	public MovieTime getAddMovieTime(String desc);

	List<MovieTime> getMovieTimesByDescOrder();

	public List<MovieTime> findBySpec(MovieTime movieTime);

}
