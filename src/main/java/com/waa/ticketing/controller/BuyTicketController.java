package com.waa.ticketing.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.waa.ticketing.domain.Movie;
import com.waa.ticketing.domain.Reservation;
import com.waa.ticketing.service.MovieService;

@Controller
public class BuyTicketController {
	
	@Autowired
	MovieService movieService;
	
	@RequestMapping(value = "/movie/ticket", method = RequestMethod.GET)
	public String list(@ModelAttribute("reservation") Reservation reservation, @RequestParam("movieid") String movieId, Model model) {	
		Movie movie = movieService.getMovieById(movieId);
		model.addAttribute("movie", movie);
		
		 Map<Integer, String> times = new HashMap<Integer, String>();
		 times.put(1, "11:00");
		 times.put(2, "13:00");
		 times.put(3, "15:00");

		model.addAttribute("times", times);		
		return "buyTicket";
	}

	@RequestMapping(value = "/movie/ticket", method = RequestMethod.POST)
	public String addNewTicketToReservation(@ModelAttribute("reservation") Reservation reservation, BindingResult result,
			HttpServletRequest request) {	
		
		return "success";
	}

}