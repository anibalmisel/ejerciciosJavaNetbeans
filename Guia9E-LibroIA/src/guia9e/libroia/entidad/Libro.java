/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9e.libroia.entidad;

/**
 *
 * @author aniba
 */
public class Libro {
    // Atributos de la clase Libro

    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
// Constructor por defecto

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.ejemplares = 0;
        this.prestados = 0;
    }
// Constructor con parámetros

    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }
// Métodos setters y getters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getEjemplares() {
        return this.ejemplares;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public int getPrestados() {
        return this.prestados;
    }
// Método prestamo que incrementa el atributo prestados si hay ejemplares disponibles

    public boolean prestamo() {
        if (this.ejemplares > this.prestados) {
// Si hay ejemplares disponibles
            this.prestados++;
// Se incrementa el atributo prestados
            return true;
// Se devuelve true
        } else {
// Si no hay ejemplares disponibles
            return false;
// Se devuelve false
        }
    }
// Método devolucion que decrementa el atributo prestados si hay ejemplares prestados

    public boolean devolucion() {
        if (this.prestados > 0) {
// Si hay ejemplares prestados
            this.prestados--;
// Se decrementa el atributo prestados
            return true;
// Se devuelve true
        } else {
// Si no hay ejemplares prestados
            return false;
// Se devuelve false
        }
    }
// Método toString para mostrar los datos de los libros

    public String toString() {
        return "Título: " + this.titulo + "\nAutor: " + this.autor + "\nEjemplares: " + this.ejemplares + "\nPrestados: " + this.prestados;
    }
}