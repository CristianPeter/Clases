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
public class ContadorCompartido {

    private int n = 0;

    public int getN(String id) {
        return n;
    }

    public void setN(String id, int n) {
        this.n = n;
        System.err.println(id + ": " + n);
    }

}
