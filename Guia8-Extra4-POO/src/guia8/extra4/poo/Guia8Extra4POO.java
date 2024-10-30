/**
 * 4. Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
letra (String o char) que le corresponde.
 */
package guia8.extra4.poo;

import Entidad.Nif;
import Servicio.NifServicio;

/**
 *
 * @author aniba
 */
public class Guia8Extra4POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NifServicio ns = new NifServicio();
        Nif n = ns.crearNif();
        ns.mostrar(n);
        System.out.println("");
    }
}