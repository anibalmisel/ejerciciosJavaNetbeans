package Servicio;
/**
 * @author aniba
 */
public class MatematicaServicio {
// a) Método devolverMayor() para retornar cuál de los dos atributos
// tiene el mayor valor
    public double devolverMayor(double num1, double num2){
        return Math.max(num1, num2);
    }
// b) Método calcularPotencia() para calcular la potencia del mayor 
// valor de la clase elevado al menor número. Previamente se deben 
// redondear ambos valores.
    public double calcularPotencia(double num1, double num2){
        //Redondear los valores y asignarlos a variables locales
        long num1_ = Math.round(num1);
        long num2_ = Math.round(num2);
        //Obtener el mayor y el menor valor entre las variables
        long mayor=Math.max(num2_, num1_);
        long menor=Math.min(num1_, num2_);
        //Calcular la potencia del mayor elevado al menor     
        return Math.pow(mayor, menor);
    }  
// c) Método calculaRaiz(), para calcular la raíz cuadrada del menor 
// de los dos valores.
    public double calculaRaiz(double num1, double num2) {
        double menor = Math.min(num1, num2);
        return Math.sqrt(menor);
    }
}