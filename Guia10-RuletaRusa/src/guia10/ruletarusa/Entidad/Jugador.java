/*
 Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
package guia10.ruletarusa.Entidad;

import java.util.Objects;

/**
 *
 * @author aniba
 */
public class Jugador {
    //atributos
    private Integer id;
    private String nombre;
    private boolean mojadoSeco;

    //constructores
    public Jugador() {
        nombre = "Jugador"+id;
    }
    
    public Jugador(String nombre, boolean mojadoSeco) {
        this.nombre = "Jugador "+id;
        this.mojadoSeco = mojadoSeco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojadoSeco() {
        return mojadoSeco;
    }

    public void setMojadoSeco(boolean mojadoSeco) {
        this.mojadoSeco = mojadoSeco;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + (this.mojadoSeco ? 1 : 0);
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
        final Jugador other = (Jugador) obj;
        if (this.mojadoSeco != other.mojadoSeco) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    /**
     * disparo(Revolver r): el método, recibe el revolver de agua y llama
     * a los métodos de mojar() y siguienteChorro() de Revolver. El jugador
     * se apunta, aprieta el gatillo y si el revolver tira el agua, el jugador
     * se moja. El atributo mojado pasa a false y el método devuelve true, sino false.
     * @return un boolean true si esta mojado, y false si esta seco.
     */
    
    public boolean disparo(RevolverDeAgua r) {
        int disparo=r.llenarRevolver();
        do {
            mojadoSeco = r.mojar(disparo);
            if (mojadoSeco == false) {
                disparo = r.siguienteChorro();
            }
        } while (mojadoSeco == false);
        
        return mojadoSeco;
        //sera true si moja, false sino tiene agua
    }
    
    @Override
    public String toString() {
        return "Jugador: " + "\n nombre = Jugador " +id+ "\n mojadoSeco = " + mojadoSeco;
    }
}