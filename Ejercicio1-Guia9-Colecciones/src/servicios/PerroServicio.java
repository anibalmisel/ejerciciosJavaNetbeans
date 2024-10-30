package servicios;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author aniba
 */
public class PerroServicio {
    Scanner sc = new Scanner(System.in);
    Perro pr = new Perro();
    ArrayList<String> razaPerros = new ArrayList<>();
    /**
     * 1.El metodo debe: leer y guardar razas de perros en un ArrayList de tipo
     * String. Pedirá una raza de perro en un bucle y se guardará en la lista.
     * Después preguntará al usuario si quiere guardar otro perro o si quiere
     * salir. Si decide salir, se mostrará todos los perros guardados en el
     * ArrayList.
     */
    
    public void guardarRazasDePerros() {
        String entrarSalir = "si";
        while (entrarSalir.equalsIgnoreCase("si")) {
            System.out.println("Por favor introduce una raza de perro: ");
            String unPerro = sc.nextLine();
            pr.setRaza(unPerro);
            razaPerros.add(pr.getRaza());
            System.out.println("¿Quiere guardar otro perro?, escriba si o no: ");
            entrarSalir = sc.nextLine();
            if (!entrarSalir.equalsIgnoreCase("si")&!entrarSalir.equalsIgnoreCase("no")) {
                System.out.println("Error: si o no");
                entrarSalir = sc.nextLine();
            }
        }
        razaPerros.forEach((e) -> System.out.print(e+", "));
        System.out.println("");
    }
    /**
     * 2.Al usuario se le pedirá un perro y se recorrerá la lista con un Iterator.
     * Se buscará el perro en la lista.
     * A) Si el perro está en la lista: - a.1 Se eliminará el perro que ingresó el usuario.
     * B) Si el perro no se encuentra en la lista: - b.1 Se le informará al usuario y 
     * C) Se mostrará la lista ordenada.
     */
    
    public void eliminarOrdenar() {
        System.out.println("");
        int tamanoLista = razaPerros.size();
        System.out.println("Escriba la raza del perro que desea eliminar: ");
        String eliminarPerro = sc.nextLine();
        Iterator<String> it = razaPerros.iterator();
           //La forma de eliminar usando for
          //for (int i = 0; i < razaPerros.size(); i++) {
             //String p = razaPerros.get(i);
             //if (p.equalsIgnoreCase(eliminarPerro)) {
                 //razaPerros.remove(i);
              //}
          //}
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equalsIgnoreCase(eliminarPerro)) {
                it.remove();
            }
        }
        if (razaPerros.size()==tamanoLista) {
            System.out.println("La raza indicada no se encuentra en la lista");
        }
        //hay que ordenar ir a la clase Comparadores
        Collections.sort(razaPerros);
        System.out.println("");
        System.out.println("Lista Ordenada: ");
        razaPerros.forEach((e) -> System.out.println(e));
        Collections.reverse(razaPerros);
        System.out.println("-------------------------------------------");
        razaPerros.forEach((e) -> System.out.println(e));
        sc.close();
    }
}