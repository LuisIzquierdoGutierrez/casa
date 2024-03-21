/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja1.ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Ejercicio1 {

    public static ArrayList<Integer> lista = new ArrayList<Integer>();

    public static void main(String[] args) {
        leeValores();
        calcularSuma();
        mostrarResultados();
    }

    public static void leeValores() {
        int last = 0;
        do {
            last = Teclado.Integer("escribe un numero, -99 para terminar");
            if (last != 99) {
                lista.add(last);
            }
        } while (last != 99);
    }

    public static int calcularSuma() {
        int resultado = 0;
        for (Integer integer : lista) {
            resultado += integer;
        }
        return resultado;
    }

    public static void mostrarResultados() {
        for (Integer integer : lista) {
            System.out.println(integer);
        }
        int suma = calcularSuma();
        System.out.println(suma);
        int media = suma / lista.size();
        System.out.println(media);
        int mayor = 0;
        for (Integer integer : lista) {
            if (integer > media) {
                mayor++;
            }
        }
        System.out.println(mayor);
    }
}
