/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Clientes;

import Datos.DCaja;
import Datos.DUsuarios;
import Presentacion.Mantenimiento.*;
import Logica.ConexionSingleton;
import Logica.LCaja;
import Presentacion.Clientes.frmPrincipalMenu;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author josug
 */
public class frmAbrirCaja extends javax.swing.JFrame {
    Calendar fecha_actual = new GregorianCalendar();
    SimpleDateFormat horaActual = new SimpleDateFormat("HH:mm:ss");
    /**
     * Creates new form frmLogin
     */
    Connection cn = ConexionSingleton.getConnection();
    
    public frmAbrirCaja() {
        initComponents();
        this.setLocationRelativeTo(null);
        jdFechaApertura.setCalendar(fecha_actual);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnAbrirCaja = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnNuevaSolicitud5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        jdFechaApertura = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        btnEditarSolicitud2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnNuevaSolicitud6 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        txtMontoApertura = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtIdUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 40));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAbrirCaja.setBackground(new java.awt.Color(102, 0, 0));
        btnAbrirCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrirCaja.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAbrirCaja.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnAbrirCajaFocusGained(evt);
            }
        });
        btnAbrirCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAbrirCajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAbrirCajaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAbrirCajaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAbrirCajaMouseReleased(evt);
            }
        });
        btnAbrirCaja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Abrir Caja");
        btnAbrirCaja.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));
        btnAbrirCaja.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 10));

        jPanel1.add(btnAbrirCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 90, 40));

        btnNuevaSolicitud5.setBackground(new java.awt.Color(51, 0, 0));
        btnNuevaSolicitud5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaSolicitud5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNuevaSolicitud5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnNuevaSolicitud5FocusGained(evt);
            }
        });
        btnNuevaSolicitud5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevaSolicitud5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevaSolicitud5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNuevaSolicitud5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNuevaSolicitud5MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnNuevaSolicitud5Layout = new javax.swing.GroupLayout(btnNuevaSolicitud5);
        btnNuevaSolicitud5.setLayout(btnNuevaSolicitud5Layout);
        btnNuevaSolicitud5Layout.setHorizontalGroup(
            btnNuevaSolicitud5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        btnNuevaSolicitud5Layout.setVerticalGroup(
            btnNuevaSolicitud5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnNuevaSolicitud5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gs.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 320, 30));

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha de Apertura:");
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jdFechaApertura.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(jdFechaApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 130, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        btnEditarSolicitud2.setBackground(new java.awt.Color(102, 0, 0));
        btnEditarSolicitud2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarSolicitud2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEditarSolicitud2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnEditarSolicitud2FocusGained(evt);
            }
        });
        btnEditarSolicitud2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarSolicitud2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarSolicitud2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditarSolicitud2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEditarSolicitud2MouseReleased(evt);
            }
        });
        btnEditarSolicitud2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Cancelar");
        btnEditarSolicitud2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, -1));
        btnEditarSolicitud2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, 20));

        jPanel1.add(btnEditarSolicitud2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 90, 40));

        btnNuevaSolicitud6.setBackground(new java.awt.Color(51, 0, 0));
        btnNuevaSolicitud6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaSolicitud6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNuevaSolicitud6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnNuevaSolicitud6FocusGained(evt);
            }
        });
        btnNuevaSolicitud6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNuevaSolicitud6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNuevaSolicitud6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnNuevaSolicitud6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNuevaSolicitud6MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout btnNuevaSolicitud6Layout = new javax.swing.GroupLayout(btnNuevaSolicitud6);
        btnNuevaSolicitud6.setLayout(btnNuevaSolicitud6Layout);
        btnNuevaSolicitud6Layout.setHorizontalGroup(
            btnNuevaSolicitud6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        btnNuevaSolicitud6Layout.setVerticalGroup(
            btnNuevaSolicitud6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(btnNuevaSolicitud6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 70, 10));
        jPanel1.add(txtMontoApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 100, -1));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 130, -1));
        jPanel1.add(txtIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 40, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Monto de Apertura:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jPanel6.setBackground(new java.awt.Color(102, 0, 0));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_20px_1.png"))); // NOI18N
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 40, 40));

        jPanel5.setBackground(new java.awt.Color(51, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 40, 40));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 370, 250));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaSolicitud5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnNuevaSolicitud5FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaSolicitud5FocusGained

    private void btnNuevaSolicitud5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaSolicitud5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaSolicitud5MouseEntered

    private void btnNuevaSolicitud5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaSolicitud5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaSolicitud5MouseExited

    private void btnNuevaSolicitud5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaSolicitud5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaSolicitud5MousePressed

    private void btnNuevaSolicitud5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaSolicitud5MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaSolicitud5MouseReleased

    private void btnAbrirCajaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnAbrirCajaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbrirCajaFocusGained

    private void btnAbrirCajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirCajaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbrirCajaMouseEntered

    private void btnAbrirCajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirCajaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbrirCajaMouseExited

    private void btnAbrirCajaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirCajaMousePressed
        DCaja dc = new DCaja();
        LCaja fun = new LCaja();
        
        int añoA = jdFechaApertura.getCalendar().get(Calendar.YEAR);
        int mesA = jdFechaApertura.getCalendar().get(Calendar.MONTH);
        int diaA = jdFechaApertura.getCalendar().get(Calendar.DAY_OF_MONTH);
        dc.setFechaApertura(new Date((añoA - 1900), mesA, diaA));
        
        dc.setMontoApertura(Double.parseDouble(txtMontoApertura.getText()));
        dc.setIdUsuario(Integer.parseInt(txtIdUsuario.getText()));
        
        try {
            fun.AbrirCaja(dc);
        } catch (SQLException ex) {
            Logger.getLogger(frmAbrirCaja.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frmGestionarPagos form = new frmGestionarPagos();
                form.setVisible(true);
                form.toFront();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }//GEN-LAST:event_btnAbrirCajaMousePressed

    private void btnAbrirCajaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirCajaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbrirCajaMouseReleased

    private void btnNuevaSolicitud6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnNuevaSolicitud6FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaSolicitud6FocusGained

    private void btnNuevaSolicitud6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaSolicitud6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaSolicitud6MouseEntered

    private void btnNuevaSolicitud6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaSolicitud6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaSolicitud6MouseExited

    private void btnNuevaSolicitud6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaSolicitud6MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaSolicitud6MousePressed

    private void btnNuevaSolicitud6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevaSolicitud6MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaSolicitud6MouseReleased

    private void btnEditarSolicitud2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnEditarSolicitud2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarSolicitud2FocusGained

    private void btnEditarSolicitud2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarSolicitud2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarSolicitud2MouseEntered

    private void btnEditarSolicitud2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarSolicitud2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarSolicitud2MouseExited

    private void btnEditarSolicitud2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarSolicitud2MousePressed
        this.dispose();
    }//GEN-LAST:event_btnEditarSolicitud2MousePressed

    private void btnEditarSolicitud2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarSolicitud2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarSolicitud2MouseReleased

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        frmVistaUsuarios form = new frmVistaUsuarios();
        form.setVisible(true);
        form.toFront();
    }//GEN-LAST:event_jPanel6MousePressed

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
            java.util.logging.Logger.getLogger(frmAbrirCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAbrirCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAbrirCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAbrirCaja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAbrirCaja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAbrirCaja;
    private javax.swing.JPanel btnEditarSolicitud2;
    private javax.swing.JPanel btnNuevaSolicitud5;
    private javax.swing.JPanel btnNuevaSolicitud6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private com.toedter.calendar.JDateChooser jdFechaApertura;
    private javax.swing.JLabel lblFecha;
    public static javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtMontoApertura;
    public static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
