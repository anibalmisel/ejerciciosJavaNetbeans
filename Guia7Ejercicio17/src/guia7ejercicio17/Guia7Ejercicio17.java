/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio17;

import static java.lang.Math.floor;
import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class Guia7Ejercicio17 {

    /*
     17. Recorrer un vector de N enteros contabilizando cuántos números son
    de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
    
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Defina el tamaño de su vector:");
        int n = sc.nextInt();
        int[] enteros = new int[n];
        int j = 0;
        int k = 0;
        int l = 0;
        int m = 0;
        int o = 0;
        System.out.println("===============================================");
        for (int i = 0; i < enteros.length; i++) {
           // int entero = enteros[i];
            enteros[i] = (int) (Math.random() * 10000);
            System.out.println("" + enteros[i]);
            String cadenaNumero = String.valueOf(enteros[i]);
            
            

            switch (cadenaNumero.length()) {
                case 5:
                    j = j + 1;
                    break;
                case 4:
                    k = k + 1;
                    break;
                case 3:
                    l = l + 1;
                    break;
                case 2:
                    m = m + 1;
                    break;
                case 1:
                    o = o + 1;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        System.out.println("===============================================");
        System.out.println("En el vector existen " + j + " numeros de 5 digitos");
        System.out.println("");
        System.out.println("En el vector existen " + k + " numeros de 4 digitos");
        System.out.println("");
        System.out.println("En el vector existen " + l + " numeros de 3 digitos");
        System.out.println("");
        System.out.println("En el vector existen " + m + " numeros de 2 digitos");
        System.out.println("");
        System.out.println("En el vector existen " + o + " numeros de 1 digito");
        System.out.println("");
         
       
        /*
        56789
         int num = 123;
            String str = String.valueOf(num);
            System.out.println(str); // Imprime "123"
        */

        
        
        
        
    }
    
}
