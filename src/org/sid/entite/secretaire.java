package org.sid.entite;

import java.util.Collection;

/***********************************************************************
 * Module:  secretaire.java
 * Author:  user
 * Purpose: Defines the Class secretaire
 ***********************************************************************/



public class secretaire extends utilisateur {
   public secretaire(String codeutilisateur, String nom, String prenom, String datedenaissance,
			String situation_matrimonial, String telephone, String adresse, String pays, String email, String cIN) {
		super(codeutilisateur, nom, prenom, datedenaissance, situation_matrimonial, telephone, adresse, pays, email, cIN);
		// TODO Auto-generated constructor stub
	}

public java.util.Collection<Dossier> dossier;



   
   public secretaire(String codeutilisateur, String nom, String prenom, String datedenaissance,
		String situation_matrimonial, String telephone, String adresse, String ville, String pays, String email,
		int boite_postale, String cIN, String login, String password, Collection<org.sid.entite.message> message,
		Collection<Dossier> dossier) {
	super(codeutilisateur, nom, prenom, datedenaissance, situation_matrimonial, telephone, adresse, ville, pays, email,
			boite_postale, cIN, login, password, message);
	this.dossier = dossier;
}

public void ajouter_secretaire() {
      // TODO: implement
   }
   
   public void modifier_secretaire() {
      // TODO: implement
   }
   
   public void supprimer_secretaire() {
      // TODO: implement
   }

public java.util.Collection<Dossier> getDossier() {
	return dossier;
}

public void setDossier(java.util.Collection<Dossier> dossier) {
	this.dossier = dossier;
}
   
   
   
   
   
   
   
   
  
}