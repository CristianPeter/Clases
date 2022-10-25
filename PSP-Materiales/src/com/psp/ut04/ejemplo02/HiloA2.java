package com.psp.ut04.ejemplo02;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
class HiloA2 extends Thread {

    private Contador2 contador;

    public HiloA2(String n, Contador2 c) {
        setName(n);
        contador = c;
    }

    public void run() {
        synchronized (contador) {
            for (int j = 0; j < 300; j++) {
                contador.incrementa();
                /*try {
					sleep(100);
				} catch (InterruptedException e) {		}
                 */
            }
            System.out.println(getName() + " contador vale "
                    + contador.getValor());
        }

    }
}// HILOA
