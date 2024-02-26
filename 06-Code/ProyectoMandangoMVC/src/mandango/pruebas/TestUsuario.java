/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.pruebas;

import java.util.ArrayList;
import java.util.List;
import mandango.dao.GerenteMetodos;
import mandango.modelo.Usuarios;

/**
 *
 * @author DELL
 */
public class TestUsuario {

    GerenteMetodos repositorio = new GerenteMetodos();

    public void testListaPerfil() {
        List<Usuarios> ListaUsuario = new ArrayList<Usuarios>();
        ListaUsuario = null;
        ListaUsuario = repositorio.ListarEmpleados();

        if (ListaUsuario != null) {
            for (Usuarios temp : ListaUsuario) {
                System.out.println("nombre: " + temp.getNombre()
                + "apellido: " + temp.getApellido()
                + "rol: " + temp.getRol());
           }
         }
      }   
    
    
    public static void main(String[] args) {
        TestUsuario test = new TestUsuario();
        test.testListaPerfil();
    }

}
