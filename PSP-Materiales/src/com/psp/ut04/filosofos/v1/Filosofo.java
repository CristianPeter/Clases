/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psp.ut04.filosofos.v1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author enrique
 */
public class Filosofo extends Thread {

    private int id;
    private Tenedor tDcha;
    private Tenedor tIzda;
    private int contComer;
    private static final int EMPACHO = 10;
    private static final long TIEMPO_ENTRE_BOCADOS = 500;
    private static final long TIEMPO_ENTRE_COGER_TENEDORES = 250;

    public Filosofo(int id, Tenedor tDcha, Tenedor tIzda) {
        this.id = id;
        this.tDcha = tDcha;
        this.tIzda = tIzda;
        this.contComer = 0;
    }

    @Override
    public void run() {
        do {
            synchronized (tDcha) {
                this.tDcha.usar(this.id);
                try {
                    Thread.sleep(TIEMPO_ENTRE_COGER_TENEDORES);
                } catch (InterruptedException ex) {
                }
                synchronized (tIzda) {
                    this.tIzda.usar(this.id);
                    for (int i = 0; i < EMPACHO; i++) {
                        this.contComer++;
                        System.out.println("Filosofo " + id + " comiendo - ya lleva " + this.contComer);
                        try {
                            Thread.sleep(TIEMPO_ENTRE_BOCADOS);
                        } catch (InterruptedException ex) {
                        }
                    }
                    this.tIzda.soltar();
                }
                this.tDcha.soltar();
            }
            try {
                Thread.sleep(TIEMPO_ENTRE_COGER_TENEDORES);
            } catch (InterruptedException ex) {
            }
        } while (true);
    }

}
