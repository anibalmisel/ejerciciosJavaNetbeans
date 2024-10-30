/*
 1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

 */
package guia9.pkg1.colecciones;

import Servicio.PerroServicio;

/**
 *
 * @author aniba
 */
public class Guia91Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PerroServicio ps = new PerroServicio();
        ps.razaPerros();
        System.out.println("----------------------------------");
        ps.buscarEliminarOrdenar();
    }   
}