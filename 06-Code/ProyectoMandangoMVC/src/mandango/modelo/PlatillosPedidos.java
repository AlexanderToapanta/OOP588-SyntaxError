/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.modelo;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class PlatillosPedidos {
   private String nombrePlatillo;
    private int cantidad;
    private double precioun,ganancia;
    private Date Fganancias;

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

    public Date getFganancias() {
        return Fganancias;
    }

    public void setFganancias(Date Fganancias) {
        this.Fganancias = Fganancias;
    }

    public PlatillosPedidos(String nombrePlatillo, int cantidad, double ganancia) {
        this.nombrePlatillo = nombrePlatillo;
        this.cantidad = cantidad;
        this.ganancia = ganancia;
    }

    

    public PlatillosPedidos() {
    }

    public PlatillosPedidos(String nombrePlatillo, int cantidad, double ganancia, Date Fganancias) {
        this.nombrePlatillo = nombrePlatillo;
        this.cantidad = cantidad;
        this.ganancia = ganancia;
        this.Fganancias = Fganancias;
    }

    

   
@Override
    public String toString() {
        return "PlatillosPedidos{" + "nombrePlatillo=" + nombrePlatillo + ", cantidad=" + cantidad + ", precioun=" + precioun + ", ganancia=" + ganancia + ", Fganancias=" + Fganancias + '}';
    }
    
}
