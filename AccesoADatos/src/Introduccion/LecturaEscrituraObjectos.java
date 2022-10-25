/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Introduccion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class LecturaEscrituraObjectos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Asignatura> ls = new ArrayList<Asignatura>();
        String respuesta = "S";
        while (respuesta.equalsIgnoreCase("S")) {
            System.out.println("Introduce el nombre de la asignatura");
            String nombre = getNombre(sc);
            System.out.println("Introduce la nota de la asignatura");
            double nota = getNota(sc);
            ls.add(new Asignatura(nombre, nota));
            System.out.println("Quiere seguir introduciendo asignaturas");
            respuesta = sc.nextLine();
        }

        File f = new File("./notas.obj");
        FileOutputStream fout = null;
        ObjectOutputStream out = null;

        try {
            fout = new FileOutputStream(f);
            out = new ObjectOutputStream(fout);
            for (Asignatura l : ls) {
                out.writeObject(l);
            }
            System.out.println("Volcando la lista de objetos");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LecturaEscrituraObjectos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException io) {

        } finally {
            try {
                out.close();
                fout.close();
            } catch (IOException ex) {
                System.out.println("Error al cerrar ficheros");
            }
        }

        System.out.println("Leyendo el fichero y calculando media");
        //LECTURA 

        FileInputStream input = null;
        ObjectInputStream oin = null;

        try {
            input = new FileInputStream(f);
            oin = new ObjectInputStream(input);
            int fin = oin.read();
            while (fin != -1) {
                ls.add((Asignatura) oin.readObject());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException | ClassNotFoundException io) {
            io.printStackTrace();
        } finally {
            try {
                if (input != null && oin != null) {
                    input.close();
                    oin.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
        //Calculando media
        double media = 0;

        for (Asignatura l : ls) {
            media += l.getNota();
        }
        media = media * 1.0 / ls.size();
        ls.clear();
        System.out.println("La media es " + media);

    }

    public static String getNombre(Scanner sc) {

        String nombre = sc.nextLine();
        while (nombre.isBlank()) {
            nombre = sc.nextLine();
        }
        return nombre;
    }

    public static double getNota(Scanner sc) {

        double nota = -1;

        while (nota < 0 || nota > 10) {
            try {
                nota = Double.parseDouble(sc.nextLine());
                if (nota < 0 || nota > 10) {
                    System.out.println("No es un valor válido");
                }
            } catch (Exception e) {
                System.out.println("No es un numero");
            }

        }
        return nota;

    }
}
