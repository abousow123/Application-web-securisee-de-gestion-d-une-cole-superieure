package org.sid.entite;

import java.util.Collection;

/***********************************************************************
 * Module:  Niveau.java
 * Author:  user
 * Purpose: Defines the Class Niveau
 ***********************************************************************/



public class Niveau {
	
   private int idniveau;
   private String libelle;
   
   public java.util.Collection<classe> classe;

public Niveau(int idniveau, String libelle, Collection<org.sid.entite.classe> classe) {
	super();
	this.idniveau = idniveau;
	this.libelle = libelle;
	this.classe = classe;
}

public Niveau(int idniveau, String libelle) {
	super();
	this.idniveau = idniveau;
	this.libelle = libelle;
}

public Niveau() {
	super();
}

public int getIdniveau() {
	return idniveau;
}

public void setIdniveau(int idniveau) {
	this.idniveau = idniveau;
}

public String getLibelle() {
	return libelle;
}

public void setLibelle(String libelle) {
	this.libelle = libelle;
}

public java.util.Collection<classe> getClasse() {
	return classe;
}

public void setClasse(java.util.Collection<classe> classe) {
	this.classe = classe;
}
   
   
   
   
   
  

}