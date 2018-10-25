package com.waa.ticketing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.waa.ticketing.domain.Movie;
import com.waa.ticketing.repository.MovieRepository;
import com.waa.ticketing.service.MovieService;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Override
	public List<Movie> getAllMovies() {
		return movieRepository.getAllMovies();
	}

	@Override
	public Movie getMovieById(String movieID) {
		return movieRepository.getMovieById(movieID);
	}

	@Override
	public void addMovie(Movie product) {
		movieRepository.save(product);
	}

	@Override
	public Movie get(long productID) {
		return movieRepository.findOne(productID);
	}
}
