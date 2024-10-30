/*
 13. Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso.
 */
package guia8.ej13.poo;
import Entidad.Curso;
import Servicio.CursoServicio;
/**
 *
 * @author aniba
 */
public class Guia8Ej13POO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoServicio cs = new CursoServicio();
        Curso cr = cs.crearCurso();
        System.out.println("Profesor por este curso ganará "+cs.calcularGananciaSemanal(cr)+" por semana");
        System.out.println("");
    }
}