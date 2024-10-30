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
public enum CartaCopa {
    UNO (1, "de Copa"), DOS (2, "de Copa"), TRES (3, "de Copa"),
    CUATRO (4, "de Copa"),CINCO (5, "de Copa"), SEIS (6, "de Copa"),
    SIETE (7, "de Copa"), DIEZ (10, "de Copa"),ONCE (11, "de Copa"),
    DOCE (12, "de Copa");
    
    private Integer numero;
    private String signo;
    
    private CartaCopa(Integer numero, String signo) {
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