/*
 Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package guia9e.numericalvalues.entidad;

/**
 *
 * @author aniba
 */
public class NumericalValue {
    //attributes
    private Integer num;
    //builders
    public NumericalValue() {
    }
    
    public NumericalValue(Integer num) {
        this.num =  num;
    }
    
    //getters & setters
    public Integer getNum() {
        return num;
    }
    
    public void setNum(Integer num) {
        this.num = num;
    }
    //toString
    @Override
    public String toString() {
        return "NumericalValue{" + "num=" + num + '}';
    }
}
