/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.dao;

import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mandango.modelo.Imagenes;
import org.bson.Document;

/**
 *
 * @author DELL
 */
public class ImagenMetodos implements IImagenes{

    Conexion conn = new Conexion();
    MongoDatabase database;
    private MongoCollection<Document> collection;

    public ImagenMetodos() {
        if (conn != null) {
            this.conn = conn.crearConexion();
            this.database = conn.getDataB();
            this.collection = database.getCollection("Imagenes");
        }
    }

    private void cierreConexion() {
        try {
            conn.getMongo().close();
        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar" + ex.toString());
        }

    }

    @Override
    public Imagenes AgregarImagen(Imagenes imagen1) {
        Document imageDoc = new Document("ELRAYOOOO.jpg", imagen1.getImage());
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(imageDoc.toJson());
        } catch (FileNotFoundException ex) {
        }
        byte[] imageBytes = null;
        try {
            imageBytes = inputStream.readAllBytes();
        } catch (IOException ex) {
            Logger.getLogger(ImagenMetodos.class.getName()).log(Level.SEVERE, null, ex);
        }
        String base64 = Base64.getEncoder().encodeToString(imageBytes);
            Document imageDocument = new Document("imagen1", base64);
            collection.insertOne(imageDoc);
        imageDoc = collection.find().first();
        String base64Image = imageDocument.getString("imagen1");
        imageBytes = Base64.getDecoder().decode(base64Image);
        InputStream input = new ByteArrayInputStream(imageBytes);
        return imagen1;
          }
}
