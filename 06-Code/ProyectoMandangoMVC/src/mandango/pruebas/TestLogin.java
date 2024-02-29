/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.pruebas;

import mandango.dao.LoginMetodos;
import mandango.modelo.Usuarios;

/**
 *
 * @author DELL
 */
public class TestLogin {

    LoginMetodos repositorio = new LoginMetodos();

    public void testBuscarID() {

        Usuarios cedu = new Usuarios();
        String cedula = cedu.getCedula();
        Usuarios resultado = repositorio.BuscarUsuario(cedula);

        if (resultado != null) {
            String cedulaResultado = resultado.getCedula();
            if (cedulaResultado != null && cedulaResultado.equals(cedula)) {
                System.out.println("La contrasenia es: " + resultado.getContrasenia());
            } else {
                System.out.println("Error: La cédula del usuario no coincide.");
            }
        } else {
            System.out.println("Error: No se encontró ningún usuario con la cédula especificada.");
        }

    }

    public static void main(String[] args) {
        TestLogin test = new TestLogin();
        test.testBuscarID();
    }
}
