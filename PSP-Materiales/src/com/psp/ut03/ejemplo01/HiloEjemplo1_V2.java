package com.psp.ut03.ejemplo01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class HiloEjemplo1_V2 extends Thread {
    // constructor

    public HiloEjemplo1_V2(String nombre) {
        super(nombre);
        System.out.println("CREANDO HILO:" + getName());
    }

    // metodo run
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hilo:" + getName() + " C = " + i);
        }
    }
}// HiloEjemplo1_V2

