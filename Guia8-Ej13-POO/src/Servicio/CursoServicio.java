package Servicio;
import Entidad.Curso;
import java.util.Scanner;
/**
 *
 * @author aniba
 */
public class CursoServicio {
//método cargarAlumnos(): este método le permitirá al usuario ingresar
//los alumnos que asisten a las clases. Nosotros nos encargaremos
//de almacenar esta información en un arreglo e iterar con un bucle,
//solicitando en cada repetición que se ingrese el nombre de cada alumno.
    public String [] cargarAlumnos() {
        Scanner sc = new Scanner(System.in);
        String [] alumnos = new String[5];
        System.out.println("Se crearan grupos de cinco estudiantes");
        for (int i = 0; i <5; i++) {
            System.out.println(" - "+i+". Ingrese nombre y apellido del alumno: ");
            String nombreApellido = sc.nextLine();
            alumnos[i] = nombreApellido;
        }
        return alumnos;
    }
//Método crearCurso(): el método crear curso, le pide los valores de los
//atributos al usuario y después se le asignan a sus respectivos atributos
//para llenar el objeto Curso. En este método invocaremos al método
//cargarAlumnos() para asignarle valor al atributo alumnos
    public Curso crearCurso(){
        Scanner sc = new Scanner(System.in);
        CursoServicio cs = new CursoServicio();
        Curso cc = new Curso();
        System.out.println("Vamos a crear este curso ingrese el nombre del mismo: ");
        String nombreCurso= sc.nextLine();
        System.out.println("Indique la cantidad de horas de estudio por dia: ");
        int horasPorDia = sc.nextInt();
        System.out.println("Indique la cantidad de dias a la semana que se reunen: ");
        int diasPorSemana = sc.nextInt();
        sc.nextLine();
        System.out.println("Indique si el turno es de mañana o de tarde (t/m) ");
        char turno = sc.nextLine().toLowerCase().charAt(0);
        System.out.println("Escriba el precio del curso: ");
        float precioCurso = sc.nextFloat();
        cc.setAlumnos(cs.cargarAlumnos());
        System.out.println("");
        return  new Curso(nombreCurso, horasPorDia, diasPorSemana, turno, precioCurso, cc.getAlumnos());
    }
//Método calcularGananciaSemanal(): este método se encarga de calcular
//la ganancia en una semana por curso. Para ello, se deben multiplicar
//la cantidad de horas por día, el precio por hora, la cantidad de alumnos
//y la cantidad de días a la semana que se repite el encuentro.
public float calcularGananciaSemanal(Curso cr){
    float gananciaSemanal;
    return gananciaSemanal = cr.getPrecioPorHora()*cr.getCantidaHorasPorDia()* cr.getCantidadDiasPorSemana()*5;
}
}