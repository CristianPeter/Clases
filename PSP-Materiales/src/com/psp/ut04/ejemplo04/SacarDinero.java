package com.psp.ut04.ejemplo04;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
class SacarDinero extends Thread {

    private Cuenta c;

    public SacarDinero(String n, Cuenta c) {
        super(n);
        this.c = c;
    }

    public void run() {
        for (int x = 1; x <= 4; x++) {
            c.RetirarDinero(10, getName());
        }
    }// run	
}
