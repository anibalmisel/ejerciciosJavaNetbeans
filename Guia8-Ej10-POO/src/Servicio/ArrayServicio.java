/*
 1)(crearArreglo)El programa deberá inicializar el arreglo A con números(reales, double) aleatorios y mostrarlo por pantalla. 
 2)(ordenarArreglo), el arreglo A se debe ordenar de menor a mayor
 3)(crearArregloB):
     - 3.1)(copiarArreglo)copiar los primeros 10 números ordenados al arreglo B de 20 elementos,
     - 3.2)(rellenarArreglo) rellenar los 10 últimos elementos con el valor 0.5.
 4)(mostrarArreglos) Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
 */
package Servicio;
import Entidad.Array;
import java.util.Arrays;
public class ArrayServicio {
// 1)(crearArreglo)El programa deberá inicializar el arreglo A 
// con números aleatorios y mostrarlo por pantalla. 
    public void crearArreglo(Array ar) {
        double[] vectorA = ar.getVectorA();
        //Lleno el vector de dimension 50 con los numeros aleatorios
        for (int i = 0; i < 50; i++) {
            /*
             genero 50 numeros aleatorios
             generar un número entre A y B, B>A
             numero = (Math.random() * (B - A + 1) + A;
             */
            double numAleatorio_50 = Math.random() * (50 - 1 + 1) + 1;
            vectorA[i] = numAleatorio_50;
        }
        ar.setVectorA(vectorA);
        for (int i = 0; i < 50; i++) {
            //System.out.println(vectorA[i]);
            System.out.println(ar.getVectorA()[i]);
        }
        System.out.println("");
       //Se puede hacer asi, pero no me gusta:
       //System.out.println(Arrays.toString(vectorA));
    }

//2)(ordenarArreglo), el arreglo A se debe ordenar de menor a mayor
    public void ordenarArreglo(Array ar) {
        double[]todoUso=new double[20];
        Arrays.sort(ar.getVectorA());//este metodo te permite ordenar un arreglo de manera ascendente
        for (double ordenAscen:ar.getVectorA()) {
            System.out.println(ordenAscen);
        }
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            todoUso[i]=ar.getVectorA()[i];
        }
        ar.setVectorB(todoUso);
    }
//3)(crearArregloB):
//- 3.1)(copiarArreglo)copiar los primeros 10 números ordenados al arreglo B de 20 elementos,
//- 3.2)(rellenarArreglo) rellenar los 10 últimos elementos con el valor 0.5.
//    4)(mostrarArreglos) Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
    public void copiarArreglo(Array ar){
        Arrays.fill(ar.getVectorB(), 10, 20, 0.5);
        for (double mostrar:ar.getVectorB()) {
            System.out.println(mostrar);
        }
        /*
          Usamos el método Arrays.fill para asignar el valor 0 a los elementos del arreglo desde la posición 1 hasta la posición 3
          Arrays.fill(numeros, 1, 3, 0);
          Imprimimos el contenido del arreglo después de usar el método Arrays.fill
          System.out.println(Arrays.toString(numeros)); Imprime [10, 0, 0, 40, 50]
         */   
    }
}
