/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class TicTac extends Thread{
    String impresion;
   
    public TicTac(String impresion){
    this.impresion=impresion;
    
}

    @Override
    public void run() {
       while(true){
           try {
               System.out.println(impresion);
               Thread.sleep(2000);
           } catch (InterruptedException ex) {
               ex.printStackTrace();
           }
       }
    }
    
}
