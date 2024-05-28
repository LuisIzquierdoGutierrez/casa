/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hoja3.ejercicio2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Fichero {

    private static File file = new File("agenda.dat");

    public static void escribirFichero() {
        ObjectOutputStream fo = null;

        String nombre;
        String telefono;
        String direccion;
        String codigoPostal;

        try {
            if (file.exists()) {
                fo = new MiObjectOutputStream(new FileOutputStream(file, true));

            } else {
                fo = new ObjectOutputStream(new FileOutputStream(file));
            }

            System.out.println("escribe el nombre");
            nombre = new Scanner(System.in).nextLine();
            System.out.println("escribe el telefono");
            telefono = new Scanner(System.in).nextLine();
            System.out.println("escribe el direccion");
            direccion = new Scanner(System.in).nextLine();
            System.out.println("escribe el codigoPostal");
            codigoPostal = new Scanner(System.in).nextLine();

            Persona persona = new Persona(nombre, telefono, direccion, codigoPostal);

            fo.writeObject(persona);
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

    public static void leerFichero() {
        ArrayList<Persona> array = new ArrayList();
        array = array();

        for (Persona persona : array) {
            System.out.println(persona.toString());
        }
    }

    public static void buscar() {
        boolean fin = false;
        ArrayList<Persona> array = new ArrayList();

        System.out.println("Escribe el nombre de la persona a buscar");
        String nombre = new Scanner(System.in).nextLine();

        array = array();

        for (Persona persona1 : array) {
            if (persona1.getNombre().equals(nombre)) {
                System.out.println(persona1.toString());
            }
        }
    }

    private static ArrayList<Persona> array() {
        boolean fin = false;
        ArrayList<Persona> array = new ArrayList();

        System.out.println("Escribe el nombre de la persona a buscar");
        String nombre = new Scanner(System.in).nextLine();
        try (ObjectInputStream os = new ObjectInputStream(new FileInputStream(file));) {
            Persona persona;
            while (!fin) {
                persona = (Persona) os.readObject();//Casting necesario 
                array.add(persona);
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

        return array;
    }

    public static void borrarEntrada() {
        ArrayList<Persona> array = new ArrayList();
        array = array();
        System.out.println("Escribe el nombre de la persona a borrar");
        String nombre = new Scanner(System.in).nextLine();

        file.delete();

        ObjectOutputStream fo = null;
        try {
            for (Persona persona : array) {
                if (!persona.getNombre().equals(nombre)) {
                    if (file.exists()) {
                        fo = new MiObjectOutputStream(new FileOutputStream(file, true));

                    } else {
                        fo = new ObjectOutputStream(new FileOutputStream(file));
                    }

                    fo.writeObject(persona);
                }
            }

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

    public static void borrarFichero() {
        if (file.delete()) {
            System.out.println("fichero eliminado");
        } else {
            System.out.println("fichero no eliminado");
        }
    }
}
