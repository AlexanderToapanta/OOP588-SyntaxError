/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.servicio;

import java.util.List;
import mandango.dao.EmpleadoMetodos;
import mandango.modelo.Empleados;
import mandango.modelo.ProductosCafeteria;

/**
 *
 * @author DELL
 */
public class UsuariosServicio {
    
    public static List<ProductosCafeteria> ListarProductos(){   
        return new EmpleadoMetodos().ListarProductos();
    }
    
    public static boolean InsertarProductos(){
        return new EmpleadoMetodos().InsertarProductos();
    }
    
    public static boolean DatosEmpleados(Empleados empleados){
        return new EmpleadoMetodos().DatosEmpleados(empleados);
    }
    
    public Empleados BuscarUsuario(String cedula){
        return new EmpleadoMetodos().BuscarUsuario(cedula);
    }
    
}
