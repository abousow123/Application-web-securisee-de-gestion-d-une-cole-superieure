package org.sid.dao;

import java.util.List;

import org.sid.entite.classe;

public interface Classes {
	
	public void addClasse(classe c) ;
	public List<classe> allClasses() ;
	public classe oneClasse(String code) ;
	

}
