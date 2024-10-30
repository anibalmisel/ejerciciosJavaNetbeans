package guia9ecodigopostal.servicio;

import guia9ecodigopostal.entidad.CodigoPostal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class CodigoPostalServicio {
   
    //• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
    public HashMap<String, String> enterCodigo(HashMap<String, String> codigoCiudad) {
        Scanner sc = new Scanner(System.in);
        do {
            CodigoPostal cp = new CodigoPostal();
            System.out.print("Enter the key:");//codigo postal
            String key = sc.nextLine();
            cp.setCodigoPostal(key);
            System.out.print("Enter the value:");//ciudad
            String value = sc.nextLine();
            cp.setCiudad(value);
            codigoCiudad.put(cp.getCodigoPostal(), cp.getCiudad());
        } while (codigoCiudad.size() <3);
        System.out.println("");
        return codigoCiudad;
    }
    //• Muestra por pantalla los datos introducidos
    public void mostrarMapa (HashMap <String, String> mapa) {
        int numeracion=1;
        System.out.println("");
        System.out.println("Lista de Codigos Postales");
        System.out.println("");
        for (Map.Entry<String, String> entry : mapa.entrySet()) {
            String key1 = entry.getKey();
            String value1 = entry.getValue();
            System.out.println("("+numeracion+") El codigo postal de " + value1 + " es: " + key1);
            numeracion++;
        }
        System.out.println("");
    }
    //• Pide un código postal, si existe muestra la ciudad asociada; sino, avisa al usuario.
    public void buscar(HashMap <String, String> mapa) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the postal code: ");
        String codePostal = sc.nextLine();
        if (mapa.containsKey(codePostal)) {
            System.out.println(mapa.get(codePostal));
        } else {
            System.out.println(" La ciudad asociada al CP, no existe");
        }
        System.out.println("");
    }
    //• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
    public void eliminar(HashMap <String, String> mapa) {
        Scanner sc = new Scanner(System.in);
        int exit = 0;
        while (exit < 3) {
            System.out.println("Enter the postal code of the city for delete:");//se puede eliminar un elemento del HashMap, usando el valor?
            String cityDelete = sc.nextLine();
            String value = mapa.remove(cityDelete);// Eliminar el par y obtener el valor
            
            if (value == null) {// Si el valor es nulo, significa que la clave no existe
                System.out.println("La ciudad mencionada no se encuentra");
            } else {// Si el valor no es nulo, significa que el par se eliminó correctamente
                System.out.println("La ciudad " + cityDelete + " se eliminó del mapa");
            }
            System.out.println("");
            exit++;
        } 
    } 
}