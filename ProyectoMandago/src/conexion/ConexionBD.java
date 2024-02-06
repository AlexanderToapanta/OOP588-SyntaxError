/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.MongoDatabase;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexander
 */
public class ConexionBD {
    
    private MongoClient mongo;
    private MongoDatabase dataB;

   
    public MongoClient getMongo() {
        return mongo;
    }

    public MongoDatabase getDataB() {
        return dataB;
    }
    
    
    public ConexionBD(MongoClient mongo, MongoDatabase dataB) {
        this.mongo = mongo;
        this.dataB = dataB;
    }
    
    public ConexionBD crearConexion(){
        String servidor = "localhost";
        int puerto = 27017;
        try{
            mongo= new MongoClient(servidor, puerto);
            dataB= mongo.getDatabase("MandangoDB");
        } catch(MongoException ex){
            JOptionPane.showMessageDialog(null, "Error en la conexion a MongoDB error: "+ ex.toString(),"Mensaje",JOptionPane.ERROR_MESSAGE);
        }
        return new ConexionBD(mongo, dataB);
    }

    public ConexionBD() {
    }
    
    
}
