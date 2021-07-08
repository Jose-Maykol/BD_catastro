package vista;

import config.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Municipio extends javax.swing.JFrame {
    
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;
    String nom;
    String od;
    int estReg;
    int flagAdicionar = 0;
    int flagModificar = 0;
    int flagEliminar = 0;
    int flagInactivar = 0;
    int flagReactivar = 0;
    boolean mostrar = false;
    
    public Municipio() {
        initComponents();
        setLocationRelativeTo(null);
        TextEstadoRegistro.setEditable(false);
        TextEstadoRegistro.setEnabled(false);
        Listar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextID = new javax.swing.JTextField();
        TextNombre = new javax.swing.JTextField();
        TextOtroDato = new javax.swing.JTextField();
        TextEstadoRegistro = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        BtnAgregar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnInactivar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        BtnReactivar = new javax.swing.JButton();
        BtnAgregar4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("MUNICIPIO");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro Municipio"));

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre Municipio:");

        jLabel3.setText("Otro dato:");

        jLabel4.setText("Estado de registro:");

        TextID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIDActionPerformed(evt);
            }
        });

        TextEstadoRegistro.setEditable(false);
        TextEstadoRegistro.setText("1");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TextOtroDato, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                        .addComponent(TextNombre))
                    .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextEstadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(165, 165, 165))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TextID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(TextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TextOtroDato, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TextEstadoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        BtnAgregar4.setText("SALIR");
        BtnAgregar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregar4ActionPerformed(evt);
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
                    .addComponent(BtnAgregar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(BtnAgregar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista"));

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Otro dato", "Estado de registro"
            }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TablaDatos);

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
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(414, 414, 414))
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIDActionPerformed

    private void TextEstadoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEstadoRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEstadoRegistroActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        flagAdicionar = 1;
        Limpiar();
        LiberarDatos();
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        flagModificar = 1;
        mostrar = true;
        //Limpiar();
        CargarDatos(nom, od, estReg);
        LiberarDatos();
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        flagEliminar = 1;
        CargarDatos(nom, od, estReg);
        if (flagEliminar == 1) {
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
        CargarDatos(nom, od, estReg);
        if (flagInactivar == 1) {
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
        CargarDatos(nom, od, estReg);
        if (flagReactivar == 1) {
            BloquearDatos();
        }else {
            LiberarDatos();
        }
    }//GEN-LAST:event_BtnReactivarActionPerformed

    private void BtnAgregar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAgregar4ActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        int fila = TablaDatos.getSelectedRow();
        if ( fila == -1) {
            JOptionPane.showMessageDialog(null,"Municipio no seleccionado");
        } else {
            id = Integer.parseInt((String) TablaDatos.getValueAt(fila, 0).toString());
            nom = (String) TablaDatos.getValueAt(fila, 1);
            od = (String) TablaDatos.getValueAt(fila, 2);
            estReg = Integer.parseInt((String) TablaDatos.getValueAt(fila, 3).toString());
        }
    }//GEN-LAST:event_TablaDatosMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Municipio().setVisible(true);
            }
        });
    }

    void Listar(){
    String sql = "select * from municipios";
    try {
        cn = (Connection) con.getConnection();
        st = cn.createStatement();
        rs = st.executeQuery(sql);
        Object[] municipio = new Object[4];
        modelo = (DefaultTableModel) TablaDatos.getModel();
        while (rs.next()) {            
            municipio[0] = rs.getInt("MunNum");
            municipio[1] = rs.getString("MunNom");
            municipio[2] = rs.getString("MunOd");
            municipio[3] = rs.getString("MunEstReg");
            modelo.addRow(municipio);
        }
        TablaDatos.setModel(modelo);
    } catch (Exception e) {
        }
    }
    void CargarDatos(String nom, String od, int estReg) {
            TextID.setText(""+id);
            TextNombre.setText(nom);
            TextOtroDato.setText(od);
            TextEstadoRegistro.setText(""+estReg);
    }
    
    void LimpiarTabla(DefaultTableModel model) {
        for (int i = 0; i <= TablaDatos.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    void BloquearDatos() {
        TextID.setEditable(false);
        TextID.setEnabled(false);
        TextNombre.setEditable(false);
        TextNombre.setEnabled(false);
        TextOtroDato.setEditable(false);
        TextOtroDato.setEnabled(false);
    }
    void LiberarDatos() {
        TextID.setEditable(true);
        TextID.setEnabled(true);
        TextNombre.setEditable(true);
        TextNombre.setEnabled(true);
        TextOtroDato.setEditable(true);
        TextOtroDato.setEnabled(true);
    }
    void Actualizar() {
        if (flagAdicionar == 1) {
            // Adiciona un registro a la base de datos
            int id = Integer.parseInt(TextID.getText());
            String nom = TextNombre.getText();
            String od = TextOtroDato.getText();
            int estReg = Integer.parseInt(TextEstadoRegistro.getText());
            try {
                if (nom.equals("") || od.equals("")) {
                    JOptionPane.showMessageDialog(null, "Debe Ingresar datos por favor");
                    LimpiarTabla(modelo);               
                } else {
                    String sql = "INSERT INTO municipios values( '"+id+"', '"+nom+"','"+od+"','"+estReg+"')";
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Municipio registrado con exito !!!");
                    LimpiarTabla(modelo);   
                }
                flagAdicionar = 0;
            } catch (Exception e) {

            }
        }if (flagModificar == 1) {
            // Modifica un registro en la base de datos
            String nom = TextNombre.getText();
            String od = TextOtroDato.getText();
            int estReg = Integer.parseInt(TextEstadoRegistro.getText());
            System.out.println(nom);
            System.out.println(od);
            System.out.println(estReg);
            String sql = "UPDATE municipios set MunNom='"+nom+"',MunOd='"+od+"',MunEstReg='"+estReg+"'where MunNum="+id;
            if (nom.equals("") || od.equals("")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar datos !!!");
            }else {
                try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Datos muncipio modificado !!!");
                    LimpiarTabla(modelo);
                    flagModificar = 0;
                } catch (Exception e) {

                }
            }      
        }if (flagEliminar == 1) {
            // Elimina un registro en la base de datos
            String sql = "delete from municipios where MunNum=" + id;        
            int fila = TablaDatos.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(null,"Municipio no seleccionado");
            } else {
                    try {
                        cn = con.getConnection();
                        st = cn.createStatement();
                        st.executeUpdate(sql);
                        JOptionPane.showMessageDialog(null, "Municipio eliminado !!!");
                        LimpiarTabla(modelo);
                        LiberarDatos();
                        flagEliminar = 0;
                    } catch (Exception e) {
                        
                    }
            }   
        }if (flagInactivar == 1) {
            // Inactiva un registro en la base de datos
            String nom = TextNombre.getText();
            String od = TextOtroDato.getText();
            int estReg = Integer.parseInt(TextEstadoRegistro.getText());
            String sql = "UPDATE municipios set MunEstReg= 0 where MunNum="+id;
            if (estReg == 0) {
                JOptionPane.showMessageDialog(null, "El registro ya esta inactivado!!!");
            }else {
                try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Registro inactivado !!!");
                    LimpiarTabla(modelo);
                    LiberarDatos();
                } catch (Exception e) {

                }
            }
        }if (flagReactivar == 1) {
            // Reactiva un registro en la base de datos
            String nom = TextNombre.getText();
            String od = TextOtroDato.getText();
            int estReg = Integer.parseInt(TextEstadoRegistro.getText());
            String sql = "UPDATE municipios set MunEstReg= 1 where MunNum="+id;
            if (estReg == 1) {
                JOptionPane.showMessageDialog(null, "El registro ya esta activado!!!");
            }else {
                try {
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Registro reactivado !!!");
                    LimpiarTabla(modelo);
                    LiberarDatos();
                } catch (Exception e) {

                }
            }
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
        TextOtroDato.setText("");
        TextEstadoRegistro.setText("1");
        TextID.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnAgregar4;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnInactivar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnReactivar;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JTextField TextEstadoRegistro;
    private javax.swing.JTextField TextID;
    private javax.swing.JTextField TextNombre;
    private javax.swing.JTextField TextOtroDato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
