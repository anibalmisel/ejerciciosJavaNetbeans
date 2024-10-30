package Entidad;

/**
 * @author aniba
 */
public class Array {
    //atributos
    private double [] vectorA= new double [50];
    private double [] vectorB=new double [20];
    //constructor

    public Array() {
    }
    
    public Array(double[]vectorA, double[]vectorB){
        this.vectorA=vectorA;
        this.vectorB=vectorB;
    }
    
    public double[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(double[] vectorA) {
        this.vectorA = vectorA;
    }

    public double[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(double[] vectorB) {
        this.vectorB = vectorB;
    }

    @Override
    public String toString() {
        return "Array{" + "vectorA=" + vectorA + ", vectorB=" + vectorB + '}';
    }   
}