/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Mantenimiento;

import Presentacion.Clientes.*;
import Datos.DClientes;
import Datos.DCuadrillas;
import Datos.DDetalleServicio;
import Datos.DDireccion;
import Datos.DPersona;
import Datos.DServicios;
import Datos.DSolicitud;
import Logica.LCuadrillas;
import Logica.LDireccion;
import Logica.LEstados;
import Logica.LServicios;
import Logica.LSolicitud;
import Presentacion.Mantenimiento.frmVistaDireccionNuevo;
import Presentacion.Mantenimiento.frmVistaServicioNuevo;
import Presentacion.Mantenimiento.frmVistaZonaNuevo;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author josug
 */
public class frmValoresDireccionNuevo extends javax.swing.JFrame {
    public static int control = 0;
    private LEstados es = new LEstados();
    Calendar fecha_actual = new GregorianCalendar();
    
    String accion = null;
 
    public static String nombreServicio = "";
    public static String conexion = "";
    public static String precio = "";
    public static int zonaId = 0;
    public static String descripcion = "";
    public static String estado = "";
    
    /**
     * Creates new form frmValoresSolicitudNuevo
     */
    public frmValoresDireccionNuevo() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarValores();
    }
    
    public void cargarValores(){
        if("si".equals(frmDireccionNuevo.editar)){
            txtId.setText(String.valueOf(frmDireccionNuevo.idDireccion));
            txtIdBarrio.setText(String.valueOf(frmDireccionNuevo.idBarrio));
            txtNombreBarrio.setText(frmDireccionNuevo.nombreBarrio);
            txtDescripcion.setText(frmDireccionNuevo.descripcion);
            txtNombreDireccion.setText(frmDireccionNuevo.nombreDireccion);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtId = new javax.swing.JTextField();
        txtNombreDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdBarrio = new javax.swing.JTextField();
        txtNombreBarrio = new javax.swing.JTextField();
        btnBuscarBarrio = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        btnGuardar4 = new javax.swing.JPanel();
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
        bar.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 130, 20));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel14.setText("INSERTE LOS DATOS DEL SERVICIO");
        bar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("SERVINET");
        bar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, 20));

        bg.add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 40));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre de la Dirección:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Descripción:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 270, -1));
        jPanel3.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 53, -1));

        txtNombreDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreDireccionFocusLost(evt);
            }
        });
        txtNombreDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreDireccionKeyReleased(evt);
            }
        });
        jPanel3.add(txtNombreDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 190, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Barrio:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        jPanel3.add(txtIdBarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 53, -1));
        jPanel3.add(txtNombreBarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 140, -1));

        btnBuscarBarrio.setBackground(new java.awt.Color(102, 0, 0));
        btnBuscarBarrio.setPreferredSize(new java.awt.Dimension(40, 40));
        btnBuscarBarrio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBuscarBarrioMousePressed(evt);
            }
        });
        btnBuscarBarrio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_20px.png"))); // NOI18N
        btnBuscarBarrio.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, 20));

        jPanel3.add(btnBuscarBarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 40, 40));

        btnGuardar4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout btnGuardar4Layout = new javax.swing.GroupLayout(btnGuardar4);
        btnGuardar4.setLayout(btnGuardar4Layout);
        btnGuardar4Layout.setHorizontalGroup(
            btnGuardar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        btnGuardar4Layout.setVerticalGroup(
            btnGuardar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel3.add(btnGuardar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 40, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 340, 330));

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

        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 50, 50));

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

        jPanel1.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, 50));

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

        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 50, 50));

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

        jPanel1.add(btnGuardar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 50, 50));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 420, 480));

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
        if(txtId.getText().equals("")){
            
            DDireccion dd = new DDireccion();
            LDireccion fun = new LDireccion();
            
            dd.setNombreDireccion(txtNombreDireccion.getText());
            dd.setDescripcion(txtDescripcion.getText());
            dd.setZonaId(Integer.parseInt(txtIdBarrio.getText()));
            
            fun.insertarDireccion(dd);
            
        }else if("si".equals(frmDireccionNuevo.editar)){
            
            DDireccion dd = new DDireccion();
            LDireccion fun = new LDireccion();
            
            dd.setIdDireccion(Integer.parseInt(txtId.getText()));
            dd.setNombreDireccion(txtNombreDireccion.getText());
            dd.setDescripcion(txtDescripcion.getText());
            dd.setZonaId(Integer.parseInt(txtIdBarrio.getText()));
            
            fun.editarDireccion(dd);
        }
        this.dispose();
    }//GEN-LAST:event_btnGuardarMousePressed

    private void btnBuscarBarrioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBarrioMousePressed
        frmVistaZonaNuevo form = new frmVistaZonaNuevo();
        form.setVisible(true);
        form.toFront();
        control = 1;
    }//GEN-LAST:event_btnBuscarBarrioMousePressed

    private void txtNombreDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreDireccionKeyReleased
        String nombre = txtNombreDireccion.getText().toUpperCase();
        txtNombreDireccion.setText(nombre);
    }//GEN-LAST:event_txtNombreDireccionKeyReleased

    private void txtNombreDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreDireccionFocusLost
        buscarRepetido();
    }//GEN-LAST:event_txtNombreDireccionFocusLost

    void buscarRepetido(){
        LDireccion ld = new LDireccion();
        String nombre = txtNombreDireccion.getText();
        try {
            ResultSet rs = ld.buscarRepetido(nombre);
            if(!rs.next()){
                
            }else{
                JOptionPane.showMessageDialog(rootPane, "Ya existe la Dirección");
                txtNombreDireccion.requestFocus();
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
            java.util.logging.Logger.getLogger(frmValoresDireccionNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmValoresDireccionNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmValoresDireccionNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmValoresDireccionNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new frmValoresDireccionNuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bar;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnBuscarBarrio;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnGuardar1;
    private javax.swing.JPanel btnGuardar3;
    private javax.swing.JPanel btnGuardar4;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextArea txtDescripcion;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtIdBarrio;
    public static javax.swing.JTextField txtNombreBarrio;
    public static javax.swing.JTextField txtNombreDireccion;
    // End of variables declaration//GEN-END:variables
}
