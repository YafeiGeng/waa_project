package com.packt.webstore.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.packt.webstore.domain.Reservation;

@Controller
public class BuyTicketController {
	
/*	@Autowired
	ReservationService reservationService;*/
	
	@RequestMapping(value = "/movie/ticket", method = RequestMethod.GET)
	public String list( Model model) {	
		
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
		System.out.println("loading post");
		
		return "chooseSeat";
	}

}