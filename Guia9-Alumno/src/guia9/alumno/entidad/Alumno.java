/*
 3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
 */
package guia9.alumno.entidad;

import java.util.ArrayList;

/**
 * @author aniba
 */
public class Alumno {
    //atributos
    private String nombre;
    private ArrayList<Integer> notas;
    //constructores
    public Alumno() {
        this.notas = new ArrayList<>();
    }
    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    //getters & setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Integer> getNotas() {
        return notas;
    }
    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    public void recorrerColecciones(){
        for (Integer notasEstudiante : notas) {
            System.out.println(notasEstudiante);
        }
    }
//toString
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }   
}