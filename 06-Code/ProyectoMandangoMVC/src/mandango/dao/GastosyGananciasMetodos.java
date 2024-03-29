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
import mandango.modelo.GananciasyGastosDiarios;
import mandango.modelo.ProductosCafeteria;
import org.bson.Document;

/**
 *
 * @author Usuario
 */
public class GastosyGananciasMetodos implements IGatosyGanciasD {
 Conexion conn = new Conexion();
    MongoDatabase database;
    private MongoCollection coleccioncaja;

    public GastosyGananciasMetodos() {
        if (conn != null) {
            this.conn = conn.crearConexion();
            this.database = conn.getDataB();
            this.coleccioncaja = database.getCollection("GanaciasyCostosDiarios");
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
    public boolean GastosyGanacias(GananciasyGastosDiarios caja) {
          Document document;
        try{
        document = new Document("Dia",caja.getDia())
                .append("ganacias", caja.getGanancias())
                .append("gastos", caja.getGastos())
                .append("TotalDiario", caja.getTotal());
                coleccioncaja.insertOne(document);
        }catch (MongoException ex){
            JOptionPane.showMessageDialog(null,"Error de insercion" +ex.toString());
            return false;  
        }   finally{
            Cierre();
        }
           return true;
    }

    @Override
    public List<GananciasyGastosDiarios> ListaGanaciasDiarias() {
       
    FindIterable<Document> documento;
        List<GananciasyGastosDiarios> ListaPerfiles = new ArrayList<>();
        try{
            documento=coleccioncaja.find();
        for (Document buscar : documento){
           Date day = buscar.getDate("Dia");
           GananciasyGastosDiarios registro = new  GananciasyGastosDiarios(day);
            ListaPerfiles.add(registro);
        }
        
        }catch (MongoException ex){
            JOptionPane.showMessageDialog(null,"Error al consultar datos"+ex.getMessage());
        }finally {
            Cierre();
        }
    return ListaPerfiles;
}
}
