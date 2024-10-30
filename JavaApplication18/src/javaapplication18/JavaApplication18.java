/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author aniba
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO codeScanner leer = new Scanner(System.in);  
        System.out.println("ingrese tamaño de cuadrado");
        int numero = 0;
        numero = leer.nextInt();
        // en la sentencia for se inicializa la variable directo dentro del parentesis
        // recorre las filas y columnas incrementando hasta llegar al numero ingresado por pantalla
        for (int i = 0; i < numero; i++) {

            for (int j = 0; j < numero; j++) {

                if (i == 0 || i == numero - 1 || j == 0 || j == numero - 1) {

                    System.out.print("* ");

                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();// este espacio permite que se ejecute el for application logic here
        }

    }


/*
    package funcionesvectores;

import java.util.Scanner;

/**
 *
 * @author MasterAlexia
 */
 /*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras.
La función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void). 
    
  El cambio de divisas es:
* 0.86 libras    es un     1 €
* 1.28611 $      es un     1 €
* 129.852 yenes  es un     1 €
  */  
    
public class ejercicio14FuncionesVectores {
   public static void main(String[] args) {
  
    Scanner leer = new Scanner (System.in); 
    System.out.println("por favor introduzca cantidad de euros ");
    double cantidadEuro;
    cantidadEuro= leer.nextDouble();
    
   System.out.println("por favor introduzca moneda a la que desea convertir");
   String monedaConvertir;
   monedaConvertir=leer.nextLine().toLowerCase();
   
   // declaracion de la funcion en prog ppal
   conversionEuro(monedaConvertir, cantidadEuro);
   
   
   }
   
//[acceso][modificador][tipo]nombreFuncion([tipo] argumentos)  
    
   public static void conversionEuro(String monedaConvertir, double cantidadEuro ) {
    double resultado;
       String dolar = null, yen = null,libra = null;
       
    if (monedaConvertir == dolar || monedaConvertir== yen || monedaConvertir== libra){
        
   
      switch( monedaConvertir ){
      
       case "dolar":
           
         resultado =  cantidadEuro *  1.28611;
         System.out.println("la cantidad de euros son: " +resultado+ "$");
         break;
         
       case "yen":
         resultado = cantidadEuro * 129.852;
         
       System.out.println("la cantidad de yenes son: " +resultado+ "¥");
         break;
       
       case "libra":
          resultado = cantidadEuro * 0.86; 
          System.out.println("la cantidad de yenes son: " +resultado+ "£");
         break; 
         
   
   default:  
       
        System.out.println("Incorrecto");
   
   }        
   }
}
}
    */