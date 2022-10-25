/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActividadEntregable4_2;

import ActividadEntregable4_2.Objeto_Compartido;

/**
 *
 * @author dev
 */
public class Hilo_Consumidor extends Thread {
        Objeto_Compartido oc=new Objeto_Compartido();
   
    
    @Override
    public void run() {
        while(true){
            synchronized(oc){                 
                System.out.println("Leyendo del fichero...");
                try {
                    oc.wait();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            } 
            oc.notify();
        }
        
    }
    
}
