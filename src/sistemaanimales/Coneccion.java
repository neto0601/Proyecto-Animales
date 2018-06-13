/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaanimales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author H ERICK
 */
public class Coneccion {
    
    private String url = "jdbc:mysql://localhost:3306/mascotas";
    private String login = "root"; //Administrador de MySQL
    private String password = "";
    private Connection cnx = null;
    private Statement sttm = null;
    private ResultSet rst = null;
    //mÃ©todo para Update, Insert, Delete
    public void UID(String sql) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url, login, password);
            sttm = cnx.createStatement();
            sttm.executeUpdate(sql); //statement
        } catch (ClassNotFoundException c) {
            JOptionPane.showMessageDialog(null, "ERROR: " + c.getMessage());
            System.exit(1); //salir de aplicaciÃ³n
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
            System.exit(1);
        }
    }
    //MÃ©todo para Consultar
    public ResultSet getValores(String sql) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url, login, password);
            sttm = cnx.createStatement();
            rst = sttm.executeQuery(sql);  //resultset
        } catch (ClassNotFoundException c) {
            JOptionPane.showMessageDialog(null, "ERROR: " + c.getMessage());
            System.exit(1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
            System.exit(1);
        } 
        return rst;
        
    }
    
}
