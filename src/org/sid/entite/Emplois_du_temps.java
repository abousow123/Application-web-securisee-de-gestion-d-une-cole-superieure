package org.sid.entite;
/***********************************************************************
 * Module:  Emplois_du_temps.java
 * Author:  user
 * Purpose: Defines the Class Emplois_du_temps
 ***********************************************************************/



public class Emplois_du_temps {
	
   private String code_emploisdutemps;
   private String datedebut;
   private String datefin;
   
public Emplois_du_temps() {
	super();
}

public Emplois_du_temps(String code_emploisdutemps, String datedebut, String datefin) {
	super();
	this.code_emploisdutemps = code_emploisdutemps;
	this.datedebut = datedebut;
	this.datefin = datefin;
}

public String getCode_emploisdutemps() {
	return code_emploisdutemps;
}

public void setCode_emploisdutemps(String code_emploisdutemps) {
	this.code_emploisdutemps = code_emploisdutemps;
}

public String getDatedebut() {
	return datedebut;
}

public void setDatedebut(String datedebut) {
	this.datedebut = datedebut;
}

public String getDatefin() {
	return datefin;
}

public void setDatefin(String datefin) {
	this.datefin = datefin;
}
   
   



}