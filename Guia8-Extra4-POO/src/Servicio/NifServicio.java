package Servicio;
import Entidad.Nif;
import java.util.Scanner;
/**
 * @author aniba
 */
public class NifServicio {
//Método crearNif(): le pide al usuario el DNI y con ese DNI
//calcula la letra que le corresponderá. Una vez calculado,
//le asigna la letra que le corresponde según el resultado del calculo.
    public Nif crearNif() {
        Scanner sc = new Scanner(System.in);
        char letra;
        System.out.println("Introduzca su DNI: ");
        long dni = sc.nextLong();
        int resto = (int)(dni%23);
        char [] letras = new char [23];
        String fraseLetra = "TRWAGMYFPDXBNJZSQVHLCKE";
        for (int i = 0; i < letras.length; i++) {
            letras [i] = fraseLetra.charAt(i);
        }
        letra = letras [resto];
        System.out.println(letra);
        return new Nif(dni, letra);
    }
//Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
//guion y la letra en mayúscula; por ejemplo: 00395469-F).
    public void mostrar(Nif n) {
        System.out.println("Su Nif es: "+n.getNumeroDni()+"-"+n.getLetraDni());
    } 
}