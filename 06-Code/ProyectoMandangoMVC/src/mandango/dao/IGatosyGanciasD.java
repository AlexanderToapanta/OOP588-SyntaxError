/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mandango.dao;

import java.util.List;
import mandango.modelo.GananciasyGastosDiarios;


/**
 *
 * @author Usuario
 */
public interface IGatosyGanciasD {
    public boolean GastosyGanacias(GananciasyGastosDiarios caja);
     public List<GananciasyGastosDiarios> ListaGanaciasDiarias();
}
