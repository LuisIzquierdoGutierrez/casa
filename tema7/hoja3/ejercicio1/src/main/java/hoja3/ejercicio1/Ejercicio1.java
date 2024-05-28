/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hoja3.ejercicio1;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        File fichero = new File("facturas.dat");
        boolean salir = false;
        ObjectOutputStream fo = null;

        int nFactura;
        String cliente;
        double importe;
        boolean pagado;

        while (!salir) {
            System.out.println("Escoge la opcion deseada");
            System.out.println("1.- Añadir factura.");
            System.out.println("2.-Listado mororos");
            System.out.println("3.- Eliminar fichero");
            System.out.println("4-. Salir");

            switch (new Scanner(System.in).nextInt()) {
                case 1 -> {
                    try {
                        if (fichero.exists()) {
                            fo = new MiObjectOutputStream(new FileOutputStream(fichero, true));

                        } else {
                            fo = new ObjectOutputStream(new FileOutputStream(fichero));
                        }
                        System.out.println("numero de factura");
                        nFactura = new Scanner(System.in).nextInt();
                        System.out.println("cliente");
                        cliente = new Scanner(System.in).nextLine();
                        System.out.println("importe");
                        importe = new Scanner(System.in).nextDouble();
                        System.out.println("esta pagado?");
                        pagado = new Scanner(System.in).nextBoolean();
                        Factura factura = new Factura(nFactura, cliente, importe, pagado);
                        fo.writeObject(factura);
                    } catch (IOException ex) {
                        System.err.println(ex.toString());
                    } finally {
                        if (fo != null) {
                            try {
                                fo.close();
                            } catch (IOException ex) {
                                System.out.println("Error al cerrar el fichero");
                            }
                        }
                    }
                }
                case 2 -> {
                    boolean fin = false;
                    try (ObjectInputStream os = new ObjectInputStream(new FileInputStream(fichero));) {
                        Factura factura;
                        while (!fin) {
                            factura = (Factura) os.readObject();//Casting necesario
                            if (!factura.isPagado()) {
                                System.out.println(factura.toString());
                            }
                        }
                    } catch (EOFException e) {
                        //termina la lectura del fichero
                    } catch (ClassNotFoundException e) {
                        System.out.println("Error el tipo de objeto no es compatible");
                    } catch (FileNotFoundException e) {
                        System.out.println("No se encontró el archivo");
                    } catch (IOException e) {
                        System.out.println("Error " + e.getMessage());
                    }
                }
                case 3 -> {
                    if (fichero.delete()) {
                        System.out.println("fichero eliminado");
                    } else {
                        System.out.println("fichero no eliminado");   
                    }
                }
                case 4 -> {
                    salir = true;
                }

                default ->
                    throw new AssertionError();
            }
        }
    }
}
