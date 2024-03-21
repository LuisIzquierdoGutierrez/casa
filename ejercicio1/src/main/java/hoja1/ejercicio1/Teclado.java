/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Teclado {
    
    public static int Integer(String msg){
        System.out.println(msg);
        int resultado = 0;
        try{
            resultado = new Scanner(System.in).nextInt();
        }catch(InputMismatchException ex){
            System.out.println("Eso no es un numero entero");
            Integer(msg);
        }
        return resultado;
        
        
        
    }
    
    
    
    
}
