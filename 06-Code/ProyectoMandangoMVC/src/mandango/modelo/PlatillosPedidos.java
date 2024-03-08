/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.modelo;

/**
 *
 * @author Usuario
 */
public class PlatillosPedidos {
    String nombrePlatillo;
    int cantidad;
    double precioun,ganancia;

    public String getNombrePlatillo() {
        return nombrePlatillo;
    }

    public void setNombrePlatillo(String nombrePlatillo) {
        this.nombrePlatillo = nombrePlatillo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioun() {
        return precioun;
    }

    public void setPrecioun(double precioun) {
        this.precioun = precioun;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public PlatillosPedidos(String nombrePlatillo, int cantidad, double ganancia) {
        this.nombrePlatillo = nombrePlatillo;
        this.cantidad = cantidad;
        this.ganancia = ganancia;
    }

    

    public PlatillosPedidos() {
    }

    @Override
    public String toString() {
        return "Pedidos{" + "nombrePlatillo=" + nombrePlatillo + ", cantidad=" + cantidad + ", precioun=" + precioun + ", ganancia=" + ganancia + '}';
    }
    
}
