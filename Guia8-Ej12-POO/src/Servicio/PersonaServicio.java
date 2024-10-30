package Servicio;

import Entidad.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PersonaServicio {
//crearPersona(). Este método rellena el objeto mediante un Scanner
//y le pregunta al usuario el nombre y la fecha de nacimiento de la 
//persona a crear, recordemos que la fecha de nacimiento debe guardarse
//en un Date y los guarda en el objeto.

    public Persona crearPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor escriba su nombre");
        String nombre = sc.nextLine();
        System.out.println("Por favor ingrese año de nacimiento");
        int anio = sc.nextInt();
        System.out.println("Por favor ingrese mes de nacimiento");
        int mes = sc.nextInt();
        System.out.println("Por favor ingrese día de nacimiento");
        int dia = sc.nextInt();
      //  sc.close(); no lo cerramos aqui, sino al final en el main
      //para evitar el error: java.util.NoSuchElementException
        LocalDate fechaN = LocalDate.of(anio, mes, dia);
        return new Persona(nombre, fechaN);
    }
//Escribir un método calcularEdad() a partir de la fecha de nacimiento
//ingresada. Tener en cuenta que para conocer la edad de la persona
//también se debe conocer la fecha actual.

    public void calcularEdad(Persona p1) {
        LocalDate fechaActual = LocalDate.now();
        p1.getFechaN();
        Period edad = p1.getFechaN().until(fechaActual);
        System.out.println("Edad: " + edad.getYears() + " años");
        /*
     public int calcularEdad() {
     LocalDate fechaActual = LocalDate.now();
     long years = ChronoUnit.YEARS.between(fechaNacimiento, fechaActual);
        //El método se utiliza para obtener la diferencia en años entre
        dos fechas. Toma dos parámetros de tipo y devuelve
        el número de años completos entre esas dos fechas.
     return (int) years;
     }
     En este código mejorado, se utiliza el método de la clase para obtener 
     la diferencia en años entre la fecha de nacimiento y la fecha actual.
     Luego, se convierte esta diferencia en un valor entero y se devuelve
     como resultado del método . Esta mejora permite utilizar el valor de 
     la edad en otros lugares de tu programa, en lugar de simplemente 
     imprimirlo.
         */
    }
//Agregar a la clase el método menorQue(int edad) que recibe como
//parámetro otra edad y retorna true en caso de que el receptor tenga
//menor edad que la persona que se recibe como parámetro, o false en
//caso contrario.

    public boolean menorQue(int edad, Persona p1) {

        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento = fechaActual.minusYears(edad);
//El método de la clase LocalDate:minusYears, calcula la fecha de
//nacimiento de la persona 

        return fechaNacimiento.isAfter(p1.getFechaN());
    }

//Metodo mostrarPersona(): este método muestra la persona creada en el método
//anterior.
    public void mostrarPersona(Persona p1){
        System.out.println("Esta persona se llama "+p1.getNombre()+", y nació en la fecha: "+p1.getFechaN());
    }
}