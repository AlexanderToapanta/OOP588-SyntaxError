/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.servicio;

import java.util.List;
import mandango.dao.GerenteMetodos;
import mandango.modelo.Empleados;
import mandango.modelo.EmpleadosSuperClase;

/**
 *
 * @author Alexander
 */
public class GerenteServicio {
    public static boolean InsertarEmpleado (EmpleadosSuperClase empleado){
        return new GerenteMetodos().InsertarEmpleado(empleado);
    }
    public static List<EmpleadosSuperClase> ListarEmpleados(){
        return new GerenteMetodos().ListarEmpleados();
    }
    
    public static boolean EliminarEmpleado(String cedula){
        return new GerenteMetodos().EliminarEmpleado(cedula);
    }
    
    public static boolean ActualizarEmpleado (EmpleadosSuperClase empleado){
        return new GerenteMetodos().ActualizarEmpleado (empleado);
    }
    
}
