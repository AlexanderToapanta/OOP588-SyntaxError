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
import mandango.modelo.ProductosCafeteria;
import mandango.modelo.Usuarios;
import org.bson.Document;

/**
 *
 * @author DELL
 */
public class EmpleadoMetodos implements IEmpleado {

    Conexion conn = new Conexion();
    MongoDatabase database;
    private MongoCollection<Document> collection;

    public EmpleadoMetodos() {
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
    public List<ProductosCafeteria> ListarProductos() {
        FindIterable<Document> documento;
        List<ProductosCafeteria> ListaProductos = new ArrayList<ProductosCafeteria>();
        try {
            documento = collection.find();
            for (Document buscar : documento) {
               String nombreProducto = buscar.getString("cedula");
               int cantidad = buscar.getInteger("nombre");
               double precio = buscar.getDouble("apellido");
               
               ProductosCafeteria productos = new ProductosCafeteria(nombreProducto, cantidad, precio);
               
               
                ListarProductos().add(productos);
            }

        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar datos" + ex.getMessage());
        } finally {
            cierreConexion();
        }
        return ListaProductos;
    }

    @Override
    public boolean InsertarProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean DatosUsusarios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
