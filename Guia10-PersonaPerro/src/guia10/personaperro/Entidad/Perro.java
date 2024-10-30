/*
atributos: nombre, raza, edad y tamaño
*/
package guia10.personaperro.Entidad;

import guia10.personaperro.Enumeraciones.DogSize;
import java.util.Objects;

/**
 *
 * @author aniba
*/
public class Perro {
    //atributos
    private String dogName;
    private String dogBreed;
    private String dogAge;
    private DogSize dogSize;
    //constructores
    public Perro() {
    }

    public Perro(String dogName, String dogBreed, String dogAge, DogSize dogSize) {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.dogAge = dogAge;
        this.dogSize = dogSize;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public String getDogAge() {
        return dogAge;
    }

    public void setDogAge(String dogAge) {
        this.dogAge = dogAge;
    }

    public DogSize getDogSize() {
        return dogSize;
    }

    public void setDogSize(DogSize dogSize) {
        this.dogSize = dogSize;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.dogName);
        hash = 67 * hash + Objects.hashCode(this.dogBreed);
        hash = 67 * hash + Objects.hashCode(this.dogAge);
        hash = 67 * hash + Objects.hashCode(this.dogSize);
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
        final Perro other = (Perro) obj;
        if (!Objects.equals(this.dogName, other.dogName)) {
            return false;
        }
        if (!Objects.equals(this.dogBreed, other.dogBreed)) {
            return false;
        }
        if (!Objects.equals(this.dogAge, other.dogAge)) {
            return false;
        }
        if (this.dogSize != other.dogSize) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Perro{" + "dogName=" + dogName + ", dogBreed=" + dogBreed + ", dogAge=" + dogAge + ", dogSize=" + dogSize + '}';
    }
}