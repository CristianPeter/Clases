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
class Contador2 {

    private int c = 0;

    Contador2(int c) {
        this.c = c;
    }

    public void incrementa() {
        c = c + 1;
    }

    public void decrementa() {
        c = c - 1;
    }

    public int getValor() {
        return c;
    }

}// CONTADOR
