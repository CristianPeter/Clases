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
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class IncrementadorLento extends Thread {

    private final String id;
    private final ContadorCompartido cc;
    private static Lock llave = new ReentrantLock();

    public IncrementadorLento(String id, ContadorCompartido cc) {
        this.id = id;
        this.cc = cc;

    }

    @Override
    public void run() {
        llave.lock();
        try {
            int valor = cc.getN(id);
            valor++;
            sleep(1000);
            cc.setN(id, valor);
        } catch (InterruptedException e) {
            System.err.println(id + ": " + e);
        } finally {
            llave.unlock();
        }

    }

}
