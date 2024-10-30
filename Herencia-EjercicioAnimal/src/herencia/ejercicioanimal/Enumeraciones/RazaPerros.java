/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.ejercicioanimal.Enumeraciones;

/**
 *
 * @author aniba
 */
public enum RazaPerros {
    MESTIZO("Mestizo", "Nativo"), PASTOR("Pastor", "Varios"), CAZADOR("Cazador","Varios")
    ,TERRIER("Terrier", "Varios");
    private String nombreRaza;
    private String origen;

    private RazaPerros(String nombreRaza, String origen) {
        this.nombreRaza = nombreRaza;
        this.origen = origen;
    }

    public String getNombreRaza() {
        return nombreRaza;
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    
    
    
}
