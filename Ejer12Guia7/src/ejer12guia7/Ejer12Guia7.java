/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer12guia7;

import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class Ejer12Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*
       EJERCICIO 12
     Crea un procedimiento EsMultiplo que reciba los dos números pasados 
     por el usuario, validando que el primer numero múltiplo del segundo e
     imprima si el primer numero es múltiplo del segundo, sino informe que 
     no lo son. 
     */
    Scanner leer= new Scanner(System.in);    
    System.out.println("Ingrese dos numeros para determinar si son multiplos: ");
    int num= leer.nextInt();
    int num2= leer.nextInt();
    EsMultiplo(num,num2);
    
    }
    
    public static void EsMultiplo (int num, int num2){
        if (num%num2==0) {
            System.out.println("El numero "+num+" es multiplo de "+num2);
        }else{
            System.out.println("El numero "+num+" no es multiplo de "+num2);
        }
    }
}