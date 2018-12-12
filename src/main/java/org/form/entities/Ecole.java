package org.form.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("E")
public class Ecole extends Statut{
	

	private String ecole;

	
	
	public Ecole() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public String getEcole() {
		return ecole;
	}

	public Ecole(String niveauEtude, String domaine, String ecole) {
		super(niveauEtude, domaine);
		this.ecole = ecole;
	}


	public void setEcole(String ecole) {
		this.ecole = ecole;
	}
	

}
