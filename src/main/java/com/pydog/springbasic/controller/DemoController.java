package com.pydog.springbasic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pydog.springbasic.model.User;

@Controller
public class DemoController {

	@RequestMapping("/")
	public String hello(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "hello";
	}

	@RequestMapping("/getWelcomeMessage")
	public String getWelcomeMessage(@ModelAttribute("user") User user, Model model) {
		String message = "Welcome to Spring MVC basic demo, " + user.getFirstName() + "!";
		model.addAttribute("message", message);
		return "welcome";
	}
}
