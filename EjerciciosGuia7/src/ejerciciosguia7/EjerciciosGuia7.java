/*
Esto es un comentario largo en java
 */
package ejerciciosguia7;

import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class EjerciciosGuia7 {

    /**
     * @param args the command line arguments
     * EJERCICIO 7
     Considera que estás desarrollando una web para una empresa que fabrica motores
     (suponemos que se trata del tipo de motor de una bomba para mover fluidos).
     Definir una variable tipoMotor y permitir que el usuario ingrese un valor 
     entre 1 y 4. El programa debe mostrar lo siguiente:
          o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
          o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
          o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
          o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
          o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”
     * 
     * 
     */
    public static void main(String[] args) {
        
        /*
         EJERCICIO 7
          Considera que estás desarrollando una web para una empresa que fabrica motores
         (suponemos que se trata del tipo de motor de una bomba para mover fluidos).
         Definir una variable tipoMotor y permitir que el usuario ingrese un valor 
         entre 1 y 4. El programa debe mostrar lo siguiente:
          o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
          o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
          o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
          o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
          o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”
        */
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero que corresponda para elegir el tipo de motor que desea:");
        System.out.println("Motor tipo 1. Marque '1'");
        System.out.println("Motor tipo 2. Marque '2'");
        System.out.println("Motor tipo 3. Marque '3'");
        System.out.println("Motor tipo 4. Marque '4'");
        int tipoMotor = leer.nextInt();
        
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
    }
}