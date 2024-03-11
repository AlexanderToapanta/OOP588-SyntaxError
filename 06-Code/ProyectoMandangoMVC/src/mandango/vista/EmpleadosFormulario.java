/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mandango.vista;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import mandango.modelo.Empleados;
import mandango.modelo.EmpleadosSuperClase;
import mandango.modelo.GananciasyGastosDiarios;
import mandango.modelo.Usuarios;
import mandango.servicio.GastosyGananciasServicio;
import mandango.servicio.UsuariosServicio;

/**
 *
 * @author DELL
 */
public class EmpleadosFormulario extends javax.swing.JFrame {


    EmpleadosSuperClase empleado = new EmpleadosSuperClase();
    List<GananciasyGastosDiarios> listaregistro;

    private  String dato;
    public EmpleadosFormulario() {
        initComponents();
        datosPerfil();
        this.setLocationRelativeTo(null);
        listaregistro = GastosyGananciasServicio.ListaGanaciasDiarias();
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
     private boolean ValidarExistencia(){
          boolean existencia = true;
           SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            Date day = new Date();
            for (GananciasyGastosDiarios buscar:listaregistro){
           String date = formatoFecha.format(buscar.getDia());
           String dates = formatoFecha.format(day);
                System.out.println(date);
                System.out.println(dates);
           if(date.equals(dates)){
               JOptionPane.showMessageDialog(null, "Ya se cerro caja del dia: " +dates);
            existencia=false;
            break;
        }
           
       }        
               
          return existencia;
      }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel7 = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        lbEdad = new javax.swing.JLabel();
        lbrol = new javax.swing.JLabel();
        lbHorario = new javax.swing.JLabel();
        lbFechaNa = new javax.swing.JLabel();
        lbHorario13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnCafeteria = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btncambiapas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnCerrarSecion = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(153, 0, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(255, 255, 255));
        lbNombre.setText("jLabel1");
        jPanel7.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 228, -1));

        lbEdad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbEdad.setForeground(new java.awt.Color(255, 255, 255));
        lbEdad.setText("jLabel2");
        jPanel7.add(lbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 196, -1));

        lbrol.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbrol.setForeground(new java.awt.Color(255, 255, 255));
        lbrol.setText("jLabel3");
        jPanel7.add(lbrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 196, -1));

        lbHorario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbHorario.setForeground(new java.awt.Color(255, 255, 255));
        lbHorario.setText("jLabel4");
        jPanel7.add(lbHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 196, -1));

        lbFechaNa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbFechaNa.setForeground(new java.awt.Color(255, 255, 255));
        lbFechaNa.setText("jLabel4");
        jPanel7.add(lbFechaNa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 196, -1));

        lbHorario13.setFont(new java.awt.Font("Swis721 LtEx BT", 1, 14)); // NOI18N
        lbHorario13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/FondoEmpleado.png"))); // NOI18N
        lbHorario13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.add(lbHorario13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 630));

        jMenu1.setText("Cafeteria");

        btnCafeteria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/imagen_2024-03-10_201535903.png"))); // NOI18N
        btnCafeteria.setText("Ingreso a la cafeteria");
        btnCafeteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCafeteriaActionPerformed(evt);
            }
        });
        jMenu1.add(btnCafeteria);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cambiar Contraseña");

        btncambiapas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/imagen_2024-03-10_201248464.png"))); // NOI18N
        btncambiapas.setText("Cambiar");
        btncambiapas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncambiapasActionPerformed(evt);
            }
        });
        jMenu2.add(btncambiapas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Salir");

        mnCerrarSecion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/imagen_2024-03-10_200334793.png"))); // NOI18N
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

    private void btncambiapasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncambiapasActionPerformed
        CambiarContrasenia cambiar = new CambiarContrasenia();
        cambiar.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btncambiapasActionPerformed

    private void btnCafeteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCafeteriaActionPerformed
         if(ValidarExistencia()){
         Cafeteria cafeteria = new Cafeteria();
        cafeteria.setVisible(true);
        
        }
    }//GEN-LAST:event_btnCafeteriaActionPerformed

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
    private javax.swing.JMenuItem btnCafeteria;
    private javax.swing.JMenuItem btncambiapas;
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
