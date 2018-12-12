package org.form;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.form.dao.ContactRepository;
import org.form.dao.GenreRepository;
import org.form.dao.StatutRepository;
import org.form.entities.Contact;
import org.form.entities.Ecole;
import org.form.entities.Genre;
import org.form.entities.Institut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FormulaireContactApplication implements CommandLineRunner{

	
	@Autowired
	private ContactRepository contactRepository;
	@Autowired
	private GenreRepository genreRepository;
	@Autowired
	private StatutRepository statutRepository;
	public static void main(String[] args) {
		SpringApplication.run(FormulaireContactApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
		contactRepository.save(new Contact("Safaa","FOUHAMI", df.parse("24/09/1992"))); 
		contactRepository.save(new Contact("Meryem","FOUHAMI", df.parse("24/09/1992"))); 
		contactRepository.save(new Contact("Youness", "FOUHAMI",df.parse("24/09/1992"))); 
      
		genreRepository.save(new Genre("Homme",df.parse("12/09/2010")));
		genreRepository.save(new Genre("Femme",df.parse("11/11/2011")));
		genreRepository.save(new Genre("Autre",df.parse("12/12/2012")));
		
		statutRepository.save(new Ecole("Bac+5","Informatique","ENSIAS"));
		statutRepository.save(new Institut("Bac+2","Reseaux et Telecoms","INPT"));
		
		statutRepository.save(new Ecole("Bac","Informatique","ENSIAS"));
		statutRepository.save(new Institut("Bac+2","Reseaux et Telecoms","INPT"));
		
		
	}
}
