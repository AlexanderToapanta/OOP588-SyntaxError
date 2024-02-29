/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.servicio;

import java.util.List;
import mandango.dao.LoginMetodos;
import mandango.modelo.EmpleadosSuperClase;


/**
 *
 * @author Usuario
 */
public class LoginServicio {
    public static boolean AutenticarLogin(String usuarios, String contrasenia){
    return new LoginMetodos().AutenticarLogin(usuarios, contrasenia);
    }
     public static List<EmpleadosSuperClase> ListaUsuarios() {
        return new LoginMetodos().ListaUsuarios();
    }
    
}
