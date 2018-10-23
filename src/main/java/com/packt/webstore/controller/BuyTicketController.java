package com.packt.webstore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.packt.webstore.domain.Time;
 
@Controller
public class BuyTicketController {

	
 	@RequestMapping(value = "/ticket", method = RequestMethod.GET)
	public String getTicketForm(Model model) {
 		List<Time> times = new ArrayList<Time>();
 		Time time = new Time();
 		Time time2 = new Time();
 		time.setTime("15:00");
 		time.setTimeId(1);
 		time2.setTime("17:00");
 		time.setTimeId(2);
 		times.add(time);
 		times.add(time2);
 		
		model.addAttribute("times",times);
		return "buyTicket";
	}	
 	
 	@RequestMapping(value = "/ticket", method = RequestMethod.POST)
	public String saveTicketForm(@ModelAttribute("ticket") Time time, Model model) {
		
		model.addAttribute("greeting", "Welcome to Web Store!");
		model.addAttribute("tagline", "The one and only amazing web store");

		
		return "buyTicket";
	}	
}
