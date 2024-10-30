/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.

LOGRADO
 */
package herencia.ejercicioanimal;
import herencia.ejercicioanimal.Entidad.Animal;
import herencia.ejercicioanimal.Entidad.Caballo;
import herencia.ejercicioanimal.Entidad.Gato;
import herencia.ejercicioanimal.Entidad.Perro;
import herencia.ejercicioanimal.Enumeraciones.RazaCaballo;
import herencia.ejercicioanimal.Enumeraciones.RazaGatos;
import herencia.ejercicioanimal.Enumeraciones.RazaPerros;
import java.util.ArrayList;
/**
 *
 * @author aniba
 */
public class HerenciaEjercicioAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList();
        Animal perro1 = new Perro("Tarzan", "Carne", 3, RazaPerros.CAZADOR.getNombreRaza());
        perro1.alimentacion(perro1);
        Animal perro2 = new Perro("Danger", "Pienso", 2, RazaPerros.MESTIZO.getNombreRaza());
        perro2.alimentacion(perro2);
        Animal gato1 = new Gato("Tigre", "Atun", 1, RazaGatos.ANGORA.getNombreRaza());
        gato1.alimentacion(gato1);
        Animal caballo1 = new Caballo("Valiant", "Avena", 2, RazaCaballo.CRIOLLO.getNombreRaza());
        caballo1.alimentacion(caballo1);
        
        System.out.println("");
    }
}