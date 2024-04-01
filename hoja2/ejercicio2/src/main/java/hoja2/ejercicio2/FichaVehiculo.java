/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio2;

import java.time.LocalDateTime;

/**
 *
 * @author Luis
 */
public class FichaVehiculo {

    private LocalDateTime fEntrada;
    private LocalDateTime reparacion;
    private LocalDateTime salida;
    private String modelo;
    private String matricula;

    public FichaVehiculo(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public LocalDateTime getfEntrada() {
        return fEntrada;
    }

    public void setfEntrada(LocalDateTime fEntrada) {
        this.fEntrada = fEntrada;
    }

    public LocalDateTime getReparacion() {
        return reparacion;
    }

    public void setReparacion(LocalDateTime reparacion) {
        this.reparacion = reparacion;
    }

    public LocalDateTime getSalida() {
        return salida;
    }

    public void setSalida(LocalDateTime salida) {
        this.salida = salida;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
