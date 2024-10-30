
package Servicios;
import Entidad.Rectangulo;
import java.util.Scanner;
public class RectanguloServicios {
    public Rectangulo rc(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base of the rectangle: ");
        double base=sc.nextDouble();
        System.out.println("Enter the height of the rectangulo: ");
        double altura=sc.nextDouble();
        return new Rectangulo(base, altura);
    }
//    método para calcular la superficie del rectángulo
    public void surface (Rectangulo rc){
        double surface=rc.getAltura()*rc.getBase();
        System.out.println("The surface of the rectangle is: "+surface);
    }
//método para calcular el perímetro
    public void perimeter (Rectangulo rc){
        double perimeter=(rc.getBase()+rc.getAltura())*2;
        System.out.println("The perimeter of the rectangle is: "+perimeter);  
    }   
//método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
    public void drawRectangle(Rectangulo rc){
        for (int i = 0; i < rc.getBase(); i++) {
            for (int j = 0; j < rc.getAltura(); j++) {
                if (i == 0 || i == rc.getBase() - 1 || j == 0 || j == rc.getAltura() - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
