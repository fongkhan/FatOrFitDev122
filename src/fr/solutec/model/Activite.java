/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

import java.sql.*;

/**
 *
 * @author UTILISATEUR
 */
public class Activite {
    
    private int idActivite;
    private int idUser;
    private int nbKm;
    private int minAct;
    private Date dateActivite;

    public Activite() {
    }

    public Activite(int idActivite, int idUser, int nbKm, int minAct, Date dateActivite) {
        this.idActivite = idActivite;
        this.idUser = idUser;
        this.nbKm = nbKm;
        this.minAct = minAct;
        this.dateActivite = dateActivite;
    }

    public int getIdActivite() {
        return idActivite;
    }

    public int getIdUser() {
        return idUser;
    }

    public int getNbKm() {
        return nbKm;
    }

    public int getMinAct() {
        return minAct;
    }

    public Date getDateActivite() {
        return dateActivite;
    }

    public void setIdActivite(int idActivite) {
        this.idActivite = idActivite;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setNbKm(int nbKm) {
        this.nbKm = nbKm;
    }

    public void setMinAct(int minAct) {
        this.minAct = minAct;
    }

    public void setDateActivite(Date dateActivite) {
        this.dateActivite = dateActivite;
    }
 
    
}

