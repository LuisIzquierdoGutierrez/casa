/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja2.ejercicio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Ejercicio2 {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("escribe el nombre del directorio");

        String file = new Scanner(System.in).nextLine();
        Scanner sc = new Scanner(System.in);
        File f = new File(file);
        if (f.exists()) {
            if (f.isFile()) {
                if (f.canRead()) {
                    if (f.canWrite()) {
                        try (java.io.PrintWriter salida = new java.io.PrintWriter(f);) {
                            String cadena;
                            System.out.println("Introduce texto: para finalizar teclea FIN");
                            cadena = sc.nextLine();
                            while (!cadena.equalsIgnoreCase("FIN")) {
                                salida.println(cadena);
                                cadena = sc.nextLine();
                            }
                            salida.flush();
                        }
                    } else {
                        System.out.println("no se puede escribir en el");
                    }

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
