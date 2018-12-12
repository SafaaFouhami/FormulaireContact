package org.form.web;

import org.form.dao.StatutRepository;
import org.form.entities.Statut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatutRestController {
	@Autowired
	private StatutRepository statutRepository;

	@RequestMapping(value = "/statuts", method = RequestMethod.POST)
	public Statut saveStatut(@RequestBody Statut s) {

		return statutRepository.save(s);
	}

}
