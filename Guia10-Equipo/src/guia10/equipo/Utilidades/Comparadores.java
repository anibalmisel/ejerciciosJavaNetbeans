/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.equipo.Utilidades;

import guia10.equipo.Entidad.Equipo;
import guia10.equipo.Entidad.Jugador;
import java.util.Comparator;

/**
 *
 * @author aniba
 */
public class Comparadores {
    
    public static Comparator<Jugador> ordenarAlfabeticamenteApellido = new Comparator<Jugador>() {
        @Override
        public int compare(Jugador t, Jugador t1) {
           return t.getLastName().compareToIgnoreCase(t1.getLastName());
        }
    };
    
    public static Comparator<Equipo> ordenarAlfabeticamenteNombre = new Comparator<Equipo>() {
        @Override
        public int compare(Equipo t, Equipo t1) {
           return t.getName().compareToIgnoreCase(t1.getName());
        }
    };
    
    public static Comparator<Equipo> ordenarPorJuegosGanados = new Comparator<Equipo>() {
        @Override
        public int compare(Equipo t, Equipo t1) {
           return t.getGamesWon().compareTo(t1.getGamesWon());
        }
    };
    
}
