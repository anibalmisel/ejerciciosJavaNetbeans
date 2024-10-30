/*
 Vectores y Matrices en Java
14. Crea una aplicación que a través de una función nos convierta una cantidad
de euros introducida por teclado a otra moneda, estas pueden ser a dólares,
yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
moneda a converir que será una cadena, este no devolverá ningún valor y
mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package guia7ejercicio14;

import java.util.Scanner;

public class Guia7Ejercicio14 {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        double euros; String moneda;
        do {
           System.out.println("Introduzca la cantidad de euros a cambiar: ");
           euros = sc.nextDouble(); 
           System.out.println("");
           
            if (euros<0) {
                System.out.println("¡INCORRECTO! Por favor ingrese una cantidad valida");
                System.out.println("");
            }
            
        } while (euros<0);
        
        do {
           System.out.println("Escriba la moneda a la que desea convertir:\n"+"- dolar\n"+"- yenes\n"+"- libras\n");
           moneda = sc.next(); 
           
           if (!moneda.equalsIgnoreCase("dolar")&&!moneda.equalsIgnoreCase("yenes")&&!moneda.equalsIgnoreCase("libras")) {
                System.out.println("¡INCORRECTO! Por favor ingrese una opcion valida");
                System.out.println("");
            }
           
        } while (!moneda.equalsIgnoreCase("dolar")&&!moneda.equalsIgnoreCase("yenes")&&!moneda.equalsIgnoreCase("libras"));
        
        System.out.println("");
        converEuros(euros, moneda);*/
        
        Scanner scanner = new Scanner(System.in);
        double euros;
        do {
            System.out.println("Enter the amount in euros: ");
            euros = scanner.nextDouble();
            if (euros < 0) {
                System.out.println("Invalid input. Please enter a non-negative value.");
            }
        } while (euros < 0);
        System.out.println("Enter the currency to convert to (dollars, yens or pounds): ");
        String currency = scanner.next();
        convert(euros, currency);
        
    }
   
    public static void convert(double euros, String currency) {
        double result;
        switch (currency) {
            case "dollars":
                result = euros * 1.28611;
                break;
            case "yens":
                result = euros * 129.852;
                break;
            case "pounds":
                result = euros * 0.86;
                break;
            default:
                System.out.println("Invalid currency.");
                return;
        }
        System.out.println(euros + " euros is equal to " + result + " " + currency);
    }
    
    public static void converEuros(double cantidadEuros, String monedaConvertir){
            
        double dolar = cantidadEuros*1.28611; double yenes = cantidadEuros*129.852; double libras = cantidadEuros*0.86;
        if (monedaConvertir.equalsIgnoreCase("dolar")) {
            System.out.println("La cantidad de Euros introducida, equivale a: "+dolar+" dólares");
        }else if (monedaConvertir.equalsIgnoreCase("yenes")){
        System.out.println("La cantidad de Euros introducida, equivale a: "+yenes+" yenes");
        } else if(monedaConvertir.equalsIgnoreCase("libras")){
            System.out.println("La cantidad de Euros introducida, equivale a: "+libras+" libras");
        }
        System.out.println("");
    }
}
