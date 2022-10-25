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
public class Ejemplo01c implements Runnable {

    public void run() {
        for (int i = 0; i < 5000; i++) {
            System.out.println("Dentro del hilo runnable..." + i);
        }
    }

}
