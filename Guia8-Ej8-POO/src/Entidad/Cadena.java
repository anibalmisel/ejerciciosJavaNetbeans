/*
 Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
 String) y su longitud.
 */
package Entidad;

public class Cadena {

    //atributos
    private String frase;
    private int longi;
    //constructor por defecto

    public Cadena() {
        
    }
    //constructor por parametros

    public Cadena(String frase, int longi) {
        this.frase = frase;
        this.longi = longi;
    }
    //getters&&setters

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongi() {
        longi=frase.length();
        return longi;
    }

    public void setLongi(int longi) {
        this.longi = longi;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longi=" + longi + '}';
    }

}
