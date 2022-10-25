package com.psp.ut04.ejemplo06;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class BloqueoHilos2 {

    public static void main(String[] args) {
        ObjetoCompartido com = new ObjetoCompartido();
        HiloCadena2 a = new HiloCadena2(com, " A ");
        HiloCadena2 b = new HiloCadena2(com, " B ");
        a.start();
        b.start();
    }
}//BloqueoHilos
