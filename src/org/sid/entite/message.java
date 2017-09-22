package org.sid.entite;
/***********************************************************************
 * Module:  message.java
 * Author:  user
 * Purpose: Defines the Class message
 ***********************************************************************/



public class message {
	
   private String codemessage;
   private String objet;
   private String contenue;
   private String destinataire;
   
public message(String codemessage, String objet, String contenue, String destinataire) {
	super();
	this.codemessage = codemessage;
	this.objet = objet;
	this.contenue = contenue;
	this.destinataire = destinataire;
}

public message() {
	super();
}

public String getCodemessage() {
	return codemessage;
}

public void setCodemessage(String codemessage) {
	this.codemessage = codemessage;
}

public String getObjet() {
	return objet;
}

public void setObjet(String objet) {
	this.objet = objet;
}

public String getContenue() {
	return contenue;
}

public void setContenue(String contenue) {
	this.contenue = contenue;
}

public String getDestinataire() {
	return destinataire;
}

public void setDestinataire(String destinataire) {
	this.destinataire = destinataire;
}



   
   

}