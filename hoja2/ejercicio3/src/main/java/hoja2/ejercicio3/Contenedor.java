/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Luis
 */
public class Contenedor {

    private String codigo;
    private String origen;
    private LocalDateTime fecha;

    public Contenedor(String codigo, String origen, LocalDateTime fecha) {
        this.codigo = codigo;
        this.origen = origen;
        this.fecha = fecha;
    }

    public Contenedor() {
        this.codigo = codigo;
        this.origen = Teclado.stringOrigen("Escribe el origen");
        this.fecha = LocalDateTime.now();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Contenedor{" + "codigo=" + codigo + ", origen=" + origen + ", fecha=" + fecha.until(LocalDateTime.now(), ChronoUnit.DAYS) + '}';
    }

}
