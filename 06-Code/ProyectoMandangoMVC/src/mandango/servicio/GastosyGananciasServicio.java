/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.servicio;

import java.util.List;
import mandango.dao.GastosyGananciasMetodos;

import mandango.modelo.GananciasyGastosDiarios;



/**
 *
 * @author Usuario
 */
public class GastosyGananciasServicio {
    public static boolean GastosyGanacias(GananciasyGastosDiarios caja){
         return new GastosyGananciasMetodos().GastosyGanacias(caja);
     }
    public static List<GananciasyGastosDiarios> ListaGanaciasDiarias(){   
        return new GastosyGananciasMetodos().ListaGanaciasDiarias();
    }
}
