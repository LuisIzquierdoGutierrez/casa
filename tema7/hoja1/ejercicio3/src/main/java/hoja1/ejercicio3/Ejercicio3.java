/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja1.ejercicio3;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Luis
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        File f1 = new File("prueba.txt");
        if (!f1.exists()) {
            try {
                // nos obliga a realizar un try catch recogiendo la posible excepción
                if (f1.createNewFile()) {
                    System.out.println("el fichero ha sido creado");
                } else {
                    System.out.println("el fichero no se ha podido crear");
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
