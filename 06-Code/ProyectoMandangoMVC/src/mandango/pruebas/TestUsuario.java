/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.pruebas;

import java.util.ArrayList;
import java.util.List;
import mandango.dao.EmpleadoMetodos;
import mandango.dao.GerenteMetodos;
import mandango.modelo.Empleados;
import mandango.modelo.Usuarios;

/**
 *
 * @author DELL
 */
public class TestUsuario {

    EmpleadoMetodos repositorio = new EmpleadoMetodos();

//    public void testListaPerfil() {
//        List<Usuarios> ListaUsuario = new ArrayList<Usuarios>();
//        ListaUsuario = null;
//        ListaUsuario = repositorio.ListarEmpleados();
//
//        if (ListaUsuario != null) {
//            for (Usuarios temp : ListaUsuario) {
//                System.out.println("nombre: " + temp.getNombre()
//                + "apellido: " + temp.getApellido()
//                + "rol: " + temp.getRol());
//           }
//         }
//      }   
    
    
    public void testBuscarUsuarios(){
        
        Empleados empleado = new Empleados();
        String cedula = "1900767508";
        Empleados resultado = repositorio.BuscarUsuario(cedula);
        
        if(resultado!= null)
            System.out.println("nombre" + empleado.getNombre());
        else
            System.out.println("Error");
    }
    
    public static void main(String[] args) {
        TestUsuario test = new TestUsuario();
        test.testBuscarUsuarios();
    }

}
