package org.form.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_CNT",
discriminatorType=DiscriminatorType.STRING, length=2)
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME,include=JsonTypeInfo.As.PROPERTY, property="type")
@JsonSubTypes({
	@Type(name="E", value=Ecole.class),
	@Type(name="I", value=Institut.class)
	
	
})

public abstract class Statut implements Serializable {
@Id @GeneratedValue
	private int idStatus;
	private String niveauEtude;
	private String domaine;
	@ManyToOne
	@JoinColumn(name="id_cnt_st")
	private Contact contactS;

	public Statut() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Statut(String niveauEtude, String domaine, Contact contactS) {
		super();
		this.niveauEtude = niveauEtude;
		this.domaine = domaine;
		this.contactS = contactS;
	}

	public Statut(String niveauEtude, String domaine) {
		super();
		this.niveauEtude = niveauEtude;
		this.domaine = domaine;
	}

	public int getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(int idStatus) {
		this.idStatus = idStatus;
	}

	public String getNiveauEtude() {
		return niveauEtude;
	}

	public void setNiveauEtude(String niveauEtude) {
		this.niveauEtude = niveauEtude;
	}

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}

	public Contact getContactS() {
		return contactS;
	}

	public void setContactS(Contact contactS) {
		this.contactS = contactS;
	}
	
	
    
	
}
