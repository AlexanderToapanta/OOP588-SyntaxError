/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mandango.vista;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import mandango.modelo.Empleados;
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
        lbHorario.setText("Horario: 15:00-22:00");
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbFechaNa = new javax.swing.JLabel();
        lbEdad = new javax.swing.JLabel();
        lbrol = new javax.swing.JLabel();
        lbHorario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnIngresarProductos = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btncambiapas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        btnMostarEgresos = new javax.swing.JMenuItem();
        btnIngresarIngredientes = new javax.swing.JMenuItem();
        btnIngresos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnCerrarSecion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel7.setFont(new java.awt.Font("Swis721 Blk BT", 2, 36)); // NOI18N
        jLabel7.setText("BIENVENIDO A CAFE MANDANGO");

        lbNombre.setText("jLabel1");

        lbFechaNa.setText("jLabel2");

        lbEdad.setText("jLabel3");

        lbrol.setText("jLabel4");

        lbHorario.setText("jLabel5");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/fotoGerente.png"))); // NOI18N

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(lbFechaNa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbHorario, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(lbrol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
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
                        .addComponent(lbNombre)
                        .addGap(38, 38, 38)
                        .addComponent(lbFechaNa)
                        .addGap(41, 41, 41)
                        .addComponent(lbEdad)
                        .addGap(39, 39, 39)
                        .addComponent(lbrol)
                        .addGap(48, 48, 48)
                        .addComponent(lbHorario))
                    .addComponent(jLabel6))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jMenu1.setText("Productos");

        btnIngresarProductos.setSelected(true);
        btnIngresarProductos.setText("Ingresar Platillos");
        btnIngresarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarProductosActionPerformed(evt);
            }
        });
        jMenu1.add(btnIngresarProductos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cambiar Contraseña");

        btncambiapas.setText("Cambiar");
        btncambiapas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncambiapasActionPerformed(evt);
            }
        });
        jMenu2.add(btncambiapas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Gestionar Empleados");
        jMenuBar1.add(jMenu3);

        jMenu5.setText("Finanzas");

        btnMostarEgresos.setText("Mostrar Egresos");
        btnMostarEgresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostarEgresosActionPerformed(evt);
            }
        });
        jMenu5.add(btnMostarEgresos);

        btnIngresarIngredientes.setText("Ingresar Ingredientes");
        btnIngresarIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarIngredientesActionPerformed(evt);
            }
        });
        jMenu5.add(btnIngresarIngredientes);

        btnIngresos.setText("Mostrar Ingresos");
        btnIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresosActionPerformed(evt);
            }
        });
        jMenu5.add(btnIngresos);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Salir");

        mnCerrarSecion.setText("Cerrar Seción");
        mnCerrarSecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCerrarSecionActionPerformed(evt);
            }
        });
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

    private void btnIngresarIngredientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarIngredientesActionPerformed
         IngresoDeMateriaPrima ingredientes = new IngresoDeMateriaPrima();
        ingredientes.setVisible(true);
        
    }//GEN-LAST:event_btnIngresarIngredientesActionPerformed

    private void btnIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresosActionPerformed

    private void btnMostarEgresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostarEgresosActionPerformed
        MostraEgresos egresos = new MostraEgresos();
        egresos.setVisible(true);
    }//GEN-LAST:event_btnMostarEgresosActionPerformed

    private void btncambiapasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncambiapasActionPerformed
      CambiarContrasenia cambiar = new CambiarContrasenia();
        cambiar.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btncambiapasActionPerformed

    private void btnIngresarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarProductosActionPerformed
      IngresoDePlatillos platillos = new IngresoDePlatillos();
        platillos.setVisible(true);
        
    }//GEN-LAST:event_btnIngresarProductosActionPerformed

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
    private javax.swing.JMenuItem btnIngresarIngredientes;
    private javax.swing.JCheckBoxMenuItem btnIngresarProductos;
    private javax.swing.JMenuItem btnIngresos;
    private javax.swing.JMenuItem btnMostarEgresos;
    private javax.swing.JMenuItem btncambiapas;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbEdad;
    private javax.swing.JLabel lbFechaNa;
    private javax.swing.JLabel lbHorario;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbrol;
    private javax.swing.JMenuItem mnCerrarSecion;
    // End of variables declaration//GEN-END:variables
}
