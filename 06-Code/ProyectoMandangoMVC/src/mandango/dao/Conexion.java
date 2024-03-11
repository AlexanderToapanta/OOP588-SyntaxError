/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.dao;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

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

    public Conexion crearConexion() {

        String connectionString = "mongodb+srv://avillacres:1234AZ@cluster0.ppg8sv5.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);

        try {
            mongo = new MongoClient(uri);
            dataB = mongo.getDatabase("nombre_de_la_base_de_datos");
            System.out.println("Conexión exitosa a MongoDB.");
        } catch (Exception e) {
            System.err.println("Error al conectar a MongoDB: " + e.getMessage());
        }
        return new Conexion(mongo, dataB);
    }
}

