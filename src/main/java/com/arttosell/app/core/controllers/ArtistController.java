package com.arttosell.app.core.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ArtistController {

	@RequestMapping(value = "/artist/{id}" )
	public String getArtistById(@PathVariable(value="id") String id,
								Model model){
		model.addAttribute("id", id);
		return "artist";
	}
	
}
