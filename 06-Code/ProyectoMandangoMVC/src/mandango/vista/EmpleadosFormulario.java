/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mandango.vista;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import mandango.modelo.Empleados;
import mandango.modelo.EmpleadosSuperClase;
import mandango.modelo.Usuarios;
import mandango.servicio.UsuariosServicio;

/**
 *
 * @author DELL
 */
public class EmpleadosFormulario extends javax.swing.JFrame {


   EmpleadosSuperClase empleado = new EmpleadosSuperClase();


    private  String dato;
    public EmpleadosFormulario() {
        initComponents();
        datosPerfil();
    }

   public void datosPerfil(){
        Login dato = new Login();
        String usuario = dato.usser;
        System.out.println(dato.usser);
        empleado = UsuariosServicio.BuscarUsuario(usuario);
    
    if (empleado != null) {
        lbNombre.setText("Empleado: " + empleado.getNombre() + " " + empleado.getApellido());
        lbrol.setText("Rol: " + empleado.getRol());
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        lbFechaNa.setText("Fecha Nacimiento:"+formatoFecha.format(empleado.getFechaNacimiento()));
        
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.setTime(empleado.getFechaNacimiento());
        int anioNacimiento = fechaNacimiento.get(Calendar.YEAR);
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        int edad = anioActual - anioNacimiento;
        lbEdad.setText("Edad:"+String.valueOf(edad));
        lbHorario.setText("Horario: 15:00-22:00");
    }
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbEdad = new javax.swing.JLabel();
        lbrol = new javax.swing.JLabel();
        lbHorario = new javax.swing.JLabel();
        lbFechaNa = new javax.swing.JLabel();
        lbHorario13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mnCerrarSecion = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(153, 0, 0));

        jLabel13.setFont(new java.awt.Font("Swis721 Blk BT", 2, 36)); // NOI18N
        jLabel13.setText("BIENVENIDO A CAFE MANDANGO");

        lbNombre.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(255, 255, 255));
        lbNombre.setText("jLabel1");

        lbEdad.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        lbEdad.setForeground(new java.awt.Color(255, 255, 255));
        lbEdad.setText("jLabel2");

        lbrol.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        lbrol.setForeground(new java.awt.Color(255, 255, 255));
        lbrol.setText("jLabel3");

        lbHorario.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        lbHorario.setForeground(new java.awt.Color(255, 255, 255));
        lbHorario.setText("jLabel4");

        lbFechaNa.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        lbFechaNa.setForeground(new java.awt.Color(255, 255, 255));
        lbFechaNa.setText("jLabel4");

        lbHorario13.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        lbHorario13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Captura de pantalla 2024-02-05 222729 (1).png"))); // NOI18N
        lbHorario13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel13))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbFechaNa, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                .addComponent(lbEdad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbHorario, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                .addComponent(lbrol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbHorario13)
                .addGap(98, 98, 98))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel13)
                .addGap(44, 44, 44)
                .addComponent(lbNombre)
                .addGap(31, 31, 31)
                .addComponent(lbFechaNa)
                .addGap(26, 26, 26)
                .addComponent(lbEdad)
                .addGap(31, 31, 31)
                .addComponent(lbrol)
                .addGap(33, 33, 33)
                .addComponent(lbHorario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(lbHorario13, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jMenu1.setText("Cafeteria");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cambiar Contraseña");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Salir");

        mnCerrarSecion.setText("Cerrar Seción");
        mnCerrarSecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCerrarSecionActionPerformed(evt);
            }
        });
        jMenu3.add(mnCerrarSecion);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnCerrarSecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCerrarSecionActionPerformed
        Login login = new Login();
            login.setVisible(true);
            setVisible(false);
    }//GEN-LAST:event_mnCerrarSecionActionPerformed

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
//            java.util.logging.Logger.getLogger(EmpleadosFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EmpleadosFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EmpleadosFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EmpleadosFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EmpleadosFormulario().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel13;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbEdad;
    private javax.swing.JLabel lbFechaNa;
    private javax.swing.JLabel lbHorario;
    private javax.swing.JLabel lbHorario13;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbrol;
    private javax.swing.JMenuItem mnCerrarSecion;
    // End of variables declaration//GEN-END:variables
}
