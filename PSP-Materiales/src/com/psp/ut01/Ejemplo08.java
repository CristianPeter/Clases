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

public class Ejemplo08 {

    public static void main(String[] args) throws IOException {
        File f = new File("./build/classes");
        ProcessBuilder pb = new ProcessBuilder("java","com.psp.ut01.Ejemplo08b");
        File fInp = new File("numeros.txt");
        File fOut = new File("salida.txt");
        File fErr = new File("error.txt");
        pb.redirectInput(fInp);
        pb.redirectOutput(fOut);
        pb.redirectError(fErr);
        pb.directory(f);
        pb.start();
    }
}
