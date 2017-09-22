package org.sid.entite;
/***********************************************************************
 * Module:  responsable.java
 * Author:  user
 * Purpose: Defines the Class responsable
 ***********************************************************************/

import java.util.*;

public class responsable extends utilisateur {
	
   public responsable(String codeutilisateur, String nom, String prenom, String datedenaissance,
			String situation_matrimonial, String telephone, String adresse, String pays, String email, String cIN) {
		super(codeutilisateur, nom, prenom, datedenaissance, situation_matrimonial, telephone, adresse, pays, email, cIN);
		// TODO Auto-generated constructor stub
	}

public java.util.Collection<Emplois_du_temps> emplois_du_temps;
   public java.util.Collection<etablissement> etablissement;
   
   
   
   
   
   public responsable(String codeutilisateur, String nom, String prenom, String datedenaissance,
		String situation_matrimonial, String telephone, String adresse, String ville, String pays, String email,
		int boite_postale, String cIN, String login, String password, Collection<org.sid.entite.message> message,
		Collection<Emplois_du_temps> emplois_du_temps, Collection<org.sid.entite.etablissement> etablissement) {
	super(codeutilisateur, nom, prenom, datedenaissance, situation_matrimonial, telephone, adresse, ville, pays, email,
			boite_postale, cIN, login, password, message);
	this.emplois_du_temps = emplois_du_temps;
	this.etablissement = etablissement;
}

public void ajouter_responsable() {
      // TODO: implement
   }
   
   public void modifier_responsable() {
      // TODO: implement
   }
   
   public void supprimer_responsable() {
      // TODO: implement
   }

public java.util.Collection<Emplois_du_temps> getEmplois_du_temps() {
	return emplois_du_temps;
}

public void setEmplois_du_temps(java.util.Collection<Emplois_du_temps> emplois_du_temps) {
	this.emplois_du_temps = emplois_du_temps;
}

public java.util.Collection<etablissement> getEtablissement() {
	return etablissement;
}

public void setEtablissement(java.util.Collection<etablissement> etablissement) {
	this.etablissement = etablissement;
}
   
   
   
   
   
  
}