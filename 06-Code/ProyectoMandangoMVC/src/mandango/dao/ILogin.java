/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mandango.dao;

import mandango.modelo.Usuarios;

/**
 *
 * @author DELL
 */
public interface ILogin {
    
    public Usuarios BuscarUsuario (String cedula);
    
}
