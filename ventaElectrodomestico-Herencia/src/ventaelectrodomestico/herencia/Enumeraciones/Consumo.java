/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventaelectrodomestico.herencia.Enumeraciones;

/**
 *
 * @author aniba
 */
public enum Consumo {
    A(1000,"$"), B(800,"$"), C(600,"$"), D(500,"$"), E(300,"$"), F(100,"$");
    
    private Integer precio;
    private String signoMonetario;
    
    private Consumo(Integer precio, String signoMonetario) {
        this.precio = precio;
        this.signoMonetario = signoMonetario;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getSignoMonetario() {
        return signoMonetario;
    }

    public void setSignoMonetario(String signoMonetario) {
        this.signoMonetario = signoMonetario;
    }
    
}