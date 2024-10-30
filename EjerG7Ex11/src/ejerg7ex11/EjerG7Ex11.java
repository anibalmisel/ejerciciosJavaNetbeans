/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerg7ex11;

import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class EjerG7Ex11 {

    /**
     * @param args the command line arguments
     *
     * EJERCICIO 11 Escribir un programa que procese una secuencia de caracteres
     * ingresada por teclado y terminada en punto, y luego codifique la palabra
     * o frase ingresada de la siguiente manera: cada vocal se reemplaza por el
     * carácter que se indica en la tabla y el resto de los caracteres
     * (incluyendo a las vocales acentuadas) se mantienen sin cambios. 
     * a e i o u
     * @ # $ % *
     * Realice un subprograma que reciba una secuencia de caracteres y retorne
     * la codificación correspondiente. Utilice la estructura “según” para la
     * transformación. Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos
     * a las once y 10. La salida del programa debería ser: @y#r, l*n#s, s@l$m%s
     * @ l@s %nc# y 10.
     */
    public static void main(String[] args) {
        
        /*
         EJERCICIO 11 Escribir un programa que procese una secuencia de caracteres
         ingresada por teclado y terminada en punto, y luego codifique la palabra
         o frase ingresada de la siguiente manera: cada vocal se reemplaza por el
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
        Scanner leer = new Scanner(System.in);
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
}