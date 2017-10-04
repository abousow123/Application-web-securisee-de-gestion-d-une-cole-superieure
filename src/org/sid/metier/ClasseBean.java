/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.metier ;


import java.io.Serializable;

import org.sid.entite.Filiere;
import org.sid.entite.Niveau;

/**
 *
 * @author Lenovo
 */
public class ClasseBean implements Serializable{
     private String codeclasse;
     private Filiere filiere;
     private Niveau niveau;
     private String lbelleClasse;
     private Integer nombreeEtudiant;
     private String type;
}
