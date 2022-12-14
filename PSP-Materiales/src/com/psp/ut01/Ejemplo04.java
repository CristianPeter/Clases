package com.psp.ut01;

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

public class Ejemplo04 {

    public static void main(String[] args) throws IOException {
        //esto sólo funciona en windows
        Process p = new ProcessBuilder("CMD", "/C", "DATE").start();
        //escritura
        OutputStream os = p.getOutputStream();
        os.write("15-06-18".getBytes());
        os.flush();
        //lectura
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
        //comprobación de error - 0 bien - 1 mal
        int exitVal;
        try {
            exitVal = p.waitFor();
            System.out.println("Valor de salida: " + exitVal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
