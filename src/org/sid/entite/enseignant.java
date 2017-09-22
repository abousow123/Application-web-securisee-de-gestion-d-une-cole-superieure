package org.sid.entite;
/***********************************************************************
 * Module:  enseignant.java
 * Author:  user
 * Purpose: Defines the Class enseignant
 ***********************************************************************/

import java.util.*;

public class enseignant extends utilisateur {
	
   public enseignant(String codeutilisateur, String nom, String prenom, String datedenaissance,
			String situation_matrimonial, String telephone, String adresse, String pays, String email, String cIN) {
		super(codeutilisateur, nom, prenom, datedenaissance, situation_matrimonial, telephone, adresse, pays, email, cIN);
		// TODO Auto-generated constructor stub
	}

private String grade;
   private String status;
   
   public java.util.Collection<cours> cours;
   
   
   
   
   
   
   public enseignant(String codeutilisateur, String nom, String prenom, String datedenaissance,
		String situation_matrimonial, String telephone, String adresse, String ville, String pays, String email,
		int boite_postale, String cIN, String login, String password, Collection<org.sid.entite.message> message,
		String grade, String status) {
	super(codeutilisateur, nom, prenom, datedenaissance, situation_matrimonial, telephone, adresse, ville, pays, email,
			boite_postale, cIN, login, password, message);
	this.grade = grade;
	this.status = status;
}

public enseignant(String codeutilisateur, String nom, String prenom, String datedenaissance,
		String situation_matrimonial, String telephone, String adresse, String ville, String pays, String email,
		int boite_postale, String cIN, String login, String password, Collection<org.sid.entite.message> message) {
	super(codeutilisateur, nom, prenom, datedenaissance, situation_matrimonial, telephone, adresse, ville, pays, email,
			boite_postale, cIN, login, password, message);
}

public void ajouter_enseignant() {
      // TODO: implement
   }
   
   public void modifier_enseignant() {
      // TODO: implement
   }
   
   public void supprimer_enseignant() {
      // TODO: implement
   }

public String getGrade() {
	return grade;
}

public void setGrade(String grade) {
	this.grade = grade;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public java.util.Collection<cours> getCours() {
	return cours;
}

public void setCours(java.util.Collection<cours> cours) {
	this.cours = cours;
}
   
   
   
   
  
}