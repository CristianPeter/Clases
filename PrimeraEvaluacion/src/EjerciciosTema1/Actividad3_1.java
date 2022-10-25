/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Actividad3_1 extends Thread{
    private boolean interrupt=false;
    private boolean stop=false;
       @Override
    public void run() {
        
        while(!stop){             
                try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Actividad3_1.class.getName()).log(Level.SEVERE, null, ex);
            }   
        while(!interrupt){
            System.out.println("Inicio del bucle");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Actividad3_1.class.getName()).log(Level.SEVERE, null, ex);
            }   
            System.out.println("Final del bucle");
        
        }
                while(interrupt){
                         System.out.println("Proceso parado");
                         if(!interrupt){
                             System.out.println("Proceso reanudado");
                         }
            }

       }
        
    }
    public void Interrupt(){     
        this.interrupt=true;
    }
    
    public void Stop(){
        this.stop=true;
    }
    public void Resume(){
        this.interrupt=false;
    }

    
    
    
    
    public static void main(String[] args) {
         
        Actividad3_1 hilo1= new Actividad3_1();
        hilo1.start();
        try {
            Thread.sleep(10000);
             hilo1.Interrupt();
             Thread.sleep(10000);
             hilo1.Resume();
             Thread.sleep(10000);
             hilo1.Stop();
        } catch (InterruptedException ex) {
            Logger.getLogger(Actividad3_1.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
       
    }

 
    
}
