/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mandango.dao;

import java.util.List;
import mandango.modelo.Usuarios;
import mandango.modelo.MateriaPrima;
import mandango.modelo.ProductosCafeteria;



/**
 *
 * @author DELL
 */
public interface IGerente {
    
    public List<Usuarios> ListarEmpleados();
    public boolean InsertarEmpleado();
    public boolean EliminarEmpleado(String cedula);
    public boolean InsertarProductos();
    public boolean VisualizarGanancias();
    public List<MateriaPrima> ListarMateriaPrima();
    public List<ProductosCafeteria> ListarProductos();
    public boolean InsertarMateriaPrima();
 
    
}
