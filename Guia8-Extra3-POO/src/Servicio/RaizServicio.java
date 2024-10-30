package Servicio;

import Entidad.Raiz;
import static java.lang.Math.sqrt;

/**
 *
 * @author aniba
 */
public class RaizServicio {
//Método getDiscriminante(): devuelve el valor del discriminante (double)
//El discriminante tiene la siguiente formula: (b^2)-4*a*c
    public double getDiscriminante(int a, int b, int c){
        double resultado = Math.pow(b, 2)-(4*a*c);
        return resultado;
    }
//Método tieneRaices(): devuelve un booleano indicando si tiene dos
//soluciones, para que esto ocurra, el discriminante debe ser mayor
//o igual que 0.
    public boolean tieneRaices(double discriminante){
       boolean solucion = false;
        if (discriminante>=0) {
            solucion=true;
        }
        return solucion;
    }
//Método tieneRaiz(): devuelve un booleano indicando si tiene una única
//solución, para que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(double discriminante){
       boolean solucion = false;
        if (discriminante == 0) {
            solucion=true;
        }
        return solucion;
    }
//Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true,
//imprime las 2 posibles soluciones.
    public void obtenerRaices(Raiz rz, RaizServicio rs) {
       
        double x1; double x2;
        double discriminante = rs.getDiscriminante(rz.getA(), rz.getB(), rz.getC());
        boolean indicador = rs.tieneRaices(discriminante);
        if (indicador == true) {
            x1= (-rz.getB()+ sqrt(discriminante))/2*rz.getA();
            x2= (-rz.getB()- sqrt(discriminante))/2*rz.getA();
            System.out.println("La solucion x1 = "+x1);
            System.out.println("La solucion x2 = "+x2);
        }
    }
//Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime
//una única raíz. Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz(Raiz rz, RaizServicio rs) {
        
        double x1;
        double discriminante = rs.getDiscriminante(rz.getA(), rz.getB(), rz.getC());
        boolean indicador = rs.tieneRaiz(discriminante);
        if (indicador == true) {
            x1= (-rz.getB())/2*rz.getA();
            System.out.println(x1);
        }
    }
//Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
//y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación
//con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan
//nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
//Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a)
//Solo varia el signo delante de -b
    public void calcular (Raiz rz, RaizServicio rs) {
        double discriminante = rs.getDiscriminante(rz.getA(), rz.getB(), rz.getC());
        if (discriminante >=0) {
            rs.obtenerRaices(rz, rs);
        }else{
            System.out.println("La ecuacion no tiene soluciones reales");  
        }
    }
}