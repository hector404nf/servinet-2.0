/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.DDireccion;
import Datos.DEstadoDireccion;
import Datos.DEstadoPuesto;
import Datos.DEstadoServicio;
import Datos.DPersona;
import Datos.DPuestos;
import Datos.DServicios;
import Datos.DTipoServicio;
import Datos.DTipoUsuario;
import Datos.DUsuarios;
import Datos.guardarDatos;
import Logica.LDireccion;
import Logica.LEstados;
import Logica.LPuestos;
import Logica.LServicios;
import Logica.LTipoUsuario;
import Logica.LUsuarios;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josug
 */
public class frmPuestos extends javax.swing.JInternalFrame {
    private LEstados es = new LEstados();
    /**
     * Creates new form frmUsuario
     */
    String accion = null;
    
    public frmPuestos() {
        initComponents();
        mostrarBuscar("");
        
        cmbEstado.setModel(es.llenarComboPuestos());
        
        txtId.setVisible(false);
        txtPuesto.setVisible(false);
        cmbEstado.setVisible(false);
        
        btnGuardar.setVisible(false);
        btnCancelar.setVisible(false);
        
        lblId.setVisible(false);
        lblNombre.setVisible(false);
        lblEstado.setVisible(false);
    }
    
    public void mostrarBuscar(String buscar){
        try {
            DefaultTableModel miModelo;
            LPuestos log = new LPuestos();
            miModelo = log.mostrarPuestos(buscar);
            tblUsuarios.setModel(miModelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modificar(){
        txtId.setVisible(true);
        txtPuesto.setVisible(true);
        cmbEstado.setVisible(true);
        
        btnGuardar.setVisible(true);
        btnCancelar.setVisible(true);
        
        lblId.setVisible(true);
        lblNombre.setVisible(true);
        lblEstado.setVisible(true);
        
        btnAgregar.setVisible(false);
        btnEditar.setVisible(false);
        btnCancelarForm.setVisible(false);
        btnEliminar.setVisible(false);    
    }
    
    public void mostrarBotones(){
        txtId.setVisible(false);
        cmbEstado.setVisible(false);
        txtPuesto.setVisible(false);
        
        btnGuardar.setVisible(false);
        btnCancelar.setVisible(false);
        
        lblId.setVisible(false);
        lblNombre.setVisible(false);
        lblEstado.setVisible(false);
        
        btnAgregar.setVisible(true);
        btnEditar.setVisible(true);
        btnCancelarForm.setVisible(true);
        btnEliminar.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelarForm = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        buscar = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 104, 88));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 104, 88));

        btnCancelarForm.setText("Cancelar");
        jPanel1.add(btnCancelarForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 104, 88));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 104, 30));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, -1));

        lblId.setText("ID:");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 104, 30));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 104, 88));

        lblNombre.setText("Nombre del Puesto:");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jPanel1.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 170, 20));

        lblEstado.setText("Estado del Puesto:");
        jPanel1.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanel1.add(txtPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 190, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        jButton5.setText("Buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 185, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        btnAgregar.setVisible(false);
        btnEditar.setVisible(false);
        btnCancelarForm.setVisible(false);
        btnEliminar.setVisible(false);
        
        txtId.setVisible(true);
        txtPuesto.setVisible(true);
        cmbEstado.setVisible(true);
        
        btnGuardar.setVisible(true);
        btnCancelar.setVisible(true);
        
        lblId.setVisible(true);
        lblNombre.setVisible(true);
        lblEstado.setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        int fila = tblUsuarios.rowAtPoint(evt.getPoint());
        txtId.setText(tblUsuarios.getValueAt(fila, 0).toString());
        /*txtNombre.setText(tblUsuarios.getValueAt(fila, 1).toString());
        txtApellido.setText(tblUsuarios.getValueAt(fila, 2).toString());
        txtCedula.setText(tblUsuarios.getValueAt(fila, 3).toString());
        txtTelefono.setText(tblUsuarios.getValueAt(fila, 4).toString());
        cmbTipoServicio.setSelectedItem(tblUsuarios.getValueAt(fila, 5).toString());*/
        cmbEstado.setSelectedItem(tblUsuarios.getValueAt(fila, 6).toString());
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(tblUsuarios.getSelectedRows().length > 0){
            accion = "modificar";
            modificar();
        }else{
            JOptionPane.showMessageDialog(null, "Se debe de Seleccionar un usuario");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String actualizar = null;
        if(txtPuesto.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Campo Dirección obligatorio", "Validación", JOptionPane.WARNING_MESSAGE);
            txtPuesto.requestFocusInWindow();
            return;
        }
        
        if(cmbEstado.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Campo Estado obligatorio", "Validación", JOptionPane.WARNING_MESSAGE);
            cmbEstado.requestFocusInWindow();
            return;
        }
        
        String msg = null;
        String msg1 = null;
        String msg2 = null;
        if(txtId.getText().equals("")){
            DPuestos dts = new DPuestos();
            LPuestos fun = new LPuestos();
            DEstadoPuesto dep = new DEstadoPuesto();
            
            String estado = String.valueOf(cmbEstado.getSelectedItem());
            dts.setNombrePuesto(txtPuesto.getText());
            dep.setEstado(estado);
            msg = fun.insertarPuestos(dts, dep);
            mostrarBuscar("");
            if(msg == "si"){
                JOptionPane.showMessageDialog(rootPane, "Se insertó de forma correcta", "Información", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Ocurrió un problema al insertar", "Información", JOptionPane.ERROR);
            }
        }else if(accion.equals("modificar")){
            DDireccion dts = new DDireccion();
            LDireccion fun = new LDireccion();
            DEstadoDireccion ded = new DEstadoDireccion();
            
            String estado = String.valueOf(cmbEstado.getSelectedItem());
            dts.setIdDireccion(Integer.parseInt(txtId.getText()));
            ded.setIdEstadoDireccion(Integer.parseInt(txtId.getText()));
            /*dts.set(txtPuesto.getText());*/
            ded.setEstado(estado);
           /* msg = fun.; */
            mostrarBuscar("");
            modificar();
        }
        mostrarBotones();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(!txtId.getText().equals("")){
            int confirmacion = JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar el Usuario?", "Confirmación", 2);
            if(confirmacion == 0){
                DServicios dts = new DServicios();
                LServicios fun = new LServicios();
                DTipoServicio dtS = new DTipoServicio();
                DEstadoServicio des = new DEstadoServicio();
                
                
                dts.setIdServicio(Integer.parseInt(txtId.getText()));
                dtS.setIdTipoServicio(Integer.parseInt(txtId.getText()));
                des.setIdestadoServicio(Integer.parseInt(txtId.getText()));
                
                fun.eliminarServicios(dts, dtS, des);
                mostrarBuscar("");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        mostrarBotones();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarForm;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField buscar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPuesto;
    // End of variables declaration//GEN-END:variables
}
