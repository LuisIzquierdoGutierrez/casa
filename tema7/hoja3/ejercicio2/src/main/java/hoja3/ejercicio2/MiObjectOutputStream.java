/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio2;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Luis
 */
public class MiObjectOutputStream extends ObjectOutputStream {

    /**
     * Constructor que recibe OutputStream
     *
     * @param out
     * @throws java.io.IOException
     */
    public MiObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    /**
     * Constructor sin parametros
     *
     * @throws java.io.IOException
     */
    protected MiObjectOutputStream() throws IOException, SecurityException {
        super();
    }

    /**
     * Redefinicion del metodo de escribir la cabecera para que no haga nada.
     *
     * @throws java.io.IOException
     */
    @Override
    protected void writeStreamHeader() throws IOException {
    }

}
