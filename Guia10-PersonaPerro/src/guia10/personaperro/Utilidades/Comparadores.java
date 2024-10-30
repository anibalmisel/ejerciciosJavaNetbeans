/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.personaperro.Utilidades;

import guia10.personaperro.Entidad.Perro;
import guia10.personaperro.Entidad.Persona;
import java.util.Comparator;

/**
 *
 * @author aniba
 */
public class Comparadores {
    public Comparator<Perro> ordenarRazaAlfabeticamente = new Comparator<Perro>() {
        @Override
        public int compare(Perro t, Perro t1) {
            return t.getDogBreed().compareToIgnoreCase(t1.getDogBreed());
        }
    };
    
    public Comparator<Persona> ordenarNombreAlfabeticamente = new Comparator<Persona>() {
        @Override
        public int compare(Persona t, Persona t1) {
            return t.getFirstName().compareToIgnoreCase(t1.getFirstName());
        }
    };
}