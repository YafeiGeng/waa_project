package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.packt.webstore.domain.Cart;
import com.packt.webstore.service.CartService;



@Controller
public class CartController {

	@Autowired
	private CartService cartService;

	@RequestMapping(value = "/ticket", method = RequestMethod.GET)
	public String get(Model model) {
		return "cart";
	}
	
	@RequestMapping(value = "/{cartId}", method = RequestMethod.POST)
	public String getCart(@PathVariable(value = "cartId") String cartId, Model model) {
		model.addAttribute("cartId",cartId);
		Cart cart = cartService.read(cartId);
		if (cart == null) {
			cart = new Cart(cartId);
			cartService.create(cart );
		}
		model.addAttribute("cart",cart);
		
		return "cart";
	}
}
