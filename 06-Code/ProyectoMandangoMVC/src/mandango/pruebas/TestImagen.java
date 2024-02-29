/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mandango.pruebas;

import mandango.dao.ImagenMetodos;
import mandango.modelo.Imagenes;

/**
 *
 * @author DELL
 */
public class TestImagen {
    
    ImagenMetodos repositorio = new ImagenMetodos();
    
    public void testImagenes() {
        Imagenes imagen = null ;
        imagen = repositorio.AgregarImagen(imagen);
        
        if(imagen != null)
            System.out.println("Imagen Anadida");
        else
            System.out.println("Error");
    
        
    }
    
    public static void main(String[] args) {
        TestImagen test = new TestImagen();
        test.testImagenes();
    }
}
