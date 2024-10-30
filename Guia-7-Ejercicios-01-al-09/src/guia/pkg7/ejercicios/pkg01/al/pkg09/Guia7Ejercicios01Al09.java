/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg7.ejercicios.pkg01.al.pkg09;

import java.util.Scanner;

/**
 *
 * @author Lcdo. Anibal Misel
 */
public class Guia7Ejercicios01Al09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Ejercicio #1 guia de ejercicios de Java");
        System.out.println("");
        
        /*
          1. Escribir un programa que pida dos números enteros por teclado
  //(1)   y calcule la suma de los dos. El programa deberá después mostrar 
          el resultado de la suma
        */
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número por favor: ");
        int num = leer.nextInt();
        System.out.println("");
        System.out.print("Ingrese otro número: ");
        int num1 = leer.nextInt();
        int suma = num + num1;
        System.out.println("");
        System.out.println("El resultado de la suma es: " + suma);
        System.out.println("");
        System.out.println("============================================");
        System.out.println("");

        System.out.println("Ejercicio #2 guia de ejercicio de Java");
        System.out.println("");
        /*
  //(2)   2. Escribir un programa que pida tu nombre, lo guarde en una variable
          y lo muestre por pantalla.
        */
        System.out.println("Por favor ingrese su nombre: ");
        String nombre = leer.next();//la opcion nextLine no me permitia alojar
        //la informacion en la variable.
        System.out.println("");
        System.out.println("Hola " + nombre + ", ¡Bienvenido!");
        System.out.println("");
        System.out.println("============================================");
        System.out.println("");

        System.out.println("Ejercicio #3 guia de ejercicio de Java");
        System.out.println("");
        /*
          3. Escribir un programa que pida una frase y la muestre toda en
  //(3)   mayúsculas y después toda en minúsculas. Nota: investigar la función
          toUpperCase() y toLowerCase() en Java.
        */
        System.out.println("Por favor ingrese una frase");
        String frase = leer.next().toLowerCase();
        String fraseM = frase.toUpperCase();
        System.out.println("");
        System.out.println("la nueva frase en mayuscula es: " + fraseM);
        System.out.println("");
        System.out.println("la nueva frase en minuscula es: " + frase);
        
        System.out.println("");
        System.out.println("============================================");
        System.out.println("");

        System.out.println("Ejercicio #4 guia de ejercicio de Java");
        System.out.println("");
        /*
          4. Dada una cantidad de grados centígrados se debe mostrar su
  //(4)   equivalente en grados Fahrenheit. La fórmula correspondiente
          es: F = 32 + (9 * C / 5).
        */
        System.out.println("Ingrese la cantidad de grados centigrados");
        System.out.println("");
        double gradosC = leer.nextDouble();
        double gradosF = 32 + (9 * gradosC / 5);
        System.out.println("");
        System.out.println("El equivalente en grados Farenheit es: " + gradosF);
        System.out.println("");
        System.out.println("============================================");
        System.out.println("");

        System.out.println("Ejercicio #5 guia de ejercicio de Java");
        System.out.println("");
        /*
          5. Escribir un programa que lea un número entero por teclado
  //(5)   y muestre por pantalla el doble, el triple y la raíz cuadrada de
          ese número. Nota: investigar la función Math.sqrt().
        */
        System.out.println("Introduzca un numero entero por favor");
        int numero = leer.nextInt();
        int doble = 2 * numero;
        int triple = 3 * numero;
        double raiz = Math.sqrt(numero);
        System.out.println("");
        System.out.println("El doble del numero ingresado es: " + doble);
        System.out.println("");
        System.out.println("El triple del numero ingresado es: " + triple);
        System.out.println("");
        if (numero < 0) {
            System.out.println("El numero entero ingresado es negativo, no se puede hallar raiz cuadrada.");
        } else {
            System.out.println("La raiz cuadrada del numero ingresado es: " + raiz);
        }
        System.out.println("");

        System.out.println("");
        System.out.println("============================================");
        System.out.println("");

        System.out.println("Ejercicio #6 guia de ejercicio de Java");
        System.out.println("");
        /*
  //(6)   6. Crear un programa que dado un numero determine si es par o impar.
        */
        System.out.println("Ingrese un numero");
        int otroNumero = leer.nextInt();
        if (otroNumero % 2 == 0) {
            System.out.println("");
            System.out.println("El numero ingresado '" + otroNumero + "', es un numero par");
        } else {
            System.out.println("");
            System.out.println("El numero ingresado '" + otroNumero + "', es un numero impar");
        }
        System.out.println("");

        System.out.println("");
        System.out.println("============================================");
        System.out.println("");

        System.out.println("Ejercicio #7 guia de ejercicio de Java");
        System.out.println("");
        /*
          7. Crear un programa que pida una frase y si esa frase es igual a
          “eureka” el programa pondrá un mensaje de Correcto, sino mostrará
  //(7)   un mensaje de Incorrecto. Nota: investigar la función equals() en
          Java.
          String x = "hello";
          String y = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
          System.out.println(x.equals(y)); // true
        */
        System.out.println("Ingrese la frase clave");
        String frase2 = leer.next().toLowerCase();
        String eureka = "eureka";//new String (new char []{'e','u','r','e','k','a'});
        while (frase2.equals(eureka) == false) {
            System.out.println("Lo siento, la frase ingresada es incorrecta");
            System.out.println("");
            System.out.println("Intentelo nuevamente");
            frase2 = leer.next().toLowerCase();
        }
        System.out.println("");
        System.out.println("¡Correcto! La frase ingresada es correcta");
        System.out.println("");

        System.out.println("");
        System.out.println("============================================");
        System.out.println("");

        System.out.println("Ejercicio #8 guia de ejercicio de Java");
        System.out.println("");
        /* 
          8. Realizar un programa que solo permita introducir solo frases o
          palabras de 8 de largo. Si el usuario ingresa una frase o palabra
  //(8)   de 8 de largo se deberá de imprimir un mensaje por pantalla que diga
          “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
          Nota: investigar la función Lenght() en Java.
        */
        System.out.println("Escriba la frase clave");
        String palabra8 = leer.next();
        int longitud = palabra8.length();
        System.out.println("");
        while (longitud != 8) {
            System.out.println("Lo siento, la frase ingresada es incorrecta");
            System.out.println("");
            System.out.println("Intentelo nuevamente");
            palabra8 = leer.next();
            longitud = palabra8.length();
        }
        System.out.println("");
        System.out.println("¡Correcto! La frase ingresada es correcta");
        System.out.println("");

        System.out.println("");
        System.out.println("============================================");
        System.out.println("");

        System.out.println("Ejercicio #9 guia de ejercicio de Java");
        System.out.println("");
        /* 
          9. Escriba un programa que pida una frase o palabra y valide si la
  //(9)   primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’,
          se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
          en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
          la función Substring y equals() de Java.
          La función substring() en Java devuelve una cadena de caracteres
          y puede recibir uno o dos parámetros. El primer parámetro indica la
          posición inicial y el segundo la posición final a partir de los cuales
          se construirá la subcadena a devolver. En el caso de que solo se
          especifique un parámetro, este identificará la posición del carácter
          inicial y la posición final será el final de la cadena1.
          Por ejemplo, si tienes una cadena String palabra = "hola" y quieres
          obtener solo las primeras dos letras, puedes usar palabra.
          substring(0, 2) lo que devolvería "ho".
          Claro, aquí tienes algunos ejemplos más de cómo usar substring() en
          Java:
          Si quieres obtener una subcadena desde una posición hasta el final de
          la cadena, puedes usar solo un parámetro. Por ejemplo, si tienes una
          cadena String palabra = "hola" y quieres obtener solo las últimas dos
          letras, puedes usar palabra.substring(2) lo que devolvería "la".
          Si quieres obtener una subcadena desde el principio hasta una posición
          específica, puedes usar dos parámetros. Por ejemplo, si tienes una
          cadena String palabra = "hola" y quieres obtener solo las primeras
          tres letras, puedes usar palabra.substring(0, 3) lo que devolvería
          "hol".
          Si quieres obtener una subcadena desde una posición hasta otra posición
          específica, también puedes usar dos parámetros. Por ejemplo, si tienes
          una cadena String palabra = "hola" y quieres obtener solo las letras
          del medio, puedes usar palabra.substring(1, 3) lo que devolvería "ol".
          String x = "hello";
          String y = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
          System.out.println(x.equals(y)); // true
        */
        System.out.println("Por favor ingrese una frase: ");
        String frase3 = leer.next().toUpperCase();
        //System.out.println(""+frase.substring(0,1));
        String letra = "A";
        System.out.println("");
        while (frase3.substring(0, 1).equals(letra) == false) {
            System.out.println("Lo siento, la frase ingresada es incorrecta");
            System.out.println("");
            System.out.println("Intentelo nuevamente");
            frase3 = leer.next().toUpperCase();
        }
        System.out.println("");
        System.out.println("¡Correcto! La frase ingresada es correcta");
        System.out.println("");
    }
} 