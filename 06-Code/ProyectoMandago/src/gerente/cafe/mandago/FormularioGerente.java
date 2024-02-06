/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gerente.cafe.mandago;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import conexion.ConexionBD;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author DELL
 */
public class FormularioGerente extends javax.swing.JFrame {

    /**
     * Creates new form FormularioGerente
     */
    ConexionBD conn= new ConexionBD();
    MongoDatabase database;
    //DB db;
    Date fecha = new Date();
    int filaSeleccionada;
    
    public FormularioGerente() {
        if(conn != null){
            conn=conn.crearConexion();
            database=conn.getDataB();
        }
        
        initComponents();
        
        txtId.setEnabled(false);
        mostrarDatosTabla();
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
    }
    
    
    public void limpiar(){
        txtId.setText("");
        txtCedula.setText("");
        txtEmpleado.setText("");
        txtContraseña.setText("");
        txtEdad.setText("");
        txtSalario.setText("");
        calFNacimiento.setDate(null);
        cmbSexo.setSelectedIndex(0);
        cmbRol.setSelectedIndex(0);
    }
    
   public void mostrarDatosTabla(){
        DefaultTableModel modeloTabla=  (DefaultTableModel) tblDatos.getModel();
        modeloTabla.setRowCount(0);
        
        MongoCollection<Document> collection = database.getCollection("empleados");
        FindIterable<Document> documents = collection.find();
        
        for(Document document : documents){
            Object id=document.get("_id");
            String cedula=document.getString("cedula");
            String empleado=document.getString("empleado");
            fecha = document.getDate("FechaNacimiento");
            SimpleDateFormat fechaNac = new SimpleDateFormat("yyyy/MM/dd");
            SimpleDateFormat formato = new SimpleDateFormat("yyyy");
            String fechaAnio = formato.format(fecha);
            int anioNac = Integer.parseInt(fechaAnio), edad;
            int anioActual = Calendar.getInstance().get(Calendar.YEAR);
            edad = (anioActual - anioNac);
            String contraseña=document.getString("contraseña");
            String genero=document.getString("sexo");
            String rol = document.getString("rol");
            String salario = document.getString("salario");

            modeloTabla.addRow(new Object[]{id,cedula,empleado,contraseña,edad,genero,fechaNac.format(fecha),rol,salario});
        }
        TableColumnModel columnModel = tblDatos.getColumnModel();
        TableColumn columna= columnModel.getColumn(0);
        columna.setMinWidth(0);
        columna.setMaxWidth(0);
    }
   
   private void mostrarDatosCampos(){
       filaSeleccionada = tblDatos.getSelectedRow();
        if (filaSeleccionada == -1){
            return;
        }
        DefaultTableModel modelTabla = (DefaultTableModel) tblDatos.getModel();
        txtId.setText(modelTabla.getValueAt(filaSeleccionada,0).toString());
        txtCedula.setText(modelTabla.getValueAt(filaSeleccionada,1).toString());
        txtEmpleado.setText(modelTabla.getValueAt(filaSeleccionada,2).toString());
        txtContraseña.setText(modelTabla.getValueAt(filaSeleccionada,3).toString());
        txtEdad.setText(modelTabla.getValueAt(filaSeleccionada,4).toString());
        cmbSexo.setSelectedItem(modelTabla.getValueAt(filaSeleccionada, 5).toString());
        String fechaString = modelTabla.getValueAt(filaSeleccionada, 6).toString();
        Date fechaNac = new Date();
        SimpleDateFormat fechaComp = new SimpleDateFormat("yyyy/MM/dd");
        fechaNac = fechaComp.parse(fechaString, new ParsePosition(0));
        calFNacimiento.setDate(fechaNac);
        cmbRol.setSelectedItem(modelTabla.getValueAt(filaSeleccionada, 7).toString());
        txtSalario.setText(modelTabla.getValueAt(filaSeleccionada,8).toString());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        bgDiscapacidad = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        calFNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        cmbRol = new javax.swing.JComboBox<>();
        cmbSexo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Formulario para Registro");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 6, -1, -1));

        jLabel3.setText("Empleado:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 84, -1, -1));

        txtEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmpleadoKeyPressed(evt);
            }
        });
        getContentPane().add(txtEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 79, 391, -1));

        jLabel1.setText("Contraseña:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 128, 70, -1));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 123, 391, -1));

        btnGuardar.setBackground(new java.awt.Color(153, 255, 153));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 105, 125, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 150, 125, -1));

        btnActualizar.setBackground(new java.awt.Color(102, 102, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 195, 125, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 153, 153), java.awt.Color.red));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Cedula", "Nombre", "Contraseña", "Edad", "Sexo", "F. Nacimiento", "Rol", "Sueldo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatos.setToolTipText("");
        tblDatos.setSelectionBackground(new java.awt.Color(255, 102, 102));
        tblDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 334, 628, 200));

        jLabel5.setText("Fecha de Nacimiento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 176, -1, -1));

        calFNacimiento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                calFNacimientoPropertyChange(evt);
            }
        });
        getContentPane().add(calFNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 176, 141, -1));

        jLabel6.setText("Edad:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 181, 37, -1));

        txtEdad.setEditable(false);
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 176, 142, -1));

        jLabel7.setText("Salario:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 225, -1, -1));

        txtSalario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSalarioFocusLost(evt);
            }
        });
        txtSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSalarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 220, 156, -1));

        jLabel8.setText("Cedula:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 40, 57, -1));

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
        });
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 35, 328, -1));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 278, 628, -1));

        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el rol...", "Mesero", "Cajero", "Cocinero" }));
        getContentPane().add(cmbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 220, 151, -1));

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar el sexo...", "Masculino", "Femenino" }));
        getContentPane().add(cmbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 35, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Logo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 200, 210));

        jMenu1.setText("Productos ");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Economia ");

        jMenuItem3.setText("Ingresos Diarios");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Gastos Diarios");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calFNacimientoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_calFNacimientoPropertyChange
        if ("date".equals(evt.getPropertyName()) && calFNacimiento.getDate() != null) {
            int año = calFNacimiento.getCalendar().get(Calendar.YEAR);
            Date dato = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy");
            String fechaSistema = formato.format(dato);
            int anio = Integer.parseInt(fechaSistema), resta;
            resta = (anio - año);
            String edad = Integer.toString(resta);
            txtEdad.setText(edad);
        }
    }//GEN-LAST:event_calFNacimientoPropertyChange

    private void tblDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMouseClicked
        mostrarDatosCampos();
        btnGuardar.setVisible(false);
    }//GEN-LAST:event_tblDatosMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
  
        if (txtEmpleado.getText().isEmpty() || txtCedula.getText().isEmpty() || txtContraseña.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay datos a ingresar. Complete los campos.");
        } else if (cmbRol.getSelectedItem().equals("Seleccione el rol...")) {
            JOptionPane.showMessageDialog(null, "Ingrese el rol del trabajador.");
        }else if (txtCedula.getText().length() > 10||txtCedula.getText().length() < 10) {
            JOptionPane.showMessageDialog(null, "Verificar numeros de cedula.");
        } else if (cmbSexo.getSelectedItem().equals("Seleccionar el sexo...")) {
            JOptionPane.showMessageDialog(null, "Ingrese el sexo del empleado.");
        } else {
            try {
                int edad = Integer.parseInt(txtEdad.getText());
                if (edad < 18) {
                    JOptionPane.showMessageDialog(null, "La edad debe ser mayor a 18");
                } else {
                    
                    Document documento = new Document("empleado", txtEmpleado.getText())
                            .append("cedula", txtCedula.getText())
                            .append("contraseña", txtContraseña.getText())
                            .append("FechaNacimiento", calFNacimiento.getDate())
                            .append("sexo", cmbSexo.getSelectedItem())
                            .append("rol", cmbRol.getSelectedItem())
                            .append("salario", txtSalario.getText());

                    MongoCollection<Document> coleccion = database.getCollection("empleados");
                    coleccion.insertOne(documento);

                   
                    mostrarDatosTabla();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese una edad válida o un salario válido");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyPressed
       char teclaPresionada = evt.getKeyChar();
        if (Character.isLetter(teclaPresionada)) {
                JOptionPane.showMessageDialog(null, "No se permiten letras", "Advertencia", JOptionPane.WARNING_MESSAGE);
                String textoActual = txtCedula.getText();
            if (textoActual.length() > 0) {
                String nuevoTexto = textoActual.substring(0, textoActual.length() - 1);
                txtCedula.setText(nuevoTexto);
            }
        }
    }//GEN-LAST:event_txtCedulaKeyPressed

    private void txtEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpleadoKeyPressed
        char teclaPresionada = evt.getKeyChar();
        String textoActual = txtEmpleado.getText();

        if (Character.isDigit(teclaPresionada)) {
            JOptionPane.showMessageDialog(null, "No se permiten números en el Nombre", "Advertencia", JOptionPane.WARNING_MESSAGE);

            if (textoActual.length() > 0) {
                String nuevoTexto = textoActual.substring(0, textoActual.length() - 1);
                txtEmpleado.setText(nuevoTexto);
            }
        } else {
            if (!textoActual.isEmpty()) {
                String primeraLetra = textoActual.substring(0, 1).toUpperCase();
                String restoDelTexto = textoActual.substring(1);
                txtEmpleado.setText(primeraLetra + restoDelTexto);
            }
        }
    }//GEN-LAST:event_txtEmpleadoKeyPressed

    private void txtSalarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalarioKeyPressed
        char teclaPresionada = evt.getKeyChar();
        if (Character.isLetter(teclaPresionada)) {
                JOptionPane.showMessageDialog(null, "No se permiten letras", "Advertencia", JOptionPane.WARNING_MESSAGE);
                String textoActual = txtSalario.getText();
            if (textoActual.length() > 0) {
                String nuevoTexto = textoActual.substring(0, textoActual.length() - 1);
                txtSalario.setText(nuevoTexto);
            }
        }
    }//GEN-LAST:event_txtSalarioKeyPressed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtEmpleado.getText().isEmpty() || txtCedula.getText().isEmpty() || txtContraseña.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay datos a ingresar. Complete los campos.");
                } else if (cmbRol.getSelectedItem().equals("Seleccione el rol...")) {
                    JOptionPane.showMessageDialog(null, "Ingrese el rol del trabajador.");
                }else if (txtCedula.getText().length() > 10||txtCedula.getText().length() < 10) {
                    JOptionPane.showMessageDialog(null, "Verificar numeros de cedula.");
                }else if (cmbSexo.getSelectedItem().equals("Seleccionar el sexo...")) {
                    JOptionPane.showMessageDialog(null, "Ingrese el sexo del empleado.");
                } else {
                    try {
                        int edad = Integer.parseInt(txtEdad.getText());
                        if (edad < 18) {
                            JOptionPane.showMessageDialog(null, "La edad debe ser mayor a 18");
                        } else {
                            
                             if (filaSeleccionada >= 0) {
                                int confirmacion = JOptionPane.showConfirmDialog(null, "¿Seguro deseas actualizar?", "Confirmacion", JOptionPane.YES_NO_OPTION);
                                if (confirmacion == JOptionPane.YES_OPTION) {              
                                    DefaultTableModel modeloTabla = (DefaultTableModel) tblDatos.getModel();
                                    MongoCollection coleccion = database.getCollection("empleados");
                                    Document filtro = new Document("_id", new ObjectId(txtId.getText()));
                                    Document documento;
                                    documento = new Document("$set",new Document()
                                            .append("empleado",txtEmpleado.getText())
                                            .append("cedula", txtCedula.getText())
                                            .append("contraseña", txtContraseña.getText())
                                            .append("FechaNacimiento", calFNacimiento.getDate())
                                            .append("sexo",cmbSexo.getSelectedItem())
                                            .append("rol",cmbRol.getSelectedItem())
                                            .append("salario", txtSalario.getText()));
                                    
                                    UpdateResult result = coleccion.updateOne(filtro,documento);
                                    mostrarDatosTabla();
                                    if (result.getModifiedCount() > 0) {
                                        
                                        JOptionPane.showMessageDialog(null, "El empleado se actualizo correctamente.");                    
                           
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encontró el registro para actualizar.");
                                    }
                                } else {
                    
                                    ListSelectionModel seleccionModel = tblDatos.getSelectionModel();
                                    seleccionModel.clearSelection();
                                    filaSeleccionada = -1;
                                }
                                limpiar();
                                btnGuardar.setVisible(true);
                            } else {
                                JOptionPane.showMessageDialog(null, "Seleccione el registro a actualizar");
                            }
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Ingrese una edad válida o un salario válido");
                    }
                }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (filaSeleccionada >= 0) {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Seguro deseas eliminar?", "Confirmacion", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {

                DefaultTableModel modeloTabla = (DefaultTableModel) tblDatos.getModel();
                MongoCollection coleccion = database.getCollection("empleados");
                Document filtro = new Document("_id", new ObjectId(txtId.getText()));
                DeleteResult result = coleccion.deleteOne(filtro);

                if (result.getDeletedCount() > 0) {
                    
                    JOptionPane.showMessageDialog(null, "El registro eliminado correctamente");                    
                    modeloTabla.removeRow(filaSeleccionada);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el registro para eliminar");
                }
            } else {

                ListSelectionModel seleccionModel = tblDatos.getSelectionModel();
                seleccionModel.clearSelection();
                filaSeleccionada = -1;
            }
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione el registro a eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtSalarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSalarioFocusLost
        String salario=txtSalario.getText().trim();
        if (salario.isEmpty() || !salario.matches("^[0-9]{3,4}+.[0-9]{0,2}$")) {
            JOptionPane.showMessageDialog(this, "Verificar el salario", "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtSalario.requestFocus();
        }
    }//GEN-LAST:event_txtSalarioFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgDiscapacidad;
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private com.toedter.calendar.JDateChooser calFNacimiento;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
