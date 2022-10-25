package com.psp.ut01.actividades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Actividad1_1 {

    public static void main(String[] args) throws IOException {
        //creamos objeto File al directorio donde está Ejemplo2
        File d = new File("./build/classes");
        //proceso a ejecutar es Ejemplo2
        ProcessBuilder pb = new ProcessBuilder("java", "com.psp.ut01.actividades.LeerNombre");
        //establecemos el directorio donde está el ejecutable
        pb.directory(d);
        System.out.print("Directorio de trabajo: ");
        System.out.println(pb.directory());
        //ejecutar proceso
        Process p = pb.start();
        //obtener la salida
        try {
            InputStream is = p.getInputStream();
            int c;
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            InputStream is = p.getErrorStream();
            int c;
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            int resultado;
            resultado = p.waitFor();
            System.out.println("resultado: " + resultado);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
