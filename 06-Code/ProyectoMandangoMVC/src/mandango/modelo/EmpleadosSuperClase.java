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
    private String nombre, apellido, rol;
    private Date fechaNacimiento;   
    private String cedula, usuario, contrasenia;

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

    public EmpleadosSuperClase(String nombre, String apellido, String rol, Date fechaNacimiento, String cedula, String usuario, String contrasenia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

<<<<<<< Updated upstream
=======
    public EmpleadosSuperClase(String nombre, String apellido, String rol, Date fechaNacimiento, String cedula, String usuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.usuario = usuario;
    }
    

>>>>>>> Stashed changes
    public EmpleadosSuperClase(String nombre, String apellido, String rol, Date fechaNacimiento, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
    }

    public EmpleadosSuperClase(String rol, String usuario) {
        this.rol = rol;
        this.usuario = usuario;
    }
<<<<<<< Updated upstream
    

=======

       
    public EmpleadosSuperClase(String cedula) {
        this.cedula = cedula;
    }
    
>>>>>>> Stashed changes
    @Override
    public String toString() {
        return "EmpleadosSuperClase{" + "nombre=" + nombre + ", apellido=" + apellido + ", rol=" + rol + ", fechaNacimiento=" + fechaNacimiento + ", cedula=" + cedula + ", usuario=" + usuario + ", contrasenia=" + contrasenia + '}';
    }
    
}
