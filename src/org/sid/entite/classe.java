package org.sid.entite;
/***********************************************************************
 * Module:  classe.java
 * Author:  user
 * Purpose: Defines the Class classe
 ***********************************************************************/

import java.util.*;


public class classe {
   
   private String codeclasse;
  
   private String lbelle_classe;
  
   private int nombree_etudiant;
   
   private String type;
   
   public java.util.Collection<maquette> maquette;
   public java.util.Collection<Emplois_du_temps> emplois_du_temps;
   public filiere filiere;
   
   
   
   public classe(String codeclasse, String lbelle_classe, int nombree_etudiant, String type) {
	super();
	this.codeclasse = codeclasse;
	this.lbelle_classe = lbelle_classe;
	this.nombree_etudiant = nombree_etudiant;
	this.type = type;
}
   
   
   

public classe() {
	super();
}






public classe(String codeclasse, String lbelle_classe, int nombree_etudiant, String type,
		Collection<org.sid.entite.maquette> maquette, Collection<Emplois_du_temps> emplois_du_temps,
		org.sid.entite.filiere filiere) {
	super();
	this.codeclasse = codeclasse;
	this.lbelle_classe = lbelle_classe;
	this.nombree_etudiant = nombree_etudiant;
	this.type = type;
	this.maquette = maquette;
	this.emplois_du_temps = emplois_du_temps;
	this.filiere = filiere;
}




// Getters and Setters
   

public String getCodeclasse() {
	return codeclasse;
}

public void setCodeclasse(String codeclasse) {
	this.codeclasse = codeclasse;
}

public String getLbelle_classe() {
	return lbelle_classe;
}

public void setLbelle_classe(String lbelle_classe) {
	this.lbelle_classe = lbelle_classe;
}

public int getNombree_etudiant() {
	return nombree_etudiant;
}

public void setNombree_etudiant(int nombree_etudiant) {
	this.nombree_etudiant = nombree_etudiant;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public filiere getFiliere() {
	return filiere;
}

public void setFiliere(filiere filiere) {
	this.filiere = filiere;
}

}