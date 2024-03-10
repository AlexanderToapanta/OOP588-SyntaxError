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
        btnregresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Registro Diario");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Gastos Diarios:");

        lbGastos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbGastos.setForeground(new java.awt.Color(255, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Ingresos diarios:");

        lbGancias.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbGancias.setForeground(new java.awt.Color(51, 204, 0));

        lbTotalDiario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbDia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDia.setForeground(new java.awt.Color(0, 0, 204));

        btnCerrarCaja.setText("Cerrar Caja");
        btnCerrarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarCajaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Dia:");

        btnregresar.setText("Regresar");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(83, 83, 83)
                                .addComponent(lbDia))
                            .addComponent(lbTotalDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 90, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbGastos)
                                    .addComponent(lbGancias)))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCerrarCaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnregresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel1)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbGastos)
                    .addComponent(btnCerrarCaja))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbGancias)
                    .addComponent(btnregresar))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbDia))
                .addGap(32, 32, 32)
                .addComponent(lbTotalDiario)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
       GerenteFormulario gerente = new GerenteFormulario();
       gerente.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnregresarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        GerenteFormulario gerente = new GerenteFormulario();
       gerente.setVisible(true);
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
    private javax.swing.JButton btnregresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDia;
    private javax.swing.JLabel lbGancias;
    private javax.swing.JLabel lbGastos;
    private javax.swing.JLabel lbTotalDiario;
    // End of variables declaration//GEN-END:variables
}
