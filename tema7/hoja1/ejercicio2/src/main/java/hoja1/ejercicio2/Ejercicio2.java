/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja1.ejercicio2;

import java.io.File;

/**
 *
 * @author Luis
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        File f = new File("E:\\Documents\\prueba.txt");
        if (f.exists()) {
            System.out.println(f.getName());
            System.out.println(f.getAbsolutePath());
            if (f.canRead()) {
                System.out.println("se puede leer");
            } else {
                System.out.println("no se puede leer");   
            }
            System.out.println("su tamaño es "+f.getTotalSpace());
        } else {
            System.out.println("El fichero no existe");
        }
    }
}
