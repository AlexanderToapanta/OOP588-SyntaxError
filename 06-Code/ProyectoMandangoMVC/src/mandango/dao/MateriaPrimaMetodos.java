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
import mandango.modelo.MateriaPrima;
import org.bson.Document;

/**
 *
 * @author Usuario
 */
public class MateriaPrimaMetodos implements IMateriaPrima{
    Conexion conn = new Conexion();
 MongoDatabase database;
  private MongoCollection coleccionMateriprima;

    public MateriaPrimaMetodos() {
        if (conn != null) {
            this.conn = conn.crearConexion();
            this.database = conn.getDataB();
            this.coleccionMateriprima = database.getCollection("MateriaPrima");
            
            
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
    public List<MateriaPrima> ListarMateriaPrima() {
       List<MateriaPrima> listamateriaprima = new ArrayList<>();
         FindIterable<Document> documento;
        try{
            documento=coleccionMateriprima.find();
        for (Document buscar : documento){
            
            String nombreMateria = buscar.getString("nombreMateriaP");
            int cantidad = buscar.getInteger("cantidad");
            double precio = buscar.getDouble("precio");
            Date fecha = buscar.getDate("fecha");
            MateriaPrima materia = new MateriaPrima(nombreMateria, cantidad, precio,fecha);
            listamateriaprima.add(materia);
        }
        
        
        }catch (MongoException ex){
            JOptionPane.showMessageDialog(null,"Error al consultar datos"+ex.getMessage());
        }finally{
           cierreConexion();
        }
        return listamateriaprima;
    
    }

    @Override
    public boolean InsertarMateriaPrima(MateriaPrima materia) {
       Document documento;
        try{
            documento = new Document ("nombreMateriaP",materia.getNombreMateriPrima())
                    .append("cantidad", materia.getCantidad())
                    .append("precio", materia.getPrecio())
                    .append("fecha", materia.getFgastos());
            coleccionMateriprima.insertOne(documento);
        }catch(MongoException ex){
                    
                    }finally{
                            cierreConexion();
                            }
                    return true;
    }
    
}
