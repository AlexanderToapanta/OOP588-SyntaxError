/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.dao;

import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import mandango.modelo.Empleados;
import mandango.modelo.EmpleadosSuperClase;
import mandango.modelo.Gerente;

import org.bson.Document;
import org.bson.conversions.Bson;

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
        Bson filtro = null;
        DeleteResult resultado = null;
        boolean eliminar = false;
        try{
            filtro = new Document("cedula", cedula);
            resultado = collection.deleteOne(filtro);
            if(resultado.getDeletedCount()>0){
                eliminar = true;
            }else{
            JOptionPane.showMessageDialog(null, "No se encontro el registro para  eliminar.");
            }
        }catch(MongoException ex){
            JOptionPane.showMessageDialog(null, "Error de eliminacion" + ex.toString());
            eliminar= false;
        }finally{
            cierreConexion();
        }
        return eliminar;
    }

    @Override
    public boolean VisualizarGanancias() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public EmpleadosSuperClase BuscarUsuario(String cedula) {
        EmpleadosSuperClase empleado = null;
        Document filtro = null;
        Document resultado = null;
        try {
            filtro = new Document("cedula", cedula);
            resultado = (Document) collection.find(filtro).first();

            if (resultado != null) {
                empleado = new EmpleadosSuperClase();                
                empleado.setNombre(resultado.getString("nombre"));
                empleado.setApellido(resultado.getString("apellido"));
                empleado.setRol(resultado.getString("rol"));
                empleado.setFechaNacimiento(resultado.getDate("fechaNacimiento"));
                empleado.setCedula(resultado.getString("cedula"));
            }

        } catch (MongoException ex) {
            JOptionPane.showMessageDialog(null, "Error al consultar datos segun id " + ex.getMessage());
        } finally {
            cierreConexion();
        }
        return empleado;
 
    }

    @Override
    public boolean DatosGerente(Gerente gerente) {

                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    }

    @Override

    public boolean ActualizarClave(String usuario, String claveencriptada) {
        Document filtro,update;
        UpdateResult resultado;
        boolean actualizar = false;
        try{
            filtro = new Document("usuario",usuario);
            update = new Document ("$set",new Document("contrasenia",claveencriptada));
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
        }finally{
            cierreConexion();   
        }
           return true;
    }
    
    @Override
    public boolean ActualizarEmpleado(EmpleadosSuperClase empleado) {
        boolean actualizar = false;
        try {
            Document filtrar = new Document("cedula", empleado.getCedula());
            Document documento = new Document("$set", new Document()
                .append("nombre", empleado.getNombre())
                .append("apellido", empleado.getApellido())
                .append("fechaNacimiento", empleado.getFechaNacimiento())    
                .append("rol", empleado.getRol()));
                
            UpdateResult resultado = collection.updateOne(filtrar, documento);
            if (resultado.getModifiedCount() > 0) {
                actualizar = true;
            }
        }catch(MongoException ex){
            JOptionPane.showMessageDialog(null, "Error de insercion" + ex.toString());
//            actualizar= false;
        }finally{
            cierreConexion();
        }
        return actualizar;    
    }

    @Override
    public String EncriptarClave(String clave) {
        String encriptar = "";
        try{
            MessageDigest gestor = MessageDigest.getInstance("MD5");
            byte[] key = gestor.digest(clave.getBytes("utf-8"));
            byte[] clavebyte = Arrays.copyOf(key, 24);
            SecretKey llave = new SecretKeySpec(clavebyte, "DEsede");
            Cipher cifrar = Cipher.getInstance("DEsede");
            cifrar.init(Cipher.ENCRYPT_MODE, llave);
            
            byte[] text = clave.getBytes("utf-8");
            byte[] buffer = cifrar.doFinal(text);
            byte[] base64 = Base64.getEncoder().encode(buffer);
            encriptar = new String(base64);
        }catch(Exception ex){
            
        }

        return encriptar;

    }

   

}
