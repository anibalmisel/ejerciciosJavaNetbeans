/*
 Los atributos serán el número de DNI (entero largo) y la
letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
 Métodos getters y setters para el número de DNI y la letra.
 */
package Entidad;

/**
 *
 * @author aniba
 */
public class Nif {
    //atributos
    private long numeroDni;
    private char letraDni;
    
    //Contructores
    public Nif() {
        
    }
    
    public Nif(long numeroDni, char letraDni) {
        this.numeroDni = numeroDni;
        this.letraDni = letraDni;
    }
    
    //getters & setters
    
    public long getNumeroDni() {
        return numeroDni;
    }
    
    public void setNumeroDni(long numeroDni) {
        this.numeroDni = numeroDni;
    }
    
    public char getLetraDni() {
        return letraDni;
    }
    
    public void setLetraDni(char letraDni) {
        this.letraDni = letraDni;
    }
    
    //toString

    @Override
    public String toString() {
        return "Nif{" + "numeroDni=" + numeroDni + ", letraDni=" + letraDni + '}';
    }   
}