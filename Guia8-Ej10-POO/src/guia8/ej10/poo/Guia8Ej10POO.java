/*
 10. Realizar un programa en Java donde se creen dos arreglos: 
 el primero será un arreglo A de 50 números reales, y el segundo B,
 un arreglo de 20 números, también reales. 1)(crearArreglo)El programa
 deberá inicializar el arreglo A con números aleatorios y mostrarlo por
 pantalla. Luego2)(ordenarArreglo), el arreglo A se debe ordenar de menor
 a mayor y copiar los primeros 10 números ordenados al arreglo B de 20 
 elementos, y rellenar los 10 últimos elementos con el valor 0.5. Mostrar
 los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
 20.
 */
package guia8.ej10.poo;

import Entidad.Array;
import Servicio.ArrayServicio;

public class Guia8Ej10POO {

    public static void main(String[] args) {
      Array ar= new Array();
      ArrayServicio as= new ArrayServicio();
      as.crearArreglo(ar);
      as.ordenarArreglo(ar);
      as.copiarArreglo(ar);
      System.out.println("");
    } 
}