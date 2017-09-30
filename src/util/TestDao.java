package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sid.dao.EtudiantImp;
import org.sid.entite.etudiant;

public class TestDao {
	
	public static void main(String[] args) {
		
		
	
			EtudiantImp et = new EtudiantImp() ;
			et.addEtudiant(new etudiant("etu1", "sow","Abou", "02-10-1995","marié", "771256586", "bag", "sene", "sdsd@ff","1256584"));
		
		
		
		
		
	}

}
