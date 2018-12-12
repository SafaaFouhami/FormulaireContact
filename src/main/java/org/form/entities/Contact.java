package org.form.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Contact implements Serializable {
	@Id
	@GeneratedValue
	private Long idContact;
	private String prenom;
	private String nom;
	private Date date;
	@OneToMany(mappedBy = "contactS", fetch = FetchType.LAZY)
	private Collection<Statut> statuts;
	@OneToMany(mappedBy = "contactG", fetch = FetchType.LAZY)
	private Collection<Genre> genres;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Contact(String prenom, String nom, Date date) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.date = date;
	}



	public Long getId() {
		return idContact;
	}

	public void setId(Long id) {
		this.idContact = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}



	public Collection<Statut> getStatuts() {
		return statuts;
	}



	public void setStatuts(Collection<Statut> statuts) {
		this.statuts = statuts;
	}



	public Collection<Genre> getGenres() {
		return genres;
	}



	public void setGenres(Collection<Genre> genres) {
		this.genres = genres;
	}

}
