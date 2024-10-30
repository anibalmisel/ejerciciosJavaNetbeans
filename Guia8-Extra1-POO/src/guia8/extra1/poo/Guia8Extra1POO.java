package guia8.extra1.poo;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class Guia8Extra1POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cn = new Cancion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique nombre del autor: ");
        String autor = sc.nextLine();
        cn.setAutor(autor);
        System.out.println("Escriba el titulo de la cancion: ");
        String titulo = sc.nextLine();
        cn.setTitulo(titulo);
        System.out.println("");
        System.out.println(cn.toString());
        System.out.println("");
        sc.close();
    }
}