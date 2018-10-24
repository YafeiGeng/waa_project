package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.packt.webstore.service.TimeService;

@Controller
@RequestMapping("/ticket")
public class BuyTicketController {

/*	@Autowired
	private MovieTimeService movieTimeService;
*/
	@Autowired
	private TimeService timeService;
	
	@RequestMapping
	public String list(Model model) {
		model.addAttribute("times", timeService.getAllTimes());
		return "buyTicket";
	}
/*
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("newProduct") Time time){
		return "";
	}*/

}