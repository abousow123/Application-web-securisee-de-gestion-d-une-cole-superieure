/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.util;

import org.hibernate.HibernateException;
//import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Lenovo
 */
public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	// private static SessionFactory configureSessionFactory ( ) throws
	// HibernateException {
	// Configuration configuration = new Configuration();
	// configuration.configure();
	// ServiceRegistry serviceRegistry = new
	// StandardServiceRegistryBuilder().applySettings
	// (configuration.getProperties()).getBootstrapServiceRegistry();
	// SessionFactory sessionFactory =
	// configuration.buildSessionFactory(serviceRegistry);
	// return sessionFactory;
	// }

	public static SessionFactory buildSessionFactory() {
		try {
			Configuration configuration = new Configuration().configure(
					"/home/sow-a/git/Application-web-securisee-de-gestion-d-une-cole-superieure/src/org/sid/entite/hibernate.cfg.xml");
			return  configuration.buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
