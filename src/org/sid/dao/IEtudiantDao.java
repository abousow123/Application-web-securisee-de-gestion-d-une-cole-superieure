package org.sid.dao ;

import org.sid.entite.Etudiant;

/**
 *
 * @author Lenovo
 */
public interface IEtudiantDao {
    public boolean addEtudiant(Etudiant etudiant);
    public void modifierEtudiant(Etudiant etudiant);
    public void supprimerEtudiant(String code);
}
