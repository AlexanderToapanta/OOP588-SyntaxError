/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mandango.vista;

import java.util.List;
import javax.swing.JOptionPane;
import mandango.modelo.ProductosCafeteria;
import mandango.servicio.ProductoServicio;



/**
 *
 * @author Usuario
 */
public class ActualizarPlatillos extends javax.swing.JFrame {

    List<ProductosCafeteria> ListaPlatillos =null;
    public ActualizarPlatillos() {
        initComponents();
        ListaPlatillos=ProductoServicio.ListarProductos();
        cargarDatos();
        this.setLocationRelativeTo(null);
    }

   public void cargarDatos() {
        MostarPlatillos platillos = new MostarPlatillos();
        String palto = platillos.platillos;
        System.out.println(palto);
        txtPlatillo.setText(palto);
        for (ProductosCafeteria bus : ListaPlatillos){
            String platillo = bus.getNombreProducto();
            if(platillo.equals(palto)){
                txtPrecio.setText(String.valueOf(bus.getPrecio()));
                txtcantidad.setText(String.valueOf(bus.getCantidad()));
               break;
            }
             
        }
        
       
        
    }
    private boolean validar() {
        boolean validar = false;
        if (txtPrecio.getText().length()>0&&txtcantidad.getText().length()>0) {

            validar = true;

        } else {
            validar = false;
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        }

        return validar;
    }
    public void limpiarDatos(){
       txtPrecio.setText(" ");
       txtcantidad.setText(" ");
       
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPlatillo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtcantidad = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Actualizar platillos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel2.setText("Nombre del platillo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 82, -1, -1));

        jLabel3.setText("Cantidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        jLabel4.setText("Precio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 126, -1, -1));

        txtPlatillo.setEditable(false);
        getContentPane().add(txtPlatillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 77, 191, -1));

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 121, 191, -1));

        txtcantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcantidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcantidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 175, 191, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 259, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 259, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Food and Travel _ Cafeterías temáticas alrededor del mundo.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        MostarPlatillos platillos = new MostarPlatillos();
        platillos.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(validar()){
            int confirmacion = JOptionPane.showConfirmDialog(null,"Seguro en actualizar la cantidad y precio?", "Confirmacion",JOptionPane.YES_NO_OPTION);
            if(confirmacion == JOptionPane.YES_OPTION){
                ProductosCafeteria actualizar = new ProductosCafeteria(
                    txtPlatillo.getText(),
                    Integer.parseInt(txtcantidad.getText())
                    , Double.parseDouble(txtPrecio.getText()));
                if(ProductoServicio.ActulizarStockyPrecio(actualizar)){
                    JOptionPane.showMessageDialog(null, "Datos actualizados");

                }else {
                    JOptionPane.showMessageDialog(null, "No se actualizaron los datos");
                }
                limpiarDatos();
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtcantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyTyped
        char validacionpt2 = evt.getKeyChar();
        if (Character.isLetter(validacionpt2)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo números");
        } else if (validacionpt2 == '.' || validacionpt2 == ',') {
            String textoActual = txtcantidad.getText();
            String nuevoTexto = textoActual.replace(".", "").replace(",", "");
            txtcantidad.setText(nuevoTexto);
        }
    }//GEN-LAST:event_txtcantidadKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char validacionpt2 = evt.getKeyChar();
        if (Character.isLetter(validacionpt2)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo números");
        } else if (validacionpt2 == ',') {
            String textoActual = txtcantidad.getText();
            String nuevoTexto = textoActual.replace(",", ".");
            txtcantidad.setText(nuevoTexto);
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtcantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcantidadKeyReleased
        char validacionpt2 = evt.getKeyChar();
        if (Character.isLetter(validacionpt2)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo números");
        } else if (validacionpt2 == '.' || validacionpt2 == ',') {
            String textoActual = txtcantidad.getText();
            String nuevoTexto = textoActual.replace(".", "").replace(",", "");
            txtcantidad.setText(nuevoTexto);
        }
    }//GEN-LAST:event_txtcantidadKeyReleased

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
        char validacionpt2 = evt.getKeyChar();
        if (Character.isLetter(validacionpt2)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Ingrese solo números");
        } else if (validacionpt2 == ',') {
            String textoActual = txtcantidad.getText();
            String nuevoTexto = textoActual.replace(",", ".");
            txtcantidad.setText(nuevoTexto);
        }
    }//GEN-LAST:event_txtPrecioKeyReleased

//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(ActualizarPlatillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ActualizarPlatillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ActualizarPlatillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ActualizarPlatillos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ActualizarPlatillos().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtPlatillo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtcantidad;
    // End of variables declaration//GEN-END:variables
}
