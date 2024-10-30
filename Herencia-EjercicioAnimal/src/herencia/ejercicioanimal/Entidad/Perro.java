/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.ejercicioanimal.Entidad;

import herencia.ejercicioanimal.Interfaces.AccionPerruna;

/**
 *
 * @author aniba
 */
public class Perro extends Animal implements AccionPerruna {

    public Perro() {
    }

    public Perro(String nombre, String alimento, Integer edad, Object raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void hacerRuido() {
        System.out.println("Guau Guau Rrrrrr!");
    }
    
    @Override
    public void alimentacion(Animal perro) {
       System.out.println("El perro come: "+perro.getAlimento());
    }

    @Override
    public void vacuna() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ladrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
