/*
atributos: nombre, apellido, edad, documento y Perro
*/
package guia10.personaperro.Entidad;

import java.util.Objects;

/**
 *
 * @author aniba
*/
public class Persona {
    //atributos
    private String firstName;
    private String lastName;
    private String age;
    private String dni;
    private Perro perro;
    //constructores
    public Persona() {
    }

    public Persona(String firstName, String lastName, String age, String dni, Perro perro) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dni = dni;
        this.perro = perro;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.firstName);
        hash = 61 * hash + Objects.hashCode(this.lastName);
        hash = 61 * hash + Objects.hashCode(this.age);
        hash = 61 * hash + Objects.hashCode(this.dni);
        hash = 61 * hash + Objects.hashCode(this.perro);
        return hash;
    }

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
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.perro, other.perro)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", dni=" + dni + ", perro=" + perro + '}';
    }   
}