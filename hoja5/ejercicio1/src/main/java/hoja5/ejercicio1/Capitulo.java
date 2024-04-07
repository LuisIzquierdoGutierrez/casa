/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja5.ejercicio1;

/**
 *
 * @author Luis
 */
public class Capitulo {
    private int temporada;
    private int nCapitulo;
    private int descripcion;

    public Capitulo(int temporada, int nCapitulo, int descripcion) {
        this.temporada = temporada;
        this.nCapitulo = nCapitulo;
        this.descripcion = descripcion;
    }

    
    
    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getnCapitulo() {
        return nCapitulo;
    }

    public void setnCapitulo(int nCapitulo) {
        this.nCapitulo = nCapitulo;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
