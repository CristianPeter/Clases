package com.psp.ut04.ejemplo01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
class HiloB extends Thread {

    private Contador contador;

    public HiloB(String n, Contador c) {
        setName(n);
        contador = c;
    }

    public void run() {
        for (int j = 0; j < 300; j++) {
            contador.decrementa();
            /*try { sleep(100);} catch (InterruptedException e) {}*/
        }
        System.out.println(getName() + " contador vale " + contador.getValor());
    }
}// FIN HILOB
