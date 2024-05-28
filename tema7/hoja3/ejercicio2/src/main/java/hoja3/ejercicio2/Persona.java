/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio2;

import java.io.Serializable;

/**
 *
 * @author Luis
 */
public class Persona implements Serializable {
    private String nombre;
    private String telefono;
    private String direccion;
    private String codigoPostal;

    public Persona(String nombre, String telefono, String direccion, String codigoPostal) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", codigoPostal=" + codigoPostal + '}';
    }
    
}
