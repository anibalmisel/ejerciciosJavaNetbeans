/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.guia7.teoria;

import java.util.Scanner;

/**
 *
 * @author Lcdo Anibal Misel
 */
public class EjerciciosGuia7Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         EJERCICIO 7
          Considera que estás desarrollando una web para una empresa que fabrica motores
(07)     (suponemos que se trata del tipo de motor de una bomba para mover fluidos).
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

        System.out.println("====================================================");
        /*
          EJERCICIO 8
(08)      Escriba un programa que valide si una nota está entre 0 y 10,
          sino está entre 0 y 10 la nota se pedirá de nuevo hasta que 
          la nota sea correcta.
         */
        //Scanner leer = new Scanner(System.in);
        System.out.println("Este programa dira si su nota es valida");
        System.out.println("");
        System.out.println("Introduzca una nota entre 0 y 10:");
        int num = leer.nextInt();
        while (num < 0 || num > 10) {
            System.out.println("ingrese una nota valida:");
            num = leer.nextInt();
        }
        System.out.println("");
        System.out.println("Su nota es valida");
        System.out.println("¡Que tenga buen dia!");
        System.out.println("");
        System.out.println("====================================================");
        /*
          EJERCICIO 9
(09)      Escriba un programa que lea 20 números. Si el número leído es igual a cero 
          se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
          El programa deberá calcular y mostrar el resultado de la suma de los
          números leídos, pero si el número es negativo no debe sumarse. 
          Nota: recordar el uso de la sentencia break.
         */

        //Scanner leer = new Scanner(System.in);
        int num1;
        int i = 0;
        int suma = 0;
        System.out.println("Escriba veinte numeros:");
        while (i < 20) {
            num1 = leer.nextInt();
            if (num1 != 0) {
                if (num1 > 0) {
                    suma = num1 + suma;
                }
            } else {
                System.out.println("");
                System.out.println("¡Se capturo el numero cero!");
                break;
            }
            i = i + 1;
        }
        System.out.println("");
        System.out.println("La suma de los numeros leidos es: " + suma);
        System.out.println("");
        System.out.println("====================================================");

        /*
          EJERCICIO 10
          Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
(10)      e imprima el número ingresado seguido de tantos asteriscos como indique
          su valor. Por ejemplo:
          5 *****
          3 ***
          11 ***********
          2 **
         */
        //Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cuatro numeros entre 1 y 20:");
        int num2 = leer.nextInt();
        int num3 = leer.nextInt();
        int num4 = leer.nextInt();
        int num5 = leer.nextInt();
        System.out.print("");
        String nuevaFilasteris = asterisco(num2);
        System.out.println(num2 + " " + nuevaFilasteris);
        nuevaFilasteris = asterisco(num3);
        System.out.println(num3 + " " + nuevaFilasteris);
        nuevaFilasteris = asterisco(num4);
        System.out.println(num4 + " " + nuevaFilasteris);
        nuevaFilasteris = asterisco(num5);
        System.out.println(num5 + " " + nuevaFilasteris);
        System.out.println("");
        System.out.println("====================================================");
        
        /*
         EJERCICIO 11 Escribir un programa que procese una secuencia de caracteres
         ingresada por teclado y terminada en punto, y luego codifique la palabra
(11)     o frase ingresada de la siguiente manera: cada vocal se reemplaza por el
         carácter que se indica en la tabla y el resto de los caracteres
         (incluyendo a las vocales acentuadas) se mantienen sin cambios. 
          a e i o u
          @ # $ % *
         Realice un subprograma que reciba una secuencia de caracteres y retorne
         la codificación correspondiente. Utilice la estructura “según” para la
         transformación. Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos
         a las once y 10. La salida del programa debería ser: @y#r, l*n#s, s@l$m%s
         @ l@s %nc# y 10.
        */
        //Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase, la transformare: ");
        System.out.println(" ");
        String cadena = leer.nextLine().toLowerCase();
        String mostrar = cadenaNueva (cadena);
        System.out.println(mostrar);
        System.out.println("");
        
        //me esta devolviendo char que va ir imprimiendo. Luego la funcion debe ser de tipo char 
       
       /*
        int joa = cadena.length(); // length Retorna la longitud de la cadena
        char camVocal[] = cadena.toCharArray();// toCharArray Retorna el conjunto de caracteres de la cadena
        System.out.println("");
        for (int i = 0; i < joa; i++) {
            switch (camVocal[i]) { //es posible aplicar aqui una estructura condicional como if else.
                case 'a':
                    System.out.print("@");
                   
                    break;
                case 'e':
                    System.out.print("#");
                    
                    break;
                case 'i':
                    System.out.print("$");
                   
                    break;
                case 'o':
                    System.out.print("%");
                    
                    break;
                case 'u':
                    System.out.print("*");
                    
                    break;
                default:
                    System.out.print(""+ camVocal[i]);
                    
            }
        }
        System.out.println(" ");
        System.out.println(" "); */
       
       
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
       
        System.out.println("");
        System.out.println("====================================================");
        
        
    }
    
public static String asterisco(int num) {
        String filAster = "";
        for (int j = 0; j < num; j++) {
            filAster += "*";
        }
        System.out.println("");
        return filAster;
    }


 public static String cadenaNueva (String cadena) {
        String nuevaCadena ="";
        int joa = cadena.length(); // length Retorna la longitud de la cadena
        System.out.println("");
        for (int i = 0; i < joa; i++) {
            switch (cadena.charAt(i)) { //es posible aplicar aqui una estructura condicional como if else.
                case 'a':
                    nuevaCadena+= "@";
                   break;
                case 'e':
                    nuevaCadena+= "#"; 
                    break;
                case 'i':
                    nuevaCadena += "$";                   
                    break;
                case 'o':
                    nuevaCadena += "%";                    
                    break;
                case 'u':
                    nuevaCadena += "*";                    
                    break;
                default:
                    nuevaCadena += cadena.charAt(i);
            }
        }
        return nuevaCadena;        
    }
 
 public static void multiplicacion(int n1, int n2) {

        if (n1 % n2 == 0) {
            System.out.println("Su primer numero ingresados es multiplo del segundo");
        } else {
            System.out.println("Su primer numero ingresado no es multiplo");
        }
    }


}