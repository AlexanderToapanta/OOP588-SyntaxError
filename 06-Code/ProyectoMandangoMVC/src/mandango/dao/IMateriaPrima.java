/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mandango.dao;

import java.util.List;
import mandango.modelo.MateriaPrima;

/**
 *
 * @author DELL
 */
public interface IMateriaPrima {
    
     public List<MateriaPrima> ListarMateriaPrima();
     public boolean InsertarMateriaPrima(MateriaPrima materia);
    
}
