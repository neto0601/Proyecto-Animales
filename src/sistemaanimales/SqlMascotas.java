package sistemaanimales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SqlMascotas extends conexion {

    private MetodosMascotas mm;
    public boolean registrar(MetodosMascotas mta) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO mascotas (nombre, especie, raza, genero, estado) VALUES (?,?,?,?, 'A')";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mta.getNombre().toLowerCase());
            ps.setString(2, mta.getEspecie().toLowerCase());
            ps.setString(3, mta.getRaza().toLowerCase());
            ps.setString(4, mta.getGenero().toLowerCase());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlMascotas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    
    public MetodosMascotas buscarMascota(int id) {
    
         try {
         mm = new MetodosMascotas();
         Connection con = getConexion();
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM mascotas where id = " + id);
         while(rs.next()){
             mm.setId_mascota(rs.getInt("id"));
             mm.setNombre(rs.getString("nombre"));
             mm.setRaza(rs.getString("raza"));
             mm.setGenero(rs.getString("genero"));
             mm.setEspecie(rs.getString("especie"));
         }
        } catch (Exception e) {
            
            System.out.println("Error " + e.getMessage());
        }
         return mm;
            
        
    }
    
    public boolean updateMascota(MetodosMascotas mm){
    
         PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE mascotas SET nombre = ?, especie = ?, genero= ?, raza = ? WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mm.getNombre());
            ps.setString(2, mm.getEspecie());
            ps.setString(3, mm.getRaza());
            ps.setString(4, mm.getGenero());
            ps.setInt(5, mm.getId_mascota());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlMascotas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    
    
    }
    
        
        
        
    }


