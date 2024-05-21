/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja2.ejercicio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Ejercicio4 {

    public static void main(String[] args) throws FileNotFoundException {

        File f1 = new File(args[0]);

        File f2 = new File(args[1]);

        if (f1.exists() && f2.exists()) {
            if (f1.isFile() && f2.isFile()) {
                if (f1.canRead()) {
                    if (f2.canWrite()) {

                        try (java.io.PrintWriter salida = new java.io.PrintWriter(f2);) {

                            Scanner lector = new Scanner(f1);
                            while (lector.hasNextLine()) {
                                String data = lector.nextLine();
                                System.out.println(data);
                                salida.println(data);
                            }

                            salida.flush();
                        }
                    } else {
                        System.out.println("no se puede escribir en el");
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
