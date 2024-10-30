package guia8.ej12.poo;

import Entidad.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;

/**
 * @author aniba
 */
public class Guia8Ej12POO {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona p1 = new Persona();
        PersonaServicio ps= new PersonaServicio();
        
        p1=ps.crearPersona();
        ps.calcularEdad(p1);
        System.out.println("Ingrese una nueva edad para definir si es anterior a la primera");
        int nuevaE = sc.nextInt();
        System.out.println(ps.menorQue(nuevaE, p1));
        System.out.println("");
        ps.mostrarPersona(p1);
        System.out.println("");
        sc.close();
    }
}