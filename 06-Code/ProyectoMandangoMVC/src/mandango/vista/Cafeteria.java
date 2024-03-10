/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mandango.vista;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mandango.modelo.PlatillosPedidos;
import mandango.modelo.ProductosCafeteria;
import mandango.servicio.PlatillosPedidosServicio;
import mandango.servicio.ProductoServicio;

/**
 *
 * @author Usuario
 */
public class Cafeteria extends javax.swing.JFrame {

      private DefaultTableModel dtm;
    List<ProductosCafeteria> tablaPlatillos=null;
   static double ganancias=0;
   static double precio,totalp=0;
   static int cantidad=0;
   static String platillo=null;
    public Cafeteria() {
        initComponents();
        cargarPersona();
          btnotroplatillo.setVisible(false);
    }

     public void cargarPersona(){
        
       tablaPlatillos = ProductoServicio.ListarProductos();
         cargarTablaTodasPersonas(tablaPlatillos);
        cargarComboCedula(tablaPlatillos);
        
    }

  public void cargarComboCedula(List<ProductosCafeteria> listarPersonas){
      for (ProductosCafeteria person : listarPersonas){
          cmb_Platillos.addItem(person.getNombreProducto());
      }
      
  }
  public void cargarTablaTodasPersonas (List<ProductosCafeteria> listaPersonas){
     
      for (ProductosCafeteria persona : listaPersonas){
         if(cmb_Platillos.getSelectedItem().equals(persona.getNombreProducto())){
            platillo = persona.getNombreProducto();
             cantidad = persona.getCantidad();
             precio = persona.getPrecio();
           String precio_s = String.format("%.2f", precio);
         lbPlatillo.setText(persona.getNombreProducto());
         lbcantidad.setText("El stock disponible es de: "+persona.getCantidad());
         lbprecio.setText("Precio unitario: "+precio_s);
         }
             
       
      }
  }
  private boolean validar (){
        boolean validar=false;
      int cantidad = (int) spnPedidip.getValue();
        if(cantidad>0&&!cmb_Platillos.getSelectedItem().equals("Seleccione un platillo")){
            validar=true;
        }else{
            validar = false;
        }
        if(cantidad==0){
           JOptionPane.showMessageDialog(null, "El campo de cantidad es obligatorio");
       }
      return validar;
  }
   public void Limpiar(){
        lbPlatillo.setText(" ");
        lbcantidad.setText(" ");
        spnPedidip.setValue(0);
        lbprecio.setText(" ");
        cmb_Platillos.setSelectedIndex(0);
    } 
   public void CalcularGanancia(){
        ganancias = ganancias+totalp;
   }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmb_Platillos = new javax.swing.JComboBox<>();
        lbPlatillo = new javax.swing.JLabel();
        lbcantidad = new javax.swing.JLabel();
        lbprecio = new javax.swing.JLabel();
        spnPedidip = new javax.swing.JSpinner();
        btnInsertarPedido = new javax.swing.JButton();
        lbtotalPagar = new javax.swing.JLabel();
        btnotroplatillo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setText("Cafeteria");

        cmb_Platillos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un platillo" }));
        cmb_Platillos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_PlatillosMouseClicked(evt);
            }
        });
        cmb_Platillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_PlatillosActionPerformed(evt);
            }
        });

        spnPedidip.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnPedidip.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPedidipStateChanged(evt);
            }
        });

        btnInsertarPedido.setText("Insertar Pedido");
        btnInsertarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarPedidoActionPerformed(evt);
            }
        });

        btnotroplatillo.setText("Seleccionar otro platillo");
        btnotroplatillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnotroplatilloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_Platillos, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbtotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 34, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(spnPedidip, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInsertarPedido)
                        .addGap(238, 238, 238))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnotroplatillo)
                        .addGap(210, 210, 210))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cmb_Platillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lbPlatillo)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbcantidad)
                    .addComponent(lbprecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(spnPedidip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lbtotalPagar)
                .addGap(18, 18, 18)
                .addComponent(btnInsertarPedido)
                .addGap(18, 18, 18)
                .addComponent(btnotroplatillo)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_PlatillosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_PlatillosMouseClicked
       
    }//GEN-LAST:event_cmb_PlatillosMouseClicked

    private void cmb_PlatillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_PlatillosActionPerformed
       cargarTablaTodasPersonas(tablaPlatillos);
       cmb_Platillos.setEnabled(false);
       btnotroplatillo.setVisible(true);
       
       
    }//GEN-LAST:event_cmb_PlatillosActionPerformed

    private void spnPedidipStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnPedidipStateChanged
      if(cantidad<1){
          JOptionPane.showMessageDialog(null,"El platillo"+platillo+"no se encuentra disponible");
          btnInsertarPedido.setEnabled(false);
      } else  {
          int cantidades = (int)spnPedidip.getValue();
          if((int)spnPedidip.getValue()>cantidad){
              JOptionPane.showMessageDialog(null, "El platillo"+platillo+"solo tiene disponible"+cantidad+"cantidades");
          btnInsertarPedido.setEnabled(false);
          } else{
              
              
              
              totalp = precio*cantidades;
//              ganancias = ganancias+totalp;
              System.out.println(totalp);
              lbtotalPagar.setText("Total:"+String.format("%.2f",totalp));
              btnInsertarPedido.setEnabled(true);
              
          }
          
      }
    }//GEN-LAST:event_spnPedidipStateChanged

    private void btnInsertarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarPedidoActionPerformed
      if(validar()){
          int cantidades = (int)spnPedidip.getValue();
          cantidad = cantidad-cantidades;
          CalcularGanancia();
          PlatillosPedidos gananciass = new PlatillosPedidos(platillo, cantidad, ganancias);
          if(PlatillosPedidosServicio.InsertarPlatillosPedidos(gananciass)){
              JOptionPane.showMessageDialog(null, "Pedido ingresado correctamente");
              Limpiar();
              cmb_Platillos.setEnabled(true);
              btnotroplatillo.setVisible(false);
              System.err.println(ganancias);
          }
          
          
      }
    }//GEN-LAST:event_btnInsertarPedidoActionPerformed

    private void btnotroplatilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnotroplatilloActionPerformed
       
        
        Limpiar();
         cmb_Platillos.setEnabled(true);
         btnotroplatillo.setVisible(false);
         cargarPersona();
    }//GEN-LAST:event_btnotroplatilloActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        cargarPersona();
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
//            java.util.logging.Logger.getLogger(Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Cafeteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Cafeteria().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsertarPedido;
    private javax.swing.JButton btnotroplatillo;
    private javax.swing.JComboBox<String> cmb_Platillos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbPlatillo;
    private javax.swing.JLabel lbcantidad;
    private javax.swing.JLabel lbprecio;
    private javax.swing.JLabel lbtotalPagar;
    private javax.swing.JSpinner spnPedidip;
    // End of variables declaration//GEN-END:variables
}
