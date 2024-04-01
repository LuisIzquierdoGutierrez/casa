/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio1;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Luis
 */
public class Teclado {

    public static int integer(String msg) {
        System.out.println(msg);
        int resultado = 0;
        try {
            resultado = new Scanner(System.in).nextInt();
            if (resultado<0) {
                throw new Exception();
            }
        } catch (InputMismatchException ex) {
            System.out.println("Eso no es un numero entero");
            integer(msg);
        } catch(Exception ex){
            System.out.println("El numero tiene que ser positivo");
            integer(msg);
        }
        return resultado;

    }

    public static String string(String msg) {
        System.out.println(msg);
        String resultado = "";
        try {
            resultado = new Scanner(System.in).nextLine();
            if (Pattern.matches("[a-zA-Z]+", resultado)) {
                throw new Exception();
            }
        } catch (Exception ex) {
            System.out.println("solo puede contener letras");
            resultado = string(msg);
        }
        return resultado;
    }

    public static LocalDate fecha(String msg) {
        System.out.println(msg);
        LocalDate resultado;
        resultado = LocalDate.of(integer("año"), integer("mes"), integer("dia"));
        return resultado;
    }

}
