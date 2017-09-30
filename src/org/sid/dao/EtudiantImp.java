package org.sid.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.sid.entite.classe;
import org.sid.entite.etudiant;

import util.HibernateUtil;

public class EtudiantImp implements Etudiants {

	@Override
	public void addEtudiant(etudiant e) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession() ;
		session.beginTransaction() ;
		session.save(e) ;
		session.getTransaction().commit();
		
	}

	@Override
	public void deleteEtudiant(String code) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEtudiant(String code, etudiant e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<etudiant> listeClasse(classe c) {
	
		Session session = HibernateUtil.getSessionFactory().getCurrentSession() ;
		session.beginTransaction() ;
		Query re = session.createQuery("select e from etudiant e where e.etudiant.codeclasse=:x") ;
		re.setParameter("x", c) ;
		return re.list();
	}

	@Override
	public etudiant oneEtudiant(String code) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession() ;
		session.beginTransaction() ;
		etudiant et = session.get(etudiant.class,code ) ;
		return et;
	}


}
