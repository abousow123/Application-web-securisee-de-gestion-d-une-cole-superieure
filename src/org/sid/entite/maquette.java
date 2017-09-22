package org.sid.entite;

import java.util.Collection;

/***********************************************************************
 * Module:  maquette.java
 * Author:  user
 * Purpose: Defines the Class maquette
 ***********************************************************************/



public class maquette {
	
   private String codemaquette;
   private String annee;
   
   public java.util.Collection<semestre> semestre;
   public classe classe;
   
   
public maquette(String codemaquette, String annee, Collection<org.sid.entite.semestre> semestre,
		org.sid.entite.classe classe) {
	super();
	this.codemaquette = codemaquette;
	this.annee = annee;
	this.semestre = semestre;
	this.classe = classe;
}


public maquette() {
	super();
}


public String getCodemaquette() {
	return codemaquette;
}


public void setCodemaquette(String codemaquette) {
	this.codemaquette = codemaquette;
}


public String getAnnee() {
	return annee;
}


public void setAnnee(String annee) {
	this.annee = annee;
}


public java.util.Collection<semestre> getSemestre() {
	return semestre;
}


public void setSemestre(java.util.Collection<semestre> semestre) {
	this.semestre = semestre;
}


public classe getClasse() {
	return classe;
}


public void setClasse(classe classe) {
	this.classe = classe;
}



   
   
   
   
   
 

}