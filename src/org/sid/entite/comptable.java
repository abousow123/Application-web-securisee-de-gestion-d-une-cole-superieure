package org.sid.entite;

import java.util.Collection;

/***********************************************************************
 * Module:  comptable.java
 * Author:  user
 * Purpose: Defines the Class comptable
 ***********************************************************************/



public class comptable extends utilisateur {
	
	public java.util.Collection<facture> facture;
	
   public comptable(String codeutilisateur, String nom, String prenom, String datedenaissance,
			String situation_matrimonial, String telephone, String adresse, String pays, String email, String cIN) {
		super(codeutilisateur, nom, prenom, datedenaissance, situation_matrimonial, telephone, adresse, pays, email, cIN);
		// TODO Auto-generated constructor stub
	}


   
   
   
   
   
   
   public comptable(String codeutilisateur, String nom, String prenom, String datedenaissance,
		String situation_matrimonial, String telephone, String adresse, String ville, String pays, String email,
		int boite_postale, String cIN, String login, String password, Collection<org.sid.entite.message> message,
		Collection<org.sid.entite.facture> facture) {
	super(codeutilisateur, nom, prenom, datedenaissance, situation_matrimonial, telephone, adresse, ville, pays, email,
			boite_postale, cIN, login, password, message);
	this.facture = facture;
}








public void ajouter_comptable() {
      // TODO: implement
   }
   
   public void modifier_comptable() {
      // TODO: implement
   }
   
   public void supprimer_comptable() {
      // TODO: implement
   }








public java.util.Collection<facture> getFacture() {
	return facture;
}








public void setFacture(java.util.Collection<facture> facture) {
	this.facture = facture;
}
   
   
   
   
   
}