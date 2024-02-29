/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mandango.dao;

import java.util.List;
import mandango.modelo.Empleados;
import mandango.modelo.Gerente;




/**
 *
 * @author DELL
 */
public interface IGerente {
    
    public List<Empleados> ListarEmpleados();
    public boolean InsertarEmpleado(Empleados empleado);
    public boolean EliminarEmpleado(String cedula);
    public boolean VisualizarGanancias();
    public boolean BuscarUsuario(String cedula);
    public boolean DatosGerente(Gerente gerente);
    
}
