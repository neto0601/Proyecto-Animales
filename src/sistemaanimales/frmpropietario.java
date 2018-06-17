/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaanimales;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author H ERICK
 */
public class frmpropietario extends javax.swing.JFrame {

    ResultSet rs = null;
    propietario cl = new propietario(); //instancia de la clase propietario
    boolean registro = false;
    boolean prueba = false;
    boolean newRecord = false;
    int cantidad = 0;
    int mayor = 0;
    
    public frmpropietario() {
        initComponents();
    }

     private void Bloquear(){
        txtidprop.setEnabled(false);
        txtPrimerApellido.setEnabled(false);
        txtSegundoApellido.setEnabled(false);
        txtNombre.setEnabled(false);
        rdbMasculino.setEnabled(false);
        rdbFemenino.setEnabled(false);
        ftxtCelular.setEnabled(false);
        btnnuevo.setVisible(false);
        btnguardar.setVisible(false);
        btncancelar.setVisible(false);
        btnbuscar.setVisible(false);
        btnmodificar.setVisible(false);
        btnekiminar.setVisible(false);
        btnguardarModificacion.setVisible(false);
        btnmascotas.setVisible(true);
     }
private void Bloquear1(){
        txtidprop.setEnabled(false);
        txtPrimerApellido.setEnabled(false);
        txtSegundoApellido.setEnabled(false);
        txtNombre.setEnabled(false);
        rdbMasculino.setEnabled(false);
        rdbFemenino.setEnabled(false);
        ftxtCelular.setEnabled(false);
}
    private void Desbloquear() {
       txtPrimerApellido.setEnabled(true);
       txtSegundoApellido.setEnabled(true);
       txtNombre.setEnabled(true);
       rdbMasculino.setEnabled(true);
       rdbFemenino.setEnabled(true);
       ftxtCelular.setEnabled(true);
       btnnuevo.setVisible(true);
        btnguardar.setVisible(true);
        btncancelar.setVisible(true);
        btnbuscar.setVisible(true);
        btnmodificar.setVisible(true);
        btnekiminar.setVisible(true);
        btnguardarModificacion.setVisible(true);
        btnmascotas.setVisible(true);
    }

    private void Limpiar() {
       txtPrimerApellido.setText("");
       txtSegundoApellido.setText("");
       txtNombre.setText("");
       btngSexo.clearSelection();
       ftxtCelular.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngSexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtidprop = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ftxtCelular = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        rdbMasculino = new javax.swing.JRadioButton();
        rdbFemenino = new javax.swing.JRadioButton();
        btnnuevo = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btnekiminar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnguardarModificacion = new javax.swing.JButton();
        btnmascotas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Código de cliente:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 30));

        txtidprop.setEnabled(false);
        getContentPane().add(txtidprop, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 50, 20));

        jLabel2.setText("Primer apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtPrimerApellido.setEnabled(false);
        getContentPane().add(txtPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 240, 20));

        jLabel3.setText("Segundo apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txtSegundoApellido.setEnabled(false);
        getContentPane().add(txtSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 240, 20));

        jLabel4.setText("Nombre(s):");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtNombre.setEnabled(false);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 320, 20));

        jLabel7.setText("Celular:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 60, -1));

        try {
            ftxtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCelular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ftxtCelular.setEnabled(false);
        getContentPane().add(ftxtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 110, -1));

        jLabel8.setText("Sexo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        btngSexo.add(rdbMasculino);
        rdbMasculino.setText("Masculino");
        rdbMasculino.setEnabled(false);
        getContentPane().add(rdbMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        btngSexo.add(rdbFemenino);
        rdbFemenino.setText("Femenino");
        rdbFemenino.setEnabled(false);
        getContentPane().add(rdbFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        btnnuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnnuevo.setText("N U E V O");
        btnnuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 90, -1));

        btncancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btncancelar.setText("C A N C E L A R");
        btncancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        btnguardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnguardar.setText("G U A R D A R ");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 120, -1));

        btnbuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnbuscar.setText("B U S C A R");
        btnbuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        btnekiminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnekiminar.setText("E L I M I N A R");
        btnekiminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnekiminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnekiminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnekiminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        btnmodificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnmodificar.setText("M O D I F I C A R");
        btnmodificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        btnguardarModificacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnguardarModificacion.setText("GUARDAR MODIFICACIÓN");
        btnguardarModificacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnguardarModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarModificacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardarModificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        btnmascotas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnmascotas.setText("REGISTRAR MASCOTAS");
        btnmascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmascotasActionPerformed(evt);
            }
        });
        getContentPane().add(btnmascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        rs = null;
        //mÃ©todo en clase Clientes
        rs = cl.contarRegistros();
        try {
            while (rs.next()) {
                cantidad = rs.getInt(1);
                if (cantidad != 0) {
                    rs = null;
                    //mÃ©todo en clase Clientes
                    rs = cl.mayorRegistro();
                    while (rs.next()) {
                        mayor = rs.getInt(1) + 1;
                        //recuerde que debe completar 5 digitos
                        if (mayor < 10) {
                            txtidprop.setText("0000" + mayor);
                        } else if (mayor < 100) {
                            this.txtidprop.setText("000" + mayor);
                        } else if (mayor < 1000) {
                            txtidprop.setText("00" + mayor);
                        } else if (mayor < 10000) {
                            txtidprop.setText("0" + mayor);
                        } else {
                            txtidprop.setText("" + mayor);
                        }
                    }
                } else {
                    txtidprop.setText("0000"+1);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "AVISO DEL SISTEMA", 0);
        }
        Desbloquear();
        Limpiar();
        this.txtPrimerApellido.requestFocus();
        newRecord = true;
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        Limpiar();
        Bloquear1();
        this.txtidprop.setText("");
        newRecord = false;
        prueba = false;
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (newRecord == true) {
            if (this.txtidprop.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe existir un cÃ³digo de cliente", "AVISO DEL SISTEMA", 2);
            } else if (this.txtPrimerApellido.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo Primer apellido", "AVISO DEL SISTEMA", 2);
                this.txtPrimerApellido.requestFocus();
            } else if (this.txtNombre.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo Nombre", "AVISO DEL SISTEMA", 2);
                this.txtNombre.requestFocus();
            }else if (rdbMasculino.isSelected()== false && rdbFemenino.isSelected()==false){
                JOptionPane.showMessageDialog(rootPane, "Debe elegir el sexo", "AVISO DEL SISTEMA", 2);
                rdbMasculino.requestFocus();
            } else {
                    if (this.ftxtCelular.getText().equals("    -    ")) {
                        JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo CELULAR!!", "AVISO DEL SISTEMA", 2);
                        this.ftxtCelular.requestFocus();
                    } else {
                        //atentos, el sexo estÃ¡ con radio buttons
                        if (rdbMasculino.isSelected()==true){
                          cl.insertar(this.txtidprop.getText(), this.txtPrimerApellido.getText().toUpperCase(), this.txtSegundoApellido.getText().toUpperCase(), this.txtNombre.getText().toUpperCase(), "M", this.ftxtCelular.getText()); }
                        else{
                          cl.insertar(this.txtidprop.getText(), this.txtPrimerApellido.getText().toUpperCase(), this.txtSegundoApellido.getText().toUpperCase(), this.txtNombre.getText().toUpperCase(), "F", this.ftxtCelular.getText());}
                        JOptionPane.showMessageDialog(rootPane, "Registro guardado exitosamente!!", "AVISO DEL SISTEMA", 1);
                        Bloquear();
                        Limpiar();
                        this.txtidprop.setText("");
                        newRecord = false;
                    }
                }
            
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        String codigo = JOptionPane.showInputDialog("Ingrese el Id del Propietario  buscar:");
        rs = cl.buscar(codigo);
        try {
            while (rs.next()) {
                this.txtidprop.setText(rs.getString(1));
                this.txtPrimerApellido.setText(rs.getString(2));
                this.txtSegundoApellido.setText(rs.getString(3));
                this.txtNombre.setText(rs.getString(4));
                if (rs.getString(5).equals("M")){
                    rdbMasculino.setSelected(true);}
                else{
                    rdbFemenino.setSelected(true);
                }
                this.ftxtCelular.setText(rs.getString(6));
                prueba = true;
                registro = true;
                newRecord = false;
            }
            if (registro == false) {
                JOptionPane.showMessageDialog(rootPane, "Registro no encontrado!!!", "AVISO DEL SISTEMA", 0);
                //this.txtCodigo.setText("");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "AVISO DEL SISTEMA", 0);
        }
        registro = false;
        Bloquear();
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnekiminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnekiminarActionPerformed
        if (prueba == true) {
            String codigo = this.txtidprop.getText();
            if (JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar el registro buscado?") == 0) {
                cl.eliminar(codigo);
                JOptionPane.showMessageDialog(rootPane, "Registro eliminado exitosamente!!", "AVISO DEL SISTEMA", 1);
                Bloquear();
                Limpiar();
                this.txtidprop.setText("");
                this.btnnuevo.setVisible(true);
                this.btncancelar.setVisible(false);
                this.btnguardar.setVisible(true);
                this.btnguardarModificacion.setVisible(false);
                prueba = false;
            }
        }
    }//GEN-LAST:event_btnekiminarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
if (prueba == true) {
            Desbloquear();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnguardarModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarModificacionActionPerformed
        
                if (prueba == true) {
            if (this.txtidprop.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe existir un id de propietario", "AVISO DEL SISTEMA", 2);
            } else if (this.txtPrimerApellido.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo Primer apellido", "AVISO DEL SISTEMA", 2);
                this.txtPrimerApellido.requestFocus();
            } else if (this.txtNombre.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo Nombre", "AVISO DEL SISTEMA", 2);
                this.txtNombre.requestFocus();
            } else if (rdbMasculino.isSelected()== false && rdbFemenino.isSelected()==false){
                JOptionPane.showMessageDialog(rootPane, "Debe elegir el sexo", "AVISO DEL SISTEMA", 2);
                rdbMasculino.requestFocus();
            }else {
                    if (this.ftxtCelular.getText().equals("    -    ")) {
                        JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo CELULAR!!", "AVISO DEL SISTEMA", 2);
                        this.ftxtCelular.requestFocus();
                    } else {
                        if (rdbMasculino.isSelected()==true){
                          cl.modificar(this.txtidprop.getText(), this.txtPrimerApellido.getText().toUpperCase(), this.txtSegundoApellido.getText().toUpperCase(), this.txtNombre.getText().toUpperCase(), "M", this.ftxtCelular.getText()); }
                        else{
                          cl.modificar(this.txtidprop.getText(), this.txtPrimerApellido.getText().toUpperCase(), this.txtSegundoApellido.getText().toUpperCase(), this.txtNombre.getText().toUpperCase(), "F", this.ftxtCelular.getText());}

                        JOptionPane.showMessageDialog(rootPane, "El registro ha sido correctamente actualizado!!", "AVISO DEL SISTEMA", 1);
                        txtidprop.setText("");
                        Limpiar();
                        Bloquear();
                        prueba = false;
                        newRecord = false;

                    }
                }
            
        }
    }//GEN-LAST:event_btnguardarModificacionActionPerformed

    private void btnmascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmascotasActionPerformed
       IngresoMascotas ab=new IngresoMascotas();
       ab.setVisible(true);
    }//GEN-LAST:event_btnmascotasActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmpropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmpropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmpropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmpropietario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmpropietario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnekiminar;
    private javax.swing.ButtonGroup btngSexo;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnguardarModificacion;
    private javax.swing.JButton btnmascotas;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JFormattedTextField ftxtCelular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rdbFemenino;
    private javax.swing.JRadioButton rdbMasculino;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtidprop;
    // End of variables declaration//GEN-END:variables
}
