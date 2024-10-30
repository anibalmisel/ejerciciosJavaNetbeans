
package guia8.ej8.poo;

import Entidad.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

/**
 * En el main se creará el objeto y se le pedirá al usuario que ingrese una
 * frase que puede ser una palabra o varias palabras separadas por un espacio en
 * blanco y a través de los métodos set, se guardará la frase y la longitud de
 * manera automática según la longitud de la frase ingresada
 *
 * @author aniba
 */
public class Guia8Ej8POO {

    public static void main(String[] args) {

        Cadena cf = new Cadena();
        CadenaServicio cs = new CadenaServicio();
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase: ");
        cf.setFrase(frase = sc.nextLine());
        cs.mostrarVocales(cf);
        cs.invertirFrase(cf);
        System.out.println("Escriba un caracter para saber cuantas veces se repite en la frase");
        String letra = sc.nextLine();
        cs.vecesRepetido(cf, letra);
        System.out.println("Introduzca una nueva frase para comparar su longitud con la frase original:");
        String newFrase = sc.nextLine();
        cs.compararLongitud(cf, newFrase);
        System.out.println("Escriba una nueva frase para unirla a la original");
        String nuevaFrase = sc.nextLine();
        cs.unirFrase(cf, nuevaFrase);
        System.out.println("Introduzca una letra para cambiarla por la 'a' ");
        String letra1 = sc.nextLine();
        cs.reemplazar(cf, letra1);
        System.out.println("");
        System.out.println("Introduzca una letra para verificar si existe en la frase o no");
        String letra2 = sc.nextLine();
        cs.contiene(cf, letra2);
        sc.close();
    }
}