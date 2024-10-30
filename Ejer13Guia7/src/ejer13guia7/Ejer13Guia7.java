/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer13guia7;

import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class Ejer13Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*
        EJERCICIO 13
        Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad
        de compañeros de equipo y define su tipo de dato de tal manera 
        que te permita alojar sus nombres más adelante.
     */
     
       
        Scanner leer= new Scanner(System.in);
        String[]nombre=new String [3];
        System.out.println("Escriban sus nombres: ");
        
        for (int i = 0; i < 3; i++) {
            nombre[i]= leer.nextLine();
        }
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            if (i<1) {
                System.out.print(nombre[i]+", ");
            } else if (i==1){
                System.out.print(nombre[i]);
            } else {
                System.out.print(" y "+nombre[i]+".");
            }
        }
        System.out.println("");
        System.out.println("");
    }
    
}
