/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mandango.vista;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mandango.modelo.GananciasyGastosDiarios;
import mandango.modelo.MateriaPrima;
import mandango.servicio.GastosyGananciasServicio;
import mandango.servicio.MateriaPrimaServicio;

/**
 *
 * @author Usuario
 */
public class MostraEgresos extends javax.swing.JFrame {

    private DefaultTableModel dtm;
    List<MateriaPrima> tabladatosMateriaprima=null;
      List<GananciasyGastosDiarios> listaregistro;
    double precio;
    static double totalE;
    public MostraEgresos() {
        initComponents();
        tabladatosMateriaprima = MateriaPrimaServicio.ListarMateriaPrima();
        listaregistro = GastosyGananciasServicio.ListaGanaciasDiarias();
        MostrarDatos();
        Total();
        limpiarTabla();
        this.setLocationRelativeTo(null);
        
    }
  public void MostrarDatos(){
        dtm = (DefaultTableModel)tblDatos.getModel();
        dtm.setRowCount(0);
        
        for (MateriaPrima buscar :tabladatosMateriaprima){
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            Date day = new Date();
           String date = formatoFecha.format(buscar.getFgastos());
           String dates = formatoFecha.format(day);
           if(date.equals(dates)){
                String nombre = buscar.getNombreMateriPrima();
             int cantidad = buscar.getCantidad();
              double precio = buscar.getPrecio();
              double preciot = cantidad*precio;
              String preciot_s = String.format("%.2f", preciot);
            dtm.addRow(new Object []{nombre,cantidad,precio,preciot_s});
             
        }
            
        }
    }
   public void Total (){
       totalE=0;
     for (MateriaPrima buscar :tabladatosMateriaprima){
             SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            Date day = new Date();
           String date = formatoFecha.format(buscar.getFgastos());
           String dates = formatoFecha.format(day);
           if(date.equals(dates)){
               String nombre = buscar.getNombreMateriPrima();
             int cantidad = buscar.getCantidad();
              double precio = buscar.getPrecio();
              double preciot = cantidad*precio;
              totalE = totalE + preciot;
        }
        
     }
         
          lbtotal.setText( String.format("%.2f", totalE));
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
            existencia=false;
            break;
        }
           
       }        
               
          return existencia;
      }  
   public void limpiarTabla(){
      if(ValidarExistencia()){
      dtm =(DefaultTableModel)tblDatos.getModel();
      dtm.setRowCount(0);
      }
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbtotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbtotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(lbtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 61, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Gastos Diarios:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio Unitario", "Precio Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 229));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Las pólizas de Ingresos, Egresos y Diario en contabilidad.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        tabladatosMateriaprima = MateriaPrimaServicio.ListarMateriaPrima();
        MostrarDatos();
        Total();
    }//GEN-LAST:event_formWindowGainedFocus

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
//            java.util.logging.Logger.getLogger(MostraEgresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MostraEgresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MostraEgresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MostraEgresos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MostraEgresos().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbtotal;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
}
