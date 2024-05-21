/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja2.ejercicio5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Luis
 */
public class Ejercicio5 {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("cancion.txt");
        int linea = 1;
        StringTokenizer st;
        Scanner lector = new Scanner(f);
        while (lector.hasNextLine()) {
            String leido = lector.nextLine();
            
            st = new StringTokenizer(leido);
            
            System.out.println("Linea " + linea + ". Palabras: " + st.countTokens());
            while (st.hasMoreTokens()) {
                String palabra = st.nextToken();
                System.out.println("Palabra : "+palabra+" caracteres: "+palabra.length());
            }
            System.out.println(leido);
            linea++;
        }

    }
}
