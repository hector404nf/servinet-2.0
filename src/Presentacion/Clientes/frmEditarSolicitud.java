/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Clientes;

import Datos.DClientes;
import Datos.DPersona;
import Datos.DServiciodelCliente;
import Datos.DSolicitud;
import Logica.LEstados;
import Logica.LSolicitud;
import Presentacion.Mantenimiento.frmVistaDireccionNuevo;
import Presentacion.Mantenimiento.frmVistaServicioNuevo;
import Presentacion.Mantenimiento.frmVistaZonaNuevo;
import java.awt.Color;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JPanel;

/**
 *
 * @author josug
 */
public class frmEditarSolicitud extends javax.swing.JFrame {
    public static int control = 0;
    private LEstados es = new LEstados();
    Calendar fecha_actual = new GregorianCalendar();
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd");
    Calendar cal = Calendar.getInstance();
    
    public static String accion = null;
    public static String ruc = "";
    public static String nombres = "";
    public static String apellidos = "";
    public static String cedula = "";
    public static String telefono = "";
    public static int zonaId = 0;
    public static int direccionId = 0;
    public static String direccion = "";
    public static int tiposervicioId = 0;
    public static int estadoId = 0;
    
    /**
     * Creates new form frmValoresSolicitudNuevo
     */
    public frmEditarSolicitud() {
        initComponents();
        this.setLocationRelativeTo(null);
        

    }
    
    public void cargarValores(){
        txtId.setText(String.valueOf(frmPrincipalSolicitudesNuevo.id));
        txtNombres.setText(frmPrincipalSolicitudesNuevo.nombre);
        txtApellidos.setText(frmPrincipalSolicitudesNuevo.apellido);
        txtCedula.setText(frmPrincipalSolicitudesNuevo.cedulaIdent);
        txtIdTipo.setText(String.valueOf(frmPrincipalSolicitudesNuevo.idServicio));
        txtTipoSolicitud.setText(frmPrincipalSolicitudesNuevo.nombreServicio);
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
        txtIdTipo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTipoSolicitud = new javax.swing.JTextField();
        btnBuscarTipoSolicitud = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnGuardar5 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnGuardar3 = new javax.swing.JPanel();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator29 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jSeparator25 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar.setBackground(new java.awt.Color(204, 204, 204));
        bar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bar.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 200, 20));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("INSERTE LOS DATOS DE LA SOLICITUD");
        bar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("SERVINET");
        bar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        bg.add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 40));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(txtIdTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 53, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de Solicitud:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        jPanel3.add(txtTipoSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 170, -1));

        btnBuscarTipoSolicitud.setBackground(new java.awt.Color(102, 0, 0));
        btnBuscarTipoSolicitud.setPreferredSize(new java.awt.Dimension(40, 40));
        btnBuscarTipoSolicitud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBuscarTipoSolicitudMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarTipoSolicitudMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarTipoSolicitudMouseEntered(evt);
            }
        });
        btnBuscarTipoSolicitud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_20px.png"))); // NOI18N
        btnBuscarTipoSolicitud.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.add(btnBuscarTipoSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, 40));
        jPanel3.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 138, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cédula de Identidad:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        jPanel3.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 138, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellidos:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel3.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 138, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombres:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel3.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 53, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnGuardar5.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar5.setEnabled(false);

        javax.swing.GroupLayout btnGuardar5Layout = new javax.swing.GroupLayout(btnGuardar5);
        btnGuardar5.setLayout(btnGuardar5Layout);
        btnGuardar5Layout.setHorizontalGroup(
            btnGuardar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        btnGuardar5Layout.setVerticalGroup(
            btnGuardar5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel3.add(btnGuardar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 350, 350));

        btnGuardar.setBackground(new java.awt.Color(102, 0, 0));
        btnGuardar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGuardarMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
        });
        btnGuardar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_save_30px.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(25, 25));
        btnGuardar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 28));

        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 50, 50));

        btnGuardar1.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar1.setEnabled(false);

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

        jPanel1.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, 50));

        btnSalir.setBackground(new java.awt.Color(102, 0, 0));
        btnSalir.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalirMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
        });
        btnSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_delete_30px.png"))); // NOI18N
        jLabel13.setPreferredSize(new java.awt.Dimension(25, 25));
        btnSalir.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 28));

        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 50, 50));

        btnGuardar3.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar3.setEnabled(false);

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

        jPanel1.add(btnGuardar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 50, 50));
        jPanel1.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 120, 20));

        jSeparator26.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 20, 420));
        jPanel1.add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 370, 20));

        jSeparator29.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 10, 360));
        jPanel1.add(jSeparator24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 230, 20));

        jSeparator25.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 10, 40));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 410, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void btnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMousePressed
        this.dispose();
    }//GEN-LAST:event_btnSalirMousePressed

    private void btnGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMousePressed
        String msg = null;
        if(frmPrincipalSolicitudesNuevo.accion.equals("modificar")){
            nombres = txtNombres.getText();
            apellidos = txtApellidos.getText();
            cedula = txtCedula.getText();
            tiposervicioId = Integer.parseInt(txtIdTipo.getText());
            
            DClientes dc = new DClientes();
            DPersona dp = new DPersona();
            DSolicitud ds = new DSolicitud();
            LSolicitud fun = new LSolicitud();
            
            ds.setClienteId(Integer.parseInt(txtId.getText()));
            ds.setServicioId(tiposervicioId);
            ds.setIdSolicitud(Integer.parseInt(txtId.getText()));
            
            dp.setNombre(nombres);
            dp.setApellido(apellidos);
            dp.setCedulaIdent(cedula);
            dp.setIdPersona(Integer.parseInt(txtId.getText()));
            
            dc.setPersonaId(Integer.parseInt(txtId.getText()));
            dc.setId(Integer.parseInt(txtId.getText()));
            
            fun.editarSolicitud(ds, dp, dc);
        }
        this.dispose();
    }//GEN-LAST:event_btnGuardarMousePressed

    private void btnBuscarTipoSolicitudMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarTipoSolicitudMousePressed
        frmVistaServicioNuevo form = new frmVistaServicioNuevo();
        form.setVisible(true);
        form.toFront();
        control = 1;
    }//GEN-LAST:event_btnBuscarTipoSolicitudMousePressed

    private void btnBuscarTipoSolicitudMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarTipoSolicitudMouseEntered
        setColor(btnBuscarTipoSolicitud);
    }//GEN-LAST:event_btnBuscarTipoSolicitudMouseEntered

    private void btnBuscarTipoSolicitudMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarTipoSolicitudMouseExited
        resetColor(btnBuscarTipoSolicitud);
    }//GEN-LAST:event_btnBuscarTipoSolicitudMouseExited

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        setColor(btnGuardar);
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        resetColor(btnGuardar);
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        setColor(btnSalir);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        resetColor(btnSalir);
    }//GEN-LAST:event_btnSalirMouseExited

    void setColor(JPanel panel) {
        panel.setBackground(new Color(51, 0, 0));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(102, 0, 0));
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
            java.util.logging.Logger.getLogger(frmEditarSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEditarSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEditarSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEditarSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEditarSolicitud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bar;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnBuscarTipoSolicitud;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnGuardar1;
    private javax.swing.JPanel btnGuardar3;
    private javax.swing.JPanel btnGuardar5;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator5;
    public static javax.swing.JTextField txtApellidos;
    public static javax.swing.JTextField txtCedula;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtIdTipo;
    public static javax.swing.JTextField txtNombres;
    public static javax.swing.JTextField txtTipoSolicitud;
    // End of variables declaration//GEN-END:variables
}
