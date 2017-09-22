package org.sid.entite;

import java.util.Date;

/***********************************************************************
 * Module:  cours.java
 * Author:  user
 * Purpose: Defines the Class cours
 ***********************************************************************/



public class cours {
	
	
   private String codecours;
   private java.util.Date date;
   private String heure_debut;
   private String heure_fin;
   
   
public cours(String codecours, Date date, String heure_debut, String heure_fin) {
	super();
	this.codecours = codecours;
	this.date = date;
	this.heure_debut = heure_debut;
	this.heure_fin = heure_fin;
}


public cours() {
	super();
}


public String getCodecours() {
	return codecours;
}


public void setCodecours(String codecours) {
	this.codecours = codecours;
}


public java.util.Date getDate() {
	return date;
}


public void setDate(java.util.Date date) {
	this.date = date;
}


public String getHeure_debut() {
	return heure_debut;
}


public void setHeure_debut(String heure_debut) {
	this.heure_debut = heure_debut;
}


public String getHeure_fin() {
	return heure_fin;
}


public void setHeure_fin(String heure_fin) {
	this.heure_fin = heure_fin;
}


   
   

}