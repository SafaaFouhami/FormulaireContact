package org.form.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("I")
public class Institut extends Statut {
	
	private String institut;

	
	public Institut(String niveauEtude, String domaine, String institut) {
		super(niveauEtude, domaine);
		this.institut = institut;
	}

	public Institut(String niveauEtude, String domaine, Contact contactS, String institut) {
		super(niveauEtude, domaine, contactS);
		this.institut = institut;
	}

	public Institut() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Institut(String niveauEtude, String domaine, Contact contactS) {
		super(niveauEtude, domaine, contactS);
		// TODO Auto-generated constructor stub
	}

	public String getInstitut() {
		return institut;
	}

	public void setInstitut(String institut) {
		this.institut = institut;
	}

}
