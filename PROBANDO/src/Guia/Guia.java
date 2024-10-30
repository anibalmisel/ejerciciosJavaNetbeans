/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probando;

import java.util.Scanner;
public class PROBANDO {
    /*
      11. Realizar un programa que pida dos números enteros positivos por
      teclado y muestre por pantalla el siguiente menú:
                               MENU
                           1. Sumar
                           2. Restar
                           3. Multiplicar
                           4. Dividir
                           5. Salir
                           Elija opción:
      El usuario deberá elegir una opción y el programa deberá mostrar el 
      resultado por pantalla y luego volver al menú. El programa deberá
      ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el 
      usuario selecciona la opción 5, en vez de salir del programa directa-
      mente, se debe mostrar el siguiente mensaje de confirmación: ¿Está 
      seguro que desea salir del programa (S/N)? Si el usuario selecciona el
      carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar 
      el menú.
     @utor IA Microsoft Chat Bing
    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, opcion;
        do {
            System.out.println("Ingrese dos números enteros positivos:");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        } while (num1 < 0 || num2 < 0);

        do {
            System.out.println("MENU\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir entre cero.");
                    } else {
                        System.out.println("La división es: " + ((double) num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String confirm = sc.next();
                    if (confirm.equalsIgnoreCase("S")) {
                        System.out.println("Saliendo...");
                    } else {
                        //continue;
                        opcion = 0;
                    }
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }
}