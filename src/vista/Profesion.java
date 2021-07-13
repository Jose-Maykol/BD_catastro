/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import config.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Profesion extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;
    String nom;
    String estReg;
    int flagAdicionar = 0;
    int flagModificar = 0;
    int flagEliminar = 0;
    int flagInactivar = 0;
    int flagReactivar = 0;
    
    public Profesion() {
        initComponents();
        setLocationRelativeTo(null);
        Listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        BtnAgregar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnInactivar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        BtnReactivar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextID = new javax.swing.JTextField();
        TextNombre = new javax.swing.JTextField();
        TextEstadoRegistro = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        BtnAgregar.setText("AGREGAR");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnModificar.setText("MODIFICAR");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("CANCELAR");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnInactivar.setText("INACTIVAR");
        BtnInactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInactivarActionPerformed(evt);
            }
        });

        BtnActualizar.setText("ACTUALIZAR");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        BtnReactivar.setText("REACTIVAR");
        BtnReactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReactivarActionPerformed(evt);
            }
        });

        BtnSalir.setText("SALIR");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnInactivar, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(BtnReactivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnInactivar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(BtnReactivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel5.setText("PROFESION");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro Profesion"));

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre Profesion:");

        jLabel4.setText("Estado de registro:");

        TextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIDActionPerformed(evt);
            }
        });

        TextEstadoRegistro.setEditable(false);
        TextEstadoRegistro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextEstadoRegistro.setText("A");
        TextEstadoRegistro.setEnabled(false);
        TextEstadoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEstadoRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextEstadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(165, 165, 165))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextEstadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista"));

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "ER"
            }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TablaDatos);
        if (TablaDatos.getColumnModel().getColumnCount() > 0) {
            TablaDatos.getColumnModel().getColumn(0).setMinWidth(70);
            TablaDatos.getColumnModel().getColumn(0).setPreferredWidth(70);
            TablaDatos.getColumnModel().getColumn(0).setMaxWidth(70);
            TablaDatos.getColumnModel().getColumn(2).setMinWidth(40);
            TablaDatos.getColumnModel().getColumn(2).setPreferredWidth(40);
            TablaDatos.getColumnModel().getColumn(2).setMaxWidth(40);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(414, 414, 414)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        flagAdicionar = 1;
        Limpiar();
        LiberarDatos();
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        flagModificar = 1;
        int fila = TablaDatos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null,"Profesion no seleccionada");
        }
        //Limpiar();
        CargarDatos(nom, estReg);
        LiberarDatos();
        TextID.setEnabled(false);
        
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        flagEliminar = 1;
        CargarDatos(nom, estReg);
        int fila = TablaDatos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null,"Profesion no seleccionada");
        }if (flagEliminar == 1) {
            BloquearDatos();
        }else {
            LiberarDatos();
        }
        
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        Cancelar();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnInactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInactivarActionPerformed
        flagInactivar = 1;
        CargarDatos(nom, estReg);
        int fila = TablaDatos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null,"Profesion no seleccionada");
        }if (flagInactivar == 1) {
            BloquearDatos();
        }else {
            LiberarDatos();
        }
    }//GEN-LAST:event_BtnInactivarActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        Actualizar();
        Listar();
        Cancelar();
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void BtnReactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReactivarActionPerformed
        flagReactivar = 1;
        CargarDatos(nom, estReg);
        int fila = TablaDatos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null,"Profesion no seleccionada");
        }if (flagReactivar == 1) {
            BloquearDatos();
        }else {
            LiberarDatos();
        }
    }//GEN-LAST:event_BtnReactivarActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void TextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIDActionPerformed

    private void TextEstadoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEstadoRegistroActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_TextEstadoRegistroActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        int fila = TablaDatos.getSelectedRow();
        if ( fila == -1) {
            JOptionPane.showMessageDialog(null,"Municipio no seleccionado");
        } else {
            id = Integer.parseInt((String) TablaDatos.getValueAt(fila, 0).toString());
            nom = (String) TablaDatos.getValueAt(fila, 1);
            estReg = (String) TablaDatos.getValueAt(fila, 2);

        }
    }//GEN-LAST:event_TablaDatosMouseClicked

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
            java.util.logging.Logger.getLogger(Profesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profesion().setVisible(true);
            }
        });
    }
    
    void Listar(){
    String sql = "select * from profesiones";
    try {
        cn = (Connection) con.getConnection();
        st = cn.createStatement();
        rs = st.executeQuery(sql);
        Object[] municipio = new Object[3];
        modelo = (DefaultTableModel) TablaDatos.getModel();
        while (rs.next()) {            
            municipio[0] = rs.getInt("ProCod");
            municipio[1] = rs.getString("ProNom");
            municipio[2] = rs.getString("ProEstReg");
            modelo.addRow(municipio);
        }
        TablaDatos.setModel(modelo);
    } catch (Exception e) {
        }
    }
    void CargarDatos(String nom, String estReg) {
            TextID.setText(""+id);
            TextNombre.setText(nom);
            TextEstadoRegistro.setText(""+estReg);
    }
    
    void LimpiarTabla(DefaultTableModel model) {
        for (int i = 0; i < TablaDatos.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
            
        }
    }
    void BloquearDatos() {
        TextID.setEditable(false);
        TextID.setEnabled(false);
        TextNombre.setEditable(false);
        TextNombre.setEnabled(false);

    }
    void LiberarDatos() {
        TextID.setEditable(true);
        TextID.setEnabled(true);
        TextNombre.setEditable(true);
        TextNombre.setEnabled(true);
    }
    void Actualizar() {
        if (flagAdicionar == 0 && 
                flagEliminar == 0 && 
                flagReactivar == 0 && 
                flagInactivar == 0 &&
                flagModificar ==0
                ) {
            JOptionPane.showMessageDialog(null, "Usted no ha seleccionado ninguna opcion!!!");
            System.out.println(flagAdicionar + flagEliminar + flagInactivar + flagModificar + flagReactivar);
            LimpiarTabla(modelo);
        }
        if (flagAdicionar == 1) {
            // Adiciona un registro a la base de datos
            //int id = Integer.parseInt(TextID.getText());
            String id = TextID.getText();
            String nom = TextNombre.getText();
            char estReg = TextEstadoRegistro.getText().charAt(0);
            try {
                if (nom.equals("") ||  id.equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe Ingresar datos por favor");               
                }if (nom.length() > 40 || id.length() > 4) {
                    if (id.length() > 4)
                        JOptionPane.showMessageDialog(null, "Por favor ingrese un ID de menos de 4 digitos");
                    if (nom.length() > 40)
                        JOptionPane.showMessageDialog(null, "Por favor ingrese una profesion con menos de 40 caracteres");
                }else {
                    String sql = "INSERT INTO profesiones values( '"+id+"', '"+nom+"','"+estReg+"')";
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Profesion registrada con exito !!!");
                    LimpiarTabla(modelo);   
                }
            } catch (Exception e) {

            }
            LimpiarTabla(modelo); 
            flagAdicionar = 0;
        }if (flagModificar == 1) {
            // Modifica un registro en la base de datos
            String nom = TextNombre.getText();
            char estReg = TextEstadoRegistro.getText().charAt(0);
            String sql = "UPDATE profesiones set ProNom='"+nom+"',ProEstReg='"+estReg+"'where ProCod="+id;
            if (nom.equals("")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar datos !!!");
                TextID.setEnabled(true);
            }if (nom.length() > 40) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese una profesion con menos de 40 caracteres"); 
            }else {
                try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Datos de profesion modificado !!!");
                    TextID.setEnabled(true);
                } catch (Exception e) {

                }
            }  
            LimpiarTabla(modelo);
            flagModificar = 0;
        }if (flagEliminar == 1) {
            // Elimina un registro en la base de datos
            String sql = "UPDATE profesiones set ProEstReg= '*' where ProCod="+id;       
            estReg = TextEstadoRegistro.getText();
            if (estReg.equals("*")) {
                JOptionPane.showMessageDialog(null,"Este registro ya ha sido eliminado");
            } else {
                    try {
                        cn = con.getConnection();
                        st = cn.createStatement();
                        st.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Profesion eliminada !!!");
                        LiberarDatos();
                        
                    } catch (Exception e) {
                        
                    }
            }   
            LimpiarTabla(modelo);
            flagEliminar = 0;
        }if (flagInactivar == 1) {
            // Inactiva un registro en la base de datos
            String nom = TextNombre.getText();
            estReg = TextEstadoRegistro.getText();
            System.out.println(estReg);
            String sql = "UPDATE profesiones set ProEstReg= 'I' where ProCod="+id;
            if (estReg.equals("I")) {
                JOptionPane.showMessageDialog(null, "Este registro ya esta inactivado!!!");
            }else {
                try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Registro inactivado !!!");
                    LiberarDatos();
                } catch (Exception e) {

                }
            }
            flagInactivar = 0;
            LimpiarTabla(modelo);
        }if (flagReactivar == 1) {
            // Reactiva un registro en la base de datos
            String nom = TextNombre.getText();
            estReg = TextEstadoRegistro.getText();
            String sql = "UPDATE profesiones set ProEstReg= 'A' where ProCod="+id;
            System.out.println(estReg);
            if (estReg.equals("A")) {
                JOptionPane.showMessageDialog(null, "El registro ya esta activado!!!");
            }else {
                try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Registro reactivado !!!");
                    LiberarDatos();
                    
                } catch (Exception e) {

                }
            }
            flagReactivar = 0;
            LimpiarTabla(modelo);
        }
    }
    void Cancelar() {
        if (flagAdicionar == 1) {
            flagAdicionar = 0;
        }if (flagModificar == 1) {
            flagModificar =0;
        }if (flagEliminar == 1) {
            LiberarDatos();
            flagEliminar = 0;
        }if (flagInactivar == 1) {
            LiberarDatos();
            flagInactivar = 0;
        }if (flagReactivar == 1) {
            LiberarDatos();
            flagReactivar = 0;
        }
        Limpiar();
    }
    void Limpiar() {
        TextID.setText("");
        TextNombre.setText("");
        TextEstadoRegistro.setText("A");
        TextID.requestFocus();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnInactivar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnReactivar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JTextField TextEstadoRegistro;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
