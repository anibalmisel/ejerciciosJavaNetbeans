package guia9.cine.principal;

import guia9.cine.entidad.Pelicula;
import guia9.cine.servicio.PeliculaServicio;
import java.util.ArrayList;

/**
 *
 * @author aniba
 */
public class Guia9Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaServicio ps = new PeliculaServicio();
        Pelicula p1 = new Pelicula();
        ArrayList referent = new ArrayList<>();
       referent = ps.crearPelicula();
       ps.showMovie(referent);
       ps.more1houre(referent);
       ps.sortDurationMayorMenor(referent);
       ps.sortDurationMenorMayor(referent);
       ps.sortTitle(referent);
       ps.sortDirectorAlfabet(referent);
    }
}