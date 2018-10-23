package com.packt.webstore.domain;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie_time")
public class MovieTime {

	@Id
	Long id;
	
	@Column(name="movie_time_id")
	int movieTimeId;
	
	@Column(name="movie_id")
	int movieId;
	
	@Column(name="time_id")
	int timeId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getMovieTimeId() {
		return movieTimeId;
	}

	public void setMovieTimeId(int movieTimeId) {
		this.movieTimeId = movieTimeId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getTimeId() {
		return timeId;
	}

	public void setTimeId(int timeId) {
		this.timeId = timeId;
	}
	
	
}
