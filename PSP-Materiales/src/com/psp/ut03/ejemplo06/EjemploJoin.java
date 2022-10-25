package com.psp.ut03.ejemplo06;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class EjemploJoin {

    public static void main(String[] args) {
        HiloJoin h1 = new HiloJoin("Hilo1", 2);
        HiloJoin h2 = new HiloJoin("Hilo2", 5);
        HiloJoin h3 = new HiloJoin("Hilo3", 7);

        h1.start();
        h2.start();
        h3.start();

        try {
            h1.join();
            h2.join();
            h3.join();
        } catch (InterruptedException e) {
        }

        System.out.println("FINAL DE PROGRAMA");
    }
}//
