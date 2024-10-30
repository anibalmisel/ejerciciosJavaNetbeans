/*
5. Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Servicio;

import Entidad.Mes;
import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class MesServicio {
    
    public void llenarVector(Mes m) {
       String [] meses ={"enero", "febrero", "marzo", "abril", "mayo", "junio", 
           "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        m.setMeses(meses);
        int i;
        i=(int)(Math.random()*12);
        m.setMesSecreto(meses[i]);
    }
    public void adivinarMes(Mes m) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivine el mes secreto");
        System.out.println("Introduzca el nombre del mes en minúsculas: ");
        String mesAdivina = sc.nextLine().toLowerCase();
        boolean bandera;
        do {
          bandera=true;
            if (m.getMesSecreto().equalsIgnoreCase(mesAdivina)) {
                System.out.println("¡Ha acertado!");
                bandera = false;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
                mesAdivina = sc.nextLine();
            }
        } while (bandera == true);
    }
}
