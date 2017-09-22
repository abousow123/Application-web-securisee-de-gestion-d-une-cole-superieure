package org.sid.entite;





public class Absence {
   
   private String type;
   
   public cours coursB;

public Absence() {
	super();
}



public Absence(String type, cours coursB) {
	super();
	this.type = type;
	this.coursB = coursB;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public cours getCoursB() {
	return coursB;
}

public void setCoursB(cours coursB) {
	this.coursB = coursB;
}
   
   



}