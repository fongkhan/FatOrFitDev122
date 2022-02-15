
package fr.solutec.dao;

import fr.solutec.model.User;
import fr.solutec.model.Activite;
import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;

/**
 *
 * @author UTILISATEUR
 */
public class ActiviteDao {
    public static List getByIdUser(String login) throws SQLException{
        List<Activite> activites = new ArrayList<>();
        String sql = "SELECT * FROM activites WHERE idUser = ?";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setString(1, login);
        ResultSet result = prepare.executeQuery();
        while (result.next()){
            Activite A = new Activite();
            A.setIdActivite(result.getInt("idActivite"));
            A.setIdUser(result.getInt("idUser"));
            A.setNbKm(result.getInt("nbKm"));
            A.setMinAct(result.getInt("minAct"));
            A.setDateActivite(result.getDate("dateActivite"));
            activites.add(A);
        }
        return activites;
    }
    
 public static void insertActivite(Activite A) throws SQLException {
        String sql = "INSERT INTO activites (idUser, nbKm, minAct, dateActivite) VALUE (?,?,?,?)";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setInt(1, A.getIdUser());
        prepare.setInt(2, A.getNbKm());
        prepare.setInt(3, A.getMinAct());
        prepare.setDate(4, A.getDateActivite());
        prepare.execute();
    }
 /*
 public static void setActivite(String idActivite) throws SQLException {
        String sql = "UPDATE activites SET  = value1, column2 = value2, ... WHERE condition; ";
        Connection connexion = AccessBd.getConnection();
        PreparedStatement prepare = connexion.prepareStatement(sql);
        prepare.setInt(1, A.getIdUser());
        prepare.setInt(2, A.getNbKm());
        prepare.setInt(3, A.getMinAct());
        prepare.setDate(4, A.getDateActivite());
        prepare.execute();
    }
    
    */
    public static void main(String[] args) {
        
        Activite A = new Activite();
        A.setIdUser(1);
        A.setNbKm(10);
        A.setMinAct(10);
        String str="2022-02-15";  
        Date date=Date.valueOf(str);
        A.setDateActivite(date);
        try {
        insertActivite(A);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}