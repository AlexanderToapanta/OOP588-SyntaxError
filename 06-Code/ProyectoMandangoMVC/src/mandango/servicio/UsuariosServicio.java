/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.servicio;

import java.util.List;
import mandango.dao.EmpleadoMetodos;
import mandango.dao.GerenteMetodos;
import mandango.modelo.Empleados;
import mandango.modelo.EmpleadosSuperClase;
import mandango.modelo.ProductosCafeteria;
import mandango.modelo.Usuarios;

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
    
    public static EmpleadosSuperClase BuscarUsuario(String cedula){
        return new EmpleadoMetodos().BuscarUsuario(cedula);
    }
    
    public static boolean ActualizarClave(String usuario, String contrasenia){
        
         return new GerenteMetodos().ActualizarClave(usuario, contrasenia);
        
    }
    
    public static String EncriptarClave(String clave){
        return new EmpleadoMetodos().EncriptarClave(clave);
    }
   
}
