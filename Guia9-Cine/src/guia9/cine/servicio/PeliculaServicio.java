/*
 4. Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
22
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package guia9.cine.servicio;

import guia9.cine.entidad.Pelicula;
import guia9.cine.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class PeliculaServicio {
    private Scanner sc;
    ArrayList<Pelicula> movie;
    
    public PeliculaServicio() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.movie = new ArrayList<>();
    }
    
    public ArrayList crearPelicula() {
        
        String yesOrNo;
        do {
            Pelicula film = new Pelicula();
            System.out.println("Type the name of the movie:");
            String title = sc.next();
            film.setTitle(title);
            System.out.println("Type the director's name:");
            String director = sc.next();
            film.setDirector(director);
            System.out.println("Film running time:");
            int duration = sc.nextInt();
            film.setDuration(duration);
            movie.add(film);
            System.out.println("Would you like to enter another film?");
            yesOrNo = sc.next();
        } while (yesOrNo.equalsIgnoreCase("yes"));  
        return movie;
    }
    //• Mostrar en pantalla todas las películas.
    public void showMovie(ArrayList al) {
        System.out.println("List of all the movies");
        for (Object aux : al) {
            System.out.println(aux);
        }
        System.out.println("");
    }
    //• Mostrar en pantalla todas las películas con una duración
    //mayor a 1 hora.
    public void more1houre(ArrayList<Pelicula> al) {
        System.out.println("This movie are the that more one houre");
        for (int i = 0; i < al.size(); i++) {
            int aux = al.get(i).getDuration();
            if (aux>1) {
                System.out.println(al.get(i));
            }
        }
        System.out.println("");
    }
    //• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
    public void sortDurationMayorMenor(ArrayList al) {
        Collections.sort(al, Comparadores.durationMayorMenor);
        System.out.println("Movies sort duration mayor menor: ");
        for (Object durationMaMe : al) {
            System.out.println(durationMaMe);
        }
        System.out.println(""); 
    }
    //• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
     public void sortDurationMenorMayor(ArrayList al) {
        Collections.sort(al, Comparadores.durationMenorMayor);
        System.out.println("Movies sort duration menor mayor: ");
        for (Object durationMeMa : al) {
            System.out.println(durationMeMa);
        }
        System.out.println(""); 
    }
    //• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
      public void sortTitle(ArrayList al) {
        Collections.sort(al, Comparadores.titleAlfabet);
        System.out.println("Movies sort for title: ");
        for (Object title : al) {
            System.out.println(title);
        }
        System.out.println(""); 
    }
    //• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
       public void sortDirectorAlfabet(ArrayList al) {
        Collections.sort(al, Comparadores.directorAlfabeticamente);
        System.out.println("Movies sort for name of director: ");
        for (Object director : al) {
            System.out.println(director);
        }
        System.out.println(""); 
    }
}