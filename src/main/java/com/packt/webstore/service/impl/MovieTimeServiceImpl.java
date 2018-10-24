package com.packt.webstore.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packt.webstore.domain.MovieTime;
import com.packt.webstore.domain.MovieTime;
import com.packt.webstore.domain.query.ProductSpecification;
import com.packt.webstore.repository.MovieTimeRepository;
import com.packt.webstore.service.MovieTimeService;

@Service
@Transactional
public class MovieTimeServiceImpl implements MovieTimeService {

	@Autowired
	private MovieTimeRepository movieTimeRepository;

	public List<MovieTime> getAllMovieTimes() {
		return movieTimeRepository.getAllMovieTimes();
	}

	public MovieTime getMovieTimeById(String MovieTimeID) {
		return movieTimeRepository.getMovieTimeById(MovieTimeID);
	}

	public List<MovieTime> getProductsByCategory(String category) {
		return null;
//		MovieTimeRepository.getMovieTimesByCategory(category);
	}

	public Set<MovieTime> getProductsByFilter(Map<String, List<String>> filterParams) {
		List<String> params = filterParams.get("brand");
		return null;
//		MovieTimeRepository.getProductsByFilter(params);
	}

	public void addMovieTime(MovieTime product) {
		movieTimeRepository.save(product);
	}

	public MovieTime get(long productID) {
		return movieTimeRepository.findOne(productID);
	}

	public List<MovieTime> getMovieTimesByDescOrder() {
		return null;
//		MovieTimeRepository.getProductsByDescOrder();
	}

	// Cache in play because fetches are in same session
	public MovieTime getAddMovieTime(String desc) {
		MovieTime p = getMovieTimeById("P1235");
		p = get(p.getId());

		// Update
		p.setDescription(desc);
		addMovieTime(p);
		return p;

	}

	/*
	 * Uses the Specification Interface to pass Criteria into findAll This is the
	 * way to use the Criteria API with Spring Data
	 */
	public List<MovieTime> findBySpec(MovieTime product) {

		ProductSpecification productSpecification = new ProductSpecification(product);

		return MovieTimeRepository.findAll(productSpecification);
	}
}
