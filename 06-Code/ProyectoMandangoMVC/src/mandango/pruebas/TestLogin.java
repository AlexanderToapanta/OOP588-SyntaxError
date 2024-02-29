/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.pruebas;

import mandango.dao.LoginMetodos;
import mandango.vista.Login;

/**
 *
 * @author Usuario
 */
public class TestLogin {
    LoginMetodos repositorio = new LoginMetodos();
    public void TestAutenticarLogin(){
        String cedula="1900767508", contrasenia="221204";
          boolean resultado = repositorio.AutenticarLogin(cedula, contrasenia);
//          System.out.println(resultado);
          if(resultado)
              System.out.println("Encontrado");
          else
          System.out.println("Error al verificar");
        
    }
    public static void main(String[] args){
            TestLogin test = new TestLogin();
            test.TestAutenticarLogin();
        }
}
