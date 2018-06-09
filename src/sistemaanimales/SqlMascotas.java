package sistemaanimales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SqlMascotas extends conexion {

    public boolean registrar(MetodosMascotas mta) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO mascotas (Nombre, Especie, Genero, Raza) VALUES (?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, mta.getNombre());
            ps.setString(2, mta.getEspecie());
            ps.setString(3, mta.getGenero());
            ps.setString(4, mta.getRaza());
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlMascotas.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

}
