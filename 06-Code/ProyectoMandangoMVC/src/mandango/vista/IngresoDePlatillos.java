/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mandango.vista;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import mandango.modelo.ProductosCafeteria;
import mandango.servicio.ProductoServicio;

/**
 *
 * @author Usuario
 */
public class IngresoDePlatillos extends javax.swing.JFrame {

  List<ProductosCafeteria> tablaPlatillos=null;
  
    public IngresoDePlatillos() {
        initComponents();
        tablaPlatillos=ProductoServicio.ListarProductos();
        this.setLocationRelativeTo(null);
    }

    private boolean validar (){
        boolean validar=false;
        int cantidad = (int) spCantidadesPlatillos.getValue();
        if(txtPlatillo.getText().length()>0&&txtPrecio.getText().length()>0&&cantidad>0){
            validar=true;
        }else{
            validar = false;
        }
        if(txtPlatillo.getText().isBlank()&&txtPrecio.getText().isBlank()&&cantidad==0){
           JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
       } 
        else if(txtPlatillo.getText().isBlank()){
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
        txtPlatillo.setText(" ");
        txtPrecio.setText(" ");
        spCantidadesPlatillos.setValue(0);
    } 
      private boolean ValidarExistencia(){
          boolean existencia = true;
          for(ProductosCafeteria buscar:tablaPlatillos){
               String platillo = buscar.getNombreProducto().trim().toLowerCase();
               String ingreso = txtPlatillo.getText().trim().toLowerCase();
               if(platillo.equals(ingreso)){
                   JOptionPane.showMessageDialog(null, "EL platillo ya se encuentra ingresado");
                   existencia = false;
                   break;
               } 
              
               }
          return existencia;
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPlatillo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        spCantidadesPlatillos = new javax.swing.JSpinner();
        btnInsertar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingreso de platillos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Precio ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombrel del platillo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidades a la venta");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        txtPlatillo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlatilloKeyTyped(evt);
            }
        });
        jPanel1.add(txtPlatillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 201, -1));

        txtPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecioFocusLost(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 201, -1));

        spCantidadesPlatillos.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel1.add(spCantidadesPlatillos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 141, -1));

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Sabores de miedo_ Lugares con platillos temáticos de Halloween y terror.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, -160, -1, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
          Date fechaActual = new Date();
        if(validar()){
           if(ValidarExistencia()){
                 ProductosCafeteria insertarplatillo = new ProductosCafeteria(
                          txtPlatillo.getText(), 
                           (int)spCantidadesPlatillos.getValue(), 
                            Double.parseDouble(txtPrecio.getText()));
            
       if(ProductoServicio.InsertarProductos(insertarplatillo)){
           JOptionPane.showMessageDialog(null, "Ingreso exitoso");
           }
           
        tablaPlatillos=ProductoServicio.ListarProductos();
       Limpiar();
       
       }
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void txtPlatilloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlatilloKeyTyped
        char validacionpt2 = evt.getKeyChar();
        if (Character.isDigit(validacionpt2)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtPlatilloKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
      char validacionpt2 = evt.getKeyChar();
        if (Character.isLetter(validacionpt2)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo números");
        } else if (validacionpt2 == ',') {
            String textoActual = txtPrecio.getText();
            String nuevoTexto = textoActual.replace(",", ".");
            txtPrecio.setText(nuevoTexto);
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
        char validacionpt2 = evt.getKeyChar();
        if (Character.isLetter(validacionpt2)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo números");
        } else if (validacionpt2 == ',') {
            String textoActual = txtPrecio.getText();
            String nuevoTexto = textoActual.replace(",", ".");
            txtPrecio.setText(nuevoTexto);
        }
    }//GEN-LAST:event_txtPrecioKeyReleased

    private void txtPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioFocusLost
        String salario=txtPrecio.getText().trim();
        if (salario.isEmpty() || !salario.matches("^[0-9]{1,4}+.[0-9]{0,2}$")) {
            JOptionPane.showMessageDialog(this, "Verificar el ingreso a otros valores.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtPrecioFocusLost

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
//            java.util.logging.Logger.getLogger(IngresoDePlatillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(IngresoDePlatillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(IngresoDePlatillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(IngresoDePlatillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new IngresoDePlatillos().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spCantidadesPlatillos;
    private javax.swing.JTextField txtPlatillo;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
