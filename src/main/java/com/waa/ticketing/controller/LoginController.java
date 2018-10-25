package com.waa.ticketing.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.waa.ticketing.domain.User;
import com.waa.ticketing.service.UserService;

@Controller
@SessionAttributes("currentUser")
public class LoginController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String authenticate(@ModelAttribute("user") User user, Model model, HttpSession session) {

		User u = userService.getUserByUserName(user.getUserName());

		if (u == null || !u.getPassword().equals(user.getPassword())) {
			model.addAttribute("error_msg", "User doesn't registered!");
			return "login";
		}

		session.setAttribute("currentUser", u);

		return "redirect:/";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model, SessionStatus status) {

		status.setComplete();
		return "redirect:/";
	}
}
