package guia8.ej1.poo;

import Entidad.Libro;
import Servicios.LibroServicios;

/**
 *
 * @author aniba
 */
public class Guia8Ej1POO {
 /**
  * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
    Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
    constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
    luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
    numero de páginas.
  * @param args 
  */
    public static void main(String[] args) {
       LibroServicios ls= new LibroServicios();
       Libro a1 = ls.crearLibro();
       ls.MostrarLibro(a1);
    }
    
}
