/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psp.ut04.filosofos.v1;

/**
 *
 * @author enrique
 */
public class Exec {

    private static final int FILOSOFOS = 5;

    public static void main(String[] args) {
        Tenedor[] t = new Tenedor[FILOSOFOS];
        for (int i = 0; i < t.length; i++) {
            t[i] = new Tenedor(i);
        }
        Filosofo[] f = new Filosofo[FILOSOFOS];
        int idIzda = 0, idDcha = 0;
        for (int i = 0; i < FILOSOFOS; i++) {
            if (i == 0) {
                idIzda = f.length - 1;
                idDcha = 0;
            } else {
                idIzda = i - 1;
                idDcha = i;
            }
            System.out.println("Al filósofo " + i + " le toca el tenedor izquierdo " + idIzda 
                    + " y el tenedor derecho " + idDcha);
            f[i] = new Filosofo(i, t[idDcha], t[idIzda]);
        }
        for (int i = 0; i < FILOSOFOS; i++) {
            f[i].start();
        }

    }

}
