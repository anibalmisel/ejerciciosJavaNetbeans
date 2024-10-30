/*
Atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno.
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.

 */
package Entidad;

/**
 *
 * @author aniba
 */
public class Curso {
    //atributos
    private String nombreCurso;
    private int cantidaHorasPorDia;
    private int cantidadDiasPorSemana;
    private char turno;
    private float precioPorHora;
    private String [] alumnos = new String [5];
    //constructor
    public Curso(String nombreCurso, int cantidaHorasPorDia, int cantidadDiasPorSemana, char turno, float precioPorHora, String alumnos[]) {
        this.nombreCurso = nombreCurso;
        this.cantidaHorasPorDia = cantidaHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }
    
    public Curso() {
    }
    //getters & setters
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidaHorasPorDia() {
        return cantidaHorasPorDia;
    }

    public void setCantidaHorasPorDia(int cantidaHorasPorDia) {
        this.cantidaHorasPorDia = cantidaHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public char isTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public float getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(float precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    //toString
    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", cantidaHorasPorDia=" + cantidaHorasPorDia + ", cantidadDiasPorSemana=" + cantidadDiasPorSemana + ", turno=" + turno + ", precioPorHora=" + precioPorHora + ", alumnos=" + alumnos + '}';
    }
}