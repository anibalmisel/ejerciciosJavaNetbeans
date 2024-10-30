/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidades.Dni;
import Entidades.Persona;
import java.util.Comparator;

/**
 *
 * @author aniba
 */
public class Comparadores {
    
    public static Comparator<Dni> ordenarDeManeraAscendente = new Comparator<Dni> () {
        @Override
        public int compare(Dni t, Dni t1) {
            return t.getNumero().compareTo(t1.getNumero());
        }
    };
    
    public static Comparator<Persona> ordenarAlfabeticamente = new Comparator <Persona>() {
        @Override
        public int compare(Persona t, Persona t1) {
            return t.getNombre().compareToIgnoreCase(t1.getNombre());
        }
    };
}