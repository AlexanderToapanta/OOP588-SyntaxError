/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.modelo;

import java.util.Date;

/**
 *
 * @author Alexander
 */
public class EmpleadosSuperClase {
    private String cedula;
    private String nombre,apellido;
    private Date fechaNacimiento;           
    private String usuario, rol, contrasenia;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

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

    public EmpleadosSuperClase() {
    }

    public EmpleadosSuperClase(String cedula, String nombre, String apellido, Date fechaNacimiento , String rol,  String usuario, String contrasenia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.usuario = usuario;
        this.rol = rol;
        this.contrasenia = contrasenia;
    }

    public EmpleadosSuperClase(String nombre, String apellido, String rol, Date fechaNacimiento, String cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
    }

    public EmpleadosSuperClase(String rol, String usuario) {
        this.rol = rol;
        this.usuario = usuario;
    }
    

    @Override
    public String toString() {
        return "EmpleadosSuperClase{" + "nombre=" + nombre + ", apellido=" + apellido + ", rol=" + rol + ", fechaNacimiento=" + fechaNacimiento + ", cedula=" + cedula + ", usuario=" + usuario + ", contrasenia=" + contrasenia + '}';
    }
    
}
