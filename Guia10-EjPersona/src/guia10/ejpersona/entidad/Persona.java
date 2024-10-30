/*
EJERCICIO PERSONA
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package guia10.ejpersona.entidad;

/**
 *
 * @author aniba
 */

public class Dni {
    private String serie;
    private String numero;
}

public class Persona {
    private String nombre;
    private String apellido;
    private Dni dni;
}
