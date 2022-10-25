package com.psp.ut03.ejemplo05;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class HiloEjemploInterrupt extends Thread {

    public void run() {
        try {
            while (!isInterrupted()) {
                System.out.println("Inicio del bucle del hilo y hago mis cositas");
                Thread.sleep(10);
                System.out.println("Fin del bucle del hilo... aquí ya habríamos terminado de hacer lo necesario y podríamos parar");
            }
        } catch (InterruptedException e) {
            System.out.println("HA OCURRIDO UNA EXCEPCION");
        }
        System.out.println("FIN HILO");
    }//run

    public void interrumpir() {
        interrupt();
    }//interrumpir

    public static void main(String[] args) {
        HiloEjemploInterrupt h = new HiloEjemploInterrupt();
        h.start();
        for (int i = 0; i < 2000000000; i++) ;//no hago nada
        h.interrumpir();
    }//     
}//
