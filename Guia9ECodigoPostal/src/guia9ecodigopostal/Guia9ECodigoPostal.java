/*
Caracas,10101.
Maracaibo, 40011.
Valencia, 20011.
Barquisimeto,30011.
Puerto Ordaz, 80501.
Mérida,51011.
Maracay, 21011.
San Cristóbal,50011.
Porlamar, 63011.
Maturín,62011.
 */
package guia9ecodigopostal;

import guia9ecodigopostal.servicio.CodigoPostalServicio;
import java.util.HashMap;

/**
 *
 * @author aniba
 */
public class Guia9ECodigoPostal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, String> mapaLocal = new HashMap();
        CodigoPostalServicio cps = new CodigoPostalServicio();
       //• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
        System.out.println("Vamos a agregar 10 ciudades con sus codigos");
        System.out.println("");
        mapaLocal = cps.enterCodigo(mapaLocal); 
        System.out.println("");
        //• Muestra por pantalla los datos introducidos
        System.out.println("Vamos a mostrar los datos ingresados");
        System.out.println("");
        cps.mostrarMapa(mapaLocal);
        System.out.println("");
        //• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
        System.out.println("Vamos a buscar una ciudad usando el codigo postal");
        System.out.println("");
        cps.buscar(mapaLocal);
        System.out.println("");
        //• Muestra por pantalla los datos
        System.out.println("Vamos a mostrar nuevamente los datos");
        System.out.println("");
        cps.mostrarMapa(mapaLocal);
        System.out.println("");
        //• Agregar una ciudad con su código postal correspondiente más al HashMap.
        System.out.println("Vamos a agregar un nuevo elemento al HashMap");
        System.out.println("");
        mapaLocal = cps.enterCodigo(mapaLocal);
        System.out.println("");
        //• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
        System.out.println("Vamos a eliminar tres ciudades ingresando su nombre");
        System.out.println("");
        cps.eliminar(mapaLocal);
        System.out.println("");
        //• Muestra por pantalla los datos
        System.out.println("Vamos a mostrar nuevamente los datos");
        System.out.println("");
        cps.mostrarMapa(mapaLocal);
        System.out.println("");
        
//        Scanner sc = new Scanner(System.in);
//        int p;
//        int q;
//        String exit = "s";
//        do {
//            System.out.println("Enter two numbers:");
//            p = sc.nextInt();
//            q = sc.nextInt();
//            System.out.println("");
//            System.out.println("El mcd entre (" + p + "," + q + ") es: " + gcd(p, q));
//            System.out.println("");
//            System.out.println("exit?");
//            exit = sc.next();
//        } while (!exit.equalsIgnoreCase("s"));
//
//        //prueba1.forEach((e)->System.out.println(e));
//    }
//
//    public static int gcd(int p, int q) {
//        if (q == 0) {
//            return p;
//        }
//        int r = p % q;
//        return gcd(q, r);
//   
    }
}
