package org.sid.entite;
/***********************************************************************
 * Module:  evaluer.java
 * Author:  user
 * Purpose: Defines the Class evaluer
 ***********************************************************************/

import java.util.*;

public class evaluer {
	
   private java.util.Date date_evaluation;
   private double note;
   
   public EC eCB;

public evaluer(Date date_evaluation, double note, EC eCB) {
	super();
	this.date_evaluation = date_evaluation;
	this.note = note;
	this.eCB = eCB;
}

public evaluer() {
	super();
}

public java.util.Date getDate_evaluation() {
	return date_evaluation;
}

public void setDate_evaluation(java.util.Date date_evaluation) {
	this.date_evaluation = date_evaluation;
}

public double getNote() {
	return note;
}

public void setNote(double note) {
	this.note = note;
}

public EC geteCB() {
	return eCB;
}

public void seteCB(EC eCB) {
	this.eCB = eCB;
}
   
   



}