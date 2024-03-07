/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mandango.dao;

import java.util.List;
import mandango.modelo.EmpleadosSuperClase;
import mandango.modelo.Gerente;




/**
 *
 * @author DELL
 */
public interface IGerente {
    
    public List<EmpleadosSuperClase> ListarEmpleados();
    public boolean InsertarEmpleado(EmpleadosSuperClase empleado);
    public boolean EliminarEmpleado(String cedula);
    public boolean VisualizarGanancias();
    public boolean BuscarUsuario(String cedula);
    public boolean DatosGerente(Gerente gerente);
    public String EncriptarClave(String clave);
    public boolean ActualizarClave(String usuario, String claveencriptada);
    
}
