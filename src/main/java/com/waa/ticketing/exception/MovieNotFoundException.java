package com.waa.ticketing.exception;

import org.springframework.stereotype.Component;

@Component
public class MovieNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -694354952032299587L;
	
	private String movieId;
	private String message = "Movie Not Found for this ID ";
	
	public MovieNotFoundException() {}
	
	public MovieNotFoundException(String movieId, String message) {
		this.movieId = movieId;
		Object[] parameters= {movieId};
		
		if (message != null) this.message = message;
		
	}
	
	public String getFullMessage() {
		return (message + movieId);
	}
	
	public String getMovieId() {
		return movieId;
	}
	


}
