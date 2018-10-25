package com.waa.ticketing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.waa.ticketing.domain.Payment;

@Controller
public class PaymentController {

	@RequestMapping(value = "/movie/ticket/payment", method = RequestMethod.GET)
	public String list(@ModelAttribute("payment") Payment payment, Model model) {	
		return "payment";
	}

	@RequestMapping(value = "/movie/ticket/payment", method = RequestMethod.POST)
	public String addNewTicketToReservation(@ModelAttribute("payment") Payment payment, BindingResult result) {	
		
		return "success";
	}

}