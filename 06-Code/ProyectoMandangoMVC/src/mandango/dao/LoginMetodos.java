/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.dao;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javax.swing.JOptionPane;
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
    public boolean AutenticarLogin(String usuarios, String contrasenia) {
  boolean encontrado=false;
        Document filtro=null,filtro2=null;
        Document resultado = null,resultado2=null;
        try{
             filtro = new Document ("usuario",usuarios);
             resultado = (Document)coleccionUsuarios.find(filtro).first();
             filtro2 = new Document ("contrasenia",contrasenia);
             resultado2 = (Document)coleccionUsuarios.find(filtro2).first();
             if ((resultado!= null)&&(resultado2!=null)){
                 encontrado=true;
             }
        }catch(MongoException ex){
            JOptionPane.showMessageDialog(null,"Error al consultar datos segun id';" +ex.toString());
                     }finally{
                             
                             }
             
        
        return encontrado;  

    }

    @Override
    public boolean MostrarVentana(String usuario) {
       
    }

}
