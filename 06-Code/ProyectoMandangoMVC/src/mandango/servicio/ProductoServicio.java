/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.servicio;

import mandango.dao.ProductoMetodos;
import mandango.modelo.ProductosCafeteria;

/**
 *
 * @author Usuario
 */
public class ProductoServicio {
     public static boolean InsertarProductos(ProductosCafeteria producto){
         return new ProductoMetodos().InsertarProductos(producto);
     }
}
