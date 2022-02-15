/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;
import fr.solutec.model.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dsi
 */

public class UserDao {
    public static User getByLoginAndPassword(String login, String mdp) throws SQLException{
        User u = null;
        String sql = "SELECT * FROM users WHERE login = ? AND password = ?";
        Connection connexion = AccessBd.getConnection(); //////////
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, login);
        prepare.setString(2, mdp);
        ResultSet result = prepare.executeQuery();
        if (result.next()){
            u = new User();
            u.setId(result.getInt("idUser"));
            u.setNom(result.getString("nom"));
            u.setLogin(result.getString("login"));
        }
        return u;
    }
    
    public static void insertUser(User u) throws SQLException {
        String sql = "INSERT INTO users (nom, prenom, login, password, mail, poids, sexe, age) VALUE (?,?,?,?,?,?,?,?)";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, u.getNom());
        prepare.setString(2, u.getPrenom());
        prepare.setString(3, u.getLogin());
        prepare.setString(4, u.getMdp());
        prepare.setString(5, u.getMail());        
        prepare.setFloat(6, u.getPoids()); 
        prepare.setInt(7, u.getSexe()); 
        prepare.setInt(8, u.getAge()); 
   
        prepare.execute();
    }
    
    public static List<User> getAllPerson() throws SQLException {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";
        Connection connexion =  AccessBd.getConnection();
        Statement statement = connexion.createStatement();
        ResultSet result = statement.executeQuery(sql);
        while (result.next()){
            User u = new User();
            u.setId(result.getInt("idUser"));
            u.setNom(result.getString("nom"));
            u.setLogin(result.getString("login"));
            users.add(u);
        }
        return users;
    }
}

