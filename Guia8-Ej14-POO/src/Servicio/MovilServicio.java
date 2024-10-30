package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class MovilServicio {
    
//Método ingresarCodigo(): este método permitirá ingresar el código
//completo de siete números de un celular. Para ello, puede utilizarse
//un bucle repetitivo
    public int [] ingresarCodigo(){
        Scanner sc = new Scanner(System.in);
        int [] codigo = new int [7];
        System.out.println("Ingrese numero");
        String cifraCodigo = sc.nextLine();
        char [] caracteres = cifraCodigo.toCharArray();// Obtenemos un arreglo de caracteres a partir del String
        for (int i = 0; i < 7; i++) {
            codigo[i]= Character.getNumericValue(caracteres[i]); // Recorremos el arreglo de caracteres y convertimos cada uno a un entero
        }
        return codigo;
    }  
//Método cargarCelular(): se solicita al usuario que ingrese los datos
//necesarios para instanciar un objeto Celular y poder cargarlo en
//nuestro programa.
    public Movil cargarCelular(){
        Scanner sc = new Scanner(System.in);
        MovilServicio ms = new MovilServicio();
        Movil m = new Movil();
        System.out.println("Ingrese la marca del celular: ");
        String marca = sc.nextLine();
        System.out.println("Ingrese el precio del equipo: ");
        int precio = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el modelo del equipo: ");
        String modelo = sc.nextLine();
        System.out.println("Ingrese la capacidad de la memoria Ram: ");
        String memoriaRam = sc.nextLine();
        System.out.println("Indique el tipo de almacenamiento: ");
        String almacenamiento = sc.nextLine();
        m.setCodigo(ms.ingresarCodigo());        
        return new Movil(marca, precio, modelo, memoriaRam, almacenamiento, m.getCodigo());
    }   
}