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
class HiloCadena2 extends Thread {

    private ObjetoCompartido objeto;
    String cad;

    public HiloCadena2(ObjetoCompartido c, String s) {
        this.objeto = c;
        this.cad = s;
    }

    public void run() {
        synchronized (objeto) {
            for (int j = 0; j < 10; j++) {
                objeto.PintaCadena(cad);
                objeto.notify(); //aviso que ya he usado el objeto
                try {
                    objeto.wait();//esperar a que llegue un notify 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }//for 
            objeto.notify(); //despertar a todos los wait sobre el objeto
        }//fin bloque synchronized

        //System.out.print("\n"+cad + " finalizado");
    }//run

}//HiloCadena
