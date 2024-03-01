/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.dao;

import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import mandango.modelo.EmpleadosSuperClase;
import mandango.modelo.Usuarios;
import org.bson.Document;

/**
 *
 * @author DELL
 */
public class LoginMetodos implements ILogin {

     Conexion conn = new Conexion();
    MongoDatabase database;
    private MongoCollection coleccionUsuarios, coleccionEmpleados,coleccionGerente;

    public LoginMetodos() {
        if (conn != null) {
            this.conn = conn.crearConexion();
            this.database = conn.getDataB();
            this.coleccionEmpleados = database.getCollection("Empleados");
            this.coleccionUsuarios = database.getCollection("Usuarios");
        }
    }
    private void Cierre() {
        try {
            conn.getMongo().close();
        } catch (MongoException exM) {
            JOptionPane.showMessageDialog(null, "Error en ingresar Datos" + exM.toString());
        }
    }


  

    @Override
    public boolean MostrarVentana(String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean AutenticarLogin(String usuarios, String contrasenia) {
        boolean verificado=false;
      Document query = new Document ("usuario",usuarios).append("contrasenia",contrasenia);
        FindIterable<Document> result = coleccionUsuarios.find(query);
        if(result.iterator().hasNext()){
            verificado = true;
        }
        return verificado;
    }

    @Override
    public List<EmpleadosSuperClase> ListaUsuarios() {
        FindIterable<Document> documento;
        List<EmpleadosSuperClase> ListaUsuarios = new ArrayList<>();
        try{
            documento=coleccionUsuarios.find();
        for (Document buscar : documento){
<<<<<<< Updated upstream
            String usuario = buscar.getString("usuario");
//            String nombre = buscar.getString("nombre");
//            String apellido = buscar.getString("apellido");
            String rol = buscar.getString("rol");
//            Date fechaNacimiento = buscar.getDate("fechaNacimiento");
            EmpleadosSuperClase usuarios= new EmpleadosSuperClase(rol, usuario);
=======
            String cedula = buscar.getString("cedula");
            String nombre = buscar.getString("nombre");
            String apellido = buscar.getString("apellido");
            String rol = buscar.getString("rol");
            Date fechaNacimiento = buscar.getDate("fechaNacimiento");
            EmpleadosSuperClase usuarios= new EmpleadosSuperClase(nombre, apellido, rol, fechaNacimiento, cedula);
>>>>>>> Stashed changes
            ListaUsuarios.add(usuarios);
        }
        }catch (MongoException ex){
            JOptionPane.showMessageDialog(null,"Error al consultar datos"+ex.getMessage());
        }finally{
           
        }
        return ListaUsuarios;
    
    }
}
