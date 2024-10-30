/*
 9. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package guia8.ej9.poo;
import Entidad.Matematica;
import Servicio.MatematicaServicio;
/**
 * @author aniba
 */
public class Guia8Ej9POO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica ma = new Matematica();
        MatematicaServicio ms = new MatematicaServicio();
         ma.setNum1(Math.random() * 10);
         ma.setNum2(Math.random() * 10);
        System.out.println(ms.devolverMayor(ma.getNum1(), ma.getNum2())); 
        System.out.println(ms.calcularPotencia(ma.getNum1(), ma.getNum2())); 
        System.out.println(ms.calculaRaiz(ma.getNum1(), ma.getNum2())); 
    }
}