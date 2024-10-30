
package Servicio;
import Entidad.Cafetera;
import java.util.Scanner;
public class cafeteraServicio {
    Scanner sc=new Scanner(System.in);
    // Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima
    public void llenarCafetera(Cafetera cf) {
        if (cf.getCantidadActual() < cf.getCapacidadMaxima()) {
            for (int i = 0; i < cf.getCapacidadMaxima(); i++) {
                cf.setCantidadActual(cf.getCantidadActual() + 1);
            }
            System.out.println("La cafetera esta llena");
        } else {
            System.out.println("La cafetera esta llena");
        }
    }
    //Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
    //tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
    //cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
    //método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
    //cuanto quedó la taza.
    public void servirTaza(Cafetera cf) {
        
        System.out.println("Indique la capacidad de la taza: ");
        int capacidadTaza = sc.nextInt();
        if (capacidadTaza <= cf.getCantidadActual()) {
            System.out.println("Llenando...");
            int suma = cf.getCantidadActual() - capacidadTaza;
            cf.setCantidadActual(suma);
            System.out.println("La taza está servida");
        } else if (capacidadTaza > cf.getCantidadActual()){
            System.out.println("No se podra llenar toda la capacidad de la taza");
            System.out.println("Llenando...");
            System.out.println("La taza está servida. Se lleno "+cf.getCantidadActual()+" ml.");
            cf.setCantidadActual(0);
        }
        
    }
    //Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera(Cafetera cf){
        System.out.println("Vaciando...");
        if (cf.getCantidadActual()==0) {
            System.out.println("La cafetera esta vacia");
        }else{
            cf.setCantidadActual(0);
            System.out.println("La cafetera esta vacia");
        }
    }
    //Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    //recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(Cafetera cf){
        int resto=cf.getCapacidadMaxima()-cf.getCantidadActual();
        int resto2;
        System.out.println("Indique la cantidad de cafe que requiere: ");
        int cantCafe=sc.nextInt();
        if (cf.getCantidadActual()==cf.getCapacidadMaxima()) {
            System.out.println("La cafetera esta llena");
        }else if(resto>=cantCafe){
            cf.setCantidadActual(cf.getCantidadActual()+cantCafe);
            if (resto>cantCafe) {
                  resto= cf.getCapacidadMaxima()-cf.getCantidadActual();
                System.out.println("La cafetera se lleno parcialmente, falta: "+resto+" ml, para llenarse");
            }else{
                System.out.println("La cafetera esta llena");
            } 
        }else{
            System.out.println("La cantidad de cafe indicado supera la capacidad");
            System.out.println("Se llenara hasta su capacidad maxima");
            System.out.println("Llenando...");
            cf.setCantidadActual(cf.getCantidadActual() + resto);
            resto2 = cantCafe-cf.getCantidadActual();
            System.out.println("");
            System.out.println("La cafetera esta llena. Excedente: " + resto2);
        }
        
    }
}