package org.form.web;

import org.form.dao.GenreRepository;
import org.form.entities.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenreRestController {
	@Autowired
	private GenreRepository genreRepository;
	
	@RequestMapping(value="/genres", method=RequestMethod.POST)
	public  Genre saveGenre(@RequestBody Genre r) {
		
		return genreRepository.save(r);
	}

}
