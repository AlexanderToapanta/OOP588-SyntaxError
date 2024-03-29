/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mandango.dao;

import java.util.List;
import mandango.modelo.Empleados;
import mandango.modelo.EmpleadosSuperClase;
import mandango.modelo.ProductosCafeteria;
import mandango.modelo.Usuarios;

/**
 *
 * @author DELL
 */
public interface IEmpleado {
    
    public List<ProductosCafeteria> ListarProductos();
    public boolean InsertarProductos();
    public boolean DatosEmpleados(Empleados empleados);
    public EmpleadosSuperClase BuscarUsuario(String usuario);
    public String EncriptarClave(String clave);
    public boolean ActualizarClave(String claveencripted, String usuario);
}
