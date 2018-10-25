package com.waa.ticketing.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.waa.ticketing.domain.Movie;
import com.waa.ticketing.service.MovieService;

@Controller
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private MovieService movieService;

	@RequestMapping
	public String list(Model model) {
		model.addAttribute("movies", movieService.getAllMovies());
		return "movies";
	}

	@RequestMapping("/all")
	public ModelAndView allMovies() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("movies", movieService.getAllMovies());
		modelAndView.setViewName("movies");
		return modelAndView;
	}

	@RequestMapping("/movie")
	public String getMovieById(Model model, @RequestParam("id") String movieId) {

		Movie movie = movieService.getMovieById(movieId);
		model.addAttribute("movie", movie);
		return "movie";
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getAddNewProductForm(@ModelAttribute("newMovie") Movie newProduct) {
		return "addMovie";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("newMovie") @Valid Movie newMovie, BindingResult result,
			HttpServletRequest request) {
		if (result.hasErrors()) {
			return "addMovie";
		}

		MultipartFile movieImage = newMovie.getMovieImage();
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");

		if (movieImage != null && !movieImage.isEmpty()) {
			try {
				movieImage
						.transferTo(new File(rootDirectory + "\\resources\\images\\" + newMovie.getMovieId() + ".png"));
			} catch (Exception e) {
				throw new RuntimeException("Movie Image saving failed", e);
			}
		}

		try {
			movieService.addMovie(newMovie);
		} catch (Exception up) {
			System.out.println("Transaction Failed!!!");

		}

		return "redirect:/movies";
	}

}