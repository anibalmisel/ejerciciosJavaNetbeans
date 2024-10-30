/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
 Constructores, tanto el vacío como el parametrizado.
 */
package Entidad;

/**
 *
 * @author aniba
 */
public class Ahorcado {
    //atributos
    private char [] palabra;
    private int cantidadLetEncon;
    private int cantidadJuMax;
    
    //constructores
    public Ahorcado() {
    }

    public Ahorcado(char[] palabra, int cantidadLetEncon, int cantidadJuMax) {
        this.palabra = palabra;
        this.cantidadLetEncon = cantidadLetEncon;
        this.cantidadJuMax = cantidadJuMax;
    }
    
    //getters & setters

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getCantidadLetEncon() {
        return cantidadLetEncon;
    }

    public void setCantidadLetEncon(int cantidadLetEncon) {
        this.cantidadLetEncon = cantidadLetEncon;
    }

    public int getCantidadJuMax() {
        return cantidadJuMax;
    }

    public void setCantidadJuMax(int cantidadJuMax) {
        this.cantidadJuMax = cantidadJuMax;
    }
    //toString

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", cantidadLetEncon=" + cantidadLetEncon + ", cantidadJuMax=" + cantidadJuMax + '}';
    }   
}