/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio1;

import java.util.LinkedList;

/**
 *
 * @author Luis
 */
public class Academia {
    private static LinkedList<Curso> cursos = new LinkedList<>();
    
    public static void meterCurso(Curso curso){
        cursos.add(curso);
        System.out.println("curso añadido");
    }
    
    public static void meterCurso(Curso curso, int posicion){
        cursos.add(posicion, curso);
        System.out.println("curso añadido en posicion " + posicion);
    }
    
    public static void borrarCurso(String codigo){
        Curso quitar = null;
        for (Curso curso : cursos) {
            if (curso.getCodigo().equalsIgnoreCase(codigo)) {
                quitar = curso;
            }
        }
        cursos.remove(quitar);
    }
    
    public static void mostrar(){
        System.out.println("Academia");
        for (Curso curso : cursos) {
            System.out.println(curso.toString());
        }
    }
}
