package guia9.cine.utilidades;

import guia9.cine.entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author aniba
 */
public class Comparadores {
    //• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
    public static Comparator<Pelicula> durationMayorMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuration().compareTo(t.getDuration());
        }
    };
    //• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
    public static Comparator<Pelicula> durationMenorMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuration().compareTo(t1.getDuration());
        }
    };
    //• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    public static Comparator<Pelicula> titleAlfabet = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getTitle().compareTo(t.getTitle());
        }
    };
    //• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public static Comparator<Pelicula> directorAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDirector().compareTo(t.getDirector());
        }
    };        
}