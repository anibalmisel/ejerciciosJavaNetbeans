/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerg7ex10;

import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class EjerG7Ex10 {

    /**
     * @param args the command line arguments
     * EJERCICIO 10
       Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
       e imprima el número ingresado seguido de tantos asteriscos como indique
       su valor. Por ejemplo:
       5 *****
       3 ***
       11 ***********
       2 **
     */
    public static void main(String[] args) {
        
        /*
          EJERCICIO 10
          Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
          e imprima el número ingresado seguido de tantos asteriscos como indique
          su valor. Por ejemplo:
          5 *****
          3 ***
          11 ***********
          2 **
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cuatro numeros entre 1 y 20:");
        int num=leer.nextInt();
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        int num3=leer.nextInt();
        System.out.print("");
        String nuevaFilasteris=asterisco(num);
        System.out.println(num+" "+nuevaFilasteris);
        nuevaFilasteris=asterisco(num1);
        System.out.println(num1+" "+nuevaFilasteris);
        nuevaFilasteris=asterisco(num2);
        System.out.println(num2+" "+nuevaFilasteris);
        nuevaFilasteris=asterisco(num3);
        System.out.println(num3+" "+nuevaFilasteris);
        System.out.println("");
        /*
        for (int j = 1; j <= num; j++) {          
            System.out.print(" *");            
        }
        System.out.println("");
        System.out.print(num1+"");
       */
    }

    public static String asterisco(int num) {
        String filAster="";
        for (int j=0;j<num;j++) {
            filAster+="*";
        }
        System.out.println("");
        return filAster;
    }
}