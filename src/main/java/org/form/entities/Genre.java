package org.form.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Genre implements Serializable {
	@Id @GeneratedValue
	private int idGenre;
	private String genre;
	private Date date;
	@ManyToOne
	@JoinColumn(name="id_cnt_gr")
	private Contact contactG;
	public Genre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Genre(String genre, Date date) {
		super();
		this.genre = genre;
		this.date = date;
	}

	public Genre(String genre, Date date, Contact contactG) {
		super();
		this.genre = genre;
		this.date = date;
		this.contactG = contactG;
	}
	public int getIdGenre() {
		return idGenre;
	}
	public void setIdGenre(int idGenre) {
		this.idGenre = idGenre;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Contact getContactG() {
		return contactG;
	}
	public void setContactG(Contact contactG) {
		this.contactG = contactG;
	}
	
	
	
	

}
