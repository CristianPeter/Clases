package com.psp.ut04.ejemplo01;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
class Contador {

    private int c = 0;

    Contador(int c) {
        this.c = c;
    }

    public void incrementa() {
        int a = c;
        try {
            Thread.sleep(3);
        } catch (InterruptedException ex) {
            Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
        }
        c = a + 1;
    }

    public void decrementa() {
        int a = c;
        try {
            Thread.sleep(3);
        } catch (InterruptedException ex) {
            Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
        }
        c = a - 1;
    }

    public int getValor() {
        return c;
    }

}
