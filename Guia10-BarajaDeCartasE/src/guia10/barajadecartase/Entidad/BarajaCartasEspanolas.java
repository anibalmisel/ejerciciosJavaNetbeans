/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
 */
package guia10.barajadecartase.Entidad;

import guia10.barajadecartase.Enumeraciones.CartaBasto;
import guia10.barajadecartase.Enumeraciones.CartaCopa;
import guia10.barajadecartase.Enumeraciones.CartaEspada;
import guia10.barajadecartase.Enumeraciones.CartaOro;
import java.util.ArrayList;
import static java.util.Collections.shuffle;
import java.util.Objects;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author aniba
 */
public class BarajaCartasEspanolas {
    //atributos
    private CartaOro cartaOro;
    private CartaEspada cartaEspada;
    private CartaCopa cartaCopa;
    private CartaBasto cartaBasto;
    private ArrayList barajas;
    //constructores
    public BarajaCartasEspanolas(CartaOro cartaOro, CartaEspada cartaEspada, CartaCopa cartaCopa, CartaBasto cartaBasto, ArrayList barajas) {
        this.cartaOro = cartaOro;
        this.cartaEspada = cartaEspada;
        this.cartaCopa = cartaCopa;
        this.cartaBasto = cartaBasto;
        this.barajas = barajas;
    }

    public ArrayList getBarajas() {
        return barajas;
    }

    public void setBarajas(ArrayList barajas) {
        this.barajas = barajas;
    }
    
    public BarajaCartasEspanolas() {
    }

    public CartaOro getCartaOro() {
        return cartaOro;
    }

    public void setCartaOro(CartaOro cartaOro) {
        this.cartaOro = cartaOro;
    }

    public CartaEspada getCartaEspada() {
        return cartaEspada;
    }

    public void setCartaEspada(CartaEspada cartaEspada) {
        this.cartaEspada = cartaEspada;
    }

    public CartaCopa getCartaCopa() {
        return cartaCopa;
    }

    public void setCartaCopa(CartaCopa cartaCopa) {
        this.cartaCopa = cartaCopa;
    }

    public CartaBasto getCartaBasto() {
        return cartaBasto;
    }

    public void setCartaBasto(CartaBasto cartaBasto) {
        this.cartaBasto = cartaBasto;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.cartaOro);
        hash = 11 * hash + Objects.hashCode(this.cartaEspada);
        hash = 11 * hash + Objects.hashCode(this.cartaCopa);
        hash = 11 * hash + Objects.hashCode(this.cartaBasto);
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
        final BarajaCartasEspanolas other = (BarajaCartasEspanolas) obj;
        if (this.cartaOro != other.cartaOro) {
            return false;
        }
        if (this.cartaEspada != other.cartaEspada) {
            return false;
        }
        if (this.cartaCopa != other.cartaCopa) {
            return false;
        }
        if (this.cartaBasto != other.cartaBasto) {
            return false;
        }
        return true;
    }
    /**
     * Metodo barajar: 
     * @return un Array tipo String cuyos elementos estan desordenados
     */
    public ArrayList<String> barajar() {
        barajas = new ArrayList();
        for (CartaBasto baraja : CartaBasto.values()) {
            int numero = baraja.getNumero();
            String signo = baraja.getSigno();
            String carta_Numero_Signo = "La carta es: " + numero + " " + signo;

            barajas.add(carta_Numero_Signo);
        }
        for (CartaOro baraja : CartaOro.values()) {
            int numero = baraja.getNumero();
            String signo = baraja.getSigno();
            String carta_Numero_Signo = "La carta es: " + numero + " " + signo;

            barajas.add(carta_Numero_Signo);
        }
        for (CartaEspada baraja : CartaEspada.values()) {
            int numero = baraja.getNumero();
            String signo = baraja.getSigno();
            String carta_Numero_Signo = "La carta es: " + numero + " " + signo;

            barajas.add(carta_Numero_Signo);
        }
        for (CartaCopa baraja : CartaCopa.values()) {
            int numero = baraja.getNumero();
            String signo = baraja.getSigno();
            String carta_Numero_Signo = "La carta es: " + numero + " " + signo;

            barajas.add(carta_Numero_Signo);
        }
        System.out.println("");
        shuffle(barajas);
        return barajas;
    }
    
    /**
     * siguienteCarta(): devuelve la siguiente carta que está en la baraja,
     * cuando no haya más o se haya llegado al final, se indica al usuario
     * que no hay más cartas.
     * TODO dividir este metodo en otros mas pequenos
     * @return un String
     */
    public String siguienteCarta(BarajaCartasEspanolas barajas) {
        String  carta=null;
        int j = 0;
        cartasDisponibles(barajas);//este metodo muestra cuantas cartas quedan
        //Este bucle while, itera el atributo Array del objeto BarajaCartasEspanolas.
        //Muestra, una a una, las cartas de la lista. Y al mismo tiempo, llama al metodo eliminarBaraja
        //El cual va eliminando de la lista ls cartas mostradas.
        while (j < barajas.barajas.size()) {
            System.out.println(barajas.barajas.get(j));
            eliminarBaraja(barajas.barajas, barajas.barajas.get(j).toString());//elimina la baraja mostrada de la lista
            System.out.println("");
            
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Siguiente carta?", "Confirmación", JOptionPane.YES_NO_OPTION);
            
            if (respuesta == JOptionPane.YES_OPTION) {
                System.out.println(" ");
                carta= barajas.barajas.get(j).toString();
            } else{
                carta= barajas.barajas.get(j).toString();
                break;
            }
            j++;
        }
        cartasDisponibles(barajas);//este metodo muestra cuantas cartas quedan
        System.out.println("");
        return carta;
    }
    
    /**
     * • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
     * @return no retorna nada. 
     */
    public void cartasDisponibles(BarajaCartasEspanolas barajas) {
        if (barajas.barajas.size()== 1) {
           System.out.println("Solo queda "+barajas.barajas.size()+" carta"); 
        }else if( barajas.barajas.size()>1) {
            System.out.println("Quedan "+barajas.barajas.size()+" cartas");
        }else if(barajas.barajas.size()== 0) {
            System.out.println("ya no hay mas cartas");
        }
    }
    
    /**
     * mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, 
     * si se saca una carta y luego se llama al método, este no mostrara esa
     * primera carta.
     * @return un Array tipo String cuyos elementos estan desordenados
     */
    public ArrayList<String> mostrarBaraja(ArrayList a, String b ) {
        a.remove(b);
        a.forEach((e) -> System.out.println(e));
        System.out.println("");
        return a;
    }
    
    /**
     * • cartasMonton(): mostramos aquellas cartas que ya han salido,
     * si no ha salido ninguna indicárselo al usuario
     * ArrayList a, seria la lista original. ArrayList b, seria el atributo del objeto instanciado
     */
    public void cartaMonton(ArrayList a, ArrayList b) {
        
        a.removeAll(b);
        System.out.println("Las cartas del monton:");
        System.out.println("");
        a.forEach((e)->System.out.println(e));
        System.out.println("");
    }
    
    /**
     * eliminarBaraja():excluye la carta que ya ha sido mostrada, del monton.
     * @return un Array tipo String cuyos elementos estan desordenados
     */
    public ArrayList<String> eliminarBaraja(ArrayList a, String b ) {
        a.remove(b);
        System.out.println("");
        return a;
    }
    
    /**
     * darCartas(): dado un número de cartas que nos pidan, le devolveremos
     * ese número de cartas. En caso de que haya menos cartas que las pedidas,
     * no devolveremos nada, pero debemos indicárselo al usuario.
     * @return 
     */
    public ArrayList darCartas(ArrayList barajas) {
        Scanner sc = new Scanner(System.in);
        int aux = 0;
        int cartasPedidas;
        System.out.println("Cuantas cartas quiere?");
        cartasPedidas = sc.nextInt();
        
        System.out.println("Cartas dadas: ");//sentencia temporal, solo de prueba
        while (aux<cartasPedidas) {
            String cartasDadas = barajas.get(aux).toString();
            barajas.remove(barajas.get(aux));
            System.out.println(cartasDadas);
            aux++;
        }
        
        System.out.println("");
        return barajas;
    }
    
    @Override
    public String toString() {
        return "BarajaCartasEspanolas: " + "\n cartaOro = " + cartaOro + "\n cartaEspada = " + cartaEspada + "\n cartaCopa = " + cartaCopa + "\n cartaBasto = " + cartaBasto;
    }   
}