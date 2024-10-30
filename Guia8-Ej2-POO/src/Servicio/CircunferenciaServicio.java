package Servicio;

import Entidades.Circunferencia;
import java.util.Scanner;

public class CircunferenciaServicio {

    //c) Método para crearCircunferencia()
    public Circunferencia crearC() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el radio de la circunferencia:");
        int radio = sc.nextInt();
        sc.close();
        return new Circunferencia(radio);
    }

    //d) Método area(): para calcular el área de la circunferencia
    public void area(Circunferencia a1) {

        double area = Math.PI * Math.pow(a1.getRadio(), 2);

        System.out.println("El area de la circunferencia es: " + area);
    }

    //e) Método perimetro(): para calcular el perímetro
    public void perimetro(Circunferencia a1) {
         double perimetro = 2*Math.PI*a1.getRadio();
         System.out.println("El perimetro de la circunferencia es: "+perimetro);
    }
}
