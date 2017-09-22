package org.sid.entite;
/***********************************************************************
 * Module:  paiement.java
 * Author:  user
 * Purpose: Defines the Class paiement
 ***********************************************************************/



public class paiement {
	
   private String codepaiement;
   private String couverture;
   private String scolarite;
   private String typedepaiement;
   private String date_paiement;
   private String annee;
   
   public facture facture;

public paiement(String codepaiement, String couverture, String scolarite, String typedepaiement, String date_paiement,
		String annee) {
	super();
	this.codepaiement = codepaiement;
	this.couverture = couverture;
	this.scolarite = scolarite;
	this.typedepaiement = typedepaiement;
	this.date_paiement = date_paiement;
	this.annee = annee;
}

public paiement(String codepaiement, String couverture, String scolarite, String typedepaiement, String date_paiement,
		String annee, org.sid.entite.facture facture) {
	super();
	this.codepaiement = codepaiement;
	this.couverture = couverture;
	this.scolarite = scolarite;
	this.typedepaiement = typedepaiement;
	this.date_paiement = date_paiement;
	this.annee = annee;
	this.facture = facture;
}

public paiement() {
	super();
}

public String getCodepaiement() {
	return codepaiement;
}

public void setCodepaiement(String codepaiement) {
	this.codepaiement = codepaiement;
}

public String getCouverture() {
	return couverture;
}

public void setCouverture(String couverture) {
	this.couverture = couverture;
}

public String getScolarite() {
	return scolarite;
}

public void setScolarite(String scolarite) {
	this.scolarite = scolarite;
}

public String getTypedepaiement() {
	return typedepaiement;
}

public void setTypedepaiement(String typedepaiement) {
	this.typedepaiement = typedepaiement;
}

public String getDate_paiement() {
	return date_paiement;
}

public void setDate_paiement(String date_paiement) {
	this.date_paiement = date_paiement;
}

public String getAnnee() {
	return annee;
}

public void setAnnee(String annee) {
	this.annee = annee;
}

public facture getFacture() {
	return facture;
}

public void setFacture(facture facture) {
	this.facture = facture;
}
   
   
   

}