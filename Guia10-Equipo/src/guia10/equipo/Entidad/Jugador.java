/*
 clase Jugador que contenga nombre, apellido, posición
y número.
 */
package guia10.equipo.Entidad;

import java.util.Objects;

/**
 *
 * @author aniba
 */
public class Jugador {
    //atributos
    private String name;
    private String lastName;
    private String position;
    private Integer number;
    private double average;
    //constructores
    public Jugador() {
        
    }

    public Jugador(String name, String lastName, String position, Integer number, double average) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.number = number;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.name);
        hash = 73 * hash + Objects.hashCode(this.lastName);
        hash = 73 * hash + Objects.hashCode(this.position);
        hash = 73 * hash + Objects.hashCode(this.number);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.average) ^ (Double.doubleToLongBits(this.average) >>> 32));
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
        final Jugador other = (Jugador) obj;
        if (Double.doubleToLongBits(this.average) != Double.doubleToLongBits(other.average)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.position, other.position)) {
            return false;
        }
        if (!Objects.equals(this.number, other.number)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Jugador{" + "name=" + name + ", lastName=" + lastName + ", position=" + position + ", number=" + number + ", average=" + average + '}';
    }

}
