package com.arttosell.app.core.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arttosell.app.core.models.Artist;
import com.arttosell.app.core.repository.ArtistRepository;
import com.arttosell.app.core.services.ArtistService;

@Service(value = "artistService")
public class DefaultArtistService implements ArtistService{

	@Autowired
	private ArtistRepository artistRepository;
	
	@Override
	public Artist findArtistById(Long id){
		return artistRepository.findOne(id);
	}
}
