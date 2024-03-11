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
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingreso de Ingredientes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("SimSun-ExtB", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrediente");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        txtIngredientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIngredientesKeyTyped(evt);
            }
        });
        jPanel1.add(txtIngredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 188, -1));

        jLabel3.setFont(new java.awt.Font("SimSun-ExtB", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("SimSun-ExtB", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio Unitario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        spCantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spCantidadStateChanged(evt);
            }
        });
        jPanel1.add(spCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

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
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 83, -1));

        btningresaringre.setText("registrar");
        btningresaringre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresaringreActionPerformed(evt);
            }
        });
        jPanel1.add(btningresaringre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));
        jPanel1.add(lbtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 279, 208, 28));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Tallarines a la carbonara-Los Tragaldabas.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

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
          Date fechaActual = new Date();
        if(validar()){
            MateriaPrima insertarmateria = new MateriaPrima(
                    txtIngredientes.getText(),
                    Integer.parseInt(spCantidad.getValue().toString()),
                    Double.parseDouble(txtPrecio.getText()),
            fechaActual);
            
       if(MateriaPrimaServicio.InsertarMateriaPrima(insertarmateria)){
           JOptionPane.showMessageDialog(null, "Ingreso exitoso");
           
           
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbtotal;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JTextField txtIngredientes;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
