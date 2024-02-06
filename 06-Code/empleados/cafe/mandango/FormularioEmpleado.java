/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package empleados.cafe.mandango;

import cafeteria.cafe.mandago.Conexion;
import cafeteria.cafe.mandago.Cafeteria_Menu;
import com.mongodb.DB;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.awt.Color;

import org.bson.Document;

public class FormularioEmpleado extends javax.swing.JFrame {

    Conexion conn = new Conexion();
    MongoDatabase database;
    DB db;
    private String dato;
    
    public FormularioEmpleado() {
         if (conn != null) {
            conn = conn.crearConexion();
            database = conn.getDataB();

        }
        initComponents();
        
panel_de_Cafeteria.setBackground(Color.BLUE);
    }
    
public void setDato(String dato) {
         
        MongoCollection<Document> collection= database.getCollection("Empleados");
        FindIterable<Document> documents = collection.find();
        this.dato=dato;
        for (Document document :documents){
          String cedula= document.getString("Cedula");
            String nombre= document.getString("Nombre");
            String Fecha = document.getString("FechaNacimiento");
            String Rol= document.getString("Rol");
            String Horario = document.getString("Horario");
            if(dato.equals(cedula)){
                
                lbnombre.setText("Nombre:"+nombre);
                lbfechana.setText("Fecha De Nacimiento: "+Fecha);
                lbrol.setText("Rol: "+Rol);
                lbhorario.setText("Horario: "+Horario);
            }
           
    
        }
    
    
        
        
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_de_Cafeteria = new javax.swing.JDesktopPane();
        lbnombre = new javax.swing.JLabel();
        lbfechana = new javax.swing.JLabel();
        lbrol = new javax.swing.JLabel();
        lbhorario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_de_Cafeteria.setBackground(new java.awt.Color(102, 0, 0));
        panel_de_Cafeteria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_de_Cafeteria.setForeground(new java.awt.Color(102, 0, 0));
        panel_de_Cafeteria.setToolTipText("");

        lbnombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbnombre.setForeground(new java.awt.Color(255, 255, 255));
        lbnombre.setText("jLabel1");

        lbfechana.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbfechana.setForeground(new java.awt.Color(255, 255, 255));
        lbfechana.setText("jLabel2");

        lbrol.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbrol.setForeground(new java.awt.Color(255, 255, 255));
        lbrol.setText("jLabel3");

        lbhorario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbhorario.setForeground(new java.awt.Color(255, 255, 255));
        lbhorario.setText("jLabel4");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/imagen_2024-02-05_185807055 (1).png"))); // NOI18N

        panel_de_Cafeteria.setLayer(lbnombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_de_Cafeteria.setLayer(lbfechana, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_de_Cafeteria.setLayer(lbrol, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_de_Cafeteria.setLayer(lbhorario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_de_Cafeteria.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panel_de_CafeteriaLayout = new javax.swing.GroupLayout(panel_de_Cafeteria);
        panel_de_Cafeteria.setLayout(panel_de_CafeteriaLayout);
        panel_de_CafeteriaLayout.setHorizontalGroup(
            panel_de_CafeteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_de_CafeteriaLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(panel_de_CafeteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbhorario)
                    .addComponent(lbrol)
                    .addComponent(lbnombre)
                    .addComponent(lbfechana))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(108, 108, 108))
        );
        panel_de_CafeteriaLayout.setVerticalGroup(
            panel_de_CafeteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_de_CafeteriaLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lbnombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbfechana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbrol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbhorario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_de_CafeteriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("Cafeteria");

        jMenuItem1.setText("Ingreso al Sistema");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cambiar Contaseña");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_de_Cafeteria)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_de_Cafeteria)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
       Cafeteria_Menu registro = new Cafeteria_Menu();
       panel_de_Cafeteria.add(registro);
       registro.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lbfechana;
    private javax.swing.JLabel lbhorario;
    private javax.swing.JLabel lbnombre;
    private javax.swing.JLabel lbrol;
    private javax.swing.JDesktopPane panel_de_Cafeteria;
    // End of variables declaration//GEN-END:variables
}
