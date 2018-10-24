package com.packt.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ticket/payment")
public class PaymentController {

	@RequestMapping
	public String list(Model model) {		
		return "payment";
	}
	
	@RequestMapping(value="/payment", method = RequestMethod.POST)
	public String getProductById() {	
		System.out.println("payment post method is loaded");
		return "payment";
	}

 
}
