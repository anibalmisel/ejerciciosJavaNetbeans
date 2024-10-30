/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciog7ex8;

import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class EjercicioG7Ex8 {

    /**
     * @param args the command line arguments
     * EJERCICIO 8
       Escriba un programa que valide si una nota está entre 0 y 10,
       sino está entre 0 y 10 la nota se pedirá de nuevo hasta que 
       la nota sea correcta.
     */
    public static void main(String[] args) {
        /*
          EJERCICIO 8
          Escriba un programa que valide si una nota está entre 0 y 10,
          sino está entre 0 y 10 la nota se pedirá de nuevo hasta que 
          la nota sea correcta.
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Este programa dira si su nota es valida");
        System.out.println("");
        System.out.println("Introduzca una nota entre 0 y 10:");
        int num = leer.nextInt();
        while(num < 0 || num > 10){
            System.out.println("ingrese una nota valida:");
            num = leer.nextInt();
        }
        System.out.println("");
        System.out.println("Su nota es valida");
        System.out.println("¡Que tenga buen dia!");
        System.out.println("");
    }
}
