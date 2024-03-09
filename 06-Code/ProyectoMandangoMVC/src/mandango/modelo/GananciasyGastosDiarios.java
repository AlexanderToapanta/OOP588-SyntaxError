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
public class GananciasyGastosDiarios {
    private Date dia;
    private double ganancias,gastos;

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public double getGanancias() {
        return ganancias;
    }

    public void setGanancias(double ganancias) {
        this.ganancias = ganancias;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public GananciasyGastosDiarios() {
    }

    public GananciasyGastosDiarios(Date dia, double ganancias, double gastos) {
        this.dia = dia;
        this.ganancias = ganancias;
        this.gastos = gastos;
    }

    @Override
    public String toString() {
        return "GananciasyGastosDiarios{" + "dia=" + dia + ", ganancias=" + ganancias + ", gastos=" + gastos + '}';
    }
    
}
