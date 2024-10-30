/*
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.

• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
 */
package ventaelectrodomesticos.herencia.Entidad;

import java.util.Scanner;
import javax.swing.JOptionPane;
import ventaelectrodomesticos.herencia.Enumeraciones.Color;
import ventaelectrodomesticos.herencia.Enumeraciones.Consumo;
import ventaelectrodomesticos.herencia.Servicio.ElectrodomesticoServicio;

/**
 *
 * @author aniba
 */
public class Lavadora extends ElectrodomesticoServicio {
    //atributos
    private Integer carga;
    //constructores

    public Lavadora(Integer carga, Consumo CONSUMOE, Color COLOR, Integer precio, Integer peso) {
        super(CONSUMOE, COLOR, precio, peso);
        this.carga = carga;
    }

    public Lavadora() {
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    /**
     * Método crearLavadora (): este método llama a crearElectrodomestico()
     * de la clase padre, lo utilizamos para llenar los atributos heredados
     * del padre y después llenamos el atributo propio de la lavadora.
     */
    public void crearLavadora () {
        Scanner sc = new Scanner(System.in);
        crearElectrodomestico();
        System.out.print("Introduzca la carga de la lavadora: ");
        String carga = sc.nextLine();
        boolean isInteger = isInteger(carga);
        if (isInteger==true) {
            this.carga = Integer.parseInt(carga);
        } else if (isInteger == false) {
            System.out.println("La carga no es correcta");
            int respuesta = JOptionPane.showConfirmDialog(null, "¿desea omitir esta opcion?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                this.carga = 30;//asigno carga por defecto
            } else {
                System.out.print("Introduzca la carga de la lavadora: ");
                carga = sc.nextLine();
                this.carga=Integer.parseInt(carga);
            }
        }
        sc.close();
    }
    public static boolean isInteger(String data) {
        try {
            Integer.parseInt(data);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    /*
     Método precioFinal(): este método será heredado y se le sumará la
     siguiente funcionalidad. Si tiene una carga mayor de 30 kg, aumentará
     el precio en $500, si la carga es menor o igual, no se incrementará
     el precio. Este método debe llamar al método padre y añadir el código
     necesario. Recuerda que las condiciones que hemos visto en la clase
     Electrodoméstico también deben afectar al precio.
    */
    @Override
    public Integer precioFinal() {
        Integer precio=1000;
        Integer a = es.CONSUMOE.getPrecio();
        Integer b = es.getPrecio();
        Integer c= es.peso;
       
        if (c>=1 & c<=100) {
            es.setPrecio(100);  
        }else if(c>=20 & c<=49) {
            es.setPrecio(500);
        }else if(c>=50 & c<=79) {
            es.setPrecio(800);
        }else if(c>=80){
            es.setPrecio(1000);
        }
     
        return precio = a+b+1000;
    }
}