/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg7.ejercicio.pkg20;

import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class Guia7Ejercicio20 {

    /*
      EJERCICIO 20 DE LA GUIA 7
      Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números
      del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
      idénticas. Crear un programa que permita introducir un cuadrado por teclado
      y determine si este cuadrado es mágico o no. El programa deberá comprobar
      que los números introducidos son correctos, es decir, están entre el 1 y el 9.
      @param args the command line arguments
     */
    public static void main(String[] args) {

        //Crear un programa que permita introducir un cuadrado por teclado
        //y determine si este cuadrado es mágico o no.
        Scanner sc = new Scanner(System.in);
        int element;
        int element2;
        boolean bandera = true;
        int matriz[][] = new int[3][3];

        System.out.println("   Introduzca los números de la matriz");
        System.out.println(" Deben ser números del 1 al 9 sin repetir:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                element = sc.nextInt();
                if (element>0 && element<10) {
                    matriz[i][j] = element;
                }else{
                    System.out.println(" El número que ingresaste no es válido\n Instroduzca un número entre 1 y 9");
                    i=--i;
                }
            }
            System.out.println(" ");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                element2=matriz[i][j];
                System.out.print(" "+element2);
            }
            System.out.println(" ");
        }
        System.out.println("");
    }
}
