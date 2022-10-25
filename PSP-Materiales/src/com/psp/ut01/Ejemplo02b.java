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

public class Ejemplo02b {

    public static void main(String[] args) throws IOException {
        //Ejecutamos el proceso DIR
        Process p = new ProcessBuilder("ls", "-lasfexzdf").start();

        //Mostramos caracter a caracer la salida del comando
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

        //Vemos si se ha producido algún error
        try {
            InputStream er = p.getErrorStream();
            int c;
            while ((c = er.read()) != -1) {
                System.out.print((char) c);
            }
            er.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
