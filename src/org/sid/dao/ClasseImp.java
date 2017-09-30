package org.sid.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.sid.entite.classe;

import util.HibernateUtil;

public class ClasseImp implements Classes {

	@Override
	public void addClasse(classe c) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession() ;
		session.beginTransaction() ;
		session.save(c) ;
		session.getTransaction().commit();

	}

	@Override
	public List<classe> allClasses() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession() ;
		session.beginTransaction() ;
		Query q = session.createQuery("Select c from classe c") ;
		
		return q.list();
	}

	@Override
	public classe oneClasse(String code) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession() ;
		session.beginTransaction() ;
		classe c = session.get(classe.class, code) ;
		return c;
	}

}
