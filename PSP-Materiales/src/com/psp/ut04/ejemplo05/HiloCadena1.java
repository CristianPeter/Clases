package com.psp.ut04.ejemplo05;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author enrique
 */
class HiloCadena1 extends Thread {

    private ObjetoCompartido objeto;
    String cad;

    public HiloCadena1(ObjetoCompartido c, String s) {
        this.objeto = c;
        this.cad = s;
    }

    public void run() {
        for (int j = 0; j < 10; j++) {
            try {
                synchronized (objeto) {
                    objeto.PintaCadena(cad);
                }
                sleep(30);
            } //synchronized (objeto) {
            //	for (int j = 0; j < 10; j++) objeto.PintaCadena(cad);
            //  }//fin bloque synchronized
            //System.out.print("\n"+cad + " finalizado");
            catch (InterruptedException ex) {
                Logger.getLogger(HiloCadena1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//run

}//HiloCadena1
