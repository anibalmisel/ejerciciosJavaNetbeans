/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 3; // Tamaño de la matriz
        int[][] matriz = new int[n][n];

// Llenar la matriz
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int valor = (int) (Math.random() * 10); // Generar un valor aleatorio
                matriz[i][j] = valor;
                matriz[j][i] = -valor;
            }
        }

// Imprimir la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

}
