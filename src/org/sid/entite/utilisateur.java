package org.sid.entite;
/***********************************************************************
 * Module:  utilisateur.java
 * Author:  user
 * Purpose: Defines the Class utilisateur
 ***********************************************************************/

import java.util.*;

public class utilisateur {
	
   private String codeutilisateur;
   private String nom;
   private String prenom;
   private String datedenaissance;
   private String situation_matrimonial;
   private String telephone;
   private String adresse;
   private String ville;
   private String pays;
   private String email;
   private int boite_postale;
   private String CIN;
   private String login;
   private String password;
   
   public java.util.Collection<message> message;
   
   
   

   
   public utilisateur(String codeutilisateur, String nom, String prenom, String datedenaissance,
		String situation_matrimonial, String telephone, String adresse, String ville, String pays, String email,
		int boite_postale, String cIN, String login, String password, Collection<org.sid.entite.message> message) {
	super();
	this.codeutilisateur = codeutilisateur;
	this.nom = nom;
	this.prenom = prenom;
	this.datedenaissance = datedenaissance;
	this.situation_matrimonial = situation_matrimonial;
	this.telephone = telephone;
	this.adresse = adresse;
	this.ville = ville;
	this.pays = pays;
	this.email = email;
	this.boite_postale = boite_postale;
	CIN = cIN;
	this.login = login;
	this.password = password;
	this.message = message;
}

public utilisateur(String codeutilisateur, String nom, String prenom, String datedenaissance,
		String situation_matrimonial, String telephone, String adresse, String pays, String email, String cIN) {
	super();
	this.codeutilisateur = codeutilisateur;
	this.nom = nom;
	this.prenom = prenom;
	this.datedenaissance = datedenaissance;
	this.situation_matrimonial = situation_matrimonial;
	this.telephone = telephone;
	this.adresse = adresse;
	this.pays = pays;
	this.email = email;
	CIN = cIN;
}

//// ********** Getters and Setters *************
   
public String getCodeutilisateur() {
	return codeutilisateur;
}

public void setCodeutilisateur(String codeutilisateur) {
	this.codeutilisateur = codeutilisateur;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getDatedenaissance() {
	return datedenaissance;
}

public void setDatedenaissance(String datedenaissance) {
	this.datedenaissance = datedenaissance;
}

public String getSituation_matrimonial() {
	return situation_matrimonial;
}

public void setSituation_matrimonial(String situation_matrimonial) {
	this.situation_matrimonial = situation_matrimonial;
}

public String getTelephone() {
	return telephone;
}

public void setTelephone(String telephone) {
	this.telephone = telephone;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

public String getPays() {
	return pays;
}

public void setPays(String pays) {
	this.pays = pays;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getBoite_postale() {
	return boite_postale;
}

public void setBoite_postale(int boite_postale) {
	this.boite_postale = boite_postale;
}

public String getCIN() {
	return CIN;
}

public void setCIN(String cIN) {
	CIN = cIN;
}

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public java.util.Collection<message> getMessage() {
	return message;
}

public void setMessage(java.util.Collection<message> message) {
	this.message = message;
}
   
   
   
}