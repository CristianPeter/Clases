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
public class Exec {

    public static void main(String[] args) {
        ContadorCompartido cc = new ContadorCompartido();
        new IncrementadorLento("A", cc).start();
        new IncrementadorLento("B", cc).start();
        new IncrementadorLento("C", cc).start();

    }
}
