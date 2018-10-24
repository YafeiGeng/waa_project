package com.packt.webstore.service.impl;

import java.util.List;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.webstore.domain.Movie;
import com.packt.webstore.domain.query.ProductSpecification;
import com.packt.webstore.repository.MovieRepository;
import com.packt.webstore.service.MovieService;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;

	public List<Movie> getAllMovies() {
		return movieRepository.getAllMovies();
	}

	public Movie getMovieById(String movieID) {
		return movieRepository.getMovieById(movieID);
	}

	public List<Movie> getProductsByCategory(String category) {
		return null;
//		movieRepository.getMoviesByCategory(category);
	}

	public Set<Movie> getProductsByFilter(Map<String, List<String>> filterParams) {
		List<String> params = filterParams.get("brand");
		return null;
//		movieRepository.getProductsByFilter(params);
	}

	public void addMovie(Movie product) {
		movieRepository.save(product);
	}

	public Movie get(long productID) {
		return movieRepository.findOne(productID);
	}

	public List<Movie> getMoviesByDescOrder() {
		return null;
//		movieRepository.getProductsByDescOrder();
	}

	// Cache in play because fetches are in same session
	public Movie getAddMovie(String desc) {
		Movie p = getMovieById("P1235");
		p = get(p.getId());

		// Update
		p.setDescription(desc);
		addMovie(p);
		return p;

	}

	/*
	 * Uses the Specification Interface to pass Criteria into findAll This is the
	 * way to use the Criteria API with Spring Data
	 */
	public List<Movie> findBySpec(Movie product) {

		ProductSpecification productSpecification = new ProductSpecification(product);

		return movieRepository.findAll(productSpecification);
	}

}
