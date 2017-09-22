package org.sid.entite;
/***********************************************************************
 * Module:  enseignant_responsable.java
 * Author:  user
 * Purpose: Defines the Class enseignant_responsable
 ***********************************************************************/

import java.util.*;

public class enseignant_responsable extends enseignant {
	
   public enseignant_responsable(String codeutilisateur, String nom, String prenom, String datedenaissance,
			String situation_matrimonial, String telephone, String adresse, String pays, String email, String cIN) {
		super(codeutilisateur, nom, prenom, datedenaissance, situation_matrimonial, telephone, adresse, pays, email, cIN);
		// TODO Auto-generated constructor stub
	}

public java.util.Collection<filiere> filiere;

public enseignant_responsable(String codeutilisateur, String nom, String prenom, String datedenaissance,
		String situation_matrimonial, String telephone, String adresse, String pays, String email, String cIN,
		Collection<org.sid.entite.filiere> filiere) {
	super(codeutilisateur, nom, prenom, datedenaissance, situation_matrimonial, telephone, adresse, pays, email, cIN);
	this.filiere = filiere;
}

public java.util.Collection<filiere> getFiliere() {
	return filiere;
}

public void setFiliere(java.util.Collection<filiere> filiere) {
	this.filiere = filiere;
}




   
   
  

}