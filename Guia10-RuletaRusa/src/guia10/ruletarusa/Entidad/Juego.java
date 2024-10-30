/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package guia10.ruletarusa.Entidad;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class Juego {
    //atributos
    private ArrayList <Jugador> jugadores;
    private RevolverDeAgua revolver;
    //atributos

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.jugadores);
        hash = 37 * hash + Objects.hashCode(this.revolver);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Juego other = (Juego) obj;
        if (!Objects.equals(this.jugadores, other.jugadores)) {
            return false;
        }
        if (!Objects.equals(this.revolver, other.revolver)) {
            return false;
        }
        return true;
    }
    /**
     * llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores 
     * y el revolver para guardarlos en los atributos del juego.
     * @return no decuelve nada. Es Void.
     */
    public ArrayList<Jugador> llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua r) {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;

        revolver = r;

        System.out.println("Ingrese numero de jugadores: ");
        Integer aux = sc.nextInt();//TODO limitar a 6
        if (aux < 1 || aux > 6) {
            for (int i = 0; i < 6; i++) {
                Jugador j = new Jugador();
                j.setId(i + 1);//estaba seteando el mismo jugador.
                jugadores.add(j);
            }
        } else {
            for (int i = 0; i < aux; i++) {
                Jugador j = new Jugador();
                j.setId(i + 1);
                jugadores.add(j);
            }
        }

//        for (int i = 0; i < jugadores.size(); i++) {//este for es solo de prueba
//            System.out.println(jugadores.get(i));
//        }
        System.out.println("");
        sc.close();
        return jugadores;
    }
    /**
     * • ronda(): cada ronda consiste en un jugador que se apunta con el
     * revolver de agua y aprieta el gatillo. Sí el revolver tira el agua
     * el jugador se moja y se termina el juego, sino se moja, se pasa al
     * siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
     * mojar. Al final del juego, se debe mostrar que jugador se mojó.
     * @return 
     */
    public void ronda(ArrayList<Jugador>jugadores) {
        
        for (int i = 0; i < jugadores.size(); i++) {
            boolean mojadoSeco = revolver.mojar(revolver.llenarRevolver());
            if (mojadoSeco==true) {
                jugadores.get(i).setMojadoSeco(true);
                System.out.println(jugadores.get(i));
                System.out.println("");
                
                System.out.println("Has sido herido! Busca la toalla!");
                System.out.println("");
                break;
            }else{
                System.out.println(jugadores.get(i));
                System.out.println("Te has librado!");
                System.out.println("");
            }
        } 
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Juego: " + "\n jugadores = " + jugadores + "\n revolver = " + revolver;
    }   
}