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
import javax.swing.SpinnerNumberModel;
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
         SpinnerNumberModel nm = new SpinnerNumberModel();
      nm.setMaximum(cantidad);
      nm.setMinimum(0);
      spnPedidip.setModel(nm);
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
        lbtotalPagar.setText(" ");
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
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cafeteria");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 140, 30));

        cmb_Platillos.setBackground(new java.awt.Color(0, 102, 102));
        cmb_Platillos.setForeground(new java.awt.Color(0, 0, 204));
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
        jPanel1.add(cmb_Platillos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 460, -1));

        lbPlatillo.setBackground(new java.awt.Color(51, 51, 51));
        lbPlatillo.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        lbPlatillo.setForeground(new java.awt.Color(102, 0, 0));
        jPanel1.add(lbPlatillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 380, 20));

        lbcantidad.setBackground(new java.awt.Color(102, 102, 102));
        lbcantidad.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        lbcantidad.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(lbcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 350, 20));

        lbprecio.setBackground(new java.awt.Color(102, 102, 102));
        lbprecio.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        lbprecio.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(lbprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 340, 20));

        spnPedidip.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnPedidip.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnPedidipStateChanged(evt);
            }
        });
        jPanel1.add(spnPedidip, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 89, -1));

        btnInsertarPedido.setText("Insertar Pedido");
        btnInsertarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarPedidoActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));
        jPanel1.add(lbtotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 316, 231, -1));

        btnotroplatillo.setText("Seleccionar otro platillo");
        btnotroplatillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnotroplatilloActionPerformed(evt);
            }
        });
        jPanel1.add(btnotroplatillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/16 Ideas para las que quieren poner un negocio de comida.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        Date fechaActual = new Date();
        if(validar()){
          int cantidades = (int)spnPedidip.getValue();
          cantidad = cantidad-cantidades;
          CalcularGanancia();
          PlatillosPedidos gananciass = new PlatillosPedidos(platillo, cantidades, ganancias,fechaActual);
          if(PlatillosPedidosServicio.InsertarPlatillosPedidos(gananciass)){
             if(ProductoServicio.ActualizarStock(cantidad, platillo)){
                  JOptionPane.showMessageDialog(null, "Pedido ingresado correctamente");
              Limpiar();
              cmb_Platillos.setEnabled(true);
              btnotroplatillo.setVisible(false);
                 tablaPlatillos = ProductoServicio.ListarProductos();
             }
              
          }
          
          
      }
    }//GEN-LAST:event_btnInsertarPedidoActionPerformed

    private void btnotroplatilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnotroplatilloActionPerformed
       
        
        Limpiar();
         cmb_Platillos.setEnabled(true);
         btnotroplatillo.setVisible(false);
    }//GEN-LAST:event_btnotroplatilloActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbPlatillo;
    private javax.swing.JLabel lbcantidad;
    private javax.swing.JLabel lbprecio;
    private javax.swing.JLabel lbtotalPagar;
    private javax.swing.JSpinner spnPedidip;
    // End of variables declaration//GEN-END:variables
}
