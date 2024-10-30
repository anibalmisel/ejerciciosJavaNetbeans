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
public enum CartaBasto {
    UNO(1, "de Basto"), DOS(2, "de Basto"), TRES(3, "de Basto"),
    CUATRO(4, "de Basto"), CINCO(5, "de Basto"), SEIS(6, "de Basto"),
    SIETE(7, "de Basto"), DIEZ(10, "de Basto"), ONCE(11, "de Basto"),
    DOCE(12, "de Basto");
    
    private Integer numero;
    private String signo;
    
    private CartaBasto(Integer numero, String signo) {
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