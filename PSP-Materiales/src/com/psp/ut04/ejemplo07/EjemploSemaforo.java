/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psp.ut04.ejemplo07;

/**
 *
 * @author enrique
 */
import java.util.concurrent.locks.*;
import java.util.concurrent.Semaphore;

public class EjemploSemaforo {

    int i = 0;

    public static void main(String[] args) {
        final EjemploSemaforo example = new EjemploSemaforo();
        final Semaphore semaphore = new Semaphore(1); //número de hilos concurrentes que pueden entrar en la zona crítica

        final Runnable r = new Runnable() {
            public void run() {
                while (true) {
                    try {
                        semaphore.acquire();
                        //Sección crítica a proteger
                        example.printSomething();
                        Thread.sleep(1000);
                        semaphore.release();
                    } catch (Exception ex) {
                        System.out.println(" — Interrupted…");
                        ex.printStackTrace();

                    }
                }
            }
        };

        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();

    }

    public void printSomething() {
        i++;
        System.out.println(" — current value of the i :" + i);

    }

}
