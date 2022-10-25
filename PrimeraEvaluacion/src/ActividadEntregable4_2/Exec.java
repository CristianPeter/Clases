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
public class Exec {
    public static void main(String[] args) {
        
       Hilo_Productor hilo1 = new Hilo_Productor("Hola");
       Hilo_Consumidor hilo2 = new Hilo_Consumidor();
       
       hilo1.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
       hilo2.start();
       
    }
}
