/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg7.ejercicios.pkg10.al.pkg20;

import java.util.Scanner;

/**
 *
 * @author Lcdo. Anibal Misel
 */
public class Guia7Ejercicios10Al20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ejercicio # 10 de la guia 7");
        System.out.println("");
        /*
          10. Escriba un programa en el cual se ingrese un valor límite
//(10)    positivo, y a continuación solicite números al usuario hasta que
          la suma de los números introducidos supere el límite inicial.
         */
        System.out.println("Por favor ingrese un valor limite positivo");
        int limite = leer.nextInt();
        int i = 0;
        while (i < limite || i == limite) {
            System.out.println("Por favor ingrese numeros enteros positivos aleatoriamente");
            int sumatoria = leer.nextInt();
            i = sumatoria + i;
        }
        System.out.println("");
        System.out.println("La suma de los numeros introducidos es: " + i + " y ha superado el limite.");
        System.out.println("");

        System.out.println("");
        System.out.println("=================================================================");
        System.out.println("");

        System.out.println("Ejercicio # 11 de la guia 7");
        System.out.println("");
        /*
//(11)    11. Realizar un programa que pida dos números enteros positivos
          por teclado y muestre por pantalla el siguiente menú:
                               MENU
                           1. Sumar
                           2. Restar
                           3. Multiplicar
                           4. Dividir
                           5. Salir
                           Elija opción:
          El usuario deberá elegir una opción y el programa deberá mostrar el
          resultado por pantalla y luego volver al menú. El programa deberá
          ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el 
          usuario selecciona la opción 5, en vez de salir del programa 
          directamente, se debe mostrar el siguiente mensaje de confirmación:
          ¿Está seguro que desea salir del programa (S/N)? Si el usuario 
          selecciona el carácter ‘S’ se sale del programa, caso contrario se 
          vuelve a mostrar el menú.
         */
        System.out.println("Introduzca dos números enteros positivos");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        int opcion;
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Escriba el número de la operación que desea realizar: ");
            opcion = leer.nextInt();

            if (opcion != 5) {
                switch (opcion) {
                    case 1:
                        int suma = numero1 + numero2;
                        System.out.println("" + suma);
                        break;
                    case 2:
                        int resta = numero1 - numero2;
                        System.out.println("" + resta);
                        break;
                    case 3:
                        int multi = numero1 * numero2;
                        System.out.println("" + multi);
                        break;
                    case 4:
                        if (numero2 == 0) {
                            System.out.println("Error: No se puede dividir por cero.");
                        } else {
                            int divide = numero1 / numero2;
                            System.out.println("" + divide);
                        }
                        break;
                }
            } else {
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                String option = leer.next().toLowerCase();
                if (option.equals("s")) {
                    /*
                      El error en este código está en la forma en que se compara la variable
                    ` option` con el string `"s"`. En Java, para comparar el contenido de dos
                      strings, debes usar el método `equals` en lugar del operador `==`.
                      El operador `==` compara si dos referencias apuntan al mismo objeto
                      en memoria, mientras que el método `equals` compara si dos strings
                      tienen el mismo contenido.*/
                    break;
                } else {
                    opcion = 0;
                }
            }
        } while (opcion != 5);

        System.out.println("");
        System.out.println("=================================================================");
        System.out.println("");

//(11.1)   No funciona muy bien pero te muestra ejemplos de sintaxis utiles.
        System.out.println("Otra version del Ejercicio anterior creada por Bing, la IA de Microsoft");
        System.out.println("");

        int num3, num4, opcion2;
        do {
            System.out.println("Ingrese dos números enteros positivos:");
            num3 = leer.nextInt();
            num4 = leer.nextInt();
        } while (num3 < 0 || num4 < 0);

        do {
            System.out.println("MENU\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir");
            opcion2 = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (num3 + num4));
                    break;
                case 2:
                    System.out.println("La resta es: " + (num3 - num4));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + (num3 * num4));
                    break;
                case 4:
                    if (num4 == 0) {
                        System.out.println("No se puede dividir entre cero.");
                    } else {
                        System.out.println("La división es: " + ((double) num3 / num4));
                    }
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String confirm = leer.next();
                    if (confirm.equalsIgnoreCase("S")) {
                        System.out.println("Saliendo...");
                    } else {
                        //continue;
                        opcion2 = 0;
                    }
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion2 != 5);
        System.out.println("");

        System.out.println("");
        System.out.println("=================================================================");
        System.out.println("");

        System.out.println("Ejercicio # 12 de la guia 7");
        System.out.println("");
        /*
//(12)    12. Realizar un programa que simule el funcionamiento de un dispositivo
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
        int il = 0;
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
                    il = il + 1;
                    System.out.println("La secuencia es correcta");
                } else if (!cadenaU.equals(FDE)) {
                    j = j + 1;
                    System.out.println("La secuencia es incorrecta");
                }
            } else {
                k = k + 1;
                System.out.println("La secuencia es incorrecta");
            }
        } while (!cadenaU.equals(FDE));

        System.out.println("Hubo " + il + " secuencias correctas");
        System.out.println("");
        int secuenciasInc = j + k;
        System.out.println("Hubo " + secuenciasInc + " secuencias incorrectas");
        System.out.println("");

        System.out.println("");
        System.out.println("=================================================================");
        System.out.println("");

        System.out.println("Ejercicio # 13 de la guia 7");
        System.out.println("");
        /*
          13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
//(13)    Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar 
          lo siguiente:
          * * * *
          *     *
          *     *
          * * * *
         */
        System.out.println("Introduzca el numero de lados de su cuadrado: ");
        int lados = sc.nextInt();
        for (int ill = 0; ill < lados; ill++) {
            for (int jl = 0; jl < lados; jl++) {

                if (ill == 0 || ill == lados - 1) { //if (i == 0 || i == N - 1 || j == 0 || j == N - 1) esta opciondisminuye un if.
                    System.out.print(" *");
                } else if (jl == 0 || jl == lados - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("");

        System.out.println("");
        System.out.println("=================================================================");
        System.out.println("");

        System.out.println("Ejercicio # 14 de la guia 7");
        System.out.println("");
        /*
          Vectores y Matrices en Java
//(14)    14. Crea una aplicación que a través de una función nos convierta una cantidad
          de euros introducida por teclado a otra moneda, estas pueden ser a dólares,
          yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
          moneda a converir que será una cadena, este no devolverá ningún valor y
          mostrará un mensaje indicando el cambio (void).
          El cambio de divisas es:
          * 0.86 libras es un 1 €
          * 1.28611 $ es un 1 €
          * 129.852 yenes es un 1 €
         */
        double euros;
        String moneda;
        do {
            System.out.println("Introduzca la cantidad de euros a cambiar: ");
            euros = sc.nextDouble();
            System.out.println("");

            if (euros < 0) {
                System.out.println("¡INCORRECTO! Por favor ingrese una cantidad valida");
                System.out.println("");
            }

        } while (euros < 0);

        do {
            System.out.println("Escriba la moneda a la que desea convertir:\n" + "- dolar\n" + "- yenes\n" + "- libras\n");
            moneda = sc.next();

            if (!moneda.equalsIgnoreCase("dolar") && !moneda.equalsIgnoreCase("yenes") && !moneda.equalsIgnoreCase("libras")) {
                System.out.println("¡INCORRECTO! Por favor ingrese una opcion valida");
                System.out.println("");
            }

        } while (!moneda.equalsIgnoreCase("dolar") && !moneda.equalsIgnoreCase("yenes") && !moneda.equalsIgnoreCase("libras"));

        System.out.println("");
        converEuros(euros, moneda);

        System.out.println("");
        System.out.println("=================================================================");
        System.out.println("");

        System.out.println("OTRA VERSION DEL Ejercicio # 14 de la guia 7 generada por la IA Bart de GOOGLE");
        System.out.println("");

// (14.1)  
        Scanner scanner = new Scanner(System.in);
        double euros1;
        do {
            System.out.println("Enter the amount in euros: ");
            euros1 = scanner.nextDouble();
            if (euros1 < 0) {
                System.out.println("Invalid input. Please enter a non-negative value.");
            }
        } while (euros1 < 0);
        System.out.println("Enter the currency to convert to (dollars, yens or pounds): ");
        String currency = scanner.next();
        convert(euros1, currency);

        System.out.println("");
        System.out.println("=================================================================");
        System.out.println("");

        System.out.println("Ejercicio # 15 de la guia 7");
        System.out.println("");
        /*
          15. Realizar un algoritmo que rellene un vector con los 100 primeros números
//(15)    enteros y los muestre por pantalla en orden descendente.
         */
        System.out.println("Defina tamaño del vector: ");
        int jk = sc.nextInt();
        int enteros[] = new int[jk];
        //int enteros[] = new int[100];//como puedo hacer para que el tamano lo defina el usuario?
        int sumatoria = 0;

        for (int ik = 0; ik < jk; ik++) {
            enteros[ik] = ik + 1;
        }

        for (int ik = jk - 1; ik >= 0; ik--) {

            for (int kk = 0; kk < enteros.length; kk++) {//La condición de parada del bucle for debería ser i >= 0 en lugar de i > enteros.length.
                int entero = enteros[kk];
                sumatoria = sumatoria + entero;
            }
            System.out.println("[" + enteros[ik] + "]");
            /*         
              El índice ik debería comenzar en 99 en lugar de 100,
              ya que los índices de un arreglo en Java comienzan en 0. 
            */

        }
        System.out.println("La sumatoria de todos los enteros es: " + sumatoria);
        
        
        /*
          16. Realizar un algoritmo que rellene un vector de tamaño N
(16)      con valores aleatorios y le pida al usuario un numero a buscar en
          el vector. El programa mostrará donde se encuentra el numero y si
          se encuentra repetido
        */
              
      // Scanner scanner = new Scanner(System.in);
        System.out.println("Defina tamaño del vector:");
        int n= scanner.nextInt();
        int vectorN [] = new int[n];
        for (int in = 0; in < vectorN.length; in++) {
            vectorN[in] = (int) (Math.random() * 10);
            //System.out.println(""+vectorN[i]);
        }
           /*
        Claro. En Java, puedes usar el método `random()` de la clase `Math`
        para generar números aleatorios. Este método devuelve un número de 
        tipo `double` entre 0.0 y 1.0. Si deseas generar un número entero 
        aleatorio dentro de un rango específico, puedes hacerlo multiplicando
        el resultado de `Math.random()` por el tamaño del rango y luego 
        sumando el valor mínimo del rango.

        Aquí tienes un ejemplo que genera un número entero aleatorio entre
        1 y 10:
         int min = 1;
         int max = 10;
         int randomNum = (int)(Math.random() * (max - min + 1)) + min;
        */
        System.out.println("Introduzca un numero para verificar en el vector:");
        int numUsuario = scanner.nextInt();
        boolean bandera = true;
        int sumatoria1 = 0;
        for (int in = 0; in < vectorN.length; in++) {
            int jn = vectorN[in];
            if (jn == numUsuario && bandera == true) {
                System.out.println("Se encontro un elemento que coincide con '"+ numUsuario+"'");
                System.out.println("============================================================");
                bandera = false;
            }/*else{
                System.out.println("No se encontro un elemento que coincidiera con '"+ numUsuario+"'");
                System.out.println("============================================================");
                break;
            } */
             if (jn == numUsuario) {
                sumatoria = sumatoria+1;
                System.out.println("Se encontro coincidencias en el puesto: "+in+" del vector");
                System.out.println("============================================================");
            }    
        }
        if(sumatoria1>1){
            System.out.println("El elemento indicado se repite en el vector: "+sumatoria1+" veces");
        }else if (sumatoria1==1){
            System.out.println("El elemento indicado se repite en el vector: "+sumatoria1+" vez");
        }else if( sumatoria1==0){
            System.out.println("El elemento indicado no se encuentra en el vector: ");
        }
        System.out.println("");
        
        
        /*
(17)      17. Recorrer un vector de N enteros contabilizando cuántos números son
          de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
        */
       //Scanner sc = new Scanner(System.in);
        System.out.println("Defina el tamaño de su vector:");
        int n1 = sc.nextInt();
        int[] enteros1 = new int[n1];
        int j2 = 0;
        int k2 = 0;
        int l = 0;
        int m = 0;
        int o = 0;
        System.out.println("===============================================");
        for (int iv = 0; iv < enteros.length; iv++) {
           // int entero = enteros[i];
            enteros[iv] = (int) (Math.random() * 10000);
            System.out.println("" + enteros[iv]);
            String cadenaNumero = String.valueOf(enteros[iv]);
            
            

            switch (cadenaNumero.length()) {
                case 5:
                    j2 = j2 + 1;
                    break;
                case 4:
                    k2 = k2 + 1;
                    break;
                case 3:
                    l = l + 1;
                    break;
                case 2:
                    m = m + 1;
                    break;
                case 1:
                    o = o + 1;
                    break;
                default:
                    throw new AssertionError();
            }
        }
        System.out.println("===============================================");
        System.out.println("En el vector existen " + j2 + " numeros de 5 digitos");
        System.out.println("");
        System.out.println("En el vector existen " + k2 + " numeros de 4 digitos");
        System.out.println("");
        System.out.println("En el vector existen " + l + " numeros de 3 digitos");
        System.out.println("");
        System.out.println("En el vector existen " + m + " numeros de 2 digitos");
        System.out.println("");
        System.out.println("En el vector existen " + o + " numeros de 1 digito");
        System.out.println("");
         
       
        /*
        56789
         int num = 123;
            String str = String.valueOf(num);
            System.out.println(str); // Imprime "123"
        */


    }

    public static void converEuros(double cantidadEuros, String monedaConvertir) {

        double dolar = cantidadEuros * 1.28611;
        double yenes = cantidadEuros * 129.852;
        double libras = cantidadEuros * 0.86;
        if (monedaConvertir.equalsIgnoreCase("dolar")) {
            System.out.println("La cantidad de Euros introducida, equivale a: " + dolar + " dólares");
        } else if (monedaConvertir.equalsIgnoreCase("yenes")) {
            System.out.println("La cantidad de Euros introducida, equivale a: " + yenes + " yenes");
        } else if (monedaConvertir.equalsIgnoreCase("libras")) {
            System.out.println("La cantidad de Euros introducida, equivale a: " + libras + " libras");
        }
        System.out.println("");
    }

    public static void convert(double euros1, String currency) {
        double result;
        switch (currency) {
            case "dollars":
                result = euros1 * 1.28611;
                break;
            case "yens":
                result = euros1 * 129.852;
                break;
            case "pounds":
                result = euros1 * 0.86;
                break;
            default:
                System.out.println("Invalid currency.");
                return;
        }
        System.out.println(euros1 + " euros is equal to " + result + " " + currency);
    }
}
