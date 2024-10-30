package Entidad;

/**
 * @author aniba
 */
public class Perro {
    
    //atributos
    private String raza;
    
    //constructores
    public Perro() {
        
    }

    public Perro(String raza) {
        this.raza = raza;
    }

    //getters & setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    //toString
    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + '}';
    }
}