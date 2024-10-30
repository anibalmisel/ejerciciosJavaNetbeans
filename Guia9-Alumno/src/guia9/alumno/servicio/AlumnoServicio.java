package guia9.alumno.servicio;

import guia9.alumno.entidad.Alumno;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class AlumnoServicio {

    private ArrayList<Alumno> ListAlumno;
    private Scanner sc;

    public AlumnoServicio() {
        this.ListAlumno = new ArrayList<>();
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }
    // Crear un bucle que crea un objeto Alumno. Se pide toda la información
    // al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
    //pregunta al usuario si quiere crear otro Alumno o no.

    public ArrayList<Alumno> crearAlumno() {
        String nombre;
        String res;
        Integer notas;

        do {
            ArrayList<Integer> notasEstudiantes = new ArrayList<>();
            Alumno a = new Alumno();
            System.out.println("Introduzca el nombre del estudiante: ");
            a.setNombre(nombre = sc.next());

            for (int i = 0; i < 3; i++) {
                System.out.println("Introduzca la nota " + (i + 1));
                notas = sc.nextInt();
                notasEstudiantes.add(notas);
                a.setNotas(notasEstudiantes);
            }

            ListAlumno.add(a);
            System.out.println("");
            System.out.println("¿Quiere crear otro alumno?");
            res = sc.next();
            while (!res.equalsIgnoreCase("si") & !res.equalsIgnoreCase("no")) {
                System.out.println("Error: si o no");
                res = sc.next();
            }
            
        } while (res.equalsIgnoreCase("si"));

        ListAlumno.forEach((e) -> System.out.println(e));
        System.out.println("");

        return ListAlumno;
    }
        //Método notaFinal():  Dentro del método se usará
        //la lista notas para calcular el promedio final de alumno. Siendo este
        //promedio final, devuelto por el método y mostrado en el main.
    
    public Integer notaFinal(ArrayList<Integer> listAlumno) {
        Integer promedio;
        int nota1=0; 
        int nota2=0;
        int nota3=0;
        for (int i = 0; i < 3; i++) {
           nota1=listAlumno.get(0);
           nota2=listAlumno.get(1);
           nota3=listAlumno.get(2);
        }
        
        promedio=(nota1+nota2+nota3)/3;
        return promedio;
    }
}