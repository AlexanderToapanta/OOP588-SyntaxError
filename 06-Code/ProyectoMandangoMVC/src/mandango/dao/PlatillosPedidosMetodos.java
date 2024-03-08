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
import java.util.List;
import javax.swing.JOptionPane;
import mandango.modelo.PlatillosPedidos;
import org.bson.Document;

/**
 *
 * @author Usuario
 */
public class PlatillosPedidosMetodos implements IPlatillosPedidos {
    Conexion conn = new Conexion();
    MongoDatabase database;
    private MongoCollection collection,coleccionGanacias;
    
    public PlatillosPedidosMetodos() {
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
    public boolean InsertarPlatillosPedidos(PlatillosPedidos ganacias) {
       Document document;
        try{
        document = new Document("nombrePedido",ganacias.getNombrePlatillo())
                .append("cantidad", ganacias.getCantidad())
                .append("ganancias", ganacias.getGanancia());
                coleccionGanacias.insertOne(document);
        }catch (MongoException ex){
            JOptionPane.showMessageDialog(null,"Error de insercion" +ex.toString());
            return false;  
        }   finally{
            cierreConexion();
        }
           return true;
    }

    @Override
    public List<PlatillosPedidos> ListarPlatillosPedidos() {
         List<PlatillosPedidos> listaPedidos = new ArrayList<>();
        FindIterable<Document> documentoPlatillospedidos;
        FindIterable<Document> documentoPlatillos;
        try {
            documentoPlatillos = collection.find();
            documentoPlatillospedidos = coleccionGanacias.find();

            for (Document temp : documentoPlatillospedidos) {
                PlatillosPedidos pedido = new PlatillosPedidos();
                String nombreP = temp.getString("nombrePedido");
                Document platillos = (Document) collection.find(eq("nombreProducto",nombreP)).first();

                pedido.setNombrePlatillo(temp.getString("nombrePedido"));
                pedido.setCantidad(temp.getInteger("cantidad"));
                pedido.setGanancia(temp.getDouble("ganancias"));
                pedido.setPrecioun(platillos.getDouble("precio"));
                listaPedidos.add(pedido);
            }

        } catch (MongoException ex) {

        } finally {
            cierreConexion();
        }

        return listaPedidos;
    }
    
}
