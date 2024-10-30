/*
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
package guia9e.library.entidad;

import java.util.Objects;

/**
 *
 * @author aniba
 */
public class Book {

    private String title;
    private String autor;
    private String numeroEjemplares;
    private String numeroEjPrestados;

    //constructores
    public Book() {
        this.numeroEjemplares = "0";
        this.numeroEjPrestados = "0";
    }

    public Book(String title, String autor, String numeroEjemplares, String numeroEjPrestados) {
        this.title = title;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjPrestados = numeroEjPrestados;
    }

    //getters & setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(String numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public String getNumeroEjPrestados() {
        return numeroEjPrestados;
    }

    public void setNumeroEjPrestados(String numeroEjPrestados) {
        this.numeroEjPrestados = numeroEjPrestados;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.title);
        hash = 67 * hash + Objects.hashCode(this.autor);
        hash = 67 * hash + Objects.hashCode(this.numeroEjemplares);
        hash = 67 * hash + Objects.hashCode(this.numeroEjPrestados);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        if (!Objects.equals(this.numeroEjemplares, other.numeroEjemplares)) {
            return false;
        }
        if (!Objects.equals(this.numeroEjPrestados, other.numeroEjPrestados)) {
            return false;
        }
        return true;
    }

  
    
    /*
     ● Método prestamo(): El usuario ingresa el titulo del libro
       que quiere prestar y se lo busca en el conjunto. Si está en 
       el conjunto, se llama con ese objeto Libro al método. El
       método se incrementa de a uno, como un carrito de compras, 
       el atributo ejemplares prestados, del libro que ingresó el 
       usuario. Esto sucederá cada vez que se realice un préstamo
       del libro. No se podrán prestar libros de los que no queden 
       ejemplares disponibles para prestar. Devuelve true si se ha
       podido realizar la operación y false en caso contrario.
    */
    public boolean prestamo(Book b) {
        boolean operacion = true;
        int incremento = Integer.parseInt(b.numeroEjPrestados); // aplico metodo parseint para transformar string a int
        int decremento = Integer.parseInt(b.numeroEjemplares);
        if (decremento > 1) {
            if (operacion) {
                incremento++;
                b.setNumeroEjemplares(String.valueOf(decremento - 1));
            }
        }else {
            operacion = false;
        }
        b.setNumeroEjPrestados(String.valueOf(incremento));
        return operacion;
    }
    
    /*
     ● Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
       busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
       método decrementa de a uno, como un carrito de compras, el atributo ejemplares
       prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
       produzca la devolución de un libro. No se podrán devolver libros donde que no tengan
       ejemplares prestados. Devuelve true si se ha podido realizar la operación y false en
       caso contrario.
    */
    public boolean devolucion(Book b) {
        boolean devolver = true;
        int decremento = Integer.parseInt(b.numeroEjPrestados);
        int incremento = Integer.parseInt(b.numeroEjemplares);
        if (decremento > 0) {
            if (devolver == true) {
                decremento--;
                b.setNumeroEjemplares(String.valueOf(incremento + 1));
            }
        }else {
            devolver = false;
        }
        b.setNumeroEjPrestados(String.valueOf(decremento));
        return devolver;
    }
    //toString
    @Override
    public String toString() {
        return "Book{" + "title = " + title + ", autor = " + autor + ", numeroEjemplares = " + numeroEjemplares + ", numeroEjPrestados = " + numeroEjPrestados + '}';
    }
}
