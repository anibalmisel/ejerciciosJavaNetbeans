/*
• Método comprobarConsumoEnergetico(char letra): comprueba
que la letra es correcta,sino es correcta usara la letra F
por defecto. Este método se debe invocar al crear el objeto
y no será visible.
• Método comprobarColor(String color): comprueba que el color
es correcto, y si no lo es,usa el color blanco por defecto. 
Los colores disponibles para los electrodomésticos son blanco,
negro, rojo, azul y gris. No importa si el nombre está en
mayúsculas o en minúsculas. Este método se invocará al crear
el objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al 
usuario y llena el electrodoméstico, también llama los métodos
para comprobar el color y el consumo. Al precio se le da un valor
base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño,
aumentará el valor del precio. Esta es la lista de precios:

LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100
PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
 */
package ventaelectrodomesticos.herencia.Servicio;

import java.util.Scanner;
import ventaelectrodomesticos.herencia.Entidad.Electrodomestico;
import ventaelectrodomesticos.herencia.Enumeraciones.Color;
import ventaelectrodomesticos.herencia.Enumeraciones.Consumo;
import ventaelectrodomesticos.herencia.Interfaces.Usuario;

/**
 *
 * @author aniba
 */
public class ElectrodomesticoServicio extends Electrodomestico implements Usuario{
    private Scanner sc;
    private Electrodomestico el;
    private Consumo CONSUMOE;
    private Color COLOR;
    private ElectrodomesticoServicio es;

    public ElectrodomesticoServicio(Consumo CONSUMOE, Color COLOR, Integer precio, Integer peso) {
        super(precio, peso);
        
        this.CONSUMOE = CONSUMOE;
        this.COLOR = COLOR;
        this.sc = new Scanner(System.in);
        this.el = new Electrodomestico();
        comprobarConsumoEnergetico(this.CONSUMOE.toString().charAt(0));
        comprobarColor(this.COLOR.toString());
    }
    
    public ElectrodomesticoServicio() {
        this.sc = new Scanner(System.in);
        this.el = new Electrodomestico();
        comprobarConsumoEnergetico('F');
        comprobarColor("Blanco");
    }

    public Consumo getCONSUMOE() {
        return CONSUMOE;
    }

    public void setCONSUMOE(Consumo CONSUMOE) {
        this.CONSUMOE = CONSUMOE;
    }

    public Color getCOLOR() {
        return COLOR;
    }

    public void setCOLOR(Color COLOR) {
        this.COLOR = COLOR;
    }
    
   /* • Método comprobarConsumoEnergetico(char letra): comprueba que
      la letra es correcta, sino es correcta usara la letra F por defecto.
      Este método se debe invocar al crear el objeto y no será visible.
   */
    public char comprobarConsumoEnergetico(char letra) {
        String letra2 = String.valueOf(letra).toUpperCase();//garantizo que la letra se mayuscula
        char letra3=letra2.charAt(0);
        if (letra3 != 'A' && letra3 != 'B' && letra3 != 'C' && letra3 != 'D' && letra3 != 'E' && letra3 != 'F') {
            letra3 = 'F';
        }
        return letra3;
    }
    /* • Método comprobarColor(String color): comprueba que el color
       es correcto, y si no lo es,usa el color blanco por defecto. 
       Los colores disponibles para los electrodomésticos son blanco,
       negro, rojo, azul y gris. No importa si el nombre está en
       mayúsculas o en minúsculas. Este método se invocará al crear
       el objeto y no será visible.
    */
    public String comprobarColor(String color) {
        color = color.toUpperCase();
        boolean exit = true;
        
        for (Color COLOR : Color.values()) {
            if (COLOR.toString().equalsIgnoreCase(color)) {
                color = COLOR.getColor();
                exit = false;
            }
        }      
        if (exit == true) {
            color = "Blanco";
        }
        return color;
    }
    /**
     * • Metodo crearElectrodomestico(): le pide la información al 
     * usuario y llena el electrodoméstico, también llama los métodos
     * para comprobar el color y el consumo. Al precio se le da un valor
     * base de $1000.
     */
    public void crearElectrodomestico() {
        crearUsuario();
        
        System.out.print("Indique el peso del equipo: ");
        Integer peso = sc.nextInt();
        System.out.print("Introduzca el color: ");
        String color = sc.nextLine();
        color = comprobarColor(color);//usando el metodo me cercioro que se pase el dato correcto
        //con el bucle for transformo el dato string al objeto Color.
        for (Color aux : Color.values()) {
            if (aux.getColor().equalsIgnoreCase(color)) {
                COLOR = aux;
            }
        }
        System.out.print("Indique el consumo que desea: ");
        String consumoe=sc.nextLine();
         //con el bucle for transformo el dato string al objeto Consumo.
        for (Consumo exit : Consumo.values()) {
            if (exit.toString().equalsIgnoreCase(consumoe)) {
                CONSUMOE = exit;
            }
        }
        es = new ElectrodomesticoServicio(CONSUMOE, COLOR, 1000, peso);
        comprobarColor(COLOR.toString());
        System.out.println("");
        comprobarConsumoEnergetico(CONSUMOE.toString().charAt(0));
        System.out.println("");
    }

    @Override
    public void crearUsuario() {
        String nombre;
        String apellido;
        String ci;
        String telefono;
        System.out.print("Nombre del Cliente: ");
        nombre = sc.nextLine();
        System.out.print("Apellido del Cliente: ");
        apellido = sc.nextLine();
        System.out.print("Numero de identidad: ");
        ci = sc.nextLine();
        System.out.print("Telefono del Cliente: ");
        telefono = sc.nextLine();
        System.out.println("");
        System.out.println("Datos del Cliente: "+"\n Nombre y Apellidos del cliente: "+nombre+" "+apellido+"\n CI: "+ci+"\n Telefono de contacto: "+telefono);
        System.out.println("");
    }
    /*
     Método precioFinal(): según el consumo energético y su tamaño,
     aumentará el valor del precio. Esta es la lista de precios:
    */
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