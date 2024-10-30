/*
 15. Realizar un algoritmo que rellene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Defina tamano del vector: ");
        int j= sc.nextInt();
        int enteros[]=new int[j];
        //int enteros[] = new int[100];//como puedo hacer para que el tamano lo defina el usuario?
        int sumatoria=0;
        
        for (int i = 0; i < j; i++) {
            enteros[i] = i+1;
        }
        
        for (int i = j-1; i >=0; i--) {// la condicion deberia ser esta: (int i = 99; i >= 0; i--)
          
            for (int k = 0; k < enteros.length; k++) {
                int entero = enteros[k];
                sumatoria= sumatoria + entero;
            }
            System.out.println("[" + enteros[i] + "]");/*
             El error está en el segundo bucle for.
            La condición de parada del bucle for debería ser
            i >= 0 en lugar de i > enteros.length.
            Además, el índice i debería comenzar en 99 en lugar de 100,
            ya que los índices de un arreglo en Java comienzan en 0. 
            */
            
        }     
        System.out.println("La sumatoria de todos los enteros es: "+sumatoria);
    }
}
 /*
Para hacer que el programa muestre la suma de los elementos del vector, puedes crear una variable para almacenar la suma y luego recorrer el vector con un bucle `for`, sumando cada elemento del vector a la variable de la suma. Finalmente, puedes mostrar el resultado de la suma después de recorrer el vector. Aquí tienes un ejemplo de cómo hacerlo:

```java
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int tamano = sc.nextInt();
        int enteros[] = new int[tamano];
        
        for (int i = 0; i < tamano; i++) {
            enteros[i] = i+1;
        }
        
        int suma = 0;
        for (int i = 0; i < tamano; i++) {
            suma += enteros[i];
        }
        
        System.out.println("La suma de los elementos del vector es: " + suma);             
    }
}
```


*/