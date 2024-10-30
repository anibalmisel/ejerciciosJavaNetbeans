/*
14. Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. 
 */
package guia8.ej14.poo;

import Entidad.Movil;
import Servicio.MovilServicio;

/**
 * @author aniba
 */
public class Guia8Ej14POO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MovilServicio ms = new MovilServicio();
        Movil m1 = ms.cargarCelular();
        System.out.println(m1.toString());
        for (int i = 0; i < 7; i++) {
            System.out.println(m1.getCodigo()[i]);
        }
        System.out.println("");
    }
}