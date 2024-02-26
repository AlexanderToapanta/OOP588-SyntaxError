/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.modelo;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Usuarios {
    
    private String cedula, usuario,nombre,apellido, contrasenia, rol;
    private Date fechaNacimiento;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombreEmpleado) {
        this.nombre = nombreEmpleado;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellidoEmpleado) {
        this.apellido = apellidoEmpleado;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRol() {
        return rol;
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

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuarios(String cedula, String usuario, String nombre, String apellido, String contrasenia, String rol, Date fechaNacimiento) {
        this.cedula = cedula;
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasenia = contrasenia;
        this.rol = rol;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Usuarios(String cedula, String usuario, String nombre, String apellido, String rol, Date fechaNacimiento) {
        this.cedula = cedula;
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.fechaNacimiento = fechaNacimiento;
    }


    
    public Usuarios() {
    }
    
}
