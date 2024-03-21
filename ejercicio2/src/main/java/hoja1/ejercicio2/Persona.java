/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja1.ejercicio2;

import java.time.LocalDate;

/**
 *
 * @author Luis
 */
public class Persona {
    private String nombre;
    private LocalDate fnac;
    private String DNI;

    public Persona() {
        this.nombre = Teclado.string("introduce el nombre");
        this.fnac = Teclado.fecha("introduce la fecha de nacimiento");
        this.DNI = Teclado.string("introduce el DNI");
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }
    

}
