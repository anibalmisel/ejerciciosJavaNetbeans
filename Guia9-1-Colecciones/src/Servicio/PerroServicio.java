/*
 2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package Servicio;

import Entidad.Perro;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author aniba
 */

public class PerroServicio {

    private ArrayList<Perro> listaRaza; // Creo la lista
    private Scanner sc; // Creo el Scanner para utilizar en toda mi clase
    private final int numeroDePerros;

    //Esta es una muy buena practica
    public PerroServicio() {
        this.listaRaza = new ArrayList<>(); // Creo el espacio en memoria del LISTA
        this.sc = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
        this.numeroDePerros = listaRaza.size();
    }
    public void razaPerros() {
        String otroPerro = "si";
        while (otroPerro.equalsIgnoreCase("si")) {
            System.out.println("Escriba la raza del perro: ");
            String razaDePerro = sc.nextLine();
           listaRaza.add(new Perro(razaDePerro));
           //TODO Añadir Try and Catch
            System.out.println("¿Quiere guardar otro perro? indique si o no");
            otroPerro = sc.nextLine();
            if (!otroPerro.equalsIgnoreCase("si") & !otroPerro.equalsIgnoreCase("no") ) {
                System.out.println("error: si o no");
                otroPerro = sc.nextLine();
            } 
        }
       listaRaza.forEach((e) ->  System.out.println(e));
    }
    public void buscarEliminarOrdenar() {
        System.out.println("Por favor ingrese el nombre del perro que quiere eliminar de la lista");
        String nombrePerro = sc.nextLine();
        Iterator<Perro> it = listaRaza.iterator();
        int tamanoListaRaza = listaRaza.size();
        
        while (it.hasNext()) {
            Perro var = it.next();
            if (var.getRaza().equalsIgnoreCase(nombrePerro)) {
                it.remove();
            } 
        } 
        if (numeroDePerros==tamanoListaRaza) {
            System.out.println("El nombre indicado no se encuentra en la lista");
        }
        System.out.println("");
        System.out.println("Su lista actualizada: ");
        listaRaza.forEach((e) -> System.out.println(e));
        System.out.println("");
        System.out.println("Su lista ordenada: ");
        Collections.sort(listaRaza, Comparadores.ordenarPorNombreDesc);
        listaRaza.forEach((e) -> System.out.println(e));
    }
}