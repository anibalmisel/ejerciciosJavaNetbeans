/*
 La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
 */
package herencia.ejercicioanimal.Entidad;

/**
 *
 * @author aniba
 */
public class Animal <T> {
    //atributos
    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected T raza;

    public Animal(String nombre, String alimento, Integer edad, T raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }

    public Animal() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public T getRaza() {
        return raza;
    }

    public void setRaza(T raza) {
        this.raza = raza;
    }
     
    public void hacerRuido() {
        System.out.println("Hola Mundo");
    }
    
    /*
    Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
    mensaje por pantalla informando de que se alimenta.
    */
   public void alimentacion(Animal animal) {
       System.out.println(animal.getAlimento());
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + ", raza=" + raza + '}';
    }   
}