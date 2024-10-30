package guia9.tienda.principal;

import guia9.tienda.servicio.TiendaServicio;

/**
 *
 * @author aniba
 */
public class Guia9Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TiendaServicio ts = new TiendaServicio();
        ts.menu();
    }   
}