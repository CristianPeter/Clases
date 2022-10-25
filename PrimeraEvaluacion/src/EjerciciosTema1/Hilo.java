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
public class Hilo implements Runnable {
    

    @Override
    public void run() {
      for(int i=65;i<91;i++){
          System.out.print((char)i);
          try {
              Thread.sleep(1000);
          } catch (InterruptedException ex) {
              ex.printStackTrace();
          }
      }
    }
}
