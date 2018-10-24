package com.packt.webstore.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.packt.webstore.domain.Time;
import com.packt.webstore.service.TimeService;

@Controller
@RequestMapping("/ticket")
public class BuyTicketController {

/*	@Autowired
	private MovieTimeService movieTimeService;
*/
	/*@Autowired
	private TimeService timeService;*/
	
	@RequestMapping
	public String list(Model model) {
		Time time = new Time();
		time.setTime("17:00");
		time.setTimeId(1);
		Time time2 = new Time();
		time2.setTime("19:00");
		time2.setTimeId(2);
		
		List<Time> times = new ArrayList<Time>();
		times.add(time);
		times.add(time2);
		model.addAttribute("times", times);
		return "buyTicket";
	}
/*
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewProductForm(@ModelAttribute("newProduct") Time time){
		return "";
	}*/

}