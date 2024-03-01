/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mandango.vista;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import mandango.modelo.EmpleadosSuperClase;
import mandango.servicio.UsuariosServicio;

/**
 *
 * @author DELL
 */
public class GerenteFormulario extends javax.swing.JFrame {

      EmpleadosSuperClase gerente = new EmpleadosSuperClase();
    private  String dato;
    public GerenteFormulario() {
        initComponents();
        datosPerfil();
    }

     public void datosPerfil(){
        Login dato = new Login();
        String usuario = dato.usser;
       System.err.println(dato.usser);
    gerente = UsuariosServicio.BuscarUsuario(usuario);
    
    if (gerente != null) {
        lbNombre.setText("Empleado: " + gerente.getNombre() + " " + gerente.getApellido());
        lbrol.setText("Rol: " + gerente.getRol());
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        lbFechaNa.setText("Fecha Nacimiento:"+formatoFecha.format(gerente.getFechaNacimiento()));
        
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.setTime(gerente.getFechaNacimiento());
        int anioNacimiento = fechaNacimiento.get(Calendar.YEAR);
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        int edad = anioActual - anioNacimiento;
        lbEdad.setText("Edad:"+String.valueOf(edad));
        lbHorario.setText("15:00-22:00");
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
<<<<<<< Updated upstream
        lbNombre = new javax.swing.JLabel();
        lbFechaNa = new javax.swing.JLabel();
        lbEdad = new javax.swing.JLabel();
        lbrol = new javax.swing.JLabel();
        lbHorario = new javax.swing.JLabel();
=======
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
>>>>>>> Stashed changes
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
<<<<<<< Updated upstream
        jMenu5 = new javax.swing.JMenu();
        btnIngesoIngredientes = new javax.swing.JMenuItem();
=======
>>>>>>> Stashed changes
        jMenu4 = new javax.swing.JMenu();
        mnCerrarSecion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel7.setFont(new java.awt.Font("Swis721 Blk BT", 2, 36)); // NOI18N
        jLabel7.setText("BIENVENIDO A CAFE MANDANGO");

<<<<<<< Updated upstream
        lbNombre.setText("jLabel1");

        lbFechaNa.setText("jLabel2");

        lbEdad.setText("jLabel3");

        lbrol.setText("jLabel4");

        lbHorario.setText("jLabel5");
=======
        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");
>>>>>>> Stashed changes

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fotoGerente (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(74, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
<<<<<<< Updated upstream
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbrol, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(lbFechaNa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
=======
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
>>>>>>> Stashed changes
                        .addComponent(jLabel6)
                        .addGap(105, 105, 105))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel7)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
<<<<<<< Updated upstream
                        .addComponent(lbNombre)
                        .addGap(38, 38, 38)
                        .addComponent(lbFechaNa)
                        .addGap(41, 41, 41)
                        .addComponent(lbEdad)
                        .addGap(39, 39, 39)
                        .addComponent(lbrol)
                        .addGap(48, 48, 48)
                        .addComponent(lbHorario))
=======
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel5))
>>>>>>> Stashed changes
                    .addComponent(jLabel6))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jMenu1.setText("Productos");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cambiar Contraseña");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Gestionar Empleados");
        jMenuBar1.add(jMenu3);

<<<<<<< Updated upstream
        jMenu5.setText("Finanzas");

        btnIngesoIngredientes.setText("Ingresar Ingredientes");
        btnIngesoIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngesoIngredientesActionPerformed(evt);
            }
        });
        jMenu5.add(btnIngesoIngredientes);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Salir");

        mnCerrarSecion.setText("Cerrar Seción");
        mnCerrarSecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCerrarSecionActionPerformed(evt);
            }
        });
=======
        jMenu4.setText("Salir");

        mnCerrarSecion.setText("Cerrar Seción");
        mnCerrarSecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCerrarSecionActionPerformed(evt);
            }
        });
>>>>>>> Stashed changes
        jMenu4.add(mnCerrarSecion);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnCerrarSecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCerrarSecionActionPerformed
        Login login = new Login();
        login.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnCerrarSecionActionPerformed

<<<<<<< Updated upstream
    private void btnIngesoIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngesoIngredientesActionPerformed
         IngresoDeMateriaPrima ingredientes = new IngresoDeMateriaPrima();
        ingredientes.setVisible(true);
        
    }//GEN-LAST:event_btnIngesoIngredientesActionPerformed

=======
>>>>>>> Stashed changes
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
//            java.util.logging.Logger.getLogger(GerenteFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GerenteFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GerenteFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GerenteFormulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GerenteFormulario().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< Updated upstream
    private javax.swing.JMenuItem btnIngesoIngredientes;
=======
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
>>>>>>> Stashed changes
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
<<<<<<< Updated upstream
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbEdad;
    private javax.swing.JLabel lbFechaNa;
    private javax.swing.JLabel lbHorario;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbrol;
=======
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
>>>>>>> Stashed changes
    private javax.swing.JMenuItem mnCerrarSecion;
    // End of variables declaration//GEN-END:variables
}
