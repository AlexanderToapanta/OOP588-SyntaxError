/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.dao;

import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import mandango.modelo.Empleados;
import mandango.modelo.EmpleadosSuperClase;
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
               String nombreProducto = buscar.getString("nombreProducto");
               int cantidad = buscar.getInteger("cantidad");
               double precio = buscar.getDouble("precio");
               
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
    public boolean DatosEmpleados(Empleados empleados) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EmpleadosSuperClase BuscarUsuario(String usuario) {

    EmpleadosSuperClase empleado = null;
    Document filtro = null;
    Document resultado = null;
    
    try {
        Document query = new Document("usuario", usuario);
        FindIterable<Document> result = collection.find(query);
        
        if (result.iterator().hasNext()) {
            resultado = result.iterator().next();
            if (resultado != null) {
                empleado = new EmpleadosSuperClase();
                empleado.setCedula(resultado.getString("cedula"));
                empleado.setNombre(resultado.getString("nombre"));
                empleado.setApellido(resultado.getString("apellido"));
                empleado.setFechaNacimiento(resultado.getDate("fechaNacimiento"));
                empleado.setUsuario(resultado.getString("usuario"));
                empleado.setContrasenia(resultado.getString("contrasenia"));
                empleado.setRol(resultado.getString("rol"));
            }
            
            
        }
    } catch (MongoException ex) {
        JOptionPane.showMessageDialog(null, "Error al consultar datos según usuario: " + ex.toString());
    } finally {
        cierreConexion();
    }

    return empleado;
    }
        
    }
    
    



