/*
  Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera)
 */
package Entidad;
public class Cafetera {
    //atributos
    private int capacidadMaxima;
    private int cantidadActual;
    //constructor por defecto
    public Cafetera(){  
        this.capacidadMaxima=1000;
    }
//constructor con parametros
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima=1000;
        this.cantidadActual = cantidadActual;
        
    }
   //getters & setters
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public int getCantidadActual() {
        return cantidadActual;
    }
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    //toString
    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
}
