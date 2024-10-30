package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author aniba
 */
public class AhorcadoServicio {
//Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
//Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
//vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
//de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
//máximas, el valor que ingresó el usuario y encontradas en 0.
    public Ahorcado crearJuego() {
        int cantidadLetEncon=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese palabra: ");
        String frase = sc.nextLine();
        char [] palabra = frase.toCharArray();
        System.out.println("Indique la cantidad de jugadas maximas: ");
        int cantidadJuMax = sc.nextInt();
        
        return new Ahorcado(palabra, cantidadLetEncon, cantidadJuMax);
    }
//Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//buscar como se usa el vector.length.
    public void longitud(Ahorcado ah) {
        System.out.println(" * Debes adivinar una palabra que tiene "+ah.getPalabra().length+" letras.");
    }
//Método buscar(letra): este método recibe una letra dada por el usuario
//y busca si la letra ingresada es parte de la palabra o no. También informará
//si la letra estaba o no.
    public char buscarLetra(Ahorcado ah){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una letra: ");
        char letra = sc.nextLine().charAt(0);
        String letra1= String.valueOf(letra);
        
        //char [] caracteres = cifraCodigo.toCharArray(); Obtenemos un arreglo de caracteres a partir del String
        //vocales.indexOf(vocal)!= -1
        // El método indexOf de Java se usa para
        //obtener el índice de un carácter o una
        //subcadena dentro de una cadena. El 
        //índice empieza desde 0 y se cuenta de
        //izquierda a derecha. Si el carácter o
        //la subcadena no se encuentra en la 
        //cadena, el método devuelve -1.
        
       String frase = Arrays.toString(ah.getPalabra());
        if (frase.indexOf(letra1) == -1) {
            System.out.println("La letra no se encuentra en la frase");
        }else{
            System.out.println("La letra se encuentra en la frase");
        }
        return letra;
    }
//Método encontradas(letra): que reciba una letra ingresada por el
//usuario y muestre cuantas letras han sido encontradas y cuantas le
//faltan. Este método además deber devolver true si la letra estaba y 
//false si la letra no estaba, ya que, cada vez que se busque una letra
//que no esté, se le restará uno a sus oportunidades.
    public boolean encontradas(Ahorcado ah, char letra) {
        boolean estaOno = false;
        int k = 0;
        int oportunidades = ah.getCantidadJuMax();
        
        for (int i = 0; i < ah.getPalabra().length; i++) {
            if (ah.getPalabra()[i]==letra) {
                k++;
                estaOno = true;
            }
        }
        k= ah.getCantidadLetEncon()+k;
        ah.setCantidadLetEncon(k);
        int porEncontrar = ah.getPalabra().length-ah.getCantidadLetEncon();
     
        System.out.println("han sido encontradas: "+ah.getCantidadLetEncon()+" letra ");
        System.out.println("Faltan todavia: "+porEncontrar+" letras por encontrar");
        System.out.println("");
        
        if (estaOno==false) {
            oportunidades--;
        }
        
        ah.setCantidadJuMax(oportunidades);
         
        return estaOno;
    }   
//Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    
    public void intentos(Ahorcado ah) {
       
        System.out.println("Le quedan "+ah.getCantidadJuMax()+" oportunidades"); 
        System.out.println("");
        if (ah.getCantidadLetEncon() == ah.getPalabra().length) {
            System.out.println("¡Has ganado! La palabra secreta era: " + Arrays.toString(ah.getPalabra()));
            System.exit(0); // Terminamos el programa
        } else if (ah.getCantidadJuMax() == 0) {
            System.out.println("¡Has perdido! La palabra secreta era: " + Arrays.toString(ah.getPalabra()));
            System.exit(0); // Terminamos el programa
        }
    }
//Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main.
    public void juego(){
        System.out.println("Bienvenido al juego del Ahorcado");
        System.out.println("");
        System.out.println("Jugador A, introduzca los datos para el jugador B");
        AhorcadoServicio ahs = new AhorcadoServicio();
        Ahorcado ah = ahs.crearJuego();
        System.out.println("---------------------------------------------------");
        System.out.println("Jugador B,debes adivinar una palabra secreta introduciendo letras.");
        System.out.println("Tienes "+ah.getCantidadJuMax()+" oportunidades para equivocarte.");
        System.out.println("¡Buena suerte!");
        System.out.println("");
        while (true) {
            longitud(ah);
            char letra= buscarLetra(ah);
            encontradas(ah,letra);
            intentos(ah);
        }
    }
}