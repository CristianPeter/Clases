package com.psp.ut03.ejemplo04;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
public class HiloEjemploDead extends Thread {

    private boolean stopHilo = false;

    public void pararHilo() {
        stopHilo = true;
    }

    //metodo run
    public void run() {
        while (!stopHilo) {
            System.out.println("Inicio del bucle del hilo y hago mis cositas");

            //en este bloque de código es dónde estarían las acciones que no pueden ser interrumpidas
            try {
                sleep(1000);
            } catch (Exception e) {
            }

            System.out.println("Fin del bucle del hilo... aquí ya habríamos terminado de hacer lo necesario y podríamos parar");
        }
    }

    public static void main(String[] args) {
        HiloEjemploDead h = new HiloEjemploDead();
        h.start();
        for (int i = 0; i < 2000000000; i++) ;//no hago nada	
        h.pararHilo();
    }// main   
}//fin clase hilo
