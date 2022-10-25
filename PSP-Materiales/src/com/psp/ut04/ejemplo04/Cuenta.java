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
class Cuenta {

    private int saldo;

    Cuenta(int s) {
        saldo = s;
    }

    public int getSaldo() {
        return saldo;
    }

    public void restar(int cantidad) {
        saldo = saldo - cantidad;
    }

    public synchronized void RetirarDinero(int cant, String nom) {
        //public void RetirarDinero(int cant, String nom) {	
        if (getSaldo() >= cant) {
            System.out.println(nom + ": SE VA A RETIRAR SALDO (ACTUAL ES: " + getSaldo() + ")");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }

            restar(cant);

            System.out.println("\t" + nom + " retira =>" + cant + " ACTUAL(" + getSaldo() + ")");
        } else {
            System.out.println(nom + " No puede retirar dinero, NO HAY SALDO(" + getSaldo() + ")");
        }
        if (getSaldo() < 0) {
            System.out.println("SALDO NEGATIVO => " + getSaldo());
        }
    }//retirar
}
