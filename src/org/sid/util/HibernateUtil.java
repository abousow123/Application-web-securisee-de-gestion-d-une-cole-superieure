/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.util;


//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Lenovo
 */
public class HibernateUtil {
	 private static final SessionFactory sessionFactory=buildSessionFactory();
	  
	   public static SessionFactory buildSessionFactory(){
	        try {
	            return new Configuration().configure().buildSessionFactory();
	        } catch (Throwable ex) {
	            System.err.println("Initial SessionFactory creation failed." + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	  
	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
}
