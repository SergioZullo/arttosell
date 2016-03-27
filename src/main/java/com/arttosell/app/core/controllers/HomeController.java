package com.arttosell.app.core.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/home")
	public String getHome(Model model){
		model.addAttribute("name", "Sergio");
		return "home";
	}
	
	@RequestMapping(value="/login")
	public String login(Model model){
		model.addAttribute("name", "Sergio");
		return "login";
	}
	
}
