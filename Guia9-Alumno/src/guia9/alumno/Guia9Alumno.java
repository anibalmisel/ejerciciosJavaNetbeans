/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.alumno;

import guia9.alumno.entidad.Alumno;
import guia9.alumno.servicio.AlumnoServicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class Guia9Alumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        AlumnoServicio as = new AlumnoServicio();
        ArrayList<Alumno> estudiantes = new ArrayList<>();
        String nombreAlumno;
        boolean noExist = true;
        estudiantes = as.crearAlumno();//retorna una ArrayList tipo alumno
                                       //que contiene varios objetos alumnos
        //estudiantes.forEach((e) -> System.out.println(e));
        /**
         * El usuario ingresa el nombre del alumno que quiere
         * calcular su nota final y se lo busca en la lista de Alumnos.
         * Si está en la lista, se llama al método.
         */
        System.out.println("Escriba el nombre del alumno para calcular nota final");
        nombreAlumno = sc.nextLine();
        for (int i = 0; i < estudiantes.size(); i++) {
            String aux = estudiantes.get(i).getNombre();
            if (aux.equals(nombreAlumno)) {
                System.out.println("La nota final de "
                        + nombreAlumno + " es " + as.notaFinal(estudiantes.get(i).getNotas()));
                noExist=false;
            }
        }
        
        if (noExist==true) {
            System.out.println("El estudiante no se encuentra registrado");
        }
        System.out.println("");
        sc.close();
    }
}