/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sid.metier ;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.springframework.context.ApplicationContext;
import org.sid.dao.AdministrateurDao;
import org.sid.dao.UtilisateurDao;
import org.sid.entite.Administrateur;
import org.sid.entite.Utilisateur;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Lenovo
 */
@ManagedBean
@SessionScoped
public class AdministrateurBean implements Serializable{
     private String codeutilisateur;
     private String nom;
     private String prenom;
     private String datedenaissance;
     private String situationMatrimonial;
     private String telephone;
     private String adresse;
     private String ville;
     private String pays;
     private String email;
     private Integer boitePostale;
     private String cin;
     private String login;
     private String password;
     private String sms;

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }
     
//     private static BeanFactory factory;
//	static{
//		ApplicationContext context = new ClassPathXmlApplicationContext(new String [ ] {"/WEB-INF/springBeans.xml"});
//		factory = context;
//	}

    public AdministrateurBean() {
    }

	
    public AdministrateurBean(String codeutilisateur) {
        this.codeutilisateur = codeutilisateur;
    }

    public String getCodeutilisateur() {
        return codeutilisateur;
    }

    public void setCodeutilisateur(String codeutilisateur) {
        this.codeutilisateur = codeutilisateur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDatedenaissance() {
        return datedenaissance;
    }

    public void setDatedenaissance(String datedenaissance) {
        this.datedenaissance = datedenaissance;
    }

    public String getSituationMatrimonial() {
        return situationMatrimonial;
    }

    public void setSituationMatrimonial(String situationMatrimonial) {
        this.situationMatrimonial = situationMatrimonial;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBoitePostale() {
        return boitePostale;
    }

    public void setBoitePostale(Integer boitePostale) {
        this.boitePostale = boitePostale;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public void ajouterUser(){
        UtilisateurDao userDao = new UtilisateurDao();
        AdministrateurDao adminDao= new AdministrateurDao();
       // Utilisateur user=(Utilisateur)factory.getBean("utilisateur");
        Utilisateur user = new Utilisateur() ;
        user.setCodeutilisateur("900");
        user.setNom(nom);
        user.setPrenom(prenom);
        user.setDatedenaissance(datedenaissance);
        user.setSituationMatrimonial(situationMatrimonial);
        user.setTelephone(telephone);
        user.setAdresse(adresse);
        user.setVille(ville);
        user.setPays(pays);
        user.setEmail(email);
        user.setBoitePostale(boitePostale);
        user.setCin(cin);
        user.setLogin(login);
        user.setPassword(password);
         if(userDao.addUtilisateur(user)){
          //  Administrateur admin=(Administrateur) factory.getBean("administrateur");
        	 Administrateur admin= new Administrateur() ;
            admin.setCodeutilisateur(userDao.selectionUsersByCall(telephone).getCodeutilisateur());
            user.setCodeutilisateur(userDao.selectionUsersByCall(telephone).getCodeutilisateur());
            admin.setUtilisateur(user);
            adminDao.addAdministrateur(admin);
         }
        this.sms= "Member Info Saved Successfull!";
        effacerAll();
    }

    private void effacerAll() {
         this.nom = "";
        this.prenom = "";
        this.datedenaissance = "";
        this.situationMatrimonial = "";
        this.telephone = "";
        this.adresse = "";
        this.ville = "";
        this.pays = "";
        this.email = "";
        this.boitePostale = 0;
        this.cin = "";
        this.login = "";
        this.password = "";
    }
}
