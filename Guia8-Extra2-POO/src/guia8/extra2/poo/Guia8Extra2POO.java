package guia8.extra2.poo;

import Entidad.Punto;
import Servicio.PuntoServicio;

/**
 *
 * @author aniba
 */
public class Guia8Extra2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PuntoServicio ps = new PuntoServicio();
        Punto p1 = ps.crearPunto();
        System.out.println("La distancia entre los dos puntos dados es: "+ps.devolverDistancia(p1));
        System.out.println("");   
    }
}