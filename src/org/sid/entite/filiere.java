package org.sid.entite;
/***********************************************************************
 * Module:  filiere.java
 * Author:  user
 * Purpose: Defines the Class filiere
 ***********************************************************************/


public class filiere {
	
   private String codefiliere;
   private String libelle_filiere;
   
public filiere(String codefiliere, String libelle_filiere) {
	super();
	this.codefiliere = codefiliere;
	this.libelle_filiere = libelle_filiere;
}

public filiere() {
	super();
}

public String getCodefiliere() {
	return codefiliere;
}

public void setCodefiliere(String codefiliere) {
	this.codefiliere = codefiliere;
}

public String getLibelle_filiere() {
	return libelle_filiere;
}

public void setLibelle_filiere(String libelle_filiere) {
	this.libelle_filiere = libelle_filiere;
}
   


   

}