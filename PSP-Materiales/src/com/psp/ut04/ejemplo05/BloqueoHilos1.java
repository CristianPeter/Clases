package com.psp.ut04.ejemplo05;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class BloqueoHilos1 {

    public static void main(String[] args) {
        ObjetoCompartido com = new ObjetoCompartido();
        HiloCadena1 a = new HiloCadena1(com, " A ");
        HiloCadena1 b = new HiloCadena1(com, " B ");
        a.start();
        b.start();
    }
}//BloqueoHilosInicial
