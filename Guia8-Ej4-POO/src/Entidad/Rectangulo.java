
package Entidad;
public class Rectangulo {
    //atributos
    private double base;
    private double altura;
    //constructor por defecto
    public Rectangulo(){
        
    }
    //contructor por parametros
    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }
    //getter & setter
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //toString
    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }  
}