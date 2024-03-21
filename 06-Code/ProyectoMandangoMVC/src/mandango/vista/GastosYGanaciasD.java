/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mandango.vista;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import mandango.modelo.GananciasyGastosDiarios;
import mandango.modelo.ProductosCafeteria;
import mandango.servicio.GastosyGananciasServicio;
import mandango.servicio.ProductoServicio;



/**
 *
 * @author Usuario
 */
public class GastosYGanaciasD extends javax.swing.JFrame {

    static int dia;
    static boolean cerrado;
    MostraEgresos gastos = new MostraEgresos();
    private double gastosd = gastos.totalE;
    MostrarIngresos ganacias = new MostrarIngresos();
    private double gananciasd = ganacias.totalI;
    Date fechaActual = new Date();
    private double total=0;
    
        public GastosYGanaciasD() {
            initComponents();
            cargarDatos();
            Total();
            this.setLocationRelativeTo(null);
        }

    public void cargarDatos() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
       lbGastos.setText(String.format("%.2f", gastosd));
        lbGancias.setText(String.format("%.2f", gananciasd));
        lbDia.setText(formatoFecha.format(fechaActual));
        
    }
    public void Total(){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        total = gananciasd-gastosd;
        if(total>0){
            lbTotalDiario.setText("El dia "+formatoFecha.format(fechaActual)
                    +" se registro una ganacia de: "+String.format("%.2f", total));
        } else if(total<0){
            lbTotalDiario.setText("El dia "+formatoFecha.format(fechaActual)
                    +" se registro una pedida de: "+String.format("%.2f", total));
        }else {
            lbTotalDiario.setText("El dia "+formatoFecha.format(fechaActual)
                    +" las ganacias cubrieron los gastos: "+String.format("%.2f", total));
        }
    }
    public void CerrarVentana(){
        GerenteFormulario gerente = new GerenteFormulario();
        gerente.setVisible(true);
        setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbGastos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbGancias = new javax.swing.JLabel();
        lbTotalDiario = new javax.swing.JLabel();
        lbDia = new javax.swing.JLabel();
        btnCerrarCaja = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnCerrarCaja1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registro Diario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 17, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Gastos Diarios:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 82, -1, -1));

        lbGastos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbGastos.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 82, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setText("Ingresos diarios:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 136, -1, -1));

        lbGancias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbGancias.setForeground(new java.awt.Color(51, 204, 0));
        jPanel1.add(lbGancias, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 136, -1, -1));

        lbTotalDiario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(lbTotalDiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 255, 465, -1));

        lbDia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDia.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(lbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 198, -1, -1));

        btnCerrarCaja.setText("Cerrar Caja");
        btnCerrarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarCajaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 86, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Dia:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 198, -1, -1));

        btnCerrarCaja1.setText("Regresar");
        btnCerrarCaja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarCaja1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarCaja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 156, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/imagendegananciasdiarias (3).jpeg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarCajaActionPerformed
       
        
        int confirmacion = JOptionPane.showConfirmDialog(null,"Seguro en cerrar la caja?", "Confirmacion",JOptionPane.YES_NO_OPTION);
           if(confirmacion == JOptionPane.YES_OPTION){
              GananciasyGastosDiarios caja = new GananciasyGastosDiarios(
              fechaActual, 
               gananciasd,
               gastosd, 
               total);
               if (GastosyGananciasServicio.GastosyGanacias(caja)){
            JOptionPane.showMessageDialog(null, "Caja cerrada exitosamente");
            dia=LocalDate.now().getDayOfMonth();
            cerrado=true;
        }else {
                   JOptionPane.showMessageDialog(null, "No se pudo cerrar la caja");
               }
               CerrarVentana();
           }
    }//GEN-LAST:event_btnCerrarCajaActionPerformed

    private void btnCerrarCaja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarCaja1ActionPerformed
       CerrarVentana();
    }//GEN-LAST:event_btnCerrarCaja1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        CerrarVentana();
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GastosYGanaciasD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GastosYGanaciasD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GastosYGanaciasD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GastosYGanaciasD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GastosYGanaciasD().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarCaja;
    private javax.swing.JButton btnCerrarCaja1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDia;
    private javax.swing.JLabel lbGancias;
    private javax.swing.JLabel lbGastos;
    private javax.swing.JLabel lbTotalDiario;
    // End of variables declaration//GEN-END:variables
}
