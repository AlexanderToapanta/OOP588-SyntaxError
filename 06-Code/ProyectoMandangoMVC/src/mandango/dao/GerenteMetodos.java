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
import mandango.modelo.MateriaPrima;
import mandango.modelo.ProductosCafeteria;
import mandango.modelo.Usuarios;
import org.bson.Document;

/**
 *
 * @author DELL
 */
public class GerenteMetodos implements IGerente{
    
    Conexion conn = new Conexion();
    MongoDatabase database;
    private MongoCollection<Document>collection;
    
    public GerenteMetodos() {
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
    public List<Usuarios> ListarEmpleados() {
    FindIterable<Document> documento;
        List<Usuarios> ListaUsuarios = new ArrayList<Usuarios>();
        try {
            documento = collection.find();
            for (Document buscar : documento) {
               String cedula = buscar.getString("cedula");
               String nombre = buscar.getString("nombre");
               String apellido = buscar.getString("apellido");
               Date fechaNaci = buscar.getDate("fechaNacimiento");
               String Usuario = buscar.getString("usuario");
               String rol = buscar.getString("rol");
               
               Usuarios usuario = new Usuarios(cedula, Usuario, nombre, apellido, rol, fechaNaci);
                ListaUsuarios.add(usuario);
            }

        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar datos" + ex.getMessage());
        } finally {
            cierreConexion();
        }
        return ListaUsuarios;    }

    @Override
    public boolean InsertarEmpleado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

    @Override
    public boolean InsertarProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean VisualizarGanancias() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<MateriaPrima> ListarMateriaPrima() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ProductosCafeteria> ListarProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean InsertarMateriaPrima() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean EliminarEmpleado(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
