package Entidades;

public class Circunferencia {
    
   //Atributos
    private double radio;
    
    //constructor por defecto
    public Circunferencia(){
        
    }
    //constructor por parametro
    
    public Circunferencia (double radio){
        this.radio=radio;
    }
    //gett & setter

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    //toString

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
}
