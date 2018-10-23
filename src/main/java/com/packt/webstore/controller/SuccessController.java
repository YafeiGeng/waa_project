package com.packt.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class SuccessController {

	
 	@RequestMapping("/success")
	public String welcome(Model model) {
		
		model.addAttribute("greeting", "Payment has done successfully");
		model.addAttribute("tagline", "Thank you");

		
		return "success";
	}	
}
