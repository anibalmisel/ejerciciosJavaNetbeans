/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package explorandovectores;

import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class ExplorandoVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int cantidadInte;

        System.out.println("Cuantos participantes integran su equipo: ");
        cantidadInte = leer.nextInt();
        
        String[] nombre = new String[cantidadInte];//poder guardar los nombres de cada integrantes en el vector.
        
        System.out.println("Escriban sus nombres: ");
        
        for (int i = 0; i <nombre.length ; i++) {
            nombre[i] = leer.next();//el line nos estaba estorbando y estaba realizando un salto de linea.
        }

        System.out.println("");

        for (int i = 0; i < nombre.length; i++) { //Utiliza el bucle for mejorado para iterar sobre la matriz
            
            System.out.println(""+nombre[i]);
            
        }

        System.out.println("");
        System.out.println("");

    }

}
