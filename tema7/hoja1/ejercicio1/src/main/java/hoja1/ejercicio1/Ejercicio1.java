/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja1.ejercicio1;

import java.io.File;

/**
 *
 * @author Luis
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        File f = new File("E:\\Documents\\prueba.txt");
        if (f.exists()) {
            System.out.println("El fichero existe");
        } else {
            System.out.println("El fichero no existe");
        }
    }
}
