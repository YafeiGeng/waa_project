package com.packt.webstore.controller;

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

import com.packt.webstore.domain.Reservation;
import com.packt.webstore.service.MovieService;

@Controller
public class ChooseSeatController {
	
	@RequestMapping(value = "/movie/ticket/chooseSeat", method = RequestMethod.GET)
	public String list(@ModelAttribute("reservation") Reservation reservation) {			
		System.out.println("loading get");
		return "chooseSeat";
	}

	@RequestMapping(value = "/movie/ticket/dopayment", method = RequestMethod.POST)
	public String addNewTicketToReservation(@ModelAttribute("reservation") Reservation reservation, BindingResult result,
			HttpServletRequest request) {
		System.out.println("loading post");
		
		return "payment";
	}

}