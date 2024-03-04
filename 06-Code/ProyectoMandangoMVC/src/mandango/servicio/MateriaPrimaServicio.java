/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.servicio;

import java.util.List;

import mandango.dao.MateriaPrimaMetodos;
import mandango.modelo.MateriaPrima;


/**
 *
 * @author Usuario
 */
public class MateriaPrimaServicio {
    public static List<MateriaPrima> ListarMateriaPrima(){   
        return new MateriaPrimaMetodos().ListarMateriaPrima();
    }
    
    public static boolean  InsertarMateriaPrima(MateriaPrima materia){
        return new MateriaPrimaMetodos().InsertarMateriaPrima(materia);
    }
}
