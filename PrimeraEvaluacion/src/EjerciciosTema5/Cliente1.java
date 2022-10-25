/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosTema5;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dev
 */
public class Cliente1  {
    public static void main(String[] args) {
        
        String host="localhost";
        int puerto=6001;
        
        try {
            Socket cliente=new Socket(host,puerto);
            System.out.println(cliente.getPort());
            System.out.println(cliente.getLocalPort());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
