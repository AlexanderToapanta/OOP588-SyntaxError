/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mandango.vista;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mandango.modelo.MateriaPrima;
import mandango.servicio.MateriaPrimaServicio;

/**
 *
 * @author Usuario
 */
public class IngresoDeMateriaPrima extends javax.swing.JFrame {
static boolean zi = false;
    public IngresoDeMateriaPrima() {
        initComponents();
        
        
    }
  
      private boolean validar (){
        boolean validar=false;
        int cantidad = (int) spCantidad.getValue();
        if(txtIngredientes.getText().length()>0&&txtPrecio.getText().length()>0&&cantidad>0){
            validar=true;
        }else{
            validar = false;
        }
        if(txtIngredientes.getText().isBlank()&&txtPrecio.getText().isBlank()&&cantidad==0){
           JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
       } 
        else if(txtIngredientes.getText().isBlank()){
           JOptionPane.showMessageDialog(null, "El campo de  ingrediente es obligatorio");
       }
        else if(txtPrecio.getText().isBlank()){
           JOptionPane.showMessageDialog(null, "El campo de precio es obligatorio");
       }
        else if(cantidad==0){
           JOptionPane.showMessageDialog(null, "El campo de cantidad es obligatorio");
       }
        
        return validar;
    }
        public void Limpiar(){
        txtIngredientes.setText(" ");
        txtPrecio.setText(" ");
        spCantidad.setValue(0);
    } 
      
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIngredientes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        spCantidad = new javax.swing.JSpinner();
        txtPrecio = new javax.swing.JTextField();
        btningresaringre = new javax.swing.JButton();
        lbtotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ingreso de Ingredientes");

        jLabel2.setText("Ingrediente");

        txtIngredientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIngredientesKeyTyped(evt);
            }
        });

        jLabel3.setText("Cantidad");

        jLabel4.setText("Precio Unitario");

        spCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spCantidadStateChanged(evt);
            }
        });

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        btningresaringre.setText("registrar");
        btningresaringre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresaringreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btningresaringre)
                                    .addComponent(txtIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addContainerGap(175, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lbtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(btningresaringre)
                .addGap(18, 18, 18)
                .addComponent(lbtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIngredientesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIngredientesKeyTyped
         char validacionpt2 = evt.getKeyChar();
        if (Character.isDigit(validacionpt2)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtIngredientesKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
      char validacionpt2 = evt.getKeyChar();
        if (Character.isLetter(validacionpt2)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros");

        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void btningresaringreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresaringreActionPerformed
        if(validar()){
            Date fechaActual = new Date();
            MateriaPrima insertarmateria = new MateriaPrima(
                    txtIngredientes.getText(),
                    Integer.parseInt(spCantidad.getValue().toString()),
                    Double.parseDouble(txtPrecio.getText())
            ,fechaActual);
            
       if(MateriaPrimaServicio.InsertarMateriaPrima(insertarmateria)){
           JOptionPane.showMessageDialog(null, "Ingreso exitoso");
           
           zi=true;
       }
       
       Limpiar();
       
       }
    
       
    }//GEN-LAST:event_btningresaringreActionPerformed

    private void spCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spCantidadStateChanged
        
          
        
    }//GEN-LAST:event_spCantidadStateChanged

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

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
//            java.util.logging.Logger.getLogger(IngresoDeMateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(IngresoDeMateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(IngresoDeMateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(IngresoDeMateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new IngresoDeMateriaPrima().setVisible(true);
//            }
//        });
//    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btningresaringre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbtotal;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JTextField txtIngredientes;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
