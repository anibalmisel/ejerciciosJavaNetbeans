/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author aniba
 */
public class Libro {
    
    //Defino los atributos
    
    private String ISBN;
    private String titulo;
    private String autor;
    private Integer numeroPag;
    
    //Defino contructor por defecto

    public Libro() {
    }
    
    //Defino constructor por parametros
    
    public Libro(String ISBN, String titulo, String autor, Integer numeroPag){
        this.ISBN=ISBN;
        this.titulo=titulo;
        this.autor=autor;
        this.numeroPag=numeroPag;
    }
    
    //Defino los metodos propios getter & setter

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroPag() {
        return numeroPag;
    }

    public void setNumeroPag(Integer numeroPag) {
        this.numeroPag = numeroPag;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroPag=" + numeroPag + '}';
    }
}
