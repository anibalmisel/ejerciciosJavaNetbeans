/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicio19;

import java.util.Random;
import java.util.Scanner;

/**
 * Realice un programa que compruebe si una matriz dada es anti simétrica. Se
 * dice que una matriz A es anti simétrica cuando ésta es igual a su propia
 * traspuesta, pero cambiada de signo. Es decir, A es anti simétrica si A = -AT.
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
 * sus filas por columnas (o viceversa).
 *
 * @author Licenciado Anibal Misel
 */
public class Guia7Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*EJERCICIO 18
        Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
(18)    y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A
        se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
         */
        //Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
        int matrizP[][] = new int[4][4];
        System.out.println("");
        System.out.println("MATRIZ A");
        System.out.println("");
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP.length; j++) {

                matrizP[i][j] = (int) (Math.random() * 100);

                System.out.print(" " + matrizP[i][j]);
            }
            System.out.println("");
        }
        System.out.println("====================");
        System.out.println("");

        System.out.println("MATRIZ B TRASPUESTA");
        System.out.println("");
        int matrizB[][] = new int[4][4];
        for (int j = 0; j < matrizP.length; j++) {
            for (int i = 0; i < matrizP.length; i++) {

                matrizB[i][j] = matrizP[i][j];

                System.out.print(" " + matrizB[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("==================================================");

        /*EJERCICIO 19
         Realice un programa que compruebe si una matriz dada es anti simétrica. Se
         dice que una matriz A es anti simétrica cuando ésta es igual a su propia
(19)     traspuesta, pero cambiada de signo. Es decir, A es anti simétrica si A = -AT.
         La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
          sus filas por columnas (o viceversa).
         */
        Scanner sc = new Scanner(System.in);
        int filas = 0;
        int columnas = 0;
        int elemento;
        int elementoT;
        int valores;
        int opcion;
        boolean bandera = true;

        do {
            if (filas != columnas) {
                System.out.println("¡Toda matriz anti-simétrica es cuadrada!\n  De la forma nxn...3x3,2x2,4x4,etc");
            }
            System.out.println("  Defina dimensiones de la matriz:");//toda matriz antisimetrica es cuadrada.
            System.out.println("");
            filas = sc.nextInt();
            columnas = sc.nextInt();
        } while (filas != columnas);
        int[][] matriz = new int[filas][columnas];
        int[][] matrizT = new int[filas][columnas];

        System.out.println(" ");

        do {
            System.out.println("¿Desea introducir de manera manual los elementos de la matriz o prefiere la opcion automatizada?:");
            System.out.println("\n 1- Manual, marque (1)\n 2- Automatizada, marque (2)");
            System.out.println("");
            opcion = sc.nextInt();
            if (opcion != 1 && opcion != 2) {
                System.out.println("¡Incorrecto! introduzca una opcion valida (1) o (2)");
            }
        } while (opcion != 1 && opcion != 2);

        System.out.println("");

//AQUI COMIENZA LA OPCION MANUAL
        if (opcion == 1) {
            System.out.println("Incerte los valores de la matriz");
            System.out.println("");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.println("elemento [" + i + j + "]");
                    valores = sc.nextInt();
                    matriz[i][j] = valores;//(int) (Math.random() * 100);
                }
            }

            System.out.println("");
            System.out.println("===================================");
            System.out.println("");

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    //System.out.print("   " + matriz[i][j]);
                    elemento = matriz[i][j];
                    elementoT = matriz[j][i];
                    if (elemento != elementoT * -1 && elemento != 0 && bandera == true) {
                        System.out.println("      La matriz indicada no es antisimetrica");
                        System.out.println("Al menos un elemento de la matriz traspuesta no coincide");
                        bandera = false;
                        break;
                    }
                    System.out.print("  " + matriz[i][j]);
                }
                System.out.println("");
            }

            System.out.println("");

            while (bandera == true) {
                System.out.println("La matriz es Anti Simetrica");
                System.out.println("");

                for (int j = 0; j < matriz.length; j++) {
                    for (int i = 0; i < matriz.length; i++) {
                        System.out.print("  " + matriz[i][j]);
                    }
                    System.out.println("");
                }
                System.out.println("");
                bandera = false;//aqui se hace falso, importante para que no se vuelva un bucle infinito
            }

//AQUI EMPIEZA LA OPCION AUTOMATIZADA
        } else if (opcion == 2) {

            int[][] matrizAsimetrica = new int[matriz.length][matriz.length];
            int min = 1;
            int max = 2;
            int randomNum;
            Random rand = new Random();//metodo para escoger entre dos numeros al azar
            randomNum = rand.nextInt((max - min) + 1) + min;//elige entre 1 y 2

            switch (randomNum) {
                case 1://Genera una matriz antisimetrica
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = i + 1; j < matriz.length; j++) {
                            int elementosMatriz = (int) (Math.random() * 100);
                            matriz[i][j] = elementosMatriz;
                            matriz[j][i] = -elementosMatriz;
                        }
                    }

                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz.length; j++) {
                            System.out.print(matriz[i][j] + " ");
                        }
                        System.out.println();
                    }

                    System.out.println("");
                    System.out.println("==============================================");
                    System.out.println("");
                    System.out.println("La matriz es Anti Simetrica");
                    System.out.println("");

                    for (int j = 0; j < matriz.length; j++) {
                        for (int i = 0; i < matriz.length; i++) {
                            System.out.print(matriz[i][j] + " ");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    break;

                case 2://Genera una matriz normal

                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz.length; j++) {
                            matriz[i][j] = (int) (Math.random() * 100);
                            int elementosMatriz = matriz[i][j];
                            matrizT[j][i] = elementosMatriz;
                            int elementosMatrizT = matrizT[j][i];
                            System.out.print("  " + matriz[i][j]);
                        }
                        System.out.println("");
                    }
                    System.out.println("");

                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz.length; j++) {
                            int elementosMatriz = matriz[i][j];
                            matrizT[j][i] = elementosMatriz;
                            int elementosMatrizT = matrizT[j][i];
                            if (elementosMatriz != elementosMatrizT * -1 && elementosMatriz != 0 && bandera == true) {
                                System.out.println("      La matriz indicada no es antisimetrica");
                                System.out.println("Al menos un elemento de la matriz traspuesta no coincide");
                                bandera = false;
                                break;
                            }
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    break;
            }
        }
        System.out.println("");
    }
}
