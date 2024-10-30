package Servicio;

import Entidades.Operacion;
import java.util.Scanner;

public class OperacionServicio {
    //Método para crearOperacion()
    public Operacion crearOperacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero: ");
        double numero1 = sc.nextDouble();
        System.out.println("Introduzca el segundo numero: ");
        double numero2 = sc.nextDouble();
        sc.close();
        return new Operacion(numero1, numero2);
    }
    //Método sumar()
    public void suma(Operacion os) {
        double sumar = os.getNumero1() + os.getNumero2();
        System.out.println("La suma es: " + sumar);
    }
    //Método restar()
    public void restar(Operacion os) {
        double restar = os.getNumero1() - os.getNumero2();
        System.out.println("La diferencia es: " + restar);
    }
    //Método multiplicar()
    public void multi(Operacion os) {
        if (os.getNumero1() == 0 || os.getNumero2() == 0) {
            int cero = 0;
            System.out.println("Uno de los numeros es cero, el resultado es: " + cero);
        } else {
            double multi = os.getNumero1() * os.getNumero2();
            System.out.println("El producto es: " + multi);
        }
    }
    //Método dividir()
    public void div(Operacion os) {
        if (os.getNumero2() == 0) {
            int cero=0;
            System.out.println("La division entre '0', no es posible."+cero);
        } else {
            double div = os.getNumero1() / os.getNumero2();
            System.out.println("El resultado de dividir "+os.getNumero1()+" entre "+os.getNumero2()+" es: " + div);
        }
    }
}