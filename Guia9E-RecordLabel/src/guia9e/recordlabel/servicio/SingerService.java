/*
 Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
 */
package guia9e.recordlabel.servicio;

import guia9e.recordlabel.entidad.Singer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class SingerService {

    private Scanner sc;
    private ArrayList<Singer> famousSinger;

    public SingerService() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.famousSinger = new ArrayList<>();
    }

    public ArrayList<Singer> famouSinger() {
        //crear una lista de tipo CantanteFamoso y agregar 5 objetos
        //de tipo CantanteFamoso a la lista
        String exit = "yes";
        int plus = 0;
        do {
            System.out.println("Enter name of the singer");
            String singerF = sc.next();
            Singer sg = new Singer();
            sg.setName(singerF);
            System.out.println("Enter name of the record label");
            String record = sc.next();
            sg.setBestSellingAlbums(record);
            famousSinger.add(sg);

            System.out.println("Would you like to enter another singer?: ");
            exit = sc.next();
            if (!exit.equalsIgnoreCase("yes") & !exit.equalsIgnoreCase("no")) {
                while (!exit.equalsIgnoreCase("yes") & !exit.equalsIgnoreCase("no") & plus < 3) {
                    System.out.println("Error: Enter 'yes' or 'no': ");
                    exit = sc.next();
                    plus++;
                }
            } else if (plus == 3) {
                System.out.println("You have had three attempts. Good Bye!");
                exit = "no";
            }
        } while (exit.equalsIgnoreCase("yes"));
        System.out.println("");
        System.out.println("List of famous singer: ");
        System.out.println("");
        for (Singer singer : famousSinger) {
            System.out.println("singer: " + singer.getName() + " | Best Selling Albums: " + singer.getBestSellingAlbums());
        }
        System.out.println("");
        return famousSinger;
    }

    public void menu(ArrayList<Singer> fS) {
        SingerService ss = new SingerService();
        ArrayList<Singer> listLocal = new ArrayList();
        String exit = "yes";
        int attempts1 = 0;
        System.out.println("");
        do {
            System.out.println("Choose a menu option");
            System.out.println("        MENU" + "\n -1. Enter a new Singer" + "\n -2. Show every all singer "
                    + "\n -3. Delete Singer" + "\n -4. Exit");
            int option = sc.nextInt();
            while (option != 1 & option != 2 & option != 3 & option != 4) {
                if (attempts1 < 3) {
                    System.out.println("Error: Enter a valid option : ");
                    option = sc.nextInt();
                    attempts1++;
                } else if (attempts1 == 3) {
                    System.out.println("You have overcome the attempts, goodbye");
                    exit = "no";
                    break;
                }
            }
            switch (option) {
                case 1:
                    fS = ss.NewSinger(fS);
                    break;
                case 2:
                    fS = ss.ShowEveryAllSinger(fS);
                    break;
                case 3:
                    fS = ss.DeleteSinger(fS);
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("See yo later");
                    System.out.println("");
                    ss.ShowEveryAllSinger(fS);
                    exit = "no";
                    break;
            }
            if (exit.equalsIgnoreCase("yes")) {
                System.out.println("");
                int attempts2 = 0;
                System.out.println("wish to do other action 'yes or no'?:");
                exit = sc.next();
                while (!exit.equalsIgnoreCase("yes") & !exit.equalsIgnoreCase("no")) {
                    if (attempts2 < 3) {
                        System.out.println("Error: yes or no?: ");
                        exit = sc.next();
                        attempts2++;
                    } else if (attempts2 == 3) {
                        System.out.println("You have overcome the attempts, goodbye");
                        exit = "no";
                    }
                }
            }
        } while (exit.equalsIgnoreCase("yes"));
        System.out.println("");
    }

    public ArrayList<Singer> NewSinger(ArrayList<Singer> sl) {
        String exit = "yes";
        int plus = 0;
        do {
            System.out.println("Enter name of the singer");
            String singerF = sc.next();
            Singer sg = new Singer();
            sg.setName(singerF);
            System.out.println("Enter name of the record label");
            String record = sc.next();
            sg.setBestSellingAlbums(record);
            sl.add(sg);

            System.out.println("Would you like to enter another singer?: ");
            exit = sc.next();
            if (!exit.equalsIgnoreCase("yes") & !exit.equalsIgnoreCase("no")) {
                while (!exit.equalsIgnoreCase("yes") & !exit.equalsIgnoreCase("no") & plus < 3) {
                    System.out.println("Error: Enter 'yes' or 'no': ");
                    exit = sc.next();
                    plus++;
                }
            } else if (plus == 3) {
                System.out.println("You have had three attempts. Good Bye!");
                exit = "no";
            }
        } while (exit.equalsIgnoreCase("yes"));
        System.out.println("");
        System.out.println("List of famous singer: ");
        System.out.println("");
        for (Singer singer : sl) {
            System.out.println("singer: " + singer.getName() + " | Best Selling Albums: " + singer.getBestSellingAlbums());
        }
        System.out.println("");
        return sl;
    }

    public ArrayList<Singer> ShowEveryAllSinger(ArrayList<Singer> sl) {
        System.out.println("");
        System.out.println("List of famous singer: ");
        System.out.println("");
        for (Singer singer : sl) {
            System.out.println("singer: " + singer.getName() + " | Best Selling Albums: " + singer.getBestSellingAlbums());
        }
        System.out.println("");
        return sl;
    }

    public ArrayList<Singer> DeleteSinger(ArrayList<Singer> sl) {

        String deletedProduct;
        Singer get;
        String name;
        boolean exit = true;

        System.out.println("Enter the name singer to be deleted");
        deletedProduct = sc.next();

        for (int i = 0; i < sl.size(); i++) {
            get = sl.get(i);
            name = get.getName();

            if (get.getName().equalsIgnoreCase(deletedProduct)) {
                // Asignar el objeto a la variable toDelete
                sl.remove(i);
                System.out.println("Product has been deleted");
                exit = false;
                break;
            }
        }

        if (exit == true) {
            System.out.println("Product no exist");
        }

        return sl;
    }
}
