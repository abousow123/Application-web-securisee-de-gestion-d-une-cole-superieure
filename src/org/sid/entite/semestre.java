package org.sid.entite;

import java.util.Collection;
import java.util.Date;

/***********************************************************************
 * Module:  semestre.java
 * Author:  user
 * Purpose: Defines the Class semestre
 ***********************************************************************/



public class semestre {
	
   private String codesemestre;
   private String libelle_semestre;
   private java.util.Date date_debut;
   private java.util.Date date_fin;
   
   public java.util.Collection<UE> uE;
   public java.util.Collection<Emplois_du_temps> emplois_du_temps;
   
public semestre(String codesemestre, String libelle_semestre, Date date_debut, Date date_fin) {
	super();
	this.codesemestre = codesemestre;
	this.libelle_semestre = libelle_semestre;
	this.date_debut = date_debut;
	this.date_fin = date_fin;
}

public semestre(String codesemestre, String libelle_semestre, Date date_debut, Date date_fin, Collection<UE> uE,
		Collection<Emplois_du_temps> emplois_du_temps) {
	super();
	this.codesemestre = codesemestre;
	this.libelle_semestre = libelle_semestre;
	this.date_debut = date_debut;
	this.date_fin = date_fin;
	this.uE = uE;
	this.emplois_du_temps = emplois_du_temps;
}

public semestre() {
	super();
}

public String getCodesemestre() {
	return codesemestre;
}

public void setCodesemestre(String codesemestre) {
	this.codesemestre = codesemestre;
}

public String getLibelle_semestre() {
	return libelle_semestre;
}

public void setLibelle_semestre(String libelle_semestre) {
	this.libelle_semestre = libelle_semestre;
}

public java.util.Date getDate_debut() {
	return date_debut;
}

public void setDate_debut(java.util.Date date_debut) {
	this.date_debut = date_debut;
}

public java.util.Date getDate_fin() {
	return date_fin;
}

public void setDate_fin(java.util.Date date_fin) {
	this.date_fin = date_fin;
}

public java.util.Collection<UE> getuE() {
	return uE;
}

public void setuE(java.util.Collection<UE> uE) {
	this.uE = uE;
}

public java.util.Collection<Emplois_du_temps> getEmplois_du_temps() {
	return emplois_du_temps;
}

public void setEmplois_du_temps(java.util.Collection<Emplois_du_temps> emplois_du_temps) {
	this.emplois_du_temps = emplois_du_temps;
}
   
   



  
   
}