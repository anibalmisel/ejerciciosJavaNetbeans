/*
 Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos
repetidos. Para ello, se debe crear una clase llamada Libro que guarde la información de
cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
● Constructor por defecto.
● Constructor con parámetros.
● Métodos Setters/getters
● Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca
en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
método se incrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
● Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
método decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
caso contrario.
● Método toString para mostrar los datos de los libros.
 */
package guia9e.libroia;

import guia9e.libroia.entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class Guia9ELibroIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
// Crear un HashSet de tipo Libro para guardar los libros creados
        HashSet<Libro> conjunto = new HashSet<Libro>();
// Variable para controlar el bucle
        boolean seguir = true;
// Bucle para crear libros y guardarlos en el conjunto
        while (seguir) {
// Pedir al usuario los datos del libro y crear un objeto Libro con ellos
            System.out.println("Ingrese los datos del libro:");
            System.out.print("Título: ");
            String titulo = sc.nextLine();
            System.out.print("Autor: ");
            String autor = sc.nextLine();
            System.out.print("Ejemplares: ");
            int ejemplares = sc.nextInt();
            System.out.print("Prestados: ");
            int prestados = sc.nextInt();
            sc.nextLine();
// Limpiar el buffer
            Libro libro = new Libro(titulo, autor, ejemplares, prestados);
// Guardar el libro en el conjunto si no está repetido
            if (conjunto.add(libro)) {
                System.out.println("El libro se ha guardado correctamente.");
            } else {
                System.out.println("El libro ya existe en el conjunto.");
            }
// Preguntar al usuario si quiere crear otro libro o no
            System.out.println("¿Desea crear otro libro? (s/n)");
            String respuesta = sc.nextLine();
// Si la respuesta es n, se cambia el valor de la variable seguir a false para salir del bucle
            if (respuesta.equalsIgnoreCase("n")) {
                seguir = false;
            }
        }

// Mostrar el contenido del conjunto de libros
        System.out.println("El conjunto de libros es:");
        for (Libro l : conjunto) {
            System.out.println(l);
        }
        
        //● Método prestamo(): El usuario ingresa el titulo del libro que 
        //quiere prestar y se lo busca en el conjunto. Si está en el conjunto,
        //se llama con ese objeto Libro al método.
        
        System.out.println("Solicitud de prestamo");
        System.out.println("");
        System.out.println("Ingrese el titulo del libro que quiere prestar: ");
        String tituloPrestamo = sc.nextLine();
        
        if (conjunto.contains(tituloPrestamo)== true) {
            System.out.println("FUNCIONA");
        }
        
        
        
        // Cerrar el objeto Scanner
        sc.close();
        
    }

}
