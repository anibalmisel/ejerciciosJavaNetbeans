/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.ejercicioanimal.Entidad;

import herencia.ejercicioanimal.Interfaces.AccionGatuna;

/**
 *
 * @author aniba
 */
public class Gato extends Animal implements AccionGatuna {
    
    public Gato() {  
    }

    public Gato(String nombre, String alimento, Integer edad, Object raza) {
        super(nombre, alimento, edad, raza);
    }
    
    
    @Override
    public void hacerRuido() {
        System.out.println("Miauuu miaaauuu Grrrrr!");
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
    public void alimentacion(Animal gato) {
       System.out.println("El gato come: "+gato.getAlimento());
    }
}
