/*
 Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set.
 */
package Entidad;

import java.time.LocalDate;

/**
 *
 * @author aniba
 */
public class Persona {
    //atributos
    private String nombre;
    //LocalDate fecha = LocalDate.of(anio, mes, dia);
    private LocalDate fechaN;
    //constructor
    public Persona(){
        
    }

    public Persona(String nombre, LocalDate fechaN) {
        this.nombre = nombre;
        this.fechaN = fechaN;
    }
    
    //getters & setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaN() {
        return fechaN;
    }

    public void setFechaN(LocalDate fechaN) {
        this.fechaN = fechaN;
    }
    
    //toString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaN=" + fechaN + '}';
    }
}
