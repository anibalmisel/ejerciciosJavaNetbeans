/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciog7ex9;

import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class EjercicioG7Ex9 {

    /**
     * @param args the command line arguments
     * EJERCICIO 9
       Escriba un programa que lea 20 números. Si el número leído es igual a cero 
       se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
       El programa deberá calcular y mostrar el resultado de la suma de los
       números leídos, pero si el número es negativo no debe sumarse. 
       Nota: recordar el uso de la sentencia break.
     */
    public static void main(String[] args) {
        
        /*
          EJERCICIO 9
          Escriba un programa que lea 20 números. Si el número leído es igual a cero 
          se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
          El programa deberá calcular y mostrar el resultado de la suma de los
          números leídos, pero si el número es negativo no debe sumarse. 
          Nota: recordar el uso de la sentencia break.
        */

        Scanner leer = new Scanner(System.in);
        int num;
        int i = 0;
        int suma = 0;
        System.out.println("Escriba veinte numeros:");
        while (i < 20) {
            num = leer.nextInt();
            if (num != 0) {
                if (num > 0) {
                    suma = num + suma;
                }
            } else {
                System.out.println("");
                System.out.println("¡Se capturo el numero cero!");
                break;
            }
            i = i + 1;
        }
        System.out.println("");
        System.out.println("La suma de los numeros leidos es: " + suma);
        System.out.println("");
    }
}