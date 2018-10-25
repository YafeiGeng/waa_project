package com.waa.ticketing.service;

import java.util.List;

import com.waa.ticketing.domain.Movie;

public interface MovieService {

	List<Movie> getAllMovies();

	Movie getMovieById(String movieID);

	void addMovie(Movie movie);

	Movie get(long id);

}