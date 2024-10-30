package guia7ejercicios12y13;

import java.util.Scanner;

public class Guia7Ejercicios12y13 {

    public static void main(String[] args) {
        
        /*
        12. Realizar un programa que simule el funcionamiento de un dispositivo
        RS232, este tipo de dispositivo lee cadenas enviadas por el usuario.
        Las cadenas deben llegar con un formato fijo: tienen que ser de un
        máximo de 5 caracteres de largo, el primer carácter tiene que ser X 
        y el último tiene que ser una O.
        Las secuencias leídas que respeten el formato se consideran correctas,
        la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
        FDE), y toda secuencia distinta de FDE, que no respete el formato
        se considera incorrecta.
        Al finalizar el proceso, se imprime un informe indicando la cantidad de
        lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
        deberá investigar cómo se utilizan las siguientes funciones de Java:
        Substring(), Length(), equals().
        xisto
        casto
        mono
        xecto
        preto
        fanta
        xrito
        toret
        camba
        xacto
        */
        //Dispositivo RS 232
        Scanner sc = new Scanner(System.in);
        String FDE = "&&&&&";
        String cadenaU;
        int i = 0;
        int j = 0;
        int k = 0;
        System.out.println("Leer cadenas: ");
        do {
            cadenaU = sc.nextLine();
            int longCadena = cadenaU.length();

            while (cadenaU.equals(FDE)) {//option.equals("s")
                break;
            }
            if (longCadena == 5) {
                String primerC = cadenaU.substring(0, 1);
                String ultimoC = cadenaU.substring(4, 5);
                if (primerC.equalsIgnoreCase("x") && ultimoC.equalsIgnoreCase("o")) { //equals("X")
                    i = i + 1;
                    System.out.println("La secuencia es correcta");
                }else if(!cadenaU.equals(FDE)){
                    j = j + 1;
                    System.out.println("La secuencia es incorrecta");
                }
            }else{
                k = k + 1;
                System.out.println("La secuencia es incorrecta");
            }
        } while (!cadenaU.equals(FDE));

        System.out.println("Hubo " + i + " secuencias correctas");
        System.out.println("");
        int secuenciasInc = j + k;
        System.out.println("Hubo " + secuenciasInc + " secuencias incorrectas");
        System.out.println(""); 
          
       
       /*
       Scanner scanner = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        String input;

        while (true) {
            input = scanner.nextLine();
            if (input.equals("&&&&&")) {
                break;
            } else if (input.length() == 5 && input.charAt(0) == 'X' && input.charAt(4) == 'O') {
                correctas++;
            } else {
                incorrectas++;
            }
        }

        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);
        */
    }
}
