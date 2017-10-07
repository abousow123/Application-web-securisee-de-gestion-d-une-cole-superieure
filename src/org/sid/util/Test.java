package org.sid.util;

import org.sid.dao.AdministrateurDao;
import org.sid.entite.Administrateur;
import org.sid.entite.Utilisateur;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HibernateUtil.getSessionFactory() ;

		/*AdministrateurDao administrateurDao = new AdministrateurDao();

		Utilisateur utilisateur = new Utilisateur("900", "Sow", "Abou", "03/01/1992", "celibataire", "125353524",
				"dfdf", "dssd", "dsxcx", "dsdsc", 255, "dxdf", "dssds", "bhh", null, null, null, null, null, null,
				null);

		administrateurDao.addAdministrateur(new Administrateur(utilisateur));*/

	}

}
