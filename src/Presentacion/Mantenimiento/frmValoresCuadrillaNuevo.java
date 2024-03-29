/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Mantenimiento;

import Datos.DCuadrillas;
import Datos.DDireccion;
import Datos.DPuestos;
import Logica.LCuadrillas;
import Logica.LDireccion;
import Logica.LEstados;
import Logica.LPuestos;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author josug
 */
public class frmValoresCuadrillaNuevo extends javax.swing.JFrame {

    public static int control = 0;
    private LEstados es = new LEstados();
    Calendar fecha_actual = new GregorianCalendar();

    String accion = null;

    /**
     * Creates new form frmValoresSolicitudNuevo
     */
    public frmValoresCuadrillaNuevo() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarValores();
        txtNombreCuadrilla.requestFocus();
        txtId.setEnabled(false);
        
    }

    public void cargarValores() {
        if ("si".equals(frmCuadrillaNuevo.editar)) {
            txtId.setText(String.valueOf(frmCuadrillaNuevo.idCuadrilla));
            txtNombreCuadrilla.setText(frmCuadrillaNuevo.nombreCuadrilla);
            txtDescripcion.setText(frmCuadrillaNuevo.descripcion);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bar = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtNombreCuadrilla = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtId = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnGuardar3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar.setBackground(new java.awt.Color(204, 204, 204));
        bar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bar.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 130, 20));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel14.setText("INSERTE LOS DATOS DEL SERVICIO");
        bar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("SERVINET");
        bar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        bg.add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 40));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreCuadrilla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreCuadrillaFocusLost(evt);
            }
        });
        txtNombreCuadrilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreCuadrillaKeyReleased(evt);
            }
        });
        jPanel3.add(txtNombreCuadrilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NOMBRE CUADRILLA:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Descripción:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescripcion);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 270, -1));
        jPanel3.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 53, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 290, 270));

        btnGuardar.setBackground(new java.awt.Color(102, 0, 0));
        btnGuardar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGuardarMousePressed(evt);
            }
        });
        btnGuardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_save_30px.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(25, 25));
        btnGuardar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 50, 50));

        btnGuardar1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout btnGuardar1Layout = new javax.swing.GroupLayout(btnGuardar1);
        btnGuardar1.setLayout(btnGuardar1Layout);
        btnGuardar1Layout.setHorizontalGroup(
            btnGuardar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        btnGuardar1Layout.setVerticalGroup(
            btnGuardar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, 50));

        btnSalir.setBackground(new java.awt.Color(102, 0, 0));
        btnSalir.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalirMousePressed(evt);
            }
        });
        btnSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_delete_30px.png"))); // NOI18N
        jLabel13.setPreferredSize(new java.awt.Dimension(25, 25));
        btnSalir.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 50, 50));

        btnGuardar3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout btnGuardar3Layout = new javax.swing.GroupLayout(btnGuardar3);
        btnGuardar3.setLayout(btnGuardar3Layout);
        btnGuardar3Layout.setHorizontalGroup(
            btnGuardar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        btnGuardar3Layout.setVerticalGroup(
            btnGuardar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(btnGuardar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 50, 50));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 360, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMousePressed
        this.dispose();
    }//GEN-LAST:event_btnSalirMousePressed

    private void btnGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMousePressed
        if (txtId.getText().equals("")) {
            DCuadrillas dp = new DCuadrillas();
            LCuadrillas fun = new LCuadrillas();

            dp.setNombreCuadrilla(txtNombreCuadrilla.getText());
            dp.setDescripcion(txtDescripcion.getText());

            fun.insertarCuadrillas(dp);
        } else if ("si".equals(frmCuadrillaNuevo.editar)) {
            DCuadrillas dp = new DCuadrillas();
            LCuadrillas fun = new LCuadrillas();

            dp.setIdCuadrilla(Integer.parseInt(txtId.getText()));
            dp.setNombreCuadrilla(txtNombreCuadrilla.getText());
            dp.setDescripcion(txtDescripcion.getText());

            fun.editarCuadrilla(dp);
        }
        this.dispose();
    }//GEN-LAST:event_btnGuardarMousePressed

    private void txtNombreCuadrillaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCuadrillaKeyReleased
        String nombre = (txtNombreCuadrilla.getText()).toUpperCase();
        txtNombreCuadrilla.setText(nombre);
    }//GEN-LAST:event_txtNombreCuadrillaKeyReleased

    private void txtNombreCuadrillaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreCuadrillaFocusLost
        buscarRepetido();
    }//GEN-LAST:event_txtNombreCuadrillaFocusLost

    private void txtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyReleased
        String descripcion = txtDescripcion.getText().toUpperCase();
        txtDescripcion.setText(descripcion);
    }//GEN-LAST:event_txtDescripcionKeyReleased

    void buscarRepetido() {
        LPuestos lp = new LPuestos();
        String nombre = txtNombreCuadrilla.getText();
        try {
            ResultSet rs = lp.buscarRepetido(nombre);
            if (!rs.next()) {

            } else {
                JOptionPane.showMessageDialog(rootPane, "Ya existe el puesto");
                txtNombreCuadrilla.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

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
            java.util.logging.Logger.getLogger(frmValoresCuadrillaNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmValoresCuadrillaNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmValoresCuadrillaNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmValoresCuadrillaNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmValoresCuadrillaNuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bar;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnGuardar1;
    private javax.swing.JPanel btnGuardar3;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea txtDescripcion;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtNombreCuadrilla;
    // End of variables declaration//GEN-END:variables
}
