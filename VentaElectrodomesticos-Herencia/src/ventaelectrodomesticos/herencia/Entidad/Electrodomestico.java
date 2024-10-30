/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
 */
package ventaelectrodomesticos.herencia.Entidad;

/**
 *
 * @author aniba
 */
public class Electrodomestico {
    //Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,consumo energético (letras entre A y F) y peso.
    //atributos
    protected Integer precio;
    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, Integer peso) {
        this.precio = precio;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Equipo: " + " \n Precio = " + precio + "\n Peso = " + peso + '.';
    }
}