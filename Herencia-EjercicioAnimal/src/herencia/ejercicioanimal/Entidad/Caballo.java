/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.ejercicioanimal.Entidad;

import herencia.ejercicioanimal.Interfaces.AccionEquina;

/**
 *
 * @author aniba
 */
public class Caballo extends Animal implements AccionEquina {

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, Integer edad, Object raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void hacerRuido() {
        System.out.println("Hola Mundo");
    }

    @Override
    public void energia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vacuna() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void alimentacion(Animal caballo) {
       System.out.println("El caballo come: "+caballo.getAlimento());
    }
       
}