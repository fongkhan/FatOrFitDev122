/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;
/**
 *
 * @author joelg
 */
public class User {
    
    private int id;
    private String nom;
    private String login;
    private String prenom;
    private String mdp;
    private int sexe;
    private int age;
    private float poids;
    private String mail;
    private boolean FirstConnection;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getSexe() {
        return sexe;
    }

    public void setSexe(int sexe) {
        this.sexe = sexe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isFirstConnection() {
        return FirstConnection;
    }

    public void setFirstConnection(boolean FirstConnection) {
        this.FirstConnection = FirstConnection;
    }

    public User() {
    }

    public User(int id, String nom, String login, String mdp, String prenom,
            int sexe, int age, float poids, String mail, boolean FirstConnection) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.mdp = mdp;
        this.sexe = sexe;
        this.age = age;
        this.poids = poids;
        this.mail = mail;
        this.mdp = mdp;
        this.FirstConnection = FirstConnection;

    }
    public int getId() {
        return id;
    }
    public String getLogin() {
        return login;
    }
    public String getMdp() {
        return mdp;
    }
    public String getNom() {
        return nom;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    
}