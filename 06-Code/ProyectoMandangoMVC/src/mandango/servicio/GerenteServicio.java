/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.servicio;

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
    
}
