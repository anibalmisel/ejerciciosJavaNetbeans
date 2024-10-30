/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.barajadecartase.Enumeraciones;

/**
 *
 * @author aniba
 */
public enum CartaEspada {
    UNO(1, "de Espada"), DOS(2, "de Espada"), TRES(3, "de Espada"),
    CUATRO(4, "de Espada"), CINCO(5, "de Espada"), SEIS(6, "de Espada"),
    SIETE(7, "de Espada"), DIEZ(10, "de Espada"), ONCE(11, "de Espada"),
    DOCE(12, "de Espada");
    
    private Integer numero;
    private String signo;
    
    private CartaEspada(Integer numero, String signo) {
        this.numero = numero;
        this.signo = signo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }   
}