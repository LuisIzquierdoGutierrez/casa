/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio1;

import java.util.HashMap;

/**
 *
 * @author Luis
 */
public class Serie {

    private String nombre;

    public static enum Tematica {
        POLICIAL, COMEDIA, INFANTIL, AVENTURA
    }
    private Tematica tematica;
    private String nacionalidad;
    private boolean finalizada;
    private int temporadas;
    private HashMap<String, String> capitulos;

    public Serie(String nombre, Tematica tematica, String nacionalidad, boolean finalizada, int temporadas) {
        this.nombre = nombre;
        this.tematica = tematica;
        this.nacionalidad = nacionalidad;
        this.finalizada = finalizada;
        this.temporadas = temporadas;
        this.capitulos = new HashMap<String, String>();
    }

    public void clave(Capitulo capitulo){
        String resultado = this.nombre.substring(0, 4)+capitulo.getTemporada()+"X"+capitulo.getnCapitulo();
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public void setTematica(Tematica tematica) {
        this.tematica = tematica;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "Serie{" + "nombre=" + nombre + ", tematica=" + tematica + ", nacionalidad=" + nacionalidad + ", finalizada=" + finalizada + ", temporadas=" + temporadas + '}';
    }
    
    
    
    
}
