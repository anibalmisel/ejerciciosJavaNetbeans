/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerobjetoejercicio01.Servicios;

import java.util.Scanner;
import primerobjetoejercicio01.Entidad.Persona;

/**
 *
 * @author aniba
 */
public class ServicioPersona {
    
    private Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona (){
        
        System.out.println("Introduzca su nombre:\n");
        String nombre = leer.next();
        System.out.println("Introduzca su apellido:\n");
        String apellido = leer.next();
        System.out.println("Introduzca su sexo:\n");
        String sexo = leer.next();
        System.out.println("Introduzca su edad:\n");
        int edad = leer.nextInt();
        
        return new Persona(nombre, apellido, sexo, edad);
    }
    
    public void calculoEdad (Persona p1){
        
        
        
    }
    
    
    
    
}
