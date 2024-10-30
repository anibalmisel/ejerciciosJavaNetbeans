/*
 6. Se necesita una aplicación para una tienda en la cual queremos 
    almacenar los distintos productos que venderemos y el precio que
    tendrán. Además, se necesita que la aplicación cuente con las 
    funciones básicas. Estas las realizaremos en el servicio. Como,
    introducir un elemento, modificar su precio, eliminar un producto
    y mostrar los productos que tenemos con su precio (Utilizar Hashmap).
    El HashMap tendrá de llave el nombre del producto y de valor el precio.
    Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package guia9.tienda.servicio;

import guia9.tienda.entidad.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class TiendaServicio {

    private Scanner sc;
    private HashMap<String, String> listProductPrice;

    public TiendaServicio() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.listProductPrice = new HashMap<>();
    }

    public void menu() {
        HashMap<String, String> tienda = new HashMap<>();
        TiendaServicio ts = new TiendaServicio();
        String exit = "yes";
        int attempts1 = 0;//vcontador para limitar las respuestas erradas del usuario
        System.out.println("");
        do {
            System.out.println("Choose a menu option");
            System.out.println("        MENU" + "\n -1. New Product" + "\n -2. Chance Price"
                    + "\n -3. Delete Product" + "\n -4. Show Existence");
            int option = sc.nextInt();
            while (option != 1 & option != 2 & option != 3 & option != 4) {
                if (attempts1 < 3) {
                    System.out.println("Error: Enter a valid option : ");
                    option = sc.nextInt();
                    attempts1++;//tendra solo tres intentos
                } else if (attempts1 == 3) {
                    System.out.println("You have overcome the attempts, goodbye");
                    exit = "no";
                    break;
                }
            }

            switch (option) {
                case 1:
                    tienda = ts.newProduct();
                    break;
                case 2:
                    ts.chancePrice(tienda);
                    break;
                case 3:
                    ts.deletedProduct(tienda);
                    break;
                case 4:
                    ts.showProduct(tienda);
            }

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
        } while (exit.equalsIgnoreCase("yes"));
        System.out.println("");
        System.out.println("See yo later");
        System.out.println("");
    }

    public HashMap<String, String> newProduct() {
        String exit;
        String product;
        String price;
        do {
            Tienda t = new Tienda();
            System.out.print("Name of the product: ");
            t.setProduct(product = sc.next());
            System.out.print("Enter price: ");
            t.setPrice(price = sc.next());
            //double dPrice = Double.parseDouble(price);
            listProductPrice.put(t.getProduct(), t.getPrice());
            System.out.println("Do you want register a new article?");
            exit = sc.next();
            while (!exit.equalsIgnoreCase("yes") & !exit.equalsIgnoreCase("no")) {
                System.out.println("Error: please answer 'yes' or 'no': ");
                exit = sc.next();
            }
        } while (exit.equalsIgnoreCase("yes"));

        System.out.println("List of existing product");
        for (Map.Entry<String, String> entry : listProductPrice.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Product: " + key + " Price: " + value);
        }

        return listProductPrice;
    }

    //Chance Price
    public HashMap<String, String> chancePrice(HashMap<String, String> cp) {
        String newPrice;
        String nameProduct;
        //identificar primero el producto y luego a ese producto modificar el precio
        //containsKey(Llave)
        //get(Llave)
        System.out.println("Enter the product to be repriced");
        nameProduct = sc.next();
        if (cp.containsKey(nameProduct) == true) {
            System.out.println("Enter new price: ");
            newPrice = sc.next();
            cp.replace(nameProduct, newPrice);
        } else {
            System.out.println("The product no exist");
        }
        return cp;
    }

    //delete product
    public HashMap<String, String> deletedProduct(HashMap<String, String> cp) {
        String deletedProduct;
        System.out.println("Enter the product to be deleted");
        deletedProduct = sc.next();
        if (cp.containsKey(deletedProduct) == true) {
            cp.remove(deletedProduct);
            System.out.println("Product has been deleted");
        } else {
            System.out.println("The product no exist");
        }
        return cp;
    }

    //showProduct
    public HashMap<String, String> showProduct(HashMap<String, String> cp) {
        System.out.println("List of existing product");
        for (Map.Entry<String, String> entry : cp.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Product: " + key + " Price: " + value);
        }
        return cp;
    }
}