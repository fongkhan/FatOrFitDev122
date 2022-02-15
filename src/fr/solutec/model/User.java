/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;


/**
 *
 * @author dsi
 */
public class User {
    
    private int id;
    private String nom;
    private String login;
    private String mdp;
    
    public User(){
        
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getLogin() {
        return login;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getMdp() {
        return mdp;
    }
    
    public User(int id, String nom, String login,String mdp){
        this.id=id;
        this.nom=nom;
        this.login=login;
        this.mdp = mdp;
}
}
