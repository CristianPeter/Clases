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
public class ExecTicTac {
    public static void main(String[] args) {
                
        try {
            TicTac hilo1= new TicTac("TIC");
            hilo1.start();
            Thread.sleep(1000);
            TicTac hilo2= new TicTac("TAC");
            hilo2.start();
        } catch (InterruptedException ex) {
            Logger.getLogger(ExecTicTac.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
