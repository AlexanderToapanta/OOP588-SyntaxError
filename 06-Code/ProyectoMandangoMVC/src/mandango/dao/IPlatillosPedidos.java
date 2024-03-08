/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mandango.dao;

import java.util.List;
import mandango.modelo.PlatillosPedidos;


/**
 *
 * @author Usuario
 */
public interface IPlatillosPedidos {
    public boolean InsertarPlatillosPedidos( PlatillosPedidos ganacias);
    public List<PlatillosPedidos> ListarPlatillosPedidos();
}
