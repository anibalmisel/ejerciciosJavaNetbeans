/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
 */
package guia10.ruletarusa.Entidad;

import java.util.Objects;

/**
 *
 * @author aniba
 */
public class RevolverDeAgua {
    //atributos
    private Integer posicionTambor; //= (int) (Math.random() * (7));
    private Integer posicionAgua;// = (int) (Math.random() * (7));
    
    public RevolverDeAgua() {
        int POSICION_TAMBOR = (int) (Math.random() * (7));
        int POSICION_AGUA = (int) (Math.random() * (7));
        posicionTambor = POSICION_TAMBOR;
        posicionAgua = POSICION_AGUA;
    }
    /**
     * Este constructor se usaria en caso que defina el valor de las posiciones
     * desde un metodo externo
     * @param posicionTambor
     * @param posicionAgua 
     */

    public RevolverDeAgua(Integer posicionTambor, Integer posicionAgua) {

        this.posicionTambor = posicionTambor; //`int numero = (int) (Math.random() * (7); para generar un numero aleatorio entre 1 y 6
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionTambor() {
        return posicionTambor;
    }

    public void setPosicionTambor(Integer posicionTambor) {
        this.posicionTambor = posicionTambor;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.posicionTambor);
        hash = 23 * hash + Objects.hashCode(this.posicionAgua);
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
        final RevolverDeAgua other = (RevolverDeAgua) obj;
        if (!Objects.equals(this.posicionTambor, other.posicionTambor)) {
            return false;
        }
        if (!Objects.equals(this.posicionAgua, other.posicionAgua)) {
            return false;
        }
        return true;
    }
    /**
     * llenarRevolver(): le pone los valores de posición actual y de posición del agua.
     * Los valores deben ser aleatorios.
     * Metodo de tipo Integer, retorna un entero 0 y 1. Si coincide las posiciones del
     * tambor y el agua, retornara 0; Sino, retornara 1.
     * @return int;
     */
    public Integer llenarRevolver() {
        int disparo=1;//por defecto indica seco
        
        if (posicionTambor == posicionAgua) {
            disparo = 0;//moja
        }
//        System.out.println(posicionTambor);//solo prueba
//        System.out.println(posicionAgua);//solo prueba
        return disparo;
    }
    /**
     *mojar(): devuelve true si la posición del agua coincide con la posición actual
     * @return boolean;
     */
    public boolean mojar(Integer dispara) {
        boolean mojar=false;//seco
        if (dispara == 0) {
            mojar = true;//mojado
        }
        return mojar;//true:mojado, false: seco
    }
    /**
     *siguienteChorro(): cambia a la siguiente posición del tambor
     * @return boolean;
     */
    public Integer siguienteChorro() {
        int disparo = 1;
        
        if (posicionTambor != posicionAgua) {
            posicionTambor++;
            //System.out.println("Esto es posicion tambor del objeto pasado"+posicionTambor);
        }
        if (posicionTambor == posicionAgua) {
            disparo = 0;
        }
        //System.out.println("Esta es posicion tambor a secas "+posicionTambor);
        return disparo;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua: " + "\n posicionTambor = " + posicionTambor + "\n posicionAgua = " + posicionAgua;
    }   
}