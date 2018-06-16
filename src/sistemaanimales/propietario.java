/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaanimales;

import java.sql.ResultSet;

/**
 *
 * @author H ERICK
 */
public class propietario {
    
        Coneccion cn = new Coneccion();

    public void insertar(String idprop, String apellido1, String apellido2, String nombre, String sexo, String celular) {
        cn.UID("INSERT INTO propietarios(idprop,apellido1,apellido2,nombre,sexo,celular) VALUES('" + idprop + "','" + apellido1 + "','" + apellido2 + "','" + nombre + "','" + sexo + "','" + celular + "')");
    }
   
    public void modificar(String idprop, String apellido1, String apellido2, String nombre, String sexo, String celular) {
        cn.UID("UPDATE propietarios SET apellido1='" + apellido1 + "',apellido2='" + apellido2 + "',nombre='" + nombre + "',sexo='" + sexo + "',celular='" + celular + "' WHERE idprop='" + idprop + "'");
    }

    public void eliminar(String idprop) {
        cn.UID("DELETE FROM propietarios WHERE idprop='" + idprop + "'");
    }

    public ResultSet buscar(String idprop) {
        return (cn.getValores("SELECT * FROM propietarios WHERE idprop='" + idprop + "'"));
    }

    public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(idprop) FROM propietarios"));
    }

    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(idprop) FROM propietarios"));
    }

    public ResultSet llenarTabla() {
        return (cn.getValores("SELECT idprop,apellido1,nombre,celular FROM clientes"));
    }
}
