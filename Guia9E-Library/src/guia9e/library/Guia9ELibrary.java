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
package guia9e.library;

import guia9e.library.entidad.Book;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class Guia9ELibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // bucle que crea un objeto Libro pidiéndole al usuario todos sus datos
        // y los seteandolos en el Libro. Despues, ese Libro se guarda en el
        //conjunto y se le pregunta al usuario si quiere crear otro Libro o no.
        HashSet<Book> biblioteca = new HashSet<>();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String repetir = "si";
        do {
            Book b1 = new Book();
           
            System.out.println("----Vamos a crear un libro---");
            System.out.println("");
            System.out.println("Por favor introduzca el titulo del libro: ");
            String title = sc.next();
            b1.setTitle(title);
            System.out.println("Por favor introduzca el autor del libro: ");
            String autor = sc.next();
            b1.setAutor(autor);
            System.out.println("Por favor introduzca el numero de ejemplares existentes: ");
            String numeroEjemplares = sc.next();
            b1.setNumeroEjemplares(numeroEjemplares);
            System.out.println("Por favor indique la cantidad de ejemplares prestados: ");
            String numeroEjPrestados = sc.next();
            b1.setNumeroEjPrestados(numeroEjPrestados);
            biblioteca.add(b1);
            System.out.println("");
            System.out.println("¿Desea crear otro libro?si/no");
            repetir = sc.next();
            while (!repetir.equalsIgnoreCase("si") & !repetir.equalsIgnoreCase("no")) {
                System.out.println("Error: ¿si o no?");
                repetir = sc.next();
            }
        } while (repetir.equalsIgnoreCase("si"));
        //● Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca
        //en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
        //método se incrementa de a uno, como un carrito de compras, el atributo ejemplares
        //prestados, del libro que ingresó el usuario. Esto sucederá cada vez que se realice un
        //préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
        //disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en
        //caso contrario.
        System.out.println("");
        System.out.println("List of book: ");
        for (Book aux : biblioteca) {
            System.out.println(aux);
        }
        /*  
        Se puede hacer con bucle for each.
        */
        System.out.println("");
        System.out.println("-------Solicitud de Préstamos---------");
        System.out.println("");
        System.out.println("Ingrese el titulo del libro que retira en préstamo:");
        String prestamo = sc.next();
        boolean existe = true;
        Iterator<Book> it = biblioteca.iterator();
        while (it.hasNext()) {
            Book l = it.next();
            if (l.getTitle().equalsIgnoreCase(prestamo)) {
                if (l.prestamo(l) == true) {
                    System.out.println("");
                    System.out.println("El prestamo se hizo efectivo");
                } else {
                    System.out.println("No hay ejemplares disponibles para préstamo");
                }
                existe = false;
            }
        }
        if (existe == true) {
            System.out.println("The indicated book is not in the list: ");
            System.out.println("");
        }
        System.out.println("");
        System.out.println("List of book: ");
        for (Book aux : biblioteca) {
            System.out.println(aux);
        }
        System.out.println("");
        
        /*
          ● Método devolucion(): El usuario ingresa el titulo del libro
            que quiere devolver y se lo busca en el conjunto. Si está en
            el conjunto, se llama con ese objeto al método. El método
            decrementa de a uno, como un carrito de compras, el atributo
            ejemplares prestados, del libro seleccionado por el usuario.
            Esto sucederá cada vez que se produzca la devolución de un
            libro. No se podrán devolver libros donde que no tengan 
            ejemplares prestados. Devuelve true si se ha podido realizar
            la operación y false en caso contrario.
        */
        
        System.out.println("");
        System.out.println("-------Devoluciones---------");
        System.out.println("");
        System.out.println("Ingrese el titulo del libro devuelto:");
        String devolucion = sc.next();
        boolean existe2 = true;
        Iterator<Book> it2 = biblioteca.iterator();
        while (it2.hasNext()) {
            Book l = it2.next();
            if (l.getTitle().equalsIgnoreCase(devolucion)) {
                if (l.devolucion(l) == true) {
                    System.out.println("");
                    System.out.println("La devolucion se hizo efectiva");
                } else {
                    System.out.println("No hay ejemplares prestados");
                }
                existe = false;
            }
        }
        if (existe == true) {
            System.out.println("The indicated book is not in the list: ");
            System.out.println("");
        }
        System.out.println("");
        System.out.println(biblioteca.toString());
        System.out.println("");
    }
}