package Servicio;

import Entidad.Punto;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 * @author aniba
 */
public class PuntoServicio {
    
//crearPuntos() que le pide al usuario los dos números y los ingresa en
//los atributos del objeto.
    public Punto crearPunto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas del primer punto: ");
        System.out.print("X1 = ");
        int x1 = sc.nextInt();
         System.out.print("Y1 = ");
        int y1 = sc.nextInt();
        System.out.println("Ingrese las coordenadas del segundo punto: ");
         System.out.print("X2 = ");
        int x2 = sc.nextInt();
         System.out.print("Y2 = ");
        int y2 = sc.nextInt();
        return new Punto(x1, x2, y1, y2);
    }
//Método calcular devolverDistancia: calcula y devuelve la distancia
//que existe entre los dos puntos de la clase Puntos.
    public double devolverDistancia(Punto p1) {
        //con el metodo Math.pow, elevo a cualquier potencia.
        double primerElemento = Math.pow((p1.getX2()-p1.getX1()), 2);
        double segundoElemento = Math.pow((p1.getY2()-p1.getY1()), 2);
        double d = primerElemento + segundoElemento;
        return sqrt(d);//el metodo sqrt() me aporta la raiz cuadrada de un double
    }   
}