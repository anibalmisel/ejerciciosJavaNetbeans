/*
 4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package guia8.ej4.poo;

import Entidad.Rectangulo;
import Servicios.RectanguloServicios;

public class Guia8Ej4POO {
    public static void main(String[] args) {
        RectanguloServicios rs=new RectanguloServicios();
        Rectangulo rc=rs.rc();
        rs.surface(rc);
        rs.perimeter(rc);
        rs.drawRectangle(rc);
    }
}
