/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.dao;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.MongoDatabase;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Conexion {
    
    private MongoClient mongo;
    private MongoDatabase dataB;

    public Conexion() {
    }

    public MongoClient getMongo() {
        return mongo;
    }

    public MongoDatabase getDataB() {
        return dataB;
    }

    public Conexion(MongoClient mongo, MongoDatabase dataB) {
        this.mongo = mongo;
        this.dataB = dataB;
    }
    
    public Conexion crearConexion(){
        String servidor = "localhost";
        int puerto = 27017;
        try{
            mongo= new MongoClient(servidor, puerto);
            dataB= mongo.getDatabase("MandangoMVC");
        } catch(MongoException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion a MongoDB error: "+ ex.toString(),"Mensaje",JOptionPane.ERROR_MESSAGE);
        }
        return new Conexion(mongo, dataB);
    }
    
}
