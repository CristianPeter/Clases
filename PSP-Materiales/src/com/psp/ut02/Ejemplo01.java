package com.psp.ut02;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        Ejemplo01b hilo = new Ejemplo01b();
        hilo.start();

        Ejemplo01b hilo2 = new Ejemplo01b();
        hilo2.start();

//        Runnable r = new Ejemplo01c();
//        Thread hiloR = new Thread(r);
//        hiloR.start();

        for (int i = 0; i < 5000; i++) {
            System.out.println("Fuera del hilo..." + i);
        }
    }
}
