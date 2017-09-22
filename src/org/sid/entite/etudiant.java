package org.sid.entite;
/***********************************************************************
 * Module:  etudiant.java
 * Author:  user
 * Purpose: Defines the Class etudiant
 ***********************************************************************/



public class etudiant extends utilisateur {
   public etudiant(String codeutilisateur, String nom, String prenom, String datedenaissance,
			String situation_matrimonial, String telephone, String adresse, String pays, String email, String cIN) {
		super(codeutilisateur, nom, prenom, datedenaissance, situation_matrimonial, telephone, adresse, pays, email, cIN);
		// TODO Auto-generated constructor stub
	}

private String responsableclasse;
   
   public java.util.Collection<paiement> paiement;
   public java.util.Collection suivre;
   public java.util.Collection Association_20;
   public classe classe;
   
   
   
   public void ajouter_etudiant() {
      // TODO: implement
   }
   
   public void modifier_etudiant() {
      // TODO: implement
   }
   
   public void supprimer_etudiant() {
      // TODO: implement
   }

public String getResponsableclasse() {
	return responsableclasse;
}

public void setResponsableclasse(String responsableclasse) {
	this.responsableclasse = responsableclasse;
}

public java.util.Collection<paiement> getPaiement() {
	return paiement;
}

public void setPaiement(java.util.Collection<paiement> paiement) {
	this.paiement = paiement;
}

public java.util.Collection getSuivre() {
	return suivre;
}

public void setSuivre(java.util.Collection suivre) {
	this.suivre = suivre;
}

public java.util.Collection getAssociation_20() {
	return Association_20;
}

public void setAssociation_20(java.util.Collection association_20) {
	Association_20 = association_20;
}

public classe getClasse() {
	return classe;
}

public void setClasse(classe classe) {
	this.classe = classe;
}
   
   
   
   
   
   
}