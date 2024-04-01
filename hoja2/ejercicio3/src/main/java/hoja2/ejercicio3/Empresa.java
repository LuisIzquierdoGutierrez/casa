/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio3;

import java.util.LinkedList;

/**
 *
 * @author Luis
 */
public class Empresa {
    private LinkedList<Contenedor> contenedores;
    
    public void meter(Contenedor contenedor){
        contenedores.addFirst(contenedor);
    }
    
    public void sacar(){
        System.out.println(contenedores.poll().toString());
}
    
}
