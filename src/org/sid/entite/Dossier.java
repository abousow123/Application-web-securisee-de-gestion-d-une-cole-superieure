package org.sid.entite;

import java.util.Date;

/***********************************************************************
 * Module:  Dossier.java
 * Author:  user
 * Purpose: Defines the Class Dossier
 ***********************************************************************/


public class Dossier {
	
   private String codedossier;
   private java.util.Date date_creation;
   private String url;
   
   public etudiant etudiant;

public Dossier(String codedossier, Date date_creation, String url, org.sid.entite.etudiant etudiant) {
	super();
	this.codedossier = codedossier;
	this.date_creation = date_creation;
	this.url = url;
	this.etudiant = etudiant;
}

public Dossier() {
	super();
}

public String getCodedossier() {
	return codedossier;
}

public void setCodedossier(String codedossier) {
	this.codedossier = codedossier;
}

public java.util.Date getDate_creation() {
	return date_creation;
}

public void setDate_creation(java.util.Date date_creation) {
	this.date_creation = date_creation;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public etudiant getEtudiant() {
	return etudiant;
}

public void setEtudiant(etudiant etudiant) {
	this.etudiant = etudiant;
}



   
   



}