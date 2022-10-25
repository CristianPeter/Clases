package com.psp.ut04.ejemplo03;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
class Contador3 {

    private int c = 0;

    Contador3(int c) {
        this.c = c;
    }

    public synchronized void incrementa() {
        c = c + 1;
    }

    public synchronized void decrementa() {
        c = c - 1;
    }

    public synchronized int getValor() {
        return c;
    }

}// CONTADOR
