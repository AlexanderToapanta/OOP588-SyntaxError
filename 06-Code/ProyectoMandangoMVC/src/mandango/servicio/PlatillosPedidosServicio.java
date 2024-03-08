/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.servicio;

import java.util.List;
import mandango.dao.PlatillosPedidosMetodos;
import mandango.modelo.PlatillosPedidos;

/**
 *
 * @author Usuario
 */
public class PlatillosPedidosServicio {
     public static boolean InsertarPlatillosPedidos( PlatillosPedidos ganacias){
         return new PlatillosPedidosMetodos().InsertarPlatillosPedidos(ganacias);
     }
    public static List<PlatillosPedidos> ListarPlatillosPedidos(){   
        return new PlatillosPedidosMetodos().ListarPlatillosPedidos();
    }
     
  
}
