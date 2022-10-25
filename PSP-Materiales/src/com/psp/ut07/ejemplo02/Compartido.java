/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psp.ut07.ejemplo02;

/**
 *
 * @author enrique
 */
public class Compartido {

    int n = 0;

    public synchronized int acumular(int a) {
        this.n += a;
        return n;
    }
}
