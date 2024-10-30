/*
15. Realizar un algoritmo que rellene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.

16. Realizar un algoritmo que rellene un vector de tamaño N con valores
aleatorios y le pida al usuario un numero a buscar en el vector. 
El programa mostrará donde se encuentra el numero y si se encuentra repetido

17. Recorrer un vector de N enteros contabilizando cuántos números son
de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package ejemploAIejercicio16;

import java.util.Scanner;

public class ejemploAIejercicio16 {

    public static void main(String[] args) {
       // Get the size of the vector from the user
        /*
          16. Realizar un algoritmo que rellene un vector de tamaño N
       con valores aleatorios y le pida al usuario un numero a buscar en
       el vector. El programa mostrará donde se encuentra el numero y si
       se encuentra repetido
       */
              
       Scanner scanner = new Scanner(System.in);
        System.out.println("Defina tamaño del vector:");
        int n= scanner.nextInt();
        int vectorN [] = new int[n];
        for (int i = 0; i < vectorN.length; i++) {
            vectorN[i] = (int) (Math.random() * 10);
            //System.out.println(""+vectorN[i]);
        }
           /*
        Claro. En Java, puedes usar el método `random()` de la clase `Math`
        para generar números aleatorios. Este método devuelve un número de 
        tipo `double` entre 0.0 y 1.0. Si deseas generar un número entero 
        aleatorio dentro de un rango específico, puedes hacerlo multiplicando
        el resultado de `Math.random()` por el tamaño del rango y luego 
        sumando el valor mínimo del rango.

        Aquí tienes un ejemplo que genera un número entero aleatorio entre
        1 y 10:
         int min = 1;
         int max = 10;
         int randomNum = (int)(Math.random() * (max - min + 1)) + min;
        */
        System.out.println("Introduzca un numero para verificar en el vector:");
        int numUsuario = scanner.nextInt();
        boolean bandera = true;
        int sumatoria = 0;
        for (int i = 0; i < vectorN.length; i++) {
            int j = vectorN[i];
            if (j == numUsuario && bandera == true) {
                System.out.println("Se encontro un elemento que coincide con '"+ numUsuario+"'");
                System.out.println("============================================================");
                bandera = false;
            }/*else{
                System.out.println("No se encontro un elemento que coincidiera con '"+ numUsuario+"'");
                System.out.println("============================================================");
                break;
            } */
             if (j == numUsuario) {
                sumatoria = sumatoria+1;
                System.out.println("Se encontro coincidencias en el puesto: "+i+" del vector");
                System.out.println("============================================================");
            }    
        }
        if(sumatoria>1){
            System.out.println("El elemento indicado se repite en el vector: "+sumatoria+" veces");
        }else if (sumatoria==1){
            System.out.println("El elemento indicado se repite en el vector: "+sumatoria+" vez");
        }else if( sumatoria==0){
            System.out.println("El elemento indicado no se encuentra en el vector: ");
        }
        System.out.println("");
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*System.out.println("Enter the size of the vector: ");
        int size = scanner.nextInt();

        // Create a vector of size N
        int[] vector = new int[size];

        // Fill the vector with random numbers
        for (int i = 0; i < size; i++) {
            vector[i] = (int) (Math.random() * 100);
        }

        // Prompt the user for a number to search for
        System.out.println("Enter the number to search for: ");
        int number = scanner.nextInt();

        // Find the index of the number in the vector
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (vector[i] == number) {
                index = i;
                break;
            }
        }

        // Print the index of the number and whether it is repeated
        if (index == -1) {
            System.out.println("The number was not found in the vector.");
        } else {
            System.out.println("The number was found at index " + index + ".");

            // Check if the number is repeated
            boolean repeated = false;
            for (int i = 0; i < size; i++) {
                if (i != index && vector[i] == number) {
                    repeated = true;
                    break;
                }
            }

            if (repeated) {
                System.out.println("The number is repeated in the vector.");
            } else {
                System.out.println("The number is not repeated in the vector.");
            }
             */
        }

/*
Claro, aquí tienes un código en Java que hace lo que pides:

```java
import java.util.Random;
import java.util.Scanner;

public class BuscarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Introduce el tamaño del vector: ");
        int n = scanner.nextInt();
        
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i] = random.nextInt(100);
        }
        
        System.out.print("Introduce el número a buscar: ");
        int num = scanner.nextInt();
        
        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                System.out.println("El número " + num + " se encuentra en la posición " + i);
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("El número " + num + " no se encuentra en el vector.");
        }
    }
}
```

Este código crea un vector de tamaño `N` con valores aleatorios entre 0 y 99. Luego le pide al usuario un número a buscar en el vector y muestra en qué posiciones se encuentra el número y si se encuentra repetido.


*/