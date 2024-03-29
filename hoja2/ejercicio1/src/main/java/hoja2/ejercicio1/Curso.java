/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio1;

/**
 *
 * @author Luis
 */
public class Curso {

    private String codigo;
    private String descripcion;
    private int nHoras;
    
    public Curso(String codigo, String descripcion, int nHoras) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nHoras = nHoras;
    }
    
    public Curso() {
        this.codigo = Teclado.string("escribe el codigo del curso");
        this.descripcion = Teclado.string("escribe la descripcion del curso");
        this.nHoras = Teclado.Integer("escribe las horas del curso");
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getnHoras() {
        return nHoras;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", nHoras=" + nHoras + '}';
    }
    
    
    
}
