/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventaelectrodomesticos.herencia.Enumeraciones;

/**
 *
 * @author aniba
 */
public enum Color {
    BLANCO("Blanco"), NEGRO("Negro"), ROJO("Rojo"), AZUL("Azul"), GRIS("Gris");
    
    private String color;

    private Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}