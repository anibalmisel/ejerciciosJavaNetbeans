/*
 5. Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9].
 */
package Entidad;

/**
 *
 * @author aniba
 */
public class Mes {
    //atributos
    private String [] meses = new String [12];
    private String mesSecreto;
    //constructores
    public Mes() {
    }
    
    public Mes (String [] meses, String mesSecreto) {
        this.meses = meses;
        this.mesSecreto = mesSecreto;
    }
    
    //getters & setters

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    //toString
    @Override
    public String toString() {
        return "Mes{" + "meses=" + meses + ", mesSecreto=" + mesSecreto + '}';
    }   
}