/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package guia10.equipo;

import guia10.equipo.Servicios.EquipoServicio;

/**
 *
 * @author aniba
 */
public class Guia10Equipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EquipoServicio es = new EquipoServicio();
        es.crearEquipo();
    }
    
}
