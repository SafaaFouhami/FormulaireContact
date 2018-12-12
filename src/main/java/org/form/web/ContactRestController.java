package org.form.web;

import org.form.dao.ContactRepository;
import org.form.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactRestController {
   @Autowired
   public ContactRepository contactRepository;
	@RequestMapping(value="/contacts", method=RequestMethod.POST)
	public Contact saveContact(@RequestBody Contact c ) {
		
		return contactRepository.save(c);
	}
}
