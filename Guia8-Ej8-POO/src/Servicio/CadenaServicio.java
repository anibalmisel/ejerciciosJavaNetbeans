package Servicio;

import Entidad.Cadena;

public class CadenaServicio {
//    a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//frase ingresada.

    public void mostrarVocales(Cadena cf) {
        int cont = 0;
        String frase1 = cf.getFrase().replaceAll("[ ,.]", "");//
        String vocales="aeiou";
        for (int i = 0; i < frase1.length(); i++) {
         //necesito que se ignore los espacios vacios para efecto de
         //longitud de frase.
            
            char vocal = frase1.toLowerCase().charAt(i);
            if (vocales.indexOf(vocal)!= -1) {
                cont++;
            }
        }
        System.out.println("Hay " + cont + " vocales en la frase");
        System.out.println("");
    }
//    b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

    public void invertirFrase(Cadena cf) {
        //int dimension= cf.getLongi()-1;
        char[] vector = new char[cf.getLongi()];
        for (int i = 0; i < cf.getLongi(); i++) {
            char vocal = cf.getFrase().toLowerCase().charAt(i);
            vector[i] = vocal;
            System.out.print(vector[i]);
        }
        System.out.println(" ");
        int var = cf.getLongi() - 1;
        for (int i = var; i >= 0; i--) {
            System.out.print(vector[i]);
        }
        System.out.println("");
        /*
        Otra varianet usa el metodo StrinBuilder.
        StringBuilder fraseInvertida = new StringBuilder(frase);: Esta línea 
        crea un nuevo objeto de la clase StringBuilder, que es una clase que
        permite modificar cadenas de caracteres de forma eficiente.
        El constructor de la clase StringBuilder recibe como parámetro la 
        cadena frase y la copia en el objeto fraseInvertida.
        fraseInvertida.reverse();: Esta línea llama al método reverse de la
        clase StringBuilder, que invierte el orden de los caracteres del objeto
        que lo invoca. Es decir, cambia el primer carácter por el último, el
        segundo por el penúltimo, y así sucesivamente. Después de esta línea,
        el objeto fraseInvertida contiene la cadena frase invertida.
        System.out.println("Frase invertida: " + fraseInvertida);: Esta línea
        imprime en la consola el mensaje "Frase invertida: " seguido del
        contenido del objeto fraseInvertida, que es la cadena frase invertida.
        StringBuilder fraseInvertida = new StringBuilder(frase);
        fraseInvertida.reverse();
        System.out.println("Frase invertida: " + fraseInvertida);
         */
        
        
        
        
    }
//    c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

    public void vecesRepetido(Cadena cf, String letra) {
        int contador = 0;
        for (int i = 0; i < cf.getLongi(); i++) {
            String compara = String.valueOf(cf.getFrase().toUpperCase().charAt(i));
            if (compara.equalsIgnoreCase(letra)) {
                contador++;
            }
        }
        System.out.println("El carácter '" + letra + "' se repite " + contador + " veces");
        System.out.println("");
    }
    //e) Método compararLongitud(String frase), deberá comparar 
//la longitud de la frase que compone la clase con otra nueva frase
//ingresada por el usuario.

    public void compararLongitud(Cadena cf, String newFrase) {
        if (cf.getLongi() == newFrase.length()) {
            System.out.println("La frase ingresada tiene la misma longitud que la frase original " + cf.getLongi());
            System.out.println("");
        } else {
            System.out.println("La frase ingresada (longi." + newFrase.length() + ") no tiene la misma longitud que la frase original (longi." + cf.getLongi() + ").");
            System.out.println("");
        }
    }
//    f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//con una nueva frase ingresada por el usuario y mostrar la frase resultante.

    public void unirFrase(Cadena cf, String newFrase) {
        System.out.println(cf.getFrase() + " " + newFrase);
        System.out.println(" ");
    }
//    g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
//la frase resultante.

    public void reemplazar(Cadena cf, String letra) {
        for (int i = 0; i < cf.getLongi(); i++) {
            char vocal = cf.getFrase().toUpperCase().charAt(i);
            switch (vocal) {
                case 'A':
                    System.out.print(letra);
                    break;
                default:
                    System.out.print(vocal);
            }
        }
        System.out.println("");
    }

    //h) Método contiene(String letra), deberá comprobar si la frase contiene
    //una letra que ingresa el usuario y devuelve verdadero si la contiene y 
    //falso si no.
    public void contiene(Cadena cf, String letra) {
        int contadorFalse = 0;
        for (int i = 0; i < cf.getLongi(); i++) {
            boolean senal = false;
            String vocalCons2 = String.valueOf(cf.getFrase().charAt(i));
            if (vocalCons2.equalsIgnoreCase(letra)) {
                senal = true;
                System.out.println(senal);
                System.out.println("");
                break;
            } else {
                contadorFalse++;
            }
            while (contadorFalse == cf.getLongi()) {
                System.out.println(senal);
                System.out.println("");
                break;
            }
        }
    }
}