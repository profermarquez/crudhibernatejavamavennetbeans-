/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.distribuidora;

import Controladores.UsuarioController;
import Models.Usuario;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebastian
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    DefaultListModel model = new DefaultListModel();
    Usuario usr=null ;
    public Dashboard() {
        initComponents();
        this.cargarLstUsuarios();
        this.btnCrear.setEnabled(false);
        this.btnEliminar.setEnabled(false);
        this.btnModificar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstUsuarios = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        jCheckBox1 = new javax.swing.JCheckBox();
        jSeparator2 = new javax.swing.JSeparator();
        txtModi1 = new javax.swing.JTextField();
        txtModi2 = new javax.swing.JTextField();
        txtModi3 = new javax.swing.JTextField();
        jCheckBox2 = new javax.swing.JCheckBox();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crud Usuario");

        jLabel1.setText("Nombre: ");

        jLabel2.setText("Apellido: ");

        jLabel3.setText("Dirección:");

        txt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt1MouseClicked(evt);
            }
        });
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        txt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt2MouseClicked(evt);
            }
        });

        txt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt3MouseClicked(evt);
            }
        });

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        lstUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstUsuarios);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jCheckBox1.setText("Habilitar Crear");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        txtModi1.setEditable(false);
        txtModi1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtModi1MouseClicked(evt);
            }
        });

        txtModi2.setEditable(false);
        txtModi2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtModi2MouseClicked(evt);
            }
        });

        txtModi3.setEditable(false);
        txtModi3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtModi3MouseClicked(evt);
            }
        });

        jCheckBox2.setText("Habilitar Modificar");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jCheckBox1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(btnCrear, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt1)))
                            .addComponent(jSeparator2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtModi1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModi2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModi3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnModificar)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(jCheckBox2)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear)
                    .addComponent(jCheckBox1))
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModi3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
        this.btnEliminar.setEnabled(false);
    }//GEN-LAST:event_txt1ActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
        if(testCrear()){System.out.println("Vacios");this.jCheckBox1.setSelected(false);this.btnCrear.setEnabled(false);return;}
        String respuesta = new UsuarioController().createUsuario(this.txt1.getText(), txt2.getText(), txt3.getText());
        this.cargarLstUsuarios();
        this.limpiarTxt();
        this.jCheckBox1.setSelected(false);
        this.btnCrear.setEnabled(false);
    }//GEN-LAST:event_btnCrearActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if(jCheckBox1.isSelected()){this.btnCrear.setEnabled(true);
        this.btnEliminar.setEnabled(false);}else{this.btnCrear.setEnabled(false);}
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void lstUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstUsuariosMouseClicked
        // lstUsuarios click
        int index= lstUsuarios.getSelectedIndex();
        usr=(Usuario)this.model.getElementAt(index);
        this.txtModi1.setText(usr.getNombre());
        this.txtModi2.setText(usr.getApellido());
        this.txtModi3.setText(usr.getDireccion());
        this.jCheckBox2.setSelected(false);
        this.txtModi1.setEnabled(false);
        this.txtModi2.setEnabled(false);
        this.txtModi3.setEnabled(false);
        this.btnModificar.setEnabled(false);
        this.btnEliminar.setEnabled(true);
        
        
    }//GEN-LAST:event_lstUsuariosMouseClicked

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:ç
        if(this.usr==null){System.out.println("Seleccione...");this.jCheckBox2.setSelected(false);return;}
        if(jCheckBox2.isSelected()){
        txtModi1.setEditable(true);
        txtModi2.setEditable(true);
        txtModi3.setEditable(true);
        this.txtModi1.setEnabled(true);
        this.txtModi2.setEnabled(true);
        this.txtModi3.setEnabled(true);
        this.btnModificar.setEnabled(true);
        this.btnEliminar.setEnabled(false);}
        else{txtModi1.setEditable(false);
        txtModi2.setEditable(false);
        txtModi3.setEditable(false);
        this.btnModificar.setEnabled(false);
        this.limpiarModiTxt();}
        
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el usuario?", "Confirmación", JOptionPane.YES_NO_OPTION);
        System.out.println(resp);
        if(resp==0){
            
            String res=new UsuarioController().deleteUsuario(usr.getId());
            System.out.println(res);
            this.cargarLstUsuarios();
            this.limpiarModiTxt();
            this.btnEliminar.setEnabled(false);
        }else{this.btnEliminar.setEnabled(false);}
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        if(testModi()){System.out.println("Vacios Modi");this.limpiarModiTxt();this.jCheckBox2.setSelected(false);this.btnModificar.setEnabled(false);return;}
        String res=new UsuarioController().updateUsuario(usr.getId(),this.txtModi1.getText(),this.txtModi2.getText(),this.txtModi3.getText());
        this.limpiarModiTxt();
        this.btnModificar.setEnabled(false);
        this.cargarLstUsuarios();
        System.out.println(res);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt1MouseClicked
        // TODO add your handling code here:
        this.btnEliminar.setEnabled(false);
        
    }//GEN-LAST:event_txt1MouseClicked

    private void txtModi1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModi1MouseClicked
        // TODO add your handling code here:
        this.btnEliminar.setEnabled(false);
    }//GEN-LAST:event_txtModi1MouseClicked

    private void txtModi2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModi2MouseClicked
        // TODO add your handling code here:
        this.btnEliminar.setEnabled(false);
    }//GEN-LAST:event_txtModi2MouseClicked

    private void txtModi3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModi3MouseClicked
        // TODO add your handling code here:
        this.btnEliminar.setEnabled(false);
    }//GEN-LAST:event_txtModi3MouseClicked

    private void txt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt2MouseClicked
        // TODO add your handling code here:
        this.btnEliminar.setEnabled(false);
    }//GEN-LAST:event_txt2MouseClicked

    private void txt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt3MouseClicked
        // TODO add your handling code here:
        this.btnEliminar.setEnabled(false);
    }//GEN-LAST:event_txt3MouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JList<String> lstUsuarios;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txtModi1;
    private javax.swing.JTextField txtModi2;
    private javax.swing.JTextField txtModi3;
    // End of variables declaration//GEN-END:variables

    private void cargarLstUsuarios() {
        model.clear();
        List<Usuario> list = new UsuarioController().getUsuarios();
        for(int indice = 0;indice<list.size();indice++)
                {
                    model.addElement(new Usuario(list.get(indice).getId(),list.get(indice).getNombre(),list.get(indice).getApellido(),list.get(indice).getDireccion()));
                }
        this.lstUsuarios.setModel(model);
    }

    private void limpiarTxt() {
        this.txt1.setText("");
        this.txt2.setText("");
        this.txt3.setText("");
    }
    private void limpiarModiTxt() {
        this.txtModi1.setText("");
        this.txtModi2.setText("");
        this.txtModi3.setText("");
    }

    private boolean testCrear() {
        int ban=1;
        if(txt1.getText().equals(""));ban=0;
        if(txt2.getText().equals(""));ban=0;
        if(txt3.getText().equals(""));ban=0;
        if(ban==1){return true;}
        else return false;
    }
    private boolean testModi() {
        int ban=1;
        if(txtModi1.getText().equals(""));ban=0;
        if(txtModi2.getText().equals(""));ban=0;
        if(txtModi3.getText().equals(""));ban=0;
        if(ban==1){return true;}
        else return false;
    }
}
