/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.modelo;

/**
 *
 * @author DELL
 */
public class ProductosCafeteria {
        
       private String nombreProducto;
       private int cantidad;
       private double precio;

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ProductosCafeteria(String nombreProducto, int cantidad, double precio) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public ProductosCafeteria() {
    }

    public ProductosCafeteria(int cantidad, double precio) {
        this.cantidad = cantidad;
        this.precio = precio;
    }

   

    @Override
    public String toString() {
        return "ProductosCafeteria{" + "nombreProducto=" + nombreProducto + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
       
       
       
    
}
