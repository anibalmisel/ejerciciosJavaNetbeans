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
public enum CartaOro {
    UNO (1, "de Oro"), DOS (2, "de Oro"), TRES (3, "de Oro"),
    CUATRO (4, "de Oro"),CINCO (5, "de Oro"), SEIS (6, "de Oro"),
    SIETE (7, "de Oro"), DIEZ (10, "de Oro"),ONCE (11, "de Oro"),
    DOCE (12, "de Oro");
    
    private Integer numero;
    private String signo;
    
    private CartaOro(Integer numero, String signo) {
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