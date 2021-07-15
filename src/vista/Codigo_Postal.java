
package vista;

import config.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Codigo_Postal extends javax.swing.JFrame {

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
    
    public Codigo_Postal() {
        initComponents();
        setLocationRelativeTo(null);
        Listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jPanel4 = new javax.swing.JPanel();
        BtnAgregar1 = new javax.swing.JButton();
        BtnModificar1 = new javax.swing.JButton();
        BtnEliminar1 = new javax.swing.JButton();
        BtnCancelar1 = new javax.swing.JButton();
        BtnInactivar1 = new javax.swing.JButton();
        BtnActualizar1 = new javax.swing.JButton();
        BtnReactivar1 = new javax.swing.JButton();
        BtnSalir1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("CODIGO POSTAL");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de codigo postal"));

        jLabel1.setText("ID:");

        jLabel2.setText("Codigo Postal");

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
                    .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextEstadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(259, 259, 259))
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
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla Profesion"));

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codigo postal", "ER"
            }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TablaDatos);
        if (TablaDatos.getColumnModel().getColumnCount() > 0) {
            TablaDatos.getColumnModel().getColumn(0).setMinWidth(50);
            TablaDatos.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablaDatos.getColumnModel().getColumn(0).setMaxWidth(50);
            TablaDatos.getColumnModel().getColumn(2).setMinWidth(50);
            TablaDatos.getColumnModel().getColumn(2).setPreferredWidth(50);
            TablaDatos.getColumnModel().getColumn(2).setMaxWidth(50);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        BtnAgregar1.setText("AGREGAR");
        BtnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregar1ActionPerformed(evt);
            }
        });

        BtnModificar1.setText("MODIFICAR");
        BtnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificar1ActionPerformed(evt);
            }
        });

        BtnEliminar1.setText("ELIMINAR");
        BtnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminar1ActionPerformed(evt);
            }
        });

        BtnCancelar1.setText("CANCELAR");
        BtnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelar1ActionPerformed(evt);
            }
        });

        BtnInactivar1.setText("INACTIVAR");
        BtnInactivar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInactivar1ActionPerformed(evt);
            }
        });

        BtnActualizar1.setText("ACTUALIZAR");
        BtnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizar1ActionPerformed(evt);
            }
        });

        BtnReactivar1.setText("REACTIVAR");
        BtnReactivar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReactivar1ActionPerformed(evt);
            }
        });

        BtnSalir1.setText("SALIR");
        BtnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnAgregar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnInactivar1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnModificar1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(BtnReactivar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnActualizar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnSalir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCancelar1, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnAgregar1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(BtnModificar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCancelar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnInactivar1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(BtnReactivar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnActualizar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnSalir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIDActionPerformed

    private void TextEstadoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEstadoRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEstadoRegistroActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        int fila = TablaDatos.getSelectedRow();
        if ( fila == -1) {
            JOptionPane.showMessageDialog(null,"Codigo postal no seleccionado");
        } else {
            id = Integer.parseInt((String) TablaDatos.getValueAt(fila, 0).toString());
            nom = (String) TablaDatos.getValueAt(fila, 1);
            estReg = (String) TablaDatos.getValueAt(fila, 2);

        }
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void BtnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregar1ActionPerformed
        flagAdicionar = 1;
        Limpiar();
        LiberarDatos();
    }//GEN-LAST:event_BtnAgregar1ActionPerformed

    private void BtnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificar1ActionPerformed
        flagModificar = 1;
        int fila = TablaDatos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null,"Profesion no seleccionada");
        }
        //Limpiar();
        CargarDatos(nom, estReg);
        LiberarDatos();
        TextID.setEnabled(false);

    }//GEN-LAST:event_BtnModificar1ActionPerformed

    private void BtnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminar1ActionPerformed
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

    }//GEN-LAST:event_BtnEliminar1ActionPerformed

    private void BtnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelar1ActionPerformed
        Cancelar();
    }//GEN-LAST:event_BtnCancelar1ActionPerformed

    private void BtnInactivar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInactivar1ActionPerformed
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
    }//GEN-LAST:event_BtnInactivar1ActionPerformed

    private void BtnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizar1ActionPerformed
        Actualizar();
        Listar();
        Cancelar();
    }//GEN-LAST:event_BtnActualizar1ActionPerformed

    private void BtnReactivar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReactivar1ActionPerformed
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
    }//GEN-LAST:event_BtnReactivar1ActionPerformed

    private void BtnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalir1ActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_BtnSalir1ActionPerformed


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
            java.util.logging.Logger.getLogger(Codigo_Postal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Codigo_Postal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Codigo_Postal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Codigo_Postal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Codigo_Postal().setVisible(true);
            }
        });
    }
    
    void Listar(){
    String sql = "select * from codigos_postales";
    try {
        cn = (Connection) con.getConnection();
        st = cn.createStatement();
        rs = st.executeQuery(sql);
        Object[] municipio = new Object[3];
        modelo = (DefaultTableModel) TablaDatos.getModel();
        while (rs.next()) {            
            municipio[0] = rs.getInt("CodPosCod");
            municipio[1] = rs.getString("CodPosNum");
            municipio[2] = rs.getString("CodPosEstReg");
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
            String id = TextID.getText();
            String nom = TextNombre.getText();
            char estReg = TextEstadoRegistro.getText().charAt(0);
            try {
                if (nom.equals("") ||  id.equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe Ingresar datos por favor");               
                }if (nom.length() > 40 || id.length() > 4) {
                    if (id.length() > 4)
                        JOptionPane.showMessageDialog(null, "Por favor ingrese un ID de menos de 4 digitos");
                    if (nom.length() > 5)
                        JOptionPane.showMessageDialog(null, "Por favor ingrese un codigo postal de 5 digitos");
                }else {
                    String sql = "INSERT INTO codigos_postales values( '"+id+"', '"+nom+"','"+estReg+"')";
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
            String sql = "UPDATE codigos_postales set CodPosNum='"+nom+"',CodPosEstReg='"+estReg+"'where CodPosCod="+id;
            if (nom.equals("")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar datos !!!");
                TextID.setEnabled(true);
            }if (nom.length() > 5) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese una codigo postal de 5 digitos"); 
            }else {
                try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Datos de codigo postal modificado !!!");
                    TextID.setEnabled(true);
                } catch (Exception e) {

                }
            }  
            LimpiarTabla(modelo);
            flagModificar = 0;
        }if (flagEliminar == 1) {
            // Elimina un registro en la base de datos
            String sql = "UPDATE codigos_postales set CodPosEstReg= '*' where CodPosCod="+id;       
            estReg = TextEstadoRegistro.getText();
            if (estReg.equals("*")) {
                JOptionPane.showMessageDialog(null,"Este registro ya ha sido eliminado");
            } else {
                    try {
                        cn = con.getConnection();
                        st = cn.createStatement();
                        st.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Codigo postal eliminado !!!");
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
            String sql = "UPDATE codigos_postales set CodPosEstReg= 'I' where CodPosCod="+id;
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
            String sql = "UPDATE codigos_postales set CodPosEstReg= 'A' where CodPosCod="+id;
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
    private javax.swing.JButton BtnActualizar1;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnAgregar1;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnCancelar1;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnEliminar1;
    private javax.swing.JButton BtnInactivar;
    private javax.swing.JButton BtnInactivar1;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnModificar1;
    private javax.swing.JButton BtnReactivar;
    private javax.swing.JButton BtnReactivar1;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JButton BtnSalir1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
