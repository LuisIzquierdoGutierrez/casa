/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja1.ejercicio4;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("escribe el nombre de un directorio");
        String direccion = new Scanner(System.in).nextLine();
        File f = new File(direccion);
        Complicarse(f, 1);

    }

    public static void Complicarse(File file, int tabulacion) {

        String resultado = "";

        //añade tabulaciones segun el numero de veces que se ha usadado el metodo
        for (int i = 0; i < tabulacion; i++) {
            resultado += "\t";
        }
        String[] lista = file.list();
        // comprueba si el FILE es un directorio y si llama otra vez a el metodo para mirar lo que hay dentro
        for (String string : lista) {
            File a = new File(file.getAbsolutePath() + "\\" + string);
            System.out.println(resultado + a.getName());
            if (a.isDirectory()) {
                Complicarse(a, tabulacion + 1);
            }

        }
    }

}
