package com.packt.webstore.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

@Entity(name = "MOVIE")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Pattern(regexp = "M[1-9]+", message = "{Pattern.Movie.movieId.validation}")
	@Column(name = "MOVIEID")
	private String movieId;

	@Size(min = 4, max = 50, message = "{Size.Movie.movieName.validation}")
	private String movieName;

	@Min(value = 0, message = "{Min.Movie.price.validation}")
	@Digits(integer = 8, fraction = 2, message = "{Digits.Movie.price.validation}")
	@Column(name = "PRICE")
	private BigDecimal price;
	private String description;
	private String genre;
	private String director;
	private long runTime;

	@JsonIgnore
	@Transient
	private MultipartFile movieImage;

	public Movie() {
		super();
	}

	public Movie(String productId, String name, BigDecimal price) {
		this.setMovieId(productId);
		this.setMovieName(name);
		this.setPrice(price);
	}

	@XmlTransient
	public MultipartFile getMovieImage() {
		return movieImage;
	}

	public void setMovieImage(MultipartFile movieImage) {
		this.movieImage = movieImage;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (getMovieId() == null) {
			if (other.getMovieId() != null)
				return false;
		} else if (!getMovieId().equals(other.getMovieId()))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getMovieId() == null) ? 0 : getMovieId().hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + getMovieId() + ", movie name=" + getMovieName() + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public long getRunTime() {
		return runTime;
	}

	public void setRunTime(long runTime) {
		this.runTime = runTime;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}