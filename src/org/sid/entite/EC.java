package org.sid.entite;

import java.util.Collection;

/***********************************************************************
 * Module:  EC.java
 * Author:  user
 * Purpose: Defines the Class EC
 ***********************************************************************/


public class EC {
	
   private String codematiere;
   private String libelle_matiere;
   private String quantumhoraire;
   private int credit;
   private String tp;
   private String td;
   private String tpe;
   private String coursmagistraux;
   
   public java.util.Collection<cours> cours;
   
   
   
   
   public EC(String codematiere, String libelle_matiere, String quantumhoraire, int credit, String tp, String td,
		String tpe, String coursmagistraux) {
	super();
	this.codematiere = codematiere;
	this.libelle_matiere = libelle_matiere;
	this.quantumhoraire = quantumhoraire;
	this.credit = credit;
	this.tp = tp;
	this.td = td;
	this.tpe = tpe;
	this.coursmagistraux = coursmagistraux;
}
   
   

public EC() {
	super();
}



public EC(String codematiere, String libelle_matiere, String quantumhoraire, int credit, String tp, String td,
		String tpe, String coursmagistraux, Collection<org.sid.entite.cours> cours) {
	super();
	this.codematiere = codematiere;
	this.libelle_matiere = libelle_matiere;
	this.quantumhoraire = quantumhoraire;
	this.credit = credit;
	this.tp = tp;
	this.td = td;
	this.tpe = tpe;
	this.coursmagistraux = coursmagistraux;
	this.cours = cours;
}



public void ajouter_matiere() {
      // TODO: implement
   }
   
   public void modifier_matiere() {
      // TODO: implement
   }
   
   public void supprimer_matiere() {
      // TODO: implement
   }



public String getCodematiere() {
	return codematiere;
}



public void setCodematiere(String codematiere) {
	this.codematiere = codematiere;
}



public String getLibelle_matiere() {
	return libelle_matiere;
}



public void setLibelle_matiere(String libelle_matiere) {
	this.libelle_matiere = libelle_matiere;
}



public String getQuantumhoraire() {
	return quantumhoraire;
}



public void setQuantumhoraire(String quantumhoraire) {
	this.quantumhoraire = quantumhoraire;
}



public int getCredit() {
	return credit;
}



public void setCredit(int credit) {
	this.credit = credit;
}



public String getTp() {
	return tp;
}



public void setTp(String tp) {
	this.tp = tp;
}



public String getTd() {
	return td;
}



public void setTd(String td) {
	this.td = td;
}



public String getTpe() {
	return tpe;
}



public void setTpe(String tpe) {
	this.tpe = tpe;
}



public String getCoursmagistraux() {
	return coursmagistraux;
}



public void setCoursmagistraux(String coursmagistraux) {
	this.coursmagistraux = coursmagistraux;
}



public java.util.Collection<cours> getCours() {
	return cours;
}



public void setCours(java.util.Collection<cours> cours) {
	this.cours = cours;
}
   
   
   
   
   
   
}