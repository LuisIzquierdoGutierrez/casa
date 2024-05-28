/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja3.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            System.out.println("Escoge la opcion deseada");
            System.out.println("1.- añadir entrada.");
            System.out.println("2.- listar entradas");
            System.out.println("3.- buscar en la agenda");
            System.out.println("4-. borrar entrada");
            System.out.println("5.- borrar fichero");
            System.out.println("6.- salir");

            switch (new Scanner(System.in).nextInt()) {
                case 1 -> {
                    Fichero.escribirFichero();
                }
                case 2 -> {
                    Fichero.leerFichero();
                }
                case 3 -> {
                    Fichero.buscar();
                }
                case 4 -> {
                    Fichero.borrarEntrada();
                }
                case 5 -> {
                    Fichero.borrarFichero();
                }
                case 6 -> {
                    salir = true;
                }


                default -> {
                }

            }
        }

    }
}
