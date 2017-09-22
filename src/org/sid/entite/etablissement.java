package org.sid.entite;
/***********************************************************************
 * Module:  etablissement.java
 * Author:  user
 * Purpose: Defines the Class etablissement
 ***********************************************************************/


public class etablissement {
	
   private String codeetablissement;
   private String libelle_etablissemant;
   
   
public etablissement(String codeetablissement, String libelle_etablissemant) {
	super();
	this.codeetablissement = codeetablissement;
	this.libelle_etablissemant = libelle_etablissemant;
}


public etablissement() {
	super();
}


public String getCodeetablissement() {
	return codeetablissement;
}


public void setCodeetablissement(String codeetablissement) {
	this.codeetablissement = codeetablissement;
}


public String getLibelle_etablissemant() {
	return libelle_etablissemant;
}


public void setLibelle_etablissemant(String libelle_etablissemant) {
	this.libelle_etablissemant = libelle_etablissemant;
}



   
   

}