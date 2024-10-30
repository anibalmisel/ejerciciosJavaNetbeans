package Servicio;

import Entidades.Dni;
import Entidades.Persona;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class personaServicio {

    /**
     * Metodo crearPersona(): el método crea una persona.
     *
     * @return devuelve una persona.
     */
    public Persona crearP() throws ParseException {
        LocalDate fechaDeNacimiento = LocalDate.now(); // Asigna la fecha actual
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escriba su nombre: ");
        String nombre = sc.next();
        System.out.println("Indique su edad: ");
        Integer edad = sc.nextInt();
        char sexo = 0;
        String opciones;
        do {
            System.out.println("Indique su sexo H,M,O: ");
            opciones = sc.next();
            if (opciones.length() > 0) {
                sexo = opciones.toUpperCase().charAt(0);
                if (sexo == 'H' || sexo == 'M' || sexo == 'O') {
                    break;
                } else {
                    System.out.println("La opcion es incorrecta"
                            + "Por favor, introduzca una opcion correcta: H,M,O");
                }
            } else {
                System.out.println("La opcion no puede estar vacia");
            }
        } while ((sexo != 'H' || sexo != 'M' || sexo != 'O') && opciones.length() == 0);
        System.out.println("Introduzca su peso: ");
        String peso = sc.next();
        System.out.println("Indique su altura: ");
        String altura = sc.next();
        System.out.println("Por favor introduzca la fecha de nacimiento ‘yyyy-MM-dd’: ");
        String fechaTexto = sc.next();
        sc.nextLine();
        try {
            fechaDeNacimiento = LocalDate.parse(fechaTexto); // Aquí puedes hacer lo que quieras con el objeto fechaDeNacimiento
        } catch (DateTimeParseException e) {
            System.out.println("La fecha introducida no tiene el formato correcto.");
        }
        Dni dni = new Dni();
        System.out.println("Enter serie dni:");
        String letra = sc.nextLine();
        System.out.println("Enter number dni:");
        Integer number = sc.nextInt();
        dni = new Dni(letra, number);
        return new Persona(nombre, edad, sexo, peso, altura, fechaDeNacimiento, dni);
    }

    /**
     * Método calcularIMC(): calcula si la persona está en su peso ideal
     *
     * @return devuelve un int. px = -1 si esta por debajo del peso ideal. px =
     * 0 si tiene peso ideal. px = 1 si tiene sobrepeso.
     */
    public int calcularIMC(Persona p1) {
        /**
         * necesito transformar un String en un int String str = "123 kgr"; str
         * = str.replaceAll("[^\\d]", ""); int num = Integer.parseInt(str);
         * Double peso = Double.parseDouble(p1);
         */
        int px;
        String pe1 = p1.getPeso().replaceAll("[^\\d.]", "");
        Double peso = Double.parseDouble(pe1);
        String a1 = p1.getAltura().replaceAll("[^\\d.]", "");//estudiar el uso de las expresiones regulares
        Double altura = Double.parseDouble(a1);
        Double peso_T = peso / (altura * altura);
        if (peso_T >= 20 && peso_T <= 25) {
            px = 0;//peso ideal(PI)
            //System.out.println(px);
        } else if (peso_T < 20) {
            px = -1;//por debajo PI
            //System.out.println(px);
        } else {
            px = 1;//sobrepeso
            //System.out.println(px);
        }
        return px;
    }

    /**
     * Método esMayorDeEdad(): indica si la persona es mayor de edad.
     *
     * @return devuelve un booleano, true si es mayor de edad, false si no.
     */
    public boolean esMayorDeEdad(Persona p1) {
        boolean mayorDeEdad = false;
        int edad = p1.getEdad();
        if (edad >= 18) {
            mayorDeEdad = true;
            //System.out.println(mayorDeEdad);
        } else {
            //System.out.println(mayorDeEdad);
        }
        return mayorDeEdad;
    }
}