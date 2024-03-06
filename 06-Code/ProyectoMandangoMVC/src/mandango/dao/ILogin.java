/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mandango.dao;

import java.util.List;
import mandango.modelo.EmpleadosSuperClase;
import mandango.modelo.Usuarios;

/**
 *
 * @author DELL
 */
public interface ILogin {
    
     public boolean AutenticarLogin(String usuarios, String contrasenia);
    
        public List<EmpleadosSuperClase> ListaUsuarios();

    
}
