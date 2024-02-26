/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.modelo;

/**
 *
 * @author DELL
 */
public class MateriaPrima {
    
    private String nombreMateriPrima;
    private int cantidad;
    private double precio;

    public String getNombreMateriPrima() {
        return nombreMateriPrima;
    }

    public void setNombreMateriPrima(String nombreMateriPrima) {
        this.nombreMateriPrima = nombreMateriPrima;
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

    public MateriaPrima(String nombreMateriPrima, int cantidad, double precio) {
        this.nombreMateriPrima = nombreMateriPrima;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public MateriaPrima() {
    }

    @Override
    public String toString() {
        return "MateriaPrima{" + "nombreMateriPrima=" + nombreMateriPrima + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
    
    
}
