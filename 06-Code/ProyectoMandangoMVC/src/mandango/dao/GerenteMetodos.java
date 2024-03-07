/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.dao;

import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import mandango.modelo.Empleados;
import mandango.modelo.EmpleadosSuperClase;
import mandango.modelo.Gerente;

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
    public List<EmpleadosSuperClase> ListarEmpleados() {
        FindIterable<Document> documento;
        List<EmpleadosSuperClase> ListaEmpleados = new ArrayList<EmpleadosSuperClase>();
        try {
            documento = collection.find();
            for (Document buscar : documento) {
               String cedula = buscar.getString("cedula");
               String nombre = buscar.getString("nombre");
               String rol = buscar.getString("rol");
               
               EmpleadosSuperClase empleado = new EmpleadosSuperClase(cedula, nombre, rol);
               ListaEmpleados.add(empleado);
            }

        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar datos" + ex.getMessage());
        } finally {
            cierreConexion();
        }
        return ListaEmpleados;   
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
    public boolean BuscarUsuario(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean DatosGerente(Gerente gerente) {

                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    }

    @Override

    public boolean ActualizarClave(String usuario, String contrasenia) {
        Document filtro,update;
        UpdateResult resultado;
        boolean actualizar = false;
        try{
            filtro = new Document("usuario",usuario);
            update = new Document ("$set",new Document("contrasenia",contrasenia));
            resultado = collection.updateOne(filtro, update);
            if(resultado.getModifiedCount()>0){
                actualizar = true;
                
            }
        }catch(MongoException ex){
                    
                    }finally{
                            cierreConexion();
                            }
                    return actualizar;
    }
     

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

       

}
