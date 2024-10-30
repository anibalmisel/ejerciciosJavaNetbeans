/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerg7ex13;

import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class EjerG7Ex13 {

    /**
     * @param args the command line arguments
     * EJERCICIO 12
       Crea un procedimiento EsMultiplo que reciba los dos números pasados por
       el usuario, validando que el primer numero múltiplo del segundo y e
       imprima si el primer numero es múltiplo del segundo, sino informe que
       no lo son.
     */
    public static void main(String[] args) {
        
        /*
          EJERCICIO 12
          Crea un procedimiento EsMultiplo que reciba los dos números pasados por
          el usuario, validando que el primer numero múltiplo del segundo y e
          imprima si el primer numero es múltiplo del segundo, sino informe que
          no lo son.
        */
        
        Scanner numero = new Scanner(System.in);
        System.out.print("Ingrese su primer numero: ");
        int n1 = numero.nextInt();
        System.out.print("Ingrese su segundo numero: ");
        int n2 = numero.nextInt();
        multiplicacion(n1, n2);
    }

    public static void multiplicacion(int n1, int n2) {

        if (n1 % n2 == 0) {
            System.out.println("Su primer numero ingresados es multiplo del segundo");
        } else {
            System.out.println("Su primer numero ingresado no es multiplo");
        }
    }
}