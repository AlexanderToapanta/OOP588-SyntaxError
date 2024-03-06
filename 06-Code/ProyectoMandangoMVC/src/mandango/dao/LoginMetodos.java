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
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import mandango.modelo.EmpleadosSuperClase;
import mandango.modelo.Usuarios;
import org.bson.Document;

/**
 *
 * @author DELL
 */
public class LoginMetodos implements ILogin {

     Conexion conn = new Conexion();
    MongoDatabase database;
    private MongoCollection coleccionUsuarios, coleccionEmpleados,coleccionGerente;

    public LoginMetodos() {
        if (conn != null) {
            this.conn = conn.crearConexion();
            this.database = conn.getDataB();
            this.coleccionEmpleados = database.getCollection("Empleados");
            this.coleccionUsuarios = database.getCollection("Usuarios");
        }
    }
    private void Cierre() {
        try {
            conn.getMongo().close();
        } catch (MongoException exM) {
            JOptionPane.showMessageDialog(null, "Error en ingresar Datos" + exM.toString());
        }
    }


  

   

    @Override
    public boolean AutenticarLogin(String usuarios, String contrasenia) {
        boolean verificado=false;
      Document query = new Document ("usuario",usuarios).append("contrasenia",contrasenia);
        FindIterable<Document> result = coleccionUsuarios.find(query);
        if(result.iterator().hasNext()){
            verificado = true;
        }
        return verificado;
    }

    @Override
    public List<EmpleadosSuperClase> ListaUsuarios() {
        FindIterable<Document> documento;
        List<EmpleadosSuperClase> ListaUsuarios = new ArrayList<>();
        try{
            documento=coleccionUsuarios.find();
        for (Document buscar : documento){
             String cedula = buscar.getString("cedula");
            String usuario = buscar.getString("usuario");
            String nombre = buscar.getString("nombre");
            String apellido = buscar.getString("apellido");
            String rol = buscar.getString("rol");
            Date fechaNacimiento = buscar.getDate("fechaNacimiento");
            EmpleadosSuperClase usuarios= new EmpleadosSuperClase(rol, usuario);
            ListaUsuarios.add(usuarios);
        }
        }catch (MongoException ex){
            JOptionPane.showMessageDialog(null,"Error al consultar datos"+ex.getMessage());
        }finally{
           
        }
        return ListaUsuarios;
    
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

    @Override
    public String DesencriptarClave(String clave, String claveEncriptada) {
        String desencriptar = "";
        try{
            byte[] mensaje = Base64.getDecoder().decode(claveEncriptada.getBytes("utf-8"));
            MessageDigest digestor = MessageDigest.getInstance("MD5");
            byte[] gestion = digestor.digest(clave.getBytes("utf-8"));
            byte[] keyByte = Arrays.copyOf(gestion, 24);
            SecretKey llave = new SecretKeySpec(keyByte, "DEsede");
            Cipher descriptar = Cipher.getInstance("DEsede");
            descriptar.init(Cipher.DECRYPT_MODE, llave);
            byte[] text = descriptar.doFinal(mensaje);
            desencriptar = new String(text, "UTF-8");
        }catch(NoSuchAlgorithmException | BadPaddingException | InvalidKeyException | 
                NoSuchPaddingException | UnsupportedEncodingException | IllegalBlockSizeException e){
            e.printStackTrace();
        }catch(Exception ex){
            
        }

        return desencriptar;
        
    }
}
