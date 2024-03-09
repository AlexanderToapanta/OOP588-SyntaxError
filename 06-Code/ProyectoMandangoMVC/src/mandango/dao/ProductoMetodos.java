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
import java.util.List;
import javax.swing.JOptionPane;
import mandango.modelo.ProductosCafeteria;
import org.bson.Document;

/**
 *
 * @author DELL
 */
public class ProductoMetodos implements IProducto{
    
    Conexion conn = new Conexion();
    MongoDatabase database;
    private MongoCollection collection,coleccionGanacias;
    
    public ProductoMetodos() {
        if (conn!=null){
            this.conn=conn.crearConexion();
            this.database = conn.getDataB();
            this.collection = database.getCollection("ProductosCafeteria");
            this.coleccionGanacias = database.getCollection("GanaciasPlatillos");
        }
        }
    
    private void cierreConexion(){
       try{
           conn.getMongo().close();
       }catch (MongoException ex){
           JOptionPane.showMessageDialog(null, "Error al conectar"+ex.toString());
       }
        
    }

    @Override
    public boolean InsertarProductos(ProductosCafeteria producto) {
    Document document;
        try{
        document = new Document("nombreProducto",producto.getNombreProducto())
                .append("cantidad", producto.getCantidad())
                .append("precio", producto.getPrecio());
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
    public List<ProductosCafeteria> ListarProductos() {
    FindIterable<Document> documento;
        List<ProductosCafeteria> ListaPerfiles = new ArrayList<ProductosCafeteria>();
        try{
            documento=collection.find();
        for (Document buscar : documento){
            String nombreProducto = buscar.getString("nombreProducto");
            int cantidad = buscar.getInteger("cantidad");
            double precio = buscar.getDouble("precio");
            ProductosCafeteria productos = new ProductosCafeteria(nombreProducto, cantidad, precio);
            ListaPerfiles.add(productos);
        }
        
        
        }catch (MongoException ex){
            JOptionPane.showMessageDialog(null,"Error al consultar datos"+ex.getMessage());
        }finally{
           cierreConexion();
        }
        return ListaPerfiles;    
    }

    @Override
    public boolean ActualizarStock(int cantidad, String platillo) {
         Document filtro,update;
           UpdateResult resultado;
           boolean actualizar = false;
        try{
            filtro = new Document("nombreProducto",platillo);
            update = new Document ("$set",new Document ("cantidad",cantidad));
            resultado = collection.updateOne(filtro, update);
        }catch (MongoException ex){
            JOptionPane.showMessageDialog(null,"Error al actualizar" +ex.toString());
            return false;  
        }   finally{
             cierreConexion();
        }
           return true; 
    }

    @Override
    public boolean ActulizarStockyPrecio(ProductosCafeteria producto) {
         Document filtro,update;
           UpdateResult resultado;
           boolean actualizar = false;
        try{
            filtro = new Document("nombreProducto",producto.getNombreProducto());
            update = new Document ("$set",new Document ("cantidad",producto.getCantidad())
            .append("precio", producto.getPrecio()));
            resultado = collection.updateOne(filtro, update);
        }catch (MongoException ex){
            JOptionPane.showMessageDialog(null,"Error al actualizar" +ex.toString());
            return false;  
        }   finally{
             cierreConexion();
        }
           return true; 
    }

  

    
    
   
 }

