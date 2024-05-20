/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja2.ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Ejercicio1 {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("escribe el nombre del directorio");
        
        String file = new Scanner(System.in).nextLine();
        
        File f = new File(file);
        if (f.exists()) {
            if (f.isFile()) {
                if (f.canRead()) {
                    Scanner lector = new Scanner(f);
                    while (lector.hasNextLine()) {
                        String data = lector.nextLine();
                        System.out.println(data);
                    }
                } else {
                    System.out.println("no se puede leer");
                }
            } else {
                System.out.println("no es un fichero");
            }
        } else {
            System.out.println("no existe");
        }
    }
}
