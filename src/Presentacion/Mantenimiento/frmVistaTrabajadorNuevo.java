/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Mantenimiento;

import Logica.LTipoUsuario;
import Logica.LTrabajadores;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author josug
 */
public class frmVistaTrabajadorNuevo extends javax.swing.JFrame {

    LTrabajadores lt = new LTrabajadores();

    public static String nombre, apellido, cedula, telefono, puesto;
    public static int cod, idPuesto;

    /**
     * Creates new form frmVistaZonaNuevo
     */
    public frmVistaTrabajadorNuevo() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrar("");
        ordenarTamaños();
    }

    public void mostrar(String buscar) {
        try {
            DefaultTableModel miModelo;
            LTrabajadores fun = new LTrabajadores();
            miModelo = fun.mostrarTrabajadores(buscar);
            tblTrabajadores.setModel(miModelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void ordenarTamaños() {
        TableColumnModel Modelo = tblTrabajadores.getColumnModel();
        Modelo.getColumn(0).setPreferredWidth(10);
        Modelo.getColumn(0).setResizable(false);
        Modelo.getColumn(1).setPreferredWidth(100);
        Modelo.getColumn(1).setResizable(false);
        Modelo.getColumn(2).setPreferredWidth(100);
        Modelo.getColumn(2).setResizable(false);
        Modelo.getColumn(3).setPreferredWidth(30);
        Modelo.getColumn(3).setResizable(false);
        Modelo.getColumn(4).setPreferredWidth(30);
        Modelo.getColumn(4).setResizable(false);
        Modelo.getColumn(5).setPreferredWidth(100);
        Modelo.getColumn(5).setResizable(false);
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
        jPanel1 = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTrabajadores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 160, 30));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("SERVINET");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 60, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Seleccione un Tipo de Usuario");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Buscar:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 180, -1));

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 60));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        tblTrabajadores.setAutoCreateRowSorter(true);
        tblTrabajadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tblTrabajadores.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblTrabajadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblTrabajadores.setGridColor(new java.awt.Color(255, 255, 255));
        tblTrabajadores.setRowHeight(25);
        tblTrabajadores.setSelectionBackground(new java.awt.Color(122, 72, 221));
        tblTrabajadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblTrabajadoresMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblTrabajadores);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 680, 240));

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 700, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblTrabajadoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTrabajadoresMousePressed
        if (evt.getClickCount() == 2) {
            int fila = tblTrabajadores.getSelectedRow();

            cod = Integer.parseInt(tblTrabajadores.getValueAt(fila, 0).toString());
            nombre = tblTrabajadores.getValueAt(fila, 1).toString();
            apellido = tblTrabajadores.getValueAt(fila, 2).toString();
            cedula = tblTrabajadores.getValueAt(fila, 3).toString();
            telefono = tblTrabajadores.getValueAt(fila, 4).toString();
            puesto = tblTrabajadores.getValueAt(fila, 5).toString();
            idPuesto = lt.traerIdPuesto(cod);
            frmValoresConfiguracion.txtIdTrabajador.setText(String.valueOf(cod));
            frmValoresConfiguracion.txtNombres.setText(nombre);
            frmValoresConfiguracion.txtApellido.setText(apellido);
            frmValoresConfiguracion.txtCedula.setText(cedula);
            frmValoresConfiguracion.txtTelefono.setText(telefono);
            frmValoresConfiguracion.txtPuesto.setText(puesto);
            frmValoresConfiguracion.txtIdPuesto.setText(String.valueOf(idPuesto));
            frmValoresConfiguracion.idTrabajador = String.valueOf(cod);
            this.dispose();
        }
    }//GEN-LAST:event_tblTrabajadoresMousePressed

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
            java.util.logging.Logger.getLogger(frmVistaTrabajadorNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVistaTrabajadorNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVistaTrabajadorNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVistaTrabajadorNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new frmVistaTrabajadorNuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblTrabajadores;
    // End of variables declaration//GEN-END:variables
}
