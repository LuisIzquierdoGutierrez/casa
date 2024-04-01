/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio3;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Luis
 */
public class Teclado {

    public static String stringOrigen(String msg) {
        System.out.println(msg);
        String resultado = "";
        try {
            resultado = new Scanner(System.in).nextLine();
            if (Pattern.matches("[A-Z] [a-z]{15,}", resultado)) {
                throw new Exception();
            }
        } catch (Exception ex) {
            System.out.println("origen no valido");
            resultado = stringOrigen(msg);
        }
        return resultado;
    }

    public static String stringCodigo(String msg) {
        System.out.println(msg);
        String resultado = "";
        try {
            resultado = new Scanner(System.in).nextLine();
            if (resultado.length() != 4) {
                throw new Exception();
            }
        } catch (Exception ex) {
            System.out.println("el codigo tiene que tener 4 caracteres");
            resultado = stringOrigen(msg);
        }
        return resultado;
    }
}
