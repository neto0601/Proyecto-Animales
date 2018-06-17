
package sistemaanimales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class IngresoMascotas extends javax.swing.JFrame {

    private MetodosMascotas mm;
    private SqlMascotas sm;
    
    public IngresoMascotas() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Ingrese los datos de su Mascota");
    }
  public void Limpiar(){
      jtfNombre.setText(null);
      jtfEspecie.setText(null);
      jtfRaza.setText(null);
      jtfId.setText(null);
      if(rbtnMacho.isSelected()){
          rbtnMacho.setSelected(false);
      }else if(rbtnHembra.isSelected()){
          rbtnHembra.setSelected(false);
      }
  }
  
  public void Buttons(){
      if(!rbtnMacho.isSelected()){
          rbtnHembra.setEnabled(true);
      } 
      if(!rbtnHembra.isSelected()){
          rbtnMacho.setEnabled(true);
      }

  }
          
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        rbtnMacho = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        rbtnHembra = new javax.swing.JRadioButton();
        jtfNombre = new javax.swing.JTextField();
        jtfEspecie = new javax.swing.JTextField();
        jtfRaza = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jtfId = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblRaza = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblEspecie1 = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        bntpropietarios = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 630));
        setMinimumSize(new java.awt.Dimension(1000, 630));
        setPreferredSize(new java.awt.Dimension(1000, 630));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 360));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        rbtnMacho.setBackground(new java.awt.Color(0, 0, 0));
        rbtnMacho.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        rbtnMacho.setForeground(new java.awt.Color(255, 255, 255));
        rbtnMacho.setText("Macho");
        rbtnMacho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnMachoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 11, Short.MAX_VALUE)
                    .addComponent(rbtnMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(rbtnMacho)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 140, 50));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        rbtnHembra.setBackground(new java.awt.Color(0, 0, 0));
        rbtnHembra.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        rbtnHembra.setForeground(new java.awt.Color(255, 255, 255));
        rbtnHembra.setText("Hembra");
        rbtnHembra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnHembraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 11, Short.MAX_VALUE)
                    .addComponent(rbtnHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(rbtnHembra)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 140, 50));
        getContentPane().add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 230, 30));
        getContentPane().add(jtfEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 230, 30));
        getContentPane().add(jtfRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 230, 30));

        btnRegistrar.setFont(new java.awt.Font("Aparajita", 2, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 150, 50));

        btnEliminar.setFont(new java.awt.Font("Aparajita", 2, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 150, 50));

        btnModificar.setFont(new java.awt.Font("Aparajita", 2, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 150, 50));

        jtfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdActionPerformed(evt);
            }
        });
        getContentPane().add(jtfId, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 80, 20));

        btnBuscar.setFont(new java.awt.Font("Aparajita", 2, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 150, 50));

        btnSalir.setFont(new java.awt.Font("Aparajita", 2, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 530, 150, 50));

        btnLimpiar.setFont(new java.awt.Font("Aparajita", 2, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 150, 50));

        lblTitulo.setFont(new java.awt.Font("Aparajita", 3, 48)); // NOI18N
        lblTitulo.setText("Registro de Mascota");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 330, 50));

        lblRaza.setFont(new java.awt.Font("Aparajita", 3, 48)); // NOI18N
        lblRaza.setText("Elija el Genero:");
        getContentPane().add(lblRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 380, -1));

        lblNombre.setFont(new java.awt.Font("Aparajita", 3, 36)); // NOI18N
        lblNombre.setText("ID");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        lblEspecie1.setFont(new java.awt.Font("Aparajita", 3, 36)); // NOI18N
        lblEspecie1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEspecie1.setText("Especie:");
        lblEspecie1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblEspecie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 40));

        lblGenero.setFont(new java.awt.Font("Aparajita", 3, 36)); // NOI18N
        lblGenero.setText("Raza:");
        getContentPane().add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        lblID.setFont(new java.awt.Font("Aparajita", 3, 36)); // NOI18N
        lblID.setText("Nombre:");
        getContentPane().add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        bntpropietarios.setFont(new java.awt.Font("Aparajita", 2, 18)); // NOI18N
        bntpropietarios.setText("Regresar a Propietarios");
        bntpropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntpropietariosActionPerformed(evt);
            }
        });
        getContentPane().add(bntpropietarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 540, 180, 50));

        Fondo.setFont(new java.awt.Font("Aparajita", 3, 24)); // NOI18N
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IngresoMascotas0.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(!jtfNombre.getText().isEmpty() && !jtfEspecie.getText().isEmpty() && !jtfRaza.getText().isEmpty() && (rbtnMacho.isSelected() || rbtnHembra.isSelected())){
        SqlMascotas mas = new SqlMascotas();
        MetodosMascotas met = new MetodosMascotas();
        
        met.setNombre(jtfNombre.getText());
        met.setEspecie(jtfEspecie.getText());
        met.setRaza(jtfRaza.getText());
        if(rbtnMacho.isSelected()){
            met.setGenero("macho");
        }else if(rbtnHembra.isSelected()){
            met.setGenero("hembra");
        }
        if(mas.registrar(met)){
            JOptionPane.showMessageDialog(null, "Se han ingresado los datos correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Error al ingresar el registro");
        }
        Limpiar();
        Buttons();
        }else{
    
            JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos");
    
                }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      if(!jtfId.getText().isEmpty()){
        sm = new SqlMascotas();
        mm = sm.buscarMascota(Integer.parseInt(jtfId.getText()));
        jtfNombre.setText(mm.getNombre());
        jtfEspecie.setText(mm.getEspecie());
        jtfRaza.setText(mm.getRaza());
        String gen = mm.getGenero();
        if(mm.getGenero().equals("macho")){
        rbtnMacho.setSelected(true);
        rbtnHembra.setSelected(false);
        }
        
        if(mm.getGenero().equals("hembra")){
        rbtnHembra.setSelected(true);
        rbtnMacho.setSelected(false);
        }  
      }else{
          JOptionPane.showMessageDialog(null,"Debe de introducir el Id de la mascota que desea buscar");
      } 
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jtfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(!jtfNombre.getText().isEmpty() && !jtfEspecie.getText().isEmpty() && !jtfId.getText().isEmpty() && !jtfRaza.getText().isEmpty() && (rbtnMacho.isSelected() || rbtnHembra.isSelected())){
         sm = new SqlMascotas();
        
        String genero = " ";
        
        if(rbtnMacho.isSelected()){
            genero = "macho";
        }else if(rbtnHembra.isSelected()){
            genero = "hembra";
        }
        mm = new MetodosMascotas(Integer.parseInt(jtfId.getText()), jtfNombre.getText().toLowerCase(), jtfEspecie.getText().toLowerCase(), jtfRaza.getText().toLowerCase(), genero.toLowerCase());
        sm.updateMascota(mm);   
        }else{
            JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos de informacion (Incluido el id)");
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
        Buttons();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       if(!jtfId.getText().isEmpty()){
           sm = new SqlMascotas();       
           sm.Eliminar(Integer.parseInt(jtfId.getText()));
       }else{
           JOptionPane.showMessageDialog(null,"Debe de introducir el id de la mascota para eliminar el registro");
       }
            
       
         
        
        
        
            
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void rbtnHembraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnHembraMouseClicked
        if(rbtnHembra.isSelected()){
            rbtnMacho.setEnabled(false);
        } else{
            rbtnMacho.setEnabled(true);
        }
    }//GEN-LAST:event_rbtnHembraMouseClicked

    private void rbtnMachoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnMachoMouseClicked
        if(rbtnMacho.isSelected()){
            rbtnHembra.setEnabled(false);
        } else{
            rbtnHembra.setEnabled(true);
        }

    }//GEN-LAST:event_rbtnMachoMouseClicked

    private void bntpropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntpropietariosActionPerformed
        this.setVisible(false);
        frmpropietario n = new frmpropietario();
        n.setVisible(true);
    }//GEN-LAST:event_bntpropietariosActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(IngresoMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoMascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoMascotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton bntpropietarios;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jtfEspecie;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfRaza;
    private javax.swing.JLabel lblEspecie1;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRaza;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbtnHembra;
    private javax.swing.JRadioButton rbtnMacho;
    // End of variables declaration//GEN-END:variables



}

