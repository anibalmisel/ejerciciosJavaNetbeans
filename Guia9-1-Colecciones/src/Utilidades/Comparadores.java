package Utilidades;

import Entidad.Perro;
import java.util.Comparator;

/**
 *
 * @author aniba
 */
public class Comparadores {
 public static Comparator<Perro> ordenarPorNombreDesc = new Comparator<Perro>() {
     @Override
     public int compare(Perro t, Perro t1) {
         return t1.getRaza().compareTo(t.getRaza());
     }
 };
}