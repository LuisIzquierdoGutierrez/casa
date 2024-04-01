/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja2.ejercicio2;

import java.time.LocalDateTime;
import java.util.LinkedList;

/**
 *
 * @author Luis
 */
public class Taller {

    private LinkedList<FichaVehiculo> enEspera;
    private LinkedList<FichaVehiculo> reparados;
    private LinkedList<FichaVehiculo> finalizados;

    public Taller() {
    }

    public void insertarVehiculo(FichaVehiculo vehiculo) {
        vehiculo.setfEntrada(LocalDateTime.now());
        enEspera.add(vehiculo);
    }

    public void repararVehiculo(String matricula) {
        FichaVehiculo vehiculo = null;
        boolean continuar = true;
        for (int i = 0; i < enEspera.size() && continuar; i++) {
            if (enEspera.get(i).getMatricula().equals(matricula)) {
                vehiculo = enEspera.get(i);
                continuar = false;
            }
            if (continuar) {
                System.out.println("vehiculo no encontrado");
            } else {
                vehiculo.setReparacion(LocalDateTime.now());
                reparados.add(vehiculo);
            }
        }
    }
    
    public void darSalidaVehiculo(String matricula){
                FichaVehiculo vehiculo = null;
        boolean continuar = true;
        for (int i = 0; i < reparados.size() && continuar; i++) {
            if (reparados.get(i).getMatricula().equals(matricula)) {
                vehiculo = reparados.get(i);
                continuar = false;
            }
            if (continuar) {
                System.out.println("vehiculo no encontrado");
            } else {
                vehiculo.setSalida(LocalDateTime.now());
                reparados.add(vehiculo);
            }
        }
    }
    
    public void mostrarEstado(){
        System.out.println("Taller:\nEn espera:");
        for (FichaVehiculo fichaVehiculo : enEspera) {
            System.out.println(fichaVehiculo.toString());
        }
        System.out.println("Reparados:");
        for (FichaVehiculo reparado : reparados) {
            reparado.toString();
        }
        System.out.println("Finalizados:");
        for (FichaVehiculo finalizado : finalizados) {
            System.out.println(finalizado.toString());
        }
    }
}
