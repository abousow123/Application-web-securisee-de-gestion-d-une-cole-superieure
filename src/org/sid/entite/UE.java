package org.sid.entite;
/***********************************************************************
 * Module:  UE.java
 * Author:  user
 * Purpose: Defines the Class UE
 ***********************************************************************/

import java.util.*;

public class UE {
   private String codeUE;
   private String libelle;
   private int credit;
   
   public java.util.Collection<EC> eC;

public UE(String codeUE, String libelle, int credit) {
	super();
	this.codeUE = codeUE;
	this.libelle = libelle;
	this.credit = credit;
}

public UE(String codeUE, String libelle, int credit, Collection<EC> eC) {
	super();
	this.codeUE = codeUE;
	this.libelle = libelle;
	this.credit = credit;
	this.eC = eC;
}

public UE() {
	super();
}

public String getCodeUE() {
	return codeUE;
}

public void setCodeUE(String codeUE) {
	this.codeUE = codeUE;
}

public String getLibelle() {
	return libelle;
}

public void setLibelle(String libelle) {
	this.libelle = libelle;
}

public int getCredit() {
	return credit;
}

public void setCredit(int credit) {
	this.credit = credit;
}

public java.util.Collection<EC> geteC() {
	return eC;
}

public void seteC(java.util.Collection<EC> eC) {
	this.eC = eC;
}
   
   
   
}