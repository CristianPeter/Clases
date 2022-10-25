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

public class Ejemplo07 {

    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("ls", "-la");
        //ProcessBuilder pb = new ProcessBuilder("ls", "-lakdfeiidfe");
        
        File fOut = new File("salida.txt");
        File fErr = new File("error.txt");
        pb.redirectOutput(fOut);
        pb.redirectError(fErr);
        Process p = pb.start();
    }
}
