/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mandango.vista;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import mandango.modelo.Empleados;
import mandango.modelo.EmpleadosSuperClase;
import mandango.modelo.GananciasyGastosDiarios;
import mandango.modelo.ProductosCafeteria;
import mandango.servicio.GastosyGananciasServicio;
import mandango.servicio.UsuariosServicio;

/**
 *
 * @author DELL
 */
public class GerenteFormulario extends javax.swing.JFrame {

    EmpleadosSuperClase gerente = new EmpleadosSuperClase();
    List<GananciasyGastosDiarios> listaregistro;
    private  String dato;
    public GerenteFormulario() {
        initComponents();
        datosPerfil();
        listaregistro = GastosyGananciasServicio.ListaGanaciasDiarias();
        this.setLocationRelativeTo(null);
                
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

        jPanel1 = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        lbFechaNa = new javax.swing.JLabel();
        lbEdad = new javax.swing.JLabel();
        lbrol = new javax.swing.JLabel();
        lbHorario = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnMoPlatillos = new javax.swing.JMenuItem();
        btnInPlatillos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btncambiapas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btnListaEmpleado = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        btnMostarEgresos = new javax.swing.JMenuItem();
        btnIngresarIngredientes = new javax.swing.JMenuItem();
        btnIngresos = new javax.swing.JMenuItem();
        btnRegistroDiario = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnCerrarSecion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbNombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbNombre.setForeground(new java.awt.Color(255, 204, 51));
        lbNombre.setText("jLabel1");
        jPanel1.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 430, -1));

        lbFechaNa.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbFechaNa.setForeground(new java.awt.Color(255, 204, 51));
        lbFechaNa.setText("jLabel2");
        jPanel1.add(lbFechaNa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 450, -1));

        lbEdad.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbEdad.setForeground(new java.awt.Color(255, 204, 51));
        lbEdad.setText("jLabel3");
        jPanel1.add(lbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 440, -1));

        lbrol.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbrol.setForeground(new java.awt.Color(255, 204, 51));
        lbrol.setText("jLabel4");
        jPanel1.add(lbrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 440, -1));

        lbHorario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbHorario.setForeground(new java.awt.Color(255, 204, 51));
        lbHorario.setText("jLabel5");
        jPanel1.add(lbHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 440, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/FondoGerente.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("Productos");

        btnMoPlatillos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/imagen_2024-03-10_200823857.png"))); // NOI18N
        btnMoPlatillos.setText("Mostrar platillos");
        btnMoPlatillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoPlatillosActionPerformed(evt);
            }
        });
        jMenu1.add(btnMoPlatillos);

        btnInPlatillos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/imagen_2024-03-10_200758025.png"))); // NOI18N
        btnInPlatillos.setText("Ingresar platillos");
        btnInPlatillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInPlatillosActionPerformed(evt);
            }
        });
        jMenu1.add(btnInPlatillos);

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

        jMenu3.setText("Gestionar Empleados");

        btnListaEmpleado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnListaEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/imagen_2024-03-10_195922353.png"))); // NOI18N
        btnListaEmpleado.setText("Lista de Empleados");
        btnListaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaEmpleadoActionPerformed(evt);
            }
        });
        jMenu3.add(btnListaEmpleado);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Finanzas");

        btnMostarEgresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/imagen_2024-03-10_200245173.png"))); // NOI18N
        btnMostarEgresos.setText("Mostrar Egresos");
        btnMostarEgresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostarEgresosActionPerformed(evt);
            }
        });
        jMenu5.add(btnMostarEgresos);

        btnIngresarIngredientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/imagen_2024-03-10_200615442.png"))); // NOI18N
        btnIngresarIngredientes.setText("Ingresar Ingredientes");
        btnIngresarIngredientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarIngredientesActionPerformed(evt);
            }
        });
        jMenu5.add(btnIngresarIngredientes);

        btnIngresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/imagen_2024-03-10_200412133.png"))); // NOI18N
        btnIngresos.setText("Mostrar Ingresos");
        btnIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresosActionPerformed(evt);
            }
        });
        jMenu5.add(btnIngresos);

        btnRegistroDiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/imagen_2024-03-10_201322453.png"))); // NOI18N
        btnRegistroDiario.setText("Registro Diario");
        btnRegistroDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroDiarioActionPerformed(evt);
            }
        });
        jMenu5.add(btnRegistroDiario);

        jMenuBar1.add(jMenu5);

        jMenu4.setText("Salir");

        mnCerrarSecion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/imagen_2024-03-10_200334793.png"))); // NOI18N
        mnCerrarSecion.setText("Cerrar Sesión");
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
          if(ValidarExistencia()){
         IngresoDeMateriaPrima ingredientes = new IngresoDeMateriaPrima();
        ingredientes.setVisible(true);
        }
        
    }//GEN-LAST:event_btnIngresarIngredientesActionPerformed

    private void btnIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresosActionPerformed
       MostrarIngresos ingresos = new MostrarIngresos();
       ingresos.setVisible(true);
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

    private void btnRegistroDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroDiarioActionPerformed
        if(ValidarExistencia()){
         GastosYGanaciasD registro = new GastosYGanaciasD();
        registro.setVisible(true);
        setVisible(false);
        }
        
    }//GEN-LAST:event_btnRegistroDiarioActionPerformed

    private void btnInPlatillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInPlatillosActionPerformed
        IngresoDePlatillos platillos = new IngresoDePlatillos();
        platillos.setVisible(true);
    }//GEN-LAST:event_btnInPlatillosActionPerformed

    private void btnMoPlatillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoPlatillosActionPerformed
       MostarPlatillos platillos = new MostarPlatillos();
        platillos.setVisible(true);
    }//GEN-LAST:event_btnMoPlatillosActionPerformed

    private void btnListaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaEmpleadoActionPerformed
        ListaEmpleados newframe = new ListaEmpleados();
        newframe.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnListaEmpleadoActionPerformed

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
    private javax.swing.JMenuItem btnInPlatillos;
    private javax.swing.JMenuItem btnIngresarIngredientes;
    private javax.swing.JMenuItem btnIngresos;
    private javax.swing.JMenuItem btnListaEmpleado;
    private javax.swing.JMenuItem btnMoPlatillos;
    private javax.swing.JMenuItem btnMostarEgresos;
    private javax.swing.JMenuItem btnRegistroDiario;
    private javax.swing.JMenuItem btncambiapas;
    private javax.swing.JLabel jLabel6;
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
