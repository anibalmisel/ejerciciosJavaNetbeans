/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.personaperro.Enumeraciones;

/**
 *
 * @author aniba
 */
public enum DogSize {
    PEQUEÑO ("Pequeño: 0-5 kg"), MEDIANO ("Mediano: 6-10 kg"), GRANDE ("Grande: 11 kg en adelante");
    //atributos
    private String descripcion;
    
    //constructor
    private DogSize(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}