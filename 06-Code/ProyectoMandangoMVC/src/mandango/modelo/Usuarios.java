/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.modelo;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class Usuarios {
    
    private String cedula, usuario,contrasenia;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Usuarios() {
    }

    public Usuarios(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "cedula=" + cedula + ", usuario=" + usuario + ", contrasenia=" + contrasenia + '}';
    }

    
    
}