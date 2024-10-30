/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio18;

/**
 *
 * @author aniba
 */
public class Guia7Ejercicio18 {

    /*
     Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
     y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A
     se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
    */
    public static void main(String[] args) {
        
        //Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
        int matriz [][]=new int [4][4];
        System.out.println("");
        System.out.println("MATRIZ A");
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                matriz[i][j]= (int) (Math.random()*100);
                
                System.out.print(" "+matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("====================");
        System.out.println("");
        
        System.out.println("MATRIZ B TRASPUESTA");
        System.out.println("");
        int matrizB [][]= new int[4][4];
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                
                matrizB [i][j]= matriz[i][j];
                             
                System.out.print(" "+matrizB[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
