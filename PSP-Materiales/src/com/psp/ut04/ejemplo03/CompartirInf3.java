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
public class CompartirInf3 {

    public static void main(String[] args) {
        Contador3 cont = new Contador3(100);
        HiloA3 a = new HiloA3("HiloA", cont);
        HiloB3 b = new HiloB3("HiloB", cont);
        a.start();
        b.start();

    }
}
