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
    private MongoCollection<Document> collectionEmpleados;
    private MongoCollection<Document> collection;

    public EmpleadoMetodos() {
        if (conn != null) {
            this.conn = conn.crearConexion();
            this.database = conn.getDataB();
            this.collectionEmpleados = database.getCollection("Empleados");
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
            documento = collectionEmpleados.find();
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
        public Empleados BuscarUsuario(String cedula) {

        Empleados empleado = null;
        Document filtro=null;
        Document resultado = null, usuario = null;
        try{
             filtro = new Document ("cedula",cedula);
             resultado = (Document)collectionEmpleados.find(filtro).first();
             if (resultado != null){
                 usuario= collection.find(eq("cedula",resultado.getString("cedula"))).first();
                 empleado.setNombre(resultado.getString("nombre"));
                 empleado.setApellido(resultado.getString("apellido"));
                 
             }
        }catch(MongoException ex){
            JOptionPane.showMessageDialog(null,"Error al consultarndatos segun id';" +ex.toString());
                     }finally{
                             cierreConexion();
                             }
             
        
        return empleado;
        
    }
    
    


}
