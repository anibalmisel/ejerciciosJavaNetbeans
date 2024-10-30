
package Entidades;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Realizar una clase llamada Persona que tenga los siguientes atributos:
 * nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el
 * alumno desea añadir algún otro atributo, puede hacerlo. Los métodos que se
 * implementarán son:  Un constructor por defecto.  Un constructor con todos
 * los atributos como parámetro.  Métodos getters y setters de cada atributo.
 *
 * @author aniba
 */


public class Persona {

    //Atributos
    private String nombre;
    private Integer edad;
    private char sexo;//TODO clasificar los atributos num y relaciones entre clases
    private String peso;
    private String altura;
    private LocalDate fechaDeNacimiento;
    private Dni dni;
    

    //Constructor
    public Persona() {
    }

    public Persona(String nombre, Integer edad, char sexo, String peso, String altura, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public Persona(String nombre, Integer edad, char sexo, String peso, String altura, LocalDate fechaDeNacimiento, Dni dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.dni = dni;
    }

    public Dni getDni() {
        return dni;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        hash = 23 * hash + Objects.hashCode(this.edad);
        hash = 23 * hash + this.sexo;
        hash = 23 * hash + Objects.hashCode(this.peso);
        hash = 23 * hash + Objects.hashCode(this.altura);
        hash = 23 * hash + Objects.hashCode(this.fechaDeNacimiento);
        hash = 23 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    /**
     * TODO agregar los metodos equals y hash, asi como los comparator
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.sexo != other.sexo) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.peso, other.peso)) {
            return false;
        }
        if (!Objects.equals(this.altura, other.altura)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        if (!Objects.equals(this.fechaDeNacimiento, other.fechaDeNacimiento)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + ""
                + "\n nombre = " + nombre + ""
                + "\n edad = " + edad + ""
                + "\n sexo = " + sexo + ""
                + "\n peso = " + peso + ""
                + "\n altura = " + altura + ""
                + "\n fechaDeNacimiento = " + fechaDeNacimiento + ""
                + "\n dni = " + dni + '}';
    }
}