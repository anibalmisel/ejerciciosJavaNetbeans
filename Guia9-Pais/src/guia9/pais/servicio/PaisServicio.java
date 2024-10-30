package guia9.pais.servicio;

import guia9.pais.entidad.Pais;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author aniba
 */
public class PaisServicio {

    private Scanner sc;
    private TreeSet<String> country;

    public PaisServicio() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.country = new TreeSet<>();
    }
    //El programa pedirá un país en un bucle, se guardará el país en el
    //conjunto y después se le preguntará al usuario si quiere guardar
    //otro país o si quiere salir, si decide salir, se mostrará todos 
    //los países guardados en el conjunto.
    public TreeSet<String> registerCountry() {
        String name;
        String answer;
        do {
            Pais p = new Pais();
            System.out.println("Enter the country: ");
            p.setPais(name = sc.next());
            country.add(p.getPais());
            System.out.println("Do you want register a new country?");
            answer = sc.next();
            while (!answer.equalsIgnoreCase("yes") & !answer.equalsIgnoreCase("no")) {
                System.out.println("Error: please answer 'yes' or 'no': ");
                answer = sc.next();
            }
        } while (answer.equalsIgnoreCase("yes"));
        System.out.println("");
        System.out.println("List of country: ");
        for (String aux : country) {
            System.out.println(aux);
        }
        System.out.println("");
        return country;
    }
    //Después deberemos mostrar el conjunto ordenado alfabéticamente:
    //para esto recordar cómo se ordena un conjunto.
    public TreeSet<String> showCountry(TreeSet<String> p) {
        System.out.println("List of country: ");
        for (String aux : p) {
            System.out.println(aux);
        }
        System.out.println("");
        return p;
    }
    //Por último, al usuario se le pedirá un país y se recorrerá el conjunto
    //con un Iterator, se buscará el país en el conjunto y si está en el 
    //conjunto se eliminará el país que ingresó el usuario y se mostrará el
    //conjunto. Si el país no se encuentra en el conjunto se le informará
    //al usuario.
    public void deleteCountry(TreeSet<String> p) {
        System.out.println("Enter the country you wish to delete: ");
        String delete = sc.next();

        if (p.contains(delete) == true) {
            Iterator<String> it = p.iterator();
            while (it.hasNext()) {
                if (it.next().equalsIgnoreCase(delete)) {
                    it.remove();
                }
            }
            System.out.println("");
            System.out.println("List of country: ");
            for (String aux : p) {
                System.out.println(aux);
            }
            System.out.println("");
        } else {
            System.out.println("The indicated country is not in the list: ");
        }
        System.out.println("");
    }
}
