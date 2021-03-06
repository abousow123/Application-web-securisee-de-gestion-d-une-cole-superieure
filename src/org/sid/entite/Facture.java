package org.sid.entite ;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Facture generated by hbm2java
 */
public class Facture  implements java.io.Serializable {


     private String codefacture;
     private Comptable comptable;
     private Paiement paiement;
     private Date dateFacture;
     private BigDecimal arriere;
     private BigDecimal montant;
     private String anneeScolaire;
     private Set<Paiement> paiements = new HashSet<Paiement>(0);

    public Facture() {
    }

	
    public Facture(String codefacture, Paiement paiement) {
        this.codefacture = codefacture;
        this.paiement = paiement;
    }
    public Facture(String codefacture, Comptable comptable, Paiement paiement, Date dateFacture, BigDecimal arriere, BigDecimal montant, String anneeScolaire, Set<Paiement> paiements) {
       this.codefacture = codefacture;
       this.comptable = comptable;
       this.paiement = paiement;
       this.dateFacture = dateFacture;
       this.arriere = arriere;
       this.montant = montant;
       this.anneeScolaire = anneeScolaire;
       this.paiements = paiements;
    }
   
    public String getCodefacture() {
        return this.codefacture;
    }
    
    public void setCodefacture(String codefacture) {
        this.codefacture = codefacture;
    }
    public Comptable getComptable() {
        return this.comptable;
    }
    
    public void setComptable(Comptable comptable) {
        this.comptable = comptable;
    }
    public Paiement getPaiement() {
        return this.paiement;
    }
    
    public void setPaiement(Paiement paiement) {
        this.paiement = paiement;
    }
    public Date getDateFacture() {
        return this.dateFacture;
    }
    
    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }
    public BigDecimal getArriere() {
        return this.arriere;
    }
    
    public void setArriere(BigDecimal arriere) {
        this.arriere = arriere;
    }
    public BigDecimal getMontant() {
        return this.montant;
    }
    
    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }
    public String getAnneeScolaire() {
        return this.anneeScolaire;
    }
    
    public void setAnneeScolaire(String anneeScolaire) {
        this.anneeScolaire = anneeScolaire;
    }
    public Set<Paiement> getPaiements() {
        return this.paiements;
    }
    
    public void setPaiements(Set<Paiement> paiements) {
        this.paiements = paiements;
    }




}


