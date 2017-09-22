package org.sid.entite;
/***********************************************************************
 * Module:  facture.java
 * Author:  user
 * Purpose: Defines the Class facture
 ***********************************************************************/

import java.util.*;

public class facture {
   private String codefacture;
   private java.util.Date date_facture;
   private double arriere;
   private double montant;
   private String annee_scolaire;
   
   public paiement paiement;
   
   
   
   
   public facture() {
	super();
}

public facture(String codefacture, Date date_facture, double arriere, double montant, String annee_scolaire,
		org.sid.entite.paiement paiement) {
	super();
	this.codefacture = codefacture;
	this.date_facture = date_facture;
	this.arriere = arriere;
	this.montant = montant;
	this.annee_scolaire = annee_scolaire;
	this.paiement = paiement;
}

public void ajouter_facture() {
      // TODO: implement
   }
   
   public void modifier_facture() {
      // TODO: implement
   }
   
   public void supprimer_facture() {
      // TODO: implement
   }

public String getCodefacture() {
	return codefacture;
}

public void setCodefacture(String codefacture) {
	this.codefacture = codefacture;
}

public java.util.Date getDate_facture() {
	return date_facture;
}

public void setDate_facture(java.util.Date date_facture) {
	this.date_facture = date_facture;
}

public double getArriere() {
	return arriere;
}

public void setArriere(double arriere) {
	this.arriere = arriere;
}

public double getMontant() {
	return montant;
}

public void setMontant(double montant) {
	this.montant = montant;
}

public String getAnnee_scolaire() {
	return annee_scolaire;
}

public void setAnnee_scolaire(String annee_scolaire) {
	this.annee_scolaire = annee_scolaire;
}

public paiement getPaiement() {
	return paiement;
}

public void setPaiement(paiement paiement) {
	this.paiement = paiement;
}
   
   
   
   

}