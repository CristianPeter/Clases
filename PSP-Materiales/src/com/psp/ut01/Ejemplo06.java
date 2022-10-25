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
import java.util.*;

public class Ejemplo06 {

    public static void main(String[] args) throws IOException {
        ProcessBuilder test = new ProcessBuilder();
        Map entorno = test.environment();
        System.out.println("Variables de entorno: ");
        System.out.println(entorno);
        test = new ProcessBuilder("java", "Ejemplo1");
        List l = test.command();
        Iterator iter = l.iterator();
        System.out.println("\nArgumentos del comando: ");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        test.command("ls", "-la");
        l = test.command();
        iter = l.iterator();
        System.out.println("\nArgumentos del comando: ");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
