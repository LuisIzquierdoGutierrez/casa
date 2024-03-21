/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio2;

/**
 *
 * @author Luis
 */
public class ValidaDatos {

    public static void nombre(Persona persona) {
        if (persona.getNombre().length() > 3) {
            System.out.println("nombre valido");
        } else {
            System.out.println("nombre invalido");
        }
    }

    public static void DNI(Persona persona) {
        if (persona.getDNI().length() == 9) {
            int num = Integer.parseInt((String) persona.getDNI().subSequence(0, 8));
            num = num % 23;
            char letra;
            letra = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(num);
//            switch (num) {
//                case 0 -> {
//                    letra = 'T';
//                }
//                case 1 -> {
//                    letra = 'R';
//                }
//                case 2 -> {
//                    letra = 'W';
//                }
//                case 3 -> {
//                    letra = 'A';
//                }
//                case 4 -> {
//                    letra = 'G';
//                }
//                case 5 -> {
//                    letra = 'M';
//                }
//                case 6 -> {
//                    letra = 'Y';
//                }
//                case 7 -> {
//                    letra = 'F';
//
//                }
//                case 8 -> {
//                    letra = 'P';
//                }
//                case 9 -> {
//                    letra = 'D';
//                }
//                case 10 -> {
//                    letra = 'X';
//                }
//                case 11 -> {
//                    letra = 'B';
//                }
//                case 12 -> {
//                    letra = 'N';
//                }
//                case 13 -> {
//                    letra = 'J';
//                }
//                case 14 -> {
//                    letra = 'Z';
//                }
//                case 15 -> {
//                    letra = 'S';
//                }
//                case 16 -> {
//                    letra = 'Q';
//                }
//                case 17 -> {
//                    letra = 'V';
//                }
//                case 18 -> {
//                    letra = 'H';
//                }
//                case 19 -> {
//                    letra = 'L';
//                }
//                case 20 -> {
//                    letra = 'C';
//                }
//                case 21 -> {
//                    letra = 'K';
//                }
//                case 22 -> {
//                    letra = 'E';
//                }
//                default -> {
//                    System.out.println("no deverias de poder ver esto");
//                }
            if (persona.getDNI().charAt(8) == letra) {
                System.out.println("DNI valido");
            } else {
                System.out.println("letra DNI invalida");
            }
        } else {
            System.out.println("longitud DNI invalida");
        }
    }
}
