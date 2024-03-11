/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mandango.vista;

import java.util.List;
import javax.swing.JOptionPane;
import mandango.modelo.EmpleadosSuperClase;
import mandango.servicio.LoginServicio;
import mandango.servicio.UsuariosServicio;

/**
 *
 * @author Usuario
 */
public class CambiarContrasenia extends javax.swing.JFrame {

    List<EmpleadosSuperClase> ListaUsuarios =null;
    public CambiarContrasenia() {
        initComponents();
        cargarDatos();
        ListaUsuarios = LoginServicio.ListaUsuarios();
    }

    public void cargarDatos() {
        Login usuario = new Login();
        String usuarios = usuario.usser;
        txtUsuario.setText(usuarios);
       
        
    }
    private boolean validar() {
        boolean validar = false;
        if (!psCambioClave.getText().equals(" ") && !psConfirmarClave.getText().equals(" ")) {

            validar = true;

        } else {
            validar = false;
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        }

        return validar;
    }
    public void limpiarDatos(){
       psCambioClave.setText(" ");
       psConfirmarClave.setText(" ");
       
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        psCambioClave = new javax.swing.JPasswordField();
        psConfirmarClave = new javax.swing.JPasswordField();
        btnActualziar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirmar");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 70, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuario");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, -1));

        txtUsuario.setEditable(false);
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 82, 173, -1));
        jPanel1.add(psCambioClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 117, 171, -1));
        jPanel1.add(psConfirmarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 157, 171, -1));

        btnActualziar.setText("Actualizar");
        btnActualziar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualziarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualziar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Cambiar Contraseña");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Clave");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 50, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Debes cambiar la mayoría de tus contraseñas en internet.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualziarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualziarActionPerformed
        if (validar()){
            String clave = psCambioClave.getText();
            String confirmar = psConfirmarClave.getText();
            if (clave.equals(confirmar)){
                int confirmacion = JOptionPane.showConfirmDialog(null,"Seguro en actualizar la contrasenia?", "Confirmacion",JOptionPane.YES_NO_OPTION);
           if(confirmacion == JOptionPane.YES_OPTION){
                String encriptedclave = UsuariosServicio.EncriptarClave(clave);
               if(UsuariosServicio.ActualizarClave(txtUsuario.getText(), encriptedclave)){
                   JOptionPane.showMessageDialog(null, "Datos actualizados");
                   
               }else {
                   JOptionPane.showMessageDialog(null, "No se actualizaron los datos");
               }
               
           }
            }else {
                JOptionPane.showMessageDialog(null,"El campo de contrasenia y confirmar contrsenia deben ser iguales");
            }
            limpiarDatos();
        }
    }//GEN-LAST:event_btnActualziarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
       String usuario = txtUsuario.getText();
        for (EmpleadosSuperClase buscar :ListaUsuarios){
            String usuarios = buscar.getUsuario();
            String rol = buscar.getRol();            
            if(usuarios.equals(usuario)&&rol.equals("Gerente")){
               GerenteFormulario Gerente = new GerenteFormulario();
            Gerente.setVisible(true);
            setVisible(false);
            } else if(usuarios.equals(usuario)){
            EmpleadosFormulario Empleados = new EmpleadosFormulario();
            Empleados.setVisible(true);
            setVisible(false);
           
            
            }
        }
    }//GEN-LAST:event_btnRegresarActionPerformed

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
//            java.util.logging.Logger.getLogger(CambiarContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CambiarContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CambiarContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CambiarContrasenia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CambiarContrasenia().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualziar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField psCambioClave;
    private javax.swing.JPasswordField psConfirmarClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
