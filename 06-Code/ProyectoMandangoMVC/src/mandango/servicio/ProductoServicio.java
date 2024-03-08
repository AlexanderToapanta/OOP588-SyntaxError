/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.servicio;

import java.util.List;
import mandango.dao.MateriaPrimaMetodos;
import mandango.dao.ProductoMetodos;
import mandango.modelo.MateriaPrima;
import mandango.modelo.ProductosCafeteria;

/**
 *
 * @author Usuario
 */
public class ProductoServicio {
     public static boolean InsertarProductos(ProductosCafeteria producto){
         return new ProductoMetodos().InsertarProductos(producto);
     }
   
    public static List<ProductosCafeteria> ListarProductos(){   
        return new ProductoMetodos().ListarProductos();
    }
    public static boolean ActualizarStock(int cantidad, String platillo){
         return new ProductoMetodos().ActualizarStock(cantidad, platillo);
     }
   
}
