package util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sid.dao.EtudiantImp;
import org.sid.entite.etudiant;

public class HibernateUtil {
	
	public static SessionFactory sessionFactory = null ;
	
	static{
		try {
			sessionFactory = new Configuration().buildSessionFactory() ;
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory ;
	}
}
