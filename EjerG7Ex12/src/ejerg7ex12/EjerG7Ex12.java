/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerg7ex12;

import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class EjerG7Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner cod = new Scanner(System.in);

        System.out.println("ingrese una palabra");
        String frase = cod.nextLine().toLowerCase();
        String nuevo = sustitucion(frase);
        System.out.println("La nueva frase es:" + nuevo);
    }

    public static String sustitucion(String frase) {

        String newFrase = "";
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);//charAt Retorna el carácter especificado en la posición index
            switch (letra) {
                case 'a':
                    newFrase += "@";
                    
                    break;
                case 'e':
                    newFrase += "#";
                    break;

                case 'i':
                    newFrase += "$";
                    break;

                case 'o':
                    newFrase += "%";
                    break;

                case 'u':
                    newFrase += "*";
                    break;

                default:
                    newFrase += letra;
                    break;
            }
        }
      return newFrase;
    }
}