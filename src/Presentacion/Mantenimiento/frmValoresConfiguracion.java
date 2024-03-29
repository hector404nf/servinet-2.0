/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Mantenimiento;

import Datos.DDetalleCuadrilla;
import Datos.DPersona;
import Datos.DTrabajadores;
import Logica.LConfiguracionCuadrilla;
import Logica.LEstados;
import Logica.LHorarioTrabajo;
import Logica.LTrabajadores;
import static Presentacion.Cuadrillas.frmRegistrarEntrada.txtApellidos;
import static Presentacion.Cuadrillas.frmRegistrarEntrada.txtCedula;
import static Presentacion.Cuadrillas.frmRegistrarEntrada.txtCuadrilla;
import static Presentacion.Cuadrillas.frmRegistrarEntrada.txtIdCuadrilla;
import static Presentacion.Cuadrillas.frmRegistrarEntrada.txtIdDetalleCuadrilla;
import static Presentacion.Cuadrillas.frmRegistrarEntrada.txtIdPuesto;
import static Presentacion.Cuadrillas.frmRegistrarEntrada.txtIdTrabajador;
import static Presentacion.Cuadrillas.frmRegistrarEntrada.txtNombres;
import static Presentacion.Cuadrillas.frmRegistrarEntrada.txtPuesto;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author josug
 */
public class frmValoresConfiguracion extends javax.swing.JFrame {

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

    public static int idBarrio = 0;
    public static String barrio = "";

    LHorarioTrabajo lht = new LHorarioTrabajo();

    public static String idCuadrilla = null;

    public static String idTrabajador = null;

    /**
     * Creates new form frmValoresSolicitudNuevo
     */
    public frmValoresConfiguracion() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtIdTrabajador.setEnabled(false);
        txtIdPuesto.setEnabled(false);
        txtPuesto.setEnabled(false);

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
        txtNombres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtIdTrabajador = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnBuscarTrabajador = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        btnGuardar4 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGuardar1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnGuardar3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtBarrio = new javax.swing.JTextField();
        txtIdBarrio = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btnBuscarCuadrilla = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        btnGuardar2 = new javax.swing.JPanel();
        txtIdPuesto = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JTextField();
        txtIdDetalleCuadrilla = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bar.setBackground(new java.awt.Color(204, 204, 204));
        bar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bar.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 130, 20));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel14.setText("INSERTE LOS DATOS DEL SERVICIO");
        bar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("SERVINET");
        bar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        bg.add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 40));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombresKeyReleased(evt);
            }
        });
        jPanel3.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombres:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
        });
        jPanel3.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellidos:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        jPanel3.add(txtIdTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 53, -1));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel3.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Teléfono:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaFocusLost(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
        });
        jPanel3.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 150, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cédula de Identidad:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 130, 10));

        btnBuscarTrabajador.setBackground(new java.awt.Color(102, 0, 0));
        btnBuscarTrabajador.setPreferredSize(new java.awt.Dimension(40, 40));
        btnBuscarTrabajador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarTrabajadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarTrabajadorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBuscarTrabajadorMousePressed(evt);
            }
        });
        btnBuscarTrabajador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_20px.png"))); // NOI18N
        btnBuscarTrabajador.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.add(btnBuscarTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 40));

        btnGuardar4.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar4.setEnabled(false);

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

        jPanel3.add(btnGuardar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 40, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 180, 330));

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

        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 50, 50));

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

        jPanel1.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, 50));

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

        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 50, 50));

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

        jPanel1.add(btnGuardar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 50, 50));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtBarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 230, -1));
        jPanel2.add(txtIdBarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 53, -1));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("CUADRILLA:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnBuscarCuadrilla.setBackground(new java.awt.Color(102, 0, 0));
        btnBuscarCuadrilla.setPreferredSize(new java.awt.Dimension(40, 40));
        btnBuscarCuadrilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarCuadrillaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarCuadrillaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBuscarCuadrillaMousePressed(evt);
            }
        });
        btnBuscarCuadrilla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_20px.png"))); // NOI18N
        btnBuscarCuadrilla.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel2.add(btnBuscarCuadrilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 40, 40));

        btnGuardar2.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar2.setEnabled(false);

        javax.swing.GroupLayout btnGuardar2Layout = new javax.swing.GroupLayout(btnGuardar2);
        btnGuardar2.setLayout(btnGuardar2Layout);
        btnGuardar2Layout.setHorizontalGroup(
            btnGuardar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        btnGuardar2Layout.setVerticalGroup(
            btnGuardar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(btnGuardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 40, 40));
        jPanel2.add(txtIdPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 53, -1));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("PUESTO DE TRABAJO:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel2.add(txtPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 170, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 400, 140));
        jPanel1.add(txtIdDetalleCuadrilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 53, -1));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 690, 490));

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

        DDetalleCuadrilla ddc = new DDetalleCuadrilla();
        LConfiguracionCuadrilla fun = new LConfiguracionCuadrilla();

        System.out.println(idCuadrilla);

        ddc.setCuadrillaId(Integer.parseInt(idCuadrilla));
        ddc.setTrabajadorId(Integer.parseInt(idTrabajador));
        fun.insertarConfig(ddc);  
        this.dispose();
    }//GEN-LAST:event_btnGuardarMousePressed

    private void txtNombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyReleased
        String nombre = txtNombres.getText().toUpperCase();
        txtNombres.setText(nombre);
    }//GEN-LAST:event_txtNombresKeyReleased

    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost

    }//GEN-LAST:event_txtCedulaFocusLost

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        String apellido = txtApellido.getText().toUpperCase();
        txtApellido.setText(apellido);
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void btnBuscarCuadrillaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCuadrillaMouseEntered
        setColor(btnBuscarCuadrilla);
    }//GEN-LAST:event_btnBuscarCuadrillaMouseEntered

    private void btnBuscarCuadrillaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCuadrillaMouseExited
        resetColor(btnBuscarCuadrilla);
    }//GEN-LAST:event_btnBuscarCuadrillaMouseExited

    private void btnBuscarCuadrillaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCuadrillaMousePressed
        frmVistaCuadrillaConfiguracion form = new frmVistaCuadrillaConfiguracion();
        form.setVisible(true);
        form.toFront();
    }//GEN-LAST:event_btnBuscarCuadrillaMousePressed

    private void txtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyPressed

    }//GEN-LAST:event_txtCedulaKeyPressed

    private void btnBuscarTrabajadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarTrabajadorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarTrabajadorMouseEntered

    private void btnBuscarTrabajadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarTrabajadorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarTrabajadorMouseExited

    private void btnBuscarTrabajadorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarTrabajadorMousePressed
        frmVistaTrabajadorNuevo form = new frmVistaTrabajadorNuevo();
        form.setVisible(true);
        form.toFront();
    }//GEN-LAST:event_btnBuscarTrabajadorMousePressed

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
            java.util.logging.Logger.getLogger(frmValoresConfiguracion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmValoresConfiguracion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmValoresConfiguracion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmValoresConfiguracion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new frmValoresConfiguracion().setVisible(true);
            }
        });
    }

    void setColor(JPanel panel) {
        panel.setBackground(new Color(51, 0, 0));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(102, 0, 0));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bar;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnBuscarCuadrilla;
    private javax.swing.JPanel btnBuscarTrabajador;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnGuardar1;
    private javax.swing.JPanel btnGuardar2;
    private javax.swing.JPanel btnGuardar3;
    private javax.swing.JPanel btnGuardar4;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator5;
    public static javax.swing.JTextField txtApellido;
    public static javax.swing.JTextField txtBarrio;
    public static javax.swing.JTextField txtCedula;
    public static javax.swing.JTextField txtIdBarrio;
    public static javax.swing.JTextField txtIdDetalleCuadrilla;
    public static javax.swing.JTextField txtIdPuesto;
    public static javax.swing.JTextField txtIdTrabajador;
    public static javax.swing.JTextField txtNombres;
    public static javax.swing.JTextField txtPuesto;
    public static javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
