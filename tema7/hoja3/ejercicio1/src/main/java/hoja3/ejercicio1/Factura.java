/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio1;

import java.io.Serializable;

/**
 *
 * @author Luis
 */
public class Factura implements Serializable {
    private int nFactura;
    private String cliente;
    private double importe;
    private boolean pagado;

    public Factura(int nFactura, String cliente, double importe, boolean pagado) {
        this.nFactura = nFactura;
        this.cliente = cliente;
        this.importe = importe;
        this.pagado = pagado;
    }

    @Override
    public String toString() {
        return "Factura{" + "nFactura=" + nFactura + ", cliente=" + cliente + ", importe=" + importe + ", pagado=" + pagado + '}';
    }

    public int getnFactura() {
        return nFactura;
    }

    public void setnFactura(int nFactura) {
        this.nFactura = nFactura;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    
}
