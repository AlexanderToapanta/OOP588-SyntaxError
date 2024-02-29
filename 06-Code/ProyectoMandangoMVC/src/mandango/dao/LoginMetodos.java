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
    private MongoCollection<Document> collection;

    public LoginMetodos() {
        if (conn != null) {
            this.conn = conn.crearConexion();
            this.database = conn.getDataB();
            this.collection = database.getCollection("Usuarios");
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
    public Usuarios BuscarUsuario(String cedula) {
        Usuarios usuario = null; // Inicializamos el objeto como null
        Document filtro = new Document("cedula", cedula);
        Document resultado = (Document) collection.find(filtro).first();

        try {
            if (resultado != null) {
                // Si se encuentra un resultado en la base de datos
                // Creamos un nuevo objeto Usuarios y asignamos los valores recuperados
                usuario = new Usuarios();
                usuario.getCedula();
                usuario.getContrasenia();
            }
        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultarndatos segun id';" + ex.toString());
        } finally {
            cierreConexion();
        }

        return usuario;
    }

}
