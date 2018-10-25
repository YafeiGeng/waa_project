package com.waa.ticketing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.waa.ticketing.domain.Reservation;
 
@Controller
public class SuccessController {

	

	@RequestMapping(value="/success", method = RequestMethod.GET)
	public String display(Reservation reservation) {
		
		return "success";
	}
		
	@RequestMapping(value = "/success", method = RequestMethod.POST)	
	public @ResponseBody Reservation add(@RequestBody  Reservation reservation, BindingResult result)  {		
		return reservation;
	}
}
