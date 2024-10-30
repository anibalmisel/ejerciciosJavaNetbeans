/*
 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package guia10.personaperro;

import guia10.personaperro.Entidad.Perro;
import guia10.personaperro.Entidad.Persona;
import guia10.personaperro.Enumeraciones.DogSize;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class Guia10PersonaPerro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Perro dog = new Perro();
        crearPersona(p1, dog);
        System.out.println("");  
    }
    /*
    de momento, se guardan en la lista dos veces el ultimo elemnto que se guarda,
    y se borra el primero. RESUELTO
    */
    public static void crearPersona(Persona persona, Perro dog) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList();
        Perro dog2 = new Perro();
        
        int exit=0;//contador para ciclo while
        int exit2=0;//contador para ciclo dowhile
        
        
        System.out.println("VAMOS A CREAR DOS PERSONAS");
        while (exit < 2) {
            if (exit==1) {
                System.out.println("INGRESAMOS LOS DATOS DE LA SEGUNDA PERSONA");
            }
            System.out.println("");
            System.out.print("Ingrese el nombre: ");
            String firstName = sc.nextLine();
            //persona.setFirstName(firstName);
            System.out.print("Ingrese apellido: ");
            String lastName = sc.nextLine();
            //persona.setLastName(lastName);
            System.out.print("Ingrese edad: ");
            String age = sc.nextLine();
            //persona.setAge(age);
            System.out.print("Ingrese dni: ");
            String dni = sc.nextLine();
            //persona.setDni(dni);
            System.out.println("");
            
            //Se construye el perro 
            System.out.println("Vamos a asignarle un perro");
            System.out.println("");
            System.out.print("Ingrese nombre del perro: ");
            String dogName = sc.nextLine();
            //dog.setDogName(dogName);
            System.out.print("Ingrese raza del perro: ");
            String dogBreed = sc.nextLine();
            //dog.setDogBreed(dogBreed);
            System.out.print("Ingrese la edad del perro: ");
            String dogAge = sc.nextLine();
            //dog.setDogAge(dogAge);
            
            //se define la talla del perro
            System.out.println("Indique el tamaño del perro:"+"\n Si "+DogSize.PEQUEÑO.getDescripcion()+" entonces escriba 'p'"+"\n Si "+DogSize.MEDIANO.getDescripcion()+"  entonces escriba 'm'"+"\n Si "+DogSize.GRANDE.getDescripcion()+"  entonces escriba 'g'");
            String talla = sc.nextLine();
            do {
              if (talla.charAt(0)=='p') {
                dog2.setDogSize(DogSize.PEQUEÑO);
            }else if(talla.charAt(0) == 'm') {
                dog2.setDogSize(DogSize.MEDIANO);
            }else if(talla.charAt(0) == 'g') {
                dog2.setDogSize(DogSize.GRANDE);
            }else{
                System.out.println("Error: Escriba una entrada correcta p,m,g");
                talla = sc.nextLine();
                exit2++;
            }  
            } while (talla.charAt(0)!= 'p' & talla.charAt(0)!= 'g' & talla.charAt(0)!= 'm' & exit2 <= 2 );
                  
            if (exit>2) {
                System.out.println("Agotó sus intentos, el registro fue parcial.");
            }
            //se agrega el perrdo a la persona
            persona.setPerro(dog);
            dog2 = new Perro(dogName, dogBreed, dogAge, DogSize.GRANDE);
            dog=dog2;
            Persona p2 = new Persona(firstName, lastName, age, dni, dog);
            persona=p2;
            //se agrega la persona a la lista
            personas.add(persona);
            exit++;   
        }
        System.out.println("");
        for (Persona persona1 : personas) {
            System.out.print(persona1);
            System.out.println("");
        }
        sc.close();
    }
}