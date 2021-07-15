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
import java.sql.*;


public class Viviendas extends javax.swing.JFrame {

        Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    String VivCodPos;
    int id;
    String VivCalCod;
    String VivZonUrb;
    String VivTip;
    double VivMet;
    String VivOd;
    String estReg;
    int flagAdicionar = 0;
    int flagModificar = 0;
    int flagEliminar = 0;
    int flagInactivar = 0;
    int flagReactivar = 0;
    
    public Viviendas() {
        initComponents();
        Listar();
        LoadCalles() ;
        LoadCodigoPostal();
        LoadZonaUrbanizacion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextVivNum = new javax.swing.JTextField();
        TextEstadoRegistro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TextVivTip = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TextVivMet = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TextVivOd = new javax.swing.JTextField();
        TextCalCod = new javax.swing.JComboBox<>();
        TextCodPos = new javax.swing.JComboBox<>();
        TextZonUrb = new javax.swing.JComboBox<>();
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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de vivienda"));

        jLabel1.setText("Vivienda numero:");

        jLabel2.setText("Calle: ");

        jLabel4.setText("Estado de registro:");

        TextVivNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextVivNumActionPerformed(evt);
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

        jLabel3.setText("Codigo postal:");

        jLabel6.setText("Zona urbana:");

        jLabel7.setText("Vivienda tipo:");

        jLabel8.setText("Metros vivienda:");

        jLabel9.setText("Otro dato:");

        TextCalCod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        TextCodPos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        TextZonUrb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextVivOd, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextVivMet, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextVivTip, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextVivNum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextEstadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextCalCod, 0, 230, Short.MAX_VALUE)
                    .addComponent(TextCodPos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextZonUrb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextVivNum, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextCalCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextCodPos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TextZonUrb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TextVivTip, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TextVivMet, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TextVivOd, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextEstadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla Profesion"));

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Postal", "Viv N°", "Calle", "Zona Urbana", "Tipo", "Metros", "Od", "ER"
            }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TablaDatos);
        if (TablaDatos.getColumnModel().getColumnCount() > 0) {
            TablaDatos.getColumnModel().getColumn(0).setResizable(false);
            TablaDatos.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablaDatos.getColumnModel().getColumn(1).setResizable(false);
            TablaDatos.getColumnModel().getColumn(1).setPreferredWidth(30);
            TablaDatos.getColumnModel().getColumn(2).setPreferredWidth(100);
            TablaDatos.getColumnModel().getColumn(3).setPreferredWidth(70);
            TablaDatos.getColumnModel().getColumn(4).setResizable(false);
            TablaDatos.getColumnModel().getColumn(4).setPreferredWidth(15);
            TablaDatos.getColumnModel().getColumn(5).setResizable(false);
            TablaDatos.getColumnModel().getColumn(5).setPreferredWidth(25);
            TablaDatos.getColumnModel().getColumn(7).setResizable(false);
            TablaDatos.getColumnModel().getColumn(7).setPreferredWidth(15);
        }

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane5)
                .addContainerGap())
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextVivNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextVivNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextVivNumActionPerformed

    private void TextEstadoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEstadoRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEstadoRegistroActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        int fila = TablaDatos.getSelectedRow();
        if ( fila == -1) {
            JOptionPane.showMessageDialog(null,"Vivienda no seleccionada");
        } else {
            VivCodPos = (String) TablaDatos.getValueAt(fila, 0).toString();
            id = Integer.parseInt((String) TablaDatos.getValueAt(fila, 1).toString());
            VivCalCod = (String) TablaDatos.getValueAt(fila, 2).toString();
            VivZonUrb = (String) TablaDatos.getValueAt(fila, 3).toString();
            VivTip = (String) TablaDatos.getValueAt(fila, 4) ;
            VivMet =  Double.valueOf((String)TablaDatos.getValueAt(fila, 5).toString());
            VivOd =(String) TablaDatos.getValueAt(fila, 6) ;
            estReg = (String) TablaDatos.getValueAt(fila, 7) ;

        }
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void BtnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregar1ActionPerformed
        flagAdicionar = 1;
        Limpiar();
        LiberarDatos();
        TextCodPos.removeAllItems();
        TextCalCod.removeAllItems();
        TextZonUrb.removeAllItems();
        LoadCalles();
        LoadCodigoPostal();
        LoadZonaUrbanizacion();
    }//GEN-LAST:event_BtnAgregar1ActionPerformed

    private void BtnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificar1ActionPerformed
        flagModificar = 1;
        int fila = TablaDatos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null,"Vivienda no seleccionada");
        }
        //Limpiar();
        CargarDatos(VivCodPos, estReg,VivCalCod,VivZonUrb, VivTip, VivMet, VivOd );
        LiberarDatos();
        TextVivNum.setEnabled(false);
        TextCalCod.setEnabled(false);
        TextZonUrb.setEnabled(false);
        TextCodPos.setEnabled(false);
    }//GEN-LAST:event_BtnModificar1ActionPerformed

    private void BtnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminar1ActionPerformed
        flagEliminar = 1;
        CargarDatos(VivCodPos, estReg,VivCalCod,VivZonUrb, VivTip, VivMet, VivOd );
        int fila = TablaDatos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null,"Vivienda no seleccionada");
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
        CargarDatos(VivCodPos, estReg,VivCalCod,VivZonUrb, VivTip, VivMet, VivOd );
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
        CargarDatos(VivCodPos, estReg,VivCalCod,VivZonUrb, VivTip, VivMet, VivOd );
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
            java.util.logging.Logger.getLogger(Viviendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viviendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viviendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viviendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viviendas().setVisible(true);
            }
        });
    }

    void Listar(){
    String sql = "select * from viviendas";
    try {
        cn = (Connection) con.getConnection();
        st = cn.createStatement();
        rs = st.executeQuery(sql);
        Object[] municipio = new Object[8];
        modelo = (DefaultTableModel) TablaDatos.getModel();
        while (rs.next()) {            
            municipio[0] = getCodPos(rs.getString("CodPosCod"));
            municipio[1] = rs.getString("VivNum");
            //municipio[2] = rs.getString("CalCod");
            municipio[2] = getCalCod(rs.getString("CalCod"));
            municipio[3] = getZonUrb(rs.getString("ZonUrbCod"));
            municipio[4] = rs.getString("VivTip");
            municipio[5] = rs.getString("VivMet");
            municipio[6] = rs.getString("VivOd");
            municipio[7] = rs.getString("VivEstReg");
            modelo.addRow(municipio);
        }
        TablaDatos.setModel(modelo);
    } catch (Exception e) {
        }
    }
    void CargarDatos(String VivCodPos, String estReg, String VivCalCod, String VivZonUrb, String VivTip, double VivMet, String VivOd ) {
            //TextCalCod.setText("" + VivCalCod);
            TextCodPos.removeAllItems();
            TextCodPos.addItem(VivCodPos);
            TextVivMet.setText("" + VivMet);
            TextVivOd.setText(VivOd);
            TextVivTip.setText("" + VivTip);
            TextZonUrb.removeAllItems();
            TextZonUrb.addItem(""+VivZonUrb);
            TextCalCod.removeAllItems();
            TextCalCod.addItem("" +VivCalCod);
            TextVivNum.setText(""+id);
            TextEstadoRegistro.setText(""+estReg);
    }
    
    void LimpiarTabla(DefaultTableModel model) {
        for (int i = 0; i < TablaDatos.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
            
        }
    }
    void BloquearDatos() {
        TextCalCod.setEditable(false);
        TextCalCod.setEnabled(false);
        TextCodPos.setEditable(false);
        TextCodPos.setEnabled(false);
        TextVivMet.setEditable(false);
        TextVivMet.setEnabled(false);
        TextVivNum.setEditable(false);
        TextVivNum.setEnabled(false);
        TextVivOd.setEditable(false);
        TextVivOd.setEnabled(false);
        TextVivTip.setEditable(false);
        TextVivTip.setEnabled(false);
        TextZonUrb.setEditable(false);
        TextZonUrb.setEnabled(false);

    }
    void LiberarDatos() {
        TextCalCod.setEditable(true);
        TextCalCod.setEnabled(true);
        TextCodPos.setEditable(true);
        TextCodPos.setEnabled(true);
        TextVivMet.setEditable(true);
        TextVivMet.setEnabled(true);
        TextVivNum.setEditable(true);
        TextVivNum.setEnabled(true);
        TextVivOd.setEditable(true);
        TextVivOd.setEnabled(true);
        TextVivTip.setEditable(true);
        TextVivTip.setEnabled(true);
        TextZonUrb.setEditable(true);
        TextZonUrb.setEnabled(true);
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
            String id = TextVivNum.getText();
            String VivCodPos = TextCodPos.getSelectedItem().toString().substring(0,TextCodPos.getSelectedItem().toString().indexOf(" "));
            String VivCalCod = TextCalCod.getSelectedItem().toString().substring(0,TextCalCod.getSelectedItem().toString().indexOf(" "));
            String VivZonUrb = TextZonUrb.getSelectedItem().toString().substring(0,TextZonUrb.getSelectedItem().toString().indexOf(" "));
            char VivTip = TextVivTip.getText().charAt(0);
            String VivMet =  TextVivMet.getText();
            String VivOd = TextVivOd.getText();
            char estReg = TextEstadoRegistro.getText().charAt(0);
            
            
            try {
                
                if (VivCalCod.equals("") ||  id.equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe Ingresar datos por favor");               
                }if (VivCalCod.length() > 4 || id.length() > 4) {
                    if (id.length() > 5)
                        JOptionPane.showMessageDialog(null, "Por favor ingrese un numero de vivienda de menos de 5 digitos");
                    if (VivCalCod.length() > 4)
                        JOptionPane.showMessageDialog(null, "Por favor ingrese un codigo postal de 5 digitos");
                }else {
                    String sql = "INSERT INTO viviendas values( '"+VivCodPos+"', '"+id+"','"+VivCalCod+"','"+VivZonUrb+"', '"+VivTip+"', '"+VivMet+"', '"+VivOd+"', '"+estReg+"' )";
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Vivienda registrada con exito !!!");
                    LimpiarTabla(modelo);   
                }
            } catch (Exception e) {

            }
            LimpiarTabla(modelo); 
            flagAdicionar = 0;
        }if (flagModificar == 1) {
            // Modifica un registro en la base de datos
            //String id = TextVivNum.getText();
            //String VivCodPos = TextCodPos.getSelectedItem().toString().substring(0,TextCodPos.getSelectedItem().toString().indexOf(" "));
            //String VivCalCod = TextCalCod.getSelectedItem().toString().substring(0,TextCalCod.getSelectedItem().toString().indexOf(" "));
            //String VivZonUrb = TextZonUrb.getSelectedItem().toString().substring(0,TextZonUrb.getSelectedItem().toString().indexOf(" "));
            char VivTip = TextVivTip.getText().charAt(0);
            String VivMet =  TextVivMet.getText();
            String VivOd = TextVivOd.getText();
            char estReg = TextEstadoRegistro.getText().charAt(0);
            String sql = "UPDATE viviendas set VivTip='"+VivTip+"',VivMet='"+VivMet+"',VivOd='"+VivOd+"',VivEstReg='"+estReg+"'where VivNum="+id;
            if (VivMet.equals("")||VivOd.equals("")|| VivTip==' ') {
                JOptionPane.showMessageDialog(null, "Debe ingresar datos !!!");
                
            }if (VivOd.length() > 40) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese una codigo postal de 5 digitos"); 
            }else {
                try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Datos de vivienda modificado !!!");

                } catch (Exception e) {

                }
            }  
            LimpiarTabla(modelo);
            flagModificar = 0;
            TextVivNum.setEnabled(true);
            TextCalCod.setEnabled(true);
            TextCodPos.setEnabled(true);
            TextZonUrb.setEnabled(true);
            TextCodPos.removeAllItems();
            TextCalCod.removeAllItems();
            TextZonUrb.removeAllItems();
            LoadCalles();
            LoadCodigoPostal();
            LoadZonaUrbanizacion();
        }if (flagEliminar == 1) {
            // Elimina un registro en la base de datos
            String sql = "UPDATE viviendas set VivEstReg= '*' where VivNum="+id;       
            estReg = TextEstadoRegistro.getText();
            if (estReg.equals("*")) {
                JOptionPane.showMessageDialog(null,"Este registro ya ha sido eliminado");
            } else {
                    try {
                        cn = con.getConnection();
                        st = cn.createStatement();
                        st.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Vivienda eliminada !!!");
                        LiberarDatos();
                        
                    } catch (Exception e) {
                        
                    }
            }   
            LimpiarTabla(modelo);
            flagEliminar = 0;
            TextCodPos.removeAllItems();
            TextCalCod.removeAllItems();
            TextZonUrb.removeAllItems();
            LoadCalles();
            LoadCodigoPostal();
            LoadZonaUrbanizacion();
        }if (flagInactivar == 1) {
            // Inactiva un registro en la base de datos
            estReg = TextEstadoRegistro.getText();
            System.out.println(estReg);
            String sql = "UPDATE viviendas set VivEstReg= 'I' where VivNum="+id;
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
            TextCodPos.removeAllItems();
            TextCalCod.removeAllItems();
            TextZonUrb.removeAllItems();
            LoadCalles();
            LoadCodigoPostal();
            LoadZonaUrbanizacion();
        }if (flagReactivar == 1) {
            // Reactiva un registro en la base de datos
            estReg = TextEstadoRegistro.getText();
            String sql = "UPDATE viviendas set VivEstReg= 'A' where VivNum="+id;
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
            TextCodPos.removeAllItems();
            TextCalCod.removeAllItems();
            TextZonUrb.removeAllItems();
            LoadCalles();
            LoadCodigoPostal();
            LoadZonaUrbanizacion();
        }
    }
    void Cancelar() {
        if (flagAdicionar == 1) {
            flagAdicionar = 0;
        }if (flagModificar == 1) {
            flagModificar =0;
            TextCodPos.removeAllItems();
            TextCalCod.removeAllItems();
            TextZonUrb.removeAllItems();
            LoadCalles();
            LoadCodigoPostal();
            LoadZonaUrbanizacion();
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
        TextVivMet.setText("");
        TextVivNum.setText("");
        TextVivOd.setText("");
        TextVivTip.setText("");
        TextEstadoRegistro.setText("A");
        TextVivNum.requestFocus();
    }
    
    // funciones propias de la tablas 
    void LoadCalles() {   
        PreparedStatement pst; 
        ResultSet rs;          
        try { 
            String sql =  "SELECT CalCod,CalNom from calles";
            pst = cn.prepareStatement(sql); 
            rs = pst.executeQuery(); 
            TextCalCod.removeAllItems();
            String resp;
            while (rs.next()) { 
                    resp = rs.getString(1) +  " "+ rs.getString(2);
                    TextCalCod.addItem(resp); 
                } 
            } 
            catch ( Exception e) { 
                   e.printStackTrace(); 
        } 
    }
    void LoadCodigoPostal() {   
        PreparedStatement pst; 
        ResultSet rs;          
        try { 
            String sql =  "SELECT CodPosCod,CodPosNum from codigos_postales";
            pst = cn.prepareStatement(sql); 
            rs = pst.executeQuery(); 
            TextCodPos.removeAllItems();
            String resp;
            while (rs.next()) { 
                    resp = rs.getString(1) +  " "+ rs.getString(2);
                    TextCodPos.addItem(resp); 
                } 
            } 
            catch ( Exception e) { 
                   e.printStackTrace(); 
        } 
    }
    
    void LoadZonaUrbanizacion() {   
        PreparedStatement pst; 
        ResultSet rs;          
        try { 
            String sql =  "SELECT ZonUrbCod,ZonUrbNom from zonas_urbanas";
            pst = cn.prepareStatement(sql); 
            rs = pst.executeQuery(); 
            TextZonUrb.removeAllItems();
            String resp;
            while (rs.next()) { 
                    resp = rs.getString(1) +  " "+ rs.getString(2);
                    TextZonUrb.addItem(resp); 
                } 
            } 
            catch ( Exception e) { 
                   e.printStackTrace(); 
        } 
    }
    String getCalCod(String id) {
        String CalNom = "";
        PreparedStatement pst; 
        ResultSet rs;          
        try { 
            String sql =  "SELECT CalNom from calles where CalCod = '"+id+"' ";
            pst = cn.prepareStatement(sql); 
            rs = pst.executeQuery(); 
            String resp;
            while (rs.next()) { 
                    CalNom = rs.getString(1);
                } 
            } 
            catch ( Exception e) { 
                   e.printStackTrace(); 
        }     
        return CalNom;
    }    
    String getCodPos(String id) {
        String CodPos = "";
        PreparedStatement pst; 
        ResultSet rs;          
        try { 
            String sql =  "SELECT CodPosNum from codigos_postales where CodPosCod = '"+id+"' ";
            pst = cn.prepareStatement(sql); 
            rs = pst.executeQuery(); 
            String resp;
            while (rs.next()) { 
                    CodPos = rs.getString(1);
                } 
            } 
            catch ( Exception e) { 
                   e.printStackTrace(); 
        }     
        return CodPos;
    }  
    String getZonUrb(String id) {
        String ZonUrb = "";
        PreparedStatement pst; 
        ResultSet rs;          
        try { 
            String sql =  "SELECT ZonUrbNom from zonas_urbanas where ZonUrbCod = '"+id+"' ";
            pst = cn.prepareStatement(sql); 
            rs = pst.executeQuery(); 
            String resp;
            while (rs.next()) { 
                    ZonUrb = rs.getString(1);
                } 
            } 
            catch ( Exception e) { 
                   e.printStackTrace(); 
        }     
        return ZonUrb;
    } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar1;
    private javax.swing.JButton BtnAgregar1;
    private javax.swing.JButton BtnCancelar1;
    private javax.swing.JButton BtnEliminar1;
    private javax.swing.JButton BtnInactivar1;
    private javax.swing.JButton BtnModificar1;
    private javax.swing.JButton BtnReactivar1;
    private javax.swing.JButton BtnSalir1;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JComboBox<String> TextCalCod;
    private javax.swing.JComboBox<String> TextCodPos;
    private javax.swing.JTextField TextEstadoRegistro;
    private javax.swing.JTextField TextVivMet;
    private javax.swing.JTextField TextVivNum;
    private javax.swing.JTextField TextVivOd;
    private javax.swing.JTextField TextVivTip;
    private javax.swing.JComboBox<String> TextZonUrb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
