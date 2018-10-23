package com.packt.webstore.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.packt.webstore.domain.Movie;

public interface MovieService {

	List<Movie> getAllMovies();

	Movie getMovieById(String movieID);

	List<Movie> getProductsByCategory(String category);

	Set<Movie> getProductsByFilter(Map<String, List<String>> filterParams);

	void addMovie(Movie movie);

	Movie get(long id);

	public Movie getAddMovie(String desc);

	List<Movie> getMoviesByDescOrder();

	public List<Movie> findBySpec(Movie movie);

}