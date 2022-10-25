/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ActividadEntregable4_2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class Hilo_Productor extends Thread{
    Objeto_Compartido oc=new Objeto_Compartido();
    String texto;
    public Hilo_Productor(String txt){
        texto=txt;
        
    }
    
    @Override
    public void run() {
       
        while(true){
            synchronized(oc){         
                System.out.println("Escribiendo en el fichero...");
                oc.EscribirFichero(texto);
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
