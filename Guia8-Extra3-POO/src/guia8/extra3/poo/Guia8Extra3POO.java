package guia8.extra3.poo;

import Entidad.Raiz;
import Servicio.RaizServicio;
import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class Guia8Extra3POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RaizServicio rs = new RaizServicio();
        
        System.out.println("Introduzca valor del coeficiento a :");
        int a = sc.nextInt();
        System.out.println("Introduzca valor del coeficiento b :");
        int b = sc.nextInt();
        System.out.println("Introduzca valor del coeficiento c :");
        int c = sc.nextInt();
        Raiz rz = new Raiz(a,b,c);
        System.out.println(rs.getDiscriminante(a, b, c));
        System.out.println("");
        rs.calcular(rz, rs);
        sc.close();
        System.out.println("");
    }
}