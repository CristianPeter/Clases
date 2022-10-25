package com.psp.ut03.ejemplo06;

import static java.lang.Thread.sleep;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
class HiloJoin extends Thread {

    private int n;

    public HiloJoin(String nombre, int n) {
        super(nombre);
        this.n = n;
    }

    public void run() {
        for (int i = 1; i <= n; i++) {
            System.out.println(getName() + ": " + i);
            try {
                sleep(1000);
            } catch (InterruptedException ignore) {
            }
        }
        System.out.println("Fin Bucle " + getName());
    }
}//
