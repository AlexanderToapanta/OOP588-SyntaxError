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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import mandango.modelo.Empleados;
import mandango.modelo.EmpleadosSuperClase;
import mandango.modelo.Gerente;
import mandango.modelo.ProductosCafeteria;
import org.bson.Document;

/**
 *
 * @author Alexander
 */
public class EmpleadosSCMetodos implements IEmpleadosSC{
    Conexion conn = new Conexion();
    MongoDatabase database;
    private MongoCollection<Document> collectionEmpleados;
    private MongoCollection<Document> collection;

    public EmpleadosSCMetodos() {
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
    public List<EmpleadosSuperClase> ListarEmpleados() {
        FindIterable<Document> documento;
        List<EmpleadosSuperClase> ListaEmpleados = new ArrayList<EmpleadosSuperClase>();
        try {
            documento = collection.find();
            for (Document buscar : documento) {
               String cedula = buscar.getString("cedula");
               String nombre = buscar.getString("nombre");
               String apellido = buscar.getString("apellido");
               Date fechaNaci = buscar.getDate("fechaNacimiento");
               String Usuario = buscar.getString("usuario");
               String rol = buscar.getString("rol");
               
               EmpleadosSuperClase empleado = new EmpleadosSuperClase(nombre, apellido, rol, fechaNaci, cedula, Usuario);
               ListaEmpleados.add(empleado);
              // Usuarios usuario = new Usuarios(cedula, Usuario, nombre, apellido, rol, fechaNaci);
               // ListaUsuarios.add(usuario);
            }

        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar datos" + ex.getMessage());
        } finally {
            cierreConexion();
        }
        return ListaEmpleados;
    }

    @Override
    public boolean InsertarEmpleado(EmpleadosSuperClase empleado) {
        Document document;
        try{
        document = new Document("cedula", empleado.getCedula())
                .append("nombre", empleado.getNombre())
                .append("apellido", empleado.getApellido())
                .append("fechaNacimiento", empleado.getFechaNacimiento())
                .append("usuario", empleado.getUsuario())
                .append("rol", empleado.getRol())
                .append("contrasenia", empleado.getContrasenia());
                collection.insertOne(document);
        }catch (MongoException ex){
            JOptionPane.showMessageDialog(null,"Error de insercion" +ex.toString());
            return false;  
        }   finally{
            cierreConexion();   
        }
           return true;
    }

    @Override
    public boolean EliminarEmpleado(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean VisualizarGanancias() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean DatosGerente(Gerente gerente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    public EmpleadosSuperClase BuscarUsuario(String cedula) {
        EmpleadosSuperClase empleado = null;
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
            JOptionPane.showMessageDialog(null,"Error al consultar datos segun id';" +ex.toString());
                     }finally{
                             cierreConexion();
                             }
             
        
        return empleado;
    }
    
}
