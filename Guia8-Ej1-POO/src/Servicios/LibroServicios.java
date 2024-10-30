/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class LibroServicios {
    
    public Libro crearLibro (){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor escriba el titulo del libro: \n");
        String titulo = sc.next();
        System.out.println("Por favor escriba el autor del libro: \n");
        String autor = sc.next();
        System.out.println("Por favor escriba el ISBN: \n");
        String ISBN = sc.next();
        System.out.println("Por favor escriba el numero de paginas de la obra: \n");
        Integer numeroPag = sc.nextInt();
        sc.close();
        
        return new Libro(ISBN, titulo, autor, numeroPag);
    }
    
    public void MostrarLibro (Libro a1){
        System.out.println("Los datos del libro son: "+a1.toString());
    }
 
}
