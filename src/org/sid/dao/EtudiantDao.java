package org.sid.dao ;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sid.entite.Etudiant;
import org.sid.util.HibernateUtil;

/**
 *
 * @author Lenovo
 */
public class EtudiantDao implements IEtudiantDao{

    @Override
    public boolean addEtudiant(Etudiant etudiant) {
       Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(etudiant);
            session.getTransaction().commit();
            session.flush();
            session.close();
            return true;
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
           
        }
        return false;
    }

    @Override
    public void modifierEtudiant(Etudiant etudiant) {
         Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.update(etudiant);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }

    @Override
    public void supprimerEtudiant(String code) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            Etudiant etu = (Etudiant) session.load(Etudiant.class, new String(code));
            session.delete(etu);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }
    
}