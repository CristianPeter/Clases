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
public class CompartirInf2 {

    public static void main(String[] args) {
        Contador2 cont = new Contador2(100);
        HiloA2 a = new HiloA2("HiloA", cont);
        HiloB2 b = new HiloB2("HiloB", cont);
        a.start();
        b.start();

    }
}
