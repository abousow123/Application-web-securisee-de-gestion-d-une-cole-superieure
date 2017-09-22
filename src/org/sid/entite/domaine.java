package org.sid.entite;

import java.util.Collection;

/***********************************************************************
 * Module:  domaine.java
 * Author:  user
 * Purpose: Defines the Class domaine
 ***********************************************************************/



public class domaine {
	
   private String codedomaine;
   private String nom_domaine;
   
   public java.util.Collection<filiere> filiere;
   public etablissement etablissement;
   
public domaine(String codedomaine, String nom_domaine, Collection<org.sid.entite.filiere> filiere,
		org.sid.entite.etablissement etablissement) {
	super();
	this.codedomaine = codedomaine;
	this.nom_domaine = nom_domaine;
	this.filiere = filiere;
	this.etablissement = etablissement;
}

public domaine(String codedomaine, String nom_domaine) {
	super();
	this.codedomaine = codedomaine;
	this.nom_domaine = nom_domaine;
}

public domaine() {
	super();
}

public String getCodedomaine() {
	return codedomaine;
}

public void setCodedomaine(String codedomaine) {
	this.codedomaine = codedomaine;
}

public String getNom_domaine() {
	return nom_domaine;
}

public void setNom_domaine(String nom_domaine) {
	this.nom_domaine = nom_domaine;
}

public java.util.Collection<filiere> getFiliere() {
	return filiere;
}

public void setFiliere(java.util.Collection<filiere> filiere) {
	this.filiere = filiere;
}

public etablissement getEtablissement() {
	return etablissement;
}

public void setEtablissement(etablissement etablissement) {
	this.etablissement = etablissement;
}




   
   
  

}