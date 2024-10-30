/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.

• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package guia10.barajadecartase;

import guia10.barajadecartase.Entidad.BarajaCartasEspanolas;
import java.util.ArrayList;
import java.util.Scanner;

public class Guia10BarajaDeCartasE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b;
        BarajaCartasEspanolas b1 = new BarajaCartasEspanolas();
        ArrayList<String> barajas = new ArrayList();
        System.out.println("Barajamos las cartas: ");
        barajas=b1.barajar();//genera un lista String de cartas. Sus elementos estan desordenados. Para mostrar: forEach((e) -> System.out.println(e));
        int jugadores=0;
        System.out.println("");
        System.out.println("Cuantos jugadores en la mesa:");
        jugadores = sc.nextInt();
        System.out.println("");
        System.out.println("Repartimos: ");
        System.out.println("");
        for (int i = 0; i < jugadores; i++) {
            System.out.println("Jugador "+(i+1));
            barajas = b1.darCartas(barajas);
        }
        System.out.println("");
    }   
}