package primerobjetoejercicio01;


import java.util.Scanner;
import primerobjetoejercicio01.Entidad.Persona;
import primerobjetoejercicio01.Servicios.ServicioPersona;

public class PrimerObjetoEjercicio01 {

    public static void main(String[] args) {

        Scanner ejemplo = new Scanner(System.in);
        ServicioPersona paciente= new ServicioPersona();
        Persona usuario1 = paciente.crearPersona();
        System.out.println(usuario1.toString());
        System.out.println(" ");
        //usuario1
        System.out.println("Por favor introduzca su fecha de nacimiento en este formato 'yyyy-MM-dd': \n");
        String fNacimiento = ejemplo.next();
        //Date fechaNacimiento = new Date(ejemplo.next());
        Persona p1 = new Persona("Anibal Alberto", "Misel Aray", "Hombre");
        p1.setEdad(p1.calculoEdad(fNacimiento));
        System.out.println("");
        //usuario2
        System.out.println("Introduzca la fecha de nacimiento de su esposa:\n");
        String fNacimiento2 = ejemplo.next();
        //fechaNacimiento = new Date(ejemplo.next());
        Persona p2 = new Persona("Gerdi Alexandra", "Santoyo Chassaigne", "Mujer");
        p2.setEdad(p2.calculoEdad(fNacimiento2));
        System.out.println("");

        //imprimo respuesta
        System.out.println(" Este " + p1.getSexo() + " se llama " + p1.getNombre() + " " + p1.getApellido() + " y tiene " + p1.getEdad() + " años de edad");
        System.out.println("");
        System.out.println(" Y su " + p2.getSexo() + " se llama " + p2.getNombre() + " " + p2.getApellido() + " la cual, tiene " + p2.getEdad() + " años de edad");
        System.out.println("");
        System.out.println("-------------------------------------------------------------------------");

    }

    //    System.out.println("Si coloco solo p1, me mostrará el espacio de memoria asignada a la variable: \n" + p1);
    //        System.out.println("");
    //        System.out.println("De igual manera si coloco: " + p1.toString());
    //METODO UNO USANDO LA CLASE DATE
    //        Date fechaNacimiento = new Date("2000/01/01");
    //        Date fechaActual = new Date();
    //        int edad = (int) ((fechaActual.getTime() - fechaNacimiento.getTime()) / 31536000000L);
    //        System.out.println("La edad del usuario es: " + edad);
    //METODO DOS SIN LA CLASE DATE
    //        LocalDate fechaNacimiento = LocalDate.of(2000, 1, 1);
    //        LocalDate fechaActual = LocalDate.now();
    //        int edad = Period.between(fechaNacimiento, fechaActual).getYears();
    //        System.out.println("La edad del usuario es: " + edad);
}
