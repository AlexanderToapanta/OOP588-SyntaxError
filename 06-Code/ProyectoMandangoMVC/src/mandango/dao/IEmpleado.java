/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mandango.dao;

import java.util.List;
import mandango.modelo.ProductosCafeteria;

/**
 *
 * @author DELL
 */
public interface IEmpleado {
    
    public List<ProductosCafeteria> ListarProductos();
    public boolean InsertarProductos();
    public boolean DatosUsusarios();
    
}
