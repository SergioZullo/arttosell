package com.arttosell.app.core.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.arttosell.app.core.models.Artist;
import com.arttosell.app.core.services.ArtistService;

@Controller
public class ArtistController {
	
	@Autowired
	private ArtistService artistService;
	
	@RequestMapping(value = "/artist/{id}" )
	public String getArtistById(@PathVariable(value="id") String id,
								Model model){
		
		final Artist artist = artistService.findArtistById(Long.valueOf(id));
		
		System.out.println(artist.getId() + " " + artist.getName());
		model.addAttribute("id", id);
		return "artist";
	}
	
}
