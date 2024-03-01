/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mandango.dao;

import java.util.List;
import mandango.modelo.Empleados;
import mandango.modelo.EmpleadosSuperClase;
import mandango.modelo.Gerente;
import mandango.modelo.ProductosCafeteria;

/**
 *
 * @author Alexander
 */
public interface IEmpleadosSC {
    public List<EmpleadosSuperClase> ListarEmpleados();
    public boolean InsertarEmpleado(EmpleadosSuperClase empleado);
    public boolean EliminarEmpleado(String cedula);
    public boolean VisualizarGanancias();
    //public boolean BuscarUsuario(String cedula);
    public boolean DatosGerente(Gerente gerente);
    public List<ProductosCafeteria> ListarProductos();
    public boolean InsertarProductos();
    public boolean DatosEmpleados(Empleados empleados);
    public EmpleadosSuperClase BuscarUsuario(String cedula);
}
