/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.tienda.entidad;

import java.util.Objects;

/**
 *
 * @author aniba
 */
public class Tienda {
    //atributos
    private String product;
    private String price;
    //constructores
    public Tienda() {
    }
    public Tienda(String product, String price) {
        this.product = product;
        this.price = price;
    }
    //getters & setters
    public String getProduct() {
        return product;
    }
    
    public void setProduct(String product) {
        this.product = product;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = (int) (Math.random() * (1001));;
        hash = 67 * hash + Objects.hashCode(this.product);
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
        final Tienda other = (Tienda) obj;
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "Tienda{" + "product=" + product + ", price=" + price + '}';
    }   
}