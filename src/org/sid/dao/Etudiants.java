package org.sid.dao;

import java.util.ArrayList;

import org.sid.entite.classe;
import org.sid.entite.etudiant;

public interface Etudiants {
	public void addEtudiant(etudiant e) ;
	public void deleteEtudiant(String code) ;
	public void updateEtudiant(String code,etudiant e) ;
	public ArrayList<etudiant> listeClasse(classe c) ;
	public etudiant oneEtudiant(etudiant e) ;

}
