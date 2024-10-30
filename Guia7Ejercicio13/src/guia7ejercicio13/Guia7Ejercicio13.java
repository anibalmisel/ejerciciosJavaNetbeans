
package guia7ejercicio13;

import java.util.Scanner;


public class Guia7Ejercicio13 {
  /*
    13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
    Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar 
    lo siguiente:
        * * * *
        *     *
        *     *
        * * * *
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero de lados de su cuadrado: ");
        int lados = sc.nextInt();
        for (int i = 0; i < lados; i++) {
            for (int j = 0; j < lados; j++) {

                if (i == 0 || i == lados - 1) { //if (i == 0 || i == N - 1 || j == 0 || j == N - 1) esta opciondisminuye un if.
                    System.out.print(" *");
                } else if (j == 0 || j == lados - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
}